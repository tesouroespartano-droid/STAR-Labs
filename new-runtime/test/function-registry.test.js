'use strict';

const assert = require('node:assert/strict');
const test = require('node:test');
const { FunctionRegistryError, GS2FunctionRegistry, RegistryBridge } = require('../src/function-registry');
const { FunctionReference } = require('../src/function-reference');

test('stores GS2 metadata and resolves aliases by execution context', () => {
  const registry = new GS2FunctionRegistry([
    {
      name: 'player.chat',
      aliases: ['chat'],
      signature: 'player.chat(message)',
      parameters: [{ name: 'message', type: 'string' }],
      returns: 'void',
      context: 'client',
      status: 'fully-implemented',
      evidence: 'authorized client bridge contract',
      implementation: (message) => message,
    },
  ]);

  assert.equal(registry.resolve('chat', 'client').name, 'player.chat');
  assert.equal(registry.resolve('chat', 'server'), null);
  assert.equal(registry.invoke('chat', ['hello'], 'client'), 'hello');
  assert.equal(registry.validatedCount, 1);
});

test('does not count metadata-only or unavailable entries as validated', () => {
  const registry = new GS2FunctionRegistry([
    { name: 'future.feature', context: 'shared', status: 'metadata-only', evidence: 'documentation' },
    { name: 'disabled.feature', context: 'client', status: 'partial', available: false, implementation: () => true },
  ]);

  assert.equal(registry.size, 2);
  assert.equal(registry.validatedFunctions.length, 0);
});

test('rejects unsupported claims without implementation and evidence', () => {
  assert.throws(
    () => new GS2FunctionRegistry([{ name: 'fake.complete', status: 'fully-implemented' }]),
    FunctionRegistryError,
  );
  assert.throws(
    () => new GS2FunctionRegistry([{ name: 'fake.partial', status: 'partial' }]),
    FunctionRegistryError,
  );
});

test('exposes registry dispatch through the runtime bridge contract', () => {
  const registry = new GS2FunctionRegistry([
    { name: 'math.add', context: 'shared', status: 'fully-implemented', evidence: 'unit test', implementation: (left, right) => left + right },
  ]);
  const bridge = new RegistryBridge(registry, 'client');

  assert.equal(bridge.call('math.add', [2, 3]), 5);
  assert.throws(() => bridge.call('unknown', []), /Unavailable function/);
});

test('normalizes V12.2 metadata states and preserves category and bridge handler', () => {
  const bridgeHandler = () => true;
  const registry = new GS2FunctionRegistry([{
    name: 'player.chat',
    category: 'player',
    status: 'VALIDATED',
    context: 'client',
    evidence: 'contract test',
    bridgeHandler,
    implementation: () => true,
  }]);
  const entry = registry.resolve('player.chat', 'client');
  assert.equal(entry.status, 'fully-implemented');
  assert.equal(entry.category, 'player');
  assert.equal(entry.bridgeHandler, bridgeHandler);
  assert.equal(registry.validatedCount, 1);
});

test('function reference filters and details the same registry entries', () => {
  const registry = new GS2FunctionRegistry([
    { name: 'player.chat', category: 'player', context: 'client', status: 'VALIDATED', evidence: 'test', documentation: 'Send chat', implementation: () => null },
    { name: 'math.add', category: 'math', context: 'shared', status: 'METADATA_ONLY', evidence: 'docs' },
  ]);
  const reference = new FunctionReference(registry);
  assert.deepEqual(reference.list({ category: 'player' }).map((entry) => entry.name), ['player.chat']);
  assert.equal(reference.details('player.chat', 'client').documentation, 'Send chat');
  assert.equal(reference.details('math.add', 'client').name, 'math.add');
});
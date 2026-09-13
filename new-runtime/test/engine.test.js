'use strict';

const assert = require('node:assert/strict');
const test = require('node:test');
const { ClientBridge } = require('../src/client-bridge');
const { RuntimeEngine } = require('../src/engine');
const { GS2FunctionRegistry } = require('../src/function-registry');

function createEngine() {
  const registry = new GS2FunctionRegistry([
    { name: 'player.chat', category: 'player', context: 'client', status: 'fully-implemented', evidence: 'bridge contract test', implementation: (message) => message },
  ]);
  const bridge = new ClientBridge({ handlers: { 'player.chat': (args) => args[0] } });
  return new RuntimeEngine({ registry, bridge });
}

test('runs source through language service, VM, bridge and observable logs', () => {
  const engine = createEngine();
  const result = engine.run("let message = player.chat('ready');");
  assert.equal(result.state, 'ready');
  assert.equal(result.globals.message, 'ready');
  assert.equal(result.logs.at(-1).message, 'script.gs2 finished');
  assert.equal(engine.lastExecution.steps > 0, true);
});

test('does not execute when semantic diagnostics exist', () => {
  const engine = createEngine();
  const result = engine.run('missingFunction();', { scriptName: 'broken.gs2' });
  assert.equal(result.state, 'error');
  assert.match(result.diagnostics[0].message, /Unknown function/);
});

test('supports multiple documents and stops after the first error', () => {
  const engine = createEngine();
  const results = engine.runDocuments([
    { name: 'first.gs2', source: 'let one = 1;' },
    { name: 'broken.gs2', source: 'missing();' },
    { name: 'never.gs2', source: 'let three = 3;' },
  ]);
  assert.deepEqual(results.map((result) => result.state), ['ready', 'error']);
});

test('reports a real execution limit for an unbounded loop', () => {
  const engine = createEngine();
  const result = engine.run('while (true) {}');
  assert.equal(result.state, 'error');
  assert.match(result.diagnostics[0].message, /quota/);
});
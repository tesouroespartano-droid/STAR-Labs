'use strict';

const assert = require('node:assert/strict');
const test = require('node:test');
const { ClientBridge } = require('../src/client-bridge');
const { LanguageService } = require('../src/language-service');
const { ScriptRepository } = require('../src/script-repository');
const { GS2FunctionRegistry } = require('../src/function-registry');
const { VM } = require('../src/vm');
const { parse } = require('../src/parser');
const fs = require('node:fs');
const path = require('node:path');

test('client bridge is independent from Android and carries explicit context', () => {
  const bridge = new ClientBridge({ handlers: { 'player.chat': (args, metadata) => `${metadata.context}:${args[0]}` } });
  assert.equal(bridge.call('player.chat', ['hello']), 'client:hello');
});

test('script repository preserves independent document and dirty state', () => {
  const repository = new ScriptRepository();
  repository.create('player.gs2', 'function onCreated() {}');
  repository.update('player.gs2', 'function onCreated() { return 1; }');
  assert.equal(repository.open('player.gs2').dirty, true);
  repository.save('player.gs2');
  assert.equal(repository.open('player.gs2').dirty, false);
  assert.deepEqual(repository.list().map((document) => document.name), ['player.gs2']);
});

test('language service uses the registry for completions and diagnostics', () => {
  const registry = new GS2FunctionRegistry([
    { name: 'player.chat', aliases: ['chat'], signature: 'player.chat(message)', context: 'client', status: 'fully-implemented', evidence: 'contract test', implementation: () => null },
  ]);
  const service = new LanguageService({ registry });
  assert.equal(service.complete('player.')[0].signature, 'player.chat(message)');
  assert.deepEqual(service.analyze('unknown();', { scriptName: 'test.gs2' }).diagnostics, [{ script: 'test.gs2', line: 1, column: 1, category: 'resolution', message: "Unknown function 'unknown'" }]);
});

test('complex corpus preserves nested data, scopes, functions, branches and loops', () => {
  const source = fs.readFileSync(path.join(__dirname, '..', 'corpus', 'complex-script.gs2'), 'utf8');
  const globals = new VM({ maxSteps: 10000 }).run(parse(source));
  assert.equal(globals.output.label, 'Ada');
  assert.equal(globals.output.score, 6);
  assert.equal(globals.count, 2);
});

test('member access separates object properties from namespaced bridge calls', () => {
  const registry = new GS2FunctionRegistry([
    { name: 'player.chat', context: 'client', status: 'fully-implemented', evidence: 'contract test', implementation: (message) => message },
  ]);
  const service = new LanguageService({ registry });
  const bridge = { call: (name, args) => registry.invoke(name, args, 'client') };
  const globals = new VM({ bridge }).run(parse("let player = { name: 'Ada' }; let greeting = player.chat('hello'); let label = player.name;"));
  assert.equal(globals.greeting, 'hello');
  assert.equal(globals.label, 'Ada');
  assert.equal(service.complete('player.')[0].name, 'player.chat');
});

test('semantic analyzer finds unknown calls inside nested structures', () => {
  const registry = new GS2FunctionRegistry([]);
  const service = new LanguageService({ registry });
  const result = service.analyze('function onStart() { missing(); }', { scriptName: 'complex.gs2' });
  assert.equal(result.diagnostics[0].message, "Unknown function 'missing'");
});
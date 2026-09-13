'use strict';

const assert = require('node:assert/strict');
const test = require('node:test');
const { parse } = require('../src/parser');
const { VM } = require('../src/vm');
const { RuntimeEngine } = require('../src/engine');
const { GS2FunctionRegistry } = require('../src/function-registry');

function structuredSource(functionCount) {
  const lines = [
    "let state = { total: 0, label: 'workspace' };",
    'function accumulate(value) {',
    '  state.total = state.total + value;',
    '  return state.total;',
    '}',
  ];
  for (let index = 0; index < functionCount; index += 1) {
    lines.push(`function module${index}(value) {`);
    lines.push(`  let adjusted = value + ${index};`);
    lines.push('  return accumulate(adjusted);');
    lines.push('}');
  }
  lines.push(`let result = module${functionCount - 1}(1);`);
  return lines.join('\n');
}

test('parses and executes a structured 500-line-scale workspace without an artificial line cap', () => {
  const source = structuredSource(100);
  assert.ok(source.split('\n').length >= 400);
  const started = Date.now();
  const globals = new VM({ maxSteps: 1000000 }).run(parse(source));
  const elapsed = Date.now() - started;
  assert.equal(globals.state.label, 'workspace');
  assert.equal(typeof globals.result, 'number');
  assert.ok(elapsed < 2000, `structured fixture took ${elapsed}ms`);
});

test('runs a multi-file workspace through the engine and records each document', () => {
  const registry = new GS2FunctionRegistry([]);
  const engine = new RuntimeEngine({ registry, maxSteps: 100000 });
  const results = engine.runDocuments([
    { name: 'state.gs2', source: 'let state = { ready: true };' },
    { name: 'module.gs2', source: 'let moduleValue = 7;' },
  ]);
  assert.deepEqual(results.map((result) => result.state), ['ready', 'ready']);
  assert.equal(results.length, 2);
});
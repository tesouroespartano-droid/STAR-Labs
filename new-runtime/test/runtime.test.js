'use strict';

const assert = require('node:assert/strict');
const test = require('node:test');
const { Executor, HookRegistry, MockBridge, PanelStore, TraceLog, parseScript } = require('../src/runtime');

test('parses variables, calls and return values', () => {
  const bridge = new MockBridge({}, { add: (a, b) => a + b });
  const executor = new Executor({ bridge });
  const result = executor.run('let amount = 2\ncall add($amount, 3)\nreturn $amount');
  assert.equal(result.value, 2);
  assert.equal(result.variables.amount, 2);
});

test('dispatches hooks and records trace entries', () => {
  const calls = [];
  const bridge = new MockBridge({}, { onChat: (payload) => calls.push(payload) });
  const hooks = new HookRegistry();
  const executor = new Executor({ bridge, hooks });
  executor.run('hook chat -> onChat');
  hooks.emit('chat', { text: 'hello' });
  assert.deepEqual(calls, [{ text: 'hello' }]);
  assert.equal(executor.trace.entries.length, 1);
});

test('creates and updates panels through the independent store', () => {
  const panels = new PanelStore();
  const executor = new Executor({ bridge: new MockBridge(), panels });
  executor.run('panel console = "ready"');
  assert.equal(panels.update('console', 'done').value, 'done');
  assert.equal(panels.destroy('console'), true);
});

test('keeps the parser grammar explicit', () => {
  assert.throws(() => parseScript('player.chat("x")'), /Unsupported statement/);
});
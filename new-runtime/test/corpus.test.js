'use strict';

const assert = require('node:assert/strict');
const fs = require('node:fs');
const path = require('node:path');
const test = require('node:test');
const { parse } = require('../src/parser');
const { VM } = require('../src/vm');
const { Executor, HookRegistry, MockBridge, PanelStore } = require('../src/runtime');

const corpus = path.join(__dirname, '..', 'corpus');
const read = (name) => fs.readFileSync(path.join(corpus, name), 'utf8');
const run = (source, bridge = new MockBridge()) => {
  const vm = new VM({ bridge, maxSteps: 100000 });
  const program = parse(source);
  const globals = vm.run(program);
  return globals;
};

test('executes core GS2 corpus cases', () => {
  assert.equal(run(read('hello.gs2')).greeting, 'hello');
  assert.equal(run(read('variables.gs2')).total, 5);
  assert.equal(run(read('control-flow.gs2')).count, 3);
  assert.equal(run(read('functions.gs2')).result, 9);
  assert.equal(run(read('arrays.gs2')).result, 4);
  assert.equal(run(read('strings.gs2')).label, 'star labs');
});

test('executes an expanded large script without a line-count ceiling', () => {
  const source = Array.from({ length: 1301 }, (_, index) => `let value${index} = ${index}`).join('\n');
  const globals = run(source);
  assert.equal(source.split('\n').length, 1301);
  assert.equal(globals.value1300, 1300);
});

test('executes event, timer and panel corpus behavior through the local bridge', () => {
  const calls = [];
  const scheduled = [];
  const hooks = new HookRegistry();
  const panels = new PanelStore();
  const bridge = new MockBridge({}, {
    onChat: (payload) => calls.push(payload),
    scheduleEvent: (name, delay) => scheduled.push({ name, delay }),
  });
  const executor = new Executor({ bridge, hooks, panels });
  executor.run(read('events.gs2'));
  hooks.emit('chat', { text: 'hello' });
  assert.deepEqual(calls, [{ text: 'hello' }]);
  executor.run(read('timers.gs2'));
  assert.deepEqual(scheduled, [{ name: 'tick', delay: 10 }]);
  executor.run(read('panels.gs2'));
  assert.equal(panels.panels.get('console').value, 'ready');
});

test('reports corpus errors instead of swallowing them', () => {
  assert.throws(() => new Executor({ bridge: new MockBridge() }).run(read('error-handling.gs2')), /Unknown function/);
});

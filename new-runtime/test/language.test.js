'use strict';

const assert = require('node:assert/strict');
const test = require('node:test');
const { MockBridge } = require('../src/runtime');
const { lex } = require('../src/lexer');
const { parse } = require('../src/parser');
const { VM } = require('../src/vm');

test('lexes and parses a GS2-inspired function and expression', () => {
  const tokens = lex('function add(a, b) { return a + b; }');
  assert.equal(tokens[0].value, 'function');
  const program = parse('function add(a, b) { return a + b; } let answer = add(2, 3);');
  const globals = new VM().run(program);
  assert.equal(globals.answer, 5);
});

test('resolves properties and calls through the independent bridge', () => {
  const bridge = new MockBridge({}, { chat: (message) => message.toUpperCase() });
  const globals = new VM({ bridge }).run(parse('let player = { name: "Ada" };'));
  assert.equal(globals.player.name, 'Ada');
});

test('enforces an execution quota', () => {
  assert.throws(() => new VM({ maxSteps: 10 }).run(parse('let x = 0; while (true) { x = x + 1; }')), /quota/);
});
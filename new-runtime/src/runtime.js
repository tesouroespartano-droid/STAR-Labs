'use strict';

class ScriptError extends Error {}

function splitArguments(source) {
  const result = [];
  let quote = null;
  let depth = 0;
  let start = 0;
  for (let index = 0; index < source.length; index += 1) {
    const character = source[index];
    if (quote) {
      if (character === quote && source[index - 1] !== '\\') quote = null;
    } else if (character === '"' || character === "'") {
      quote = character;
    } else if (character === '(' || character === '[' || character === '{') {
      depth += 1;
    } else if (character === ')' || character === ']' || character === '}') {
      depth -= 1;
    } else if (character === ',' && depth === 0) {
      result.push(source.slice(start, index).trim());
      start = index + 1;
    }
  }
  if (source.slice(start).trim()) result.push(source.slice(start).trim());
  return result;
}

function parseValue(source, variables) {
  const value = source.trim();
  if (value.startsWith('$')) return variables[value.slice(1)];
  if (value === 'null') return null;
  if (value === 'true') return true;
  if (value === 'false') return false;
  if (/^-?\d+(\.\d+)?$/.test(value)) return Number(value);
  if ((value.startsWith('"') && value.endsWith('"')) || (value.startsWith("'") && value.endsWith("'"))) {
    return value.slice(1, -1).replace(/\\([\\"'])/g, '$1');
  }
  throw new ScriptError(`Unsupported expression: ${value}`);
}

function parseScript(source) {
  const statements = [];
  source.split(/\r?\n/).forEach((raw, index) => {
    const text = raw.trim();
    if (!text || text.startsWith('#')) return;
    let match = text.match(/^(?:let|set)\s+([A-Za-z_][\w.]*)\s*=\s*(.+)$/);
    if (match) {
      statements.push({ type: 'set', name: match[1], expression: match[2], line: index + 1 });
      return;
    }
    match = text.match(/^call\s+([A-Za-z_][\w.]*)\((.*)\)$/);
    if (match) {
      statements.push({ type: 'call', name: match[1], arguments: splitArguments(match[2]), line: index + 1 });
      return;
    }
    match = text.match(/^return(?:\s+(.+))?$/);
    if (match) {
      statements.push({ type: 'return', expression: match[1] || 'null', line: index + 1 });
      return;
    }
    match = text.match(/^hook\s+([A-Za-z_][\w.]*)\s*->\s*([A-Za-z_][\w.]*)$/);
    if (match) {
      statements.push({ type: 'hook', event: match[1], callback: match[2], line: index + 1 });
      return;
    }
    match = text.match(/^panel\s+([A-Za-z_][\w]*)\s*=\s*(.+)$/);
    if (match) {
      statements.push({ type: 'panel', id: match[1], expression: match[2], line: index + 1 });
      return;
    }
    throw new ScriptError(`Unsupported statement at line ${index + 1}: ${text}`);
  });
  return statements;
}

class HookRegistry {
  constructor() { this.hooks = new Map(); }
  add(event, callback) {
    if (!this.hooks.has(event)) this.hooks.set(event, new Set());
    this.hooks.get(event).add(callback);
    return () => this.hooks.get(event)?.delete(callback);
  }
  emit(event, payload) { return [...(this.hooks.get(event) || [])].map((callback) => callback(payload)); }
}

class PanelStore {
  constructor() { this.panels = new Map(); }
  create(id, value) { this.panels.set(id, { id, value }); return this.panels.get(id); }
  update(id, value) { if (!this.panels.has(id)) throw new ScriptError(`Unknown panel: ${id}`); this.panels.get(id).value = value; return this.panels.get(id); }
  destroy(id) { return this.panels.delete(id); }
}

class TraceLog {
  constructor() { this.entries = []; }
  add(entry) { this.entries.push({ ...entry, at: this.entries.length }); }
}

class Executor {
  constructor({ bridge, hooks = new HookRegistry(), panels = new PanelStore(), trace = new TraceLog() }) {
    this.bridge = bridge;
    this.hooks = hooks;
    this.panels = panels;
    this.trace = trace;
  }
  run(source) {
    const variables = {};
    let result = null;
    for (const statement of parseScript(source)) {
      this.trace.add({ type: statement.type, line: statement.line });
      try {
        if (statement.type === 'set') variables[statement.name] = parseValue(statement.expression, variables);
        if (statement.type === 'call') result = this.bridge.call(statement.name, statement.arguments.map((value) => parseValue(value, variables)));
        if (statement.type === 'return') return { value: parseValue(statement.expression, variables), variables };
        if (statement.type === 'hook') this.hooks.add(statement.event, (payload) => this.bridge.call(statement.callback, [payload]));
        if (statement.type === 'panel') this.panels.create(statement.id, parseValue(statement.expression, variables));
      } catch (error) {
        throw new ScriptError(`Line ${statement.line}: ${error.message}`);
      }
    }
    return { value: result, variables };
  }
}

class MockBridge {
  constructor(objects = {}, functions = {}) { this.objects = objects; this.functions = functions; }
  call(name, args) {
    if (typeof this.functions[name] !== 'function') throw new ScriptError(`Unknown function: ${name}`);
    return this.functions[name](...args);
  }
}

module.exports = { Executor, HookRegistry, MockBridge, PanelStore, ScriptError, TraceLog, parseScript };
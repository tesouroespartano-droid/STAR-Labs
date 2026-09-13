'use strict';

class FunctionRegistryError extends Error {}

const VALID_CONTEXTS = new Set(['client', 'server', 'shared']);
const STATUS_ALIASES = new Map([
  ['METADATA_ONLY', 'metadata-only'],
  ['STUB', 'stub'],
  ['PARTIAL', 'partial'],
  ['IMPLEMENTED', 'implemented'],
  ['VALIDATED', 'fully-implemented'],
]);
const VALID_STATUSES = new Set(['metadata-only', 'stub', 'partial', 'implemented', 'fully-implemented']);

function normalizeName(name) {
  if (typeof name !== 'string' || !/^[A-Za-z_][A-Za-z0-9_.]*$/.test(name)) {
    throw new FunctionRegistryError(`Invalid function name: ${name}`);
  }
  return name;
}

function normalizeList(value) {
  if (value === undefined) return [];
  if (!Array.isArray(value) || value.some((item) => typeof item !== 'string' || item.length === 0)) {
    throw new FunctionRegistryError('Expected a list of non-empty strings');
  }
  return [...new Set(value)];
}

class GS2FunctionRegistry {
  constructor(entries = []) {
    this.entries = new Map();
    this.aliases = new Map();
    entries.forEach((entry) => this.register(entry));
  }

  register(entry) {
    if (!entry || typeof entry !== 'object') throw new FunctionRegistryError('Function metadata must be an object');
    const name = normalizeName(entry.name);
    if (this.entries.has(name)) throw new FunctionRegistryError(`Function already registered: ${name}`);
    const context = entry.context || entry.side || 'shared';
    if (!VALID_CONTEXTS.has(context)) throw new FunctionRegistryError(`Invalid function context: ${context}`);
    const status = STATUS_ALIASES.get(entry.status) || entry.status || 'metadata-only';
    if (!VALID_STATUSES.has(status)) throw new FunctionRegistryError(`Invalid function status: ${status}`);
    const aliases = normalizeList(entry.aliases);
    const implementation = entry.implementation;
    if (implementation !== undefined && typeof implementation !== 'function') {
      throw new FunctionRegistryError(`Implementation must be callable: ${name}`);
    }
    if (['partial', 'implemented', 'fully-implemented'].includes(status) && typeof implementation !== 'function') {
      throw new FunctionRegistryError(`Implemented function requires a callable implementation: ${name}`);
    }
    if (['implemented', 'fully-implemented'].includes(status) && !entry.evidence) {
      throw new FunctionRegistryError(`Fully implemented function requires evidence: ${name}`);
    }
    const normalized = {
      name,
      category: entry.category || 'uncategorized',
      signature: entry.signature || `${name}()` ,
      parameters: Array.isArray(entry.parameters) ? [...entry.parameters] : [],
      returns: entry.returns || 'void',
      context,
      version: entry.version || null,
      available: entry.available !== false,
      aliases,
      documentation: entry.documentation || '',
      status,
      implementation: implementation || null,
      bridgeHandler: entry.bridgeHandler || null,
      evidence: entry.evidence || null,
    };
    this.entries.set(name, normalized);
    for (const alias of aliases) {
      normalizeName(alias);
      if (this.aliases.has(alias) || this.entries.has(alias)) throw new FunctionRegistryError(`Alias already registered: ${alias}`);
      this.aliases.set(alias, name);
    }
    return normalized;
  }

  resolve(name, context = 'shared') {
    if (!VALID_CONTEXTS.has(context)) throw new FunctionRegistryError(`Invalid function context: ${context}`);
    const canonicalName = this.entries.has(name) ? name : this.aliases.get(name);
    const entry = canonicalName ? this.entries.get(canonicalName) : undefined;
    if (!entry || !entry.available || (entry.context !== 'shared' && context !== 'shared' && entry.context !== context)) return null;
    return entry;
  }

  invoke(name, args = [], context = 'shared') {
    const entry = this.resolve(name, context);
    if (!entry) throw new FunctionRegistryError(`Unavailable function '${name}' in ${context} context`);
    if (typeof entry.implementation !== 'function') throw new FunctionRegistryError(`Function '${entry.name}' has no implementation`);
    return entry.implementation(...args);
  }

  get validatedFunctions() {
    return [...this.entries.values()].filter((entry) => entry.available && ['implemented', 'fully-implemented'].includes(entry.status) && typeof entry.implementation === 'function');
  }

  get size() { return this.entries.size; }
  get validatedCount() { return this.validatedFunctions.length; }
}

class RegistryBridge {
  constructor(registry, context = 'client') {
    if (!(registry instanceof GS2FunctionRegistry)) throw new FunctionRegistryError('RegistryBridge requires a GS2FunctionRegistry');
    this.registry = registry;
    this.context = context;
  }

  call(name, args) {
    return this.registry.invoke(name, args, this.context);
  }
}

module.exports = { FunctionRegistryError, GS2FunctionRegistry, RegistryBridge };
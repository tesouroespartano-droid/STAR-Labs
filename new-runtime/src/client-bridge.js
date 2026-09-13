'use strict';

class ClientBridgeError extends Error {}

class ClientBridge {
  constructor({ handlers = {}, context = 'client' } = {}) {
    this.handlers = new Map(Object.entries(handlers));
    this.context = context;
  }

  register(name, handler) {
    if (!/^[A-Za-z_][A-Za-z0-9_.]*$/.test(name)) throw new ClientBridgeError(`Invalid bridge function: ${name}`);
    if (typeof handler !== 'function') throw new ClientBridgeError(`Bridge handler must be callable: ${name}`);
    if (this.handlers.has(name)) throw new ClientBridgeError(`Bridge function already registered: ${name}`);
    this.handlers.set(name, handler);
  }

  has(name) { return this.handlers.has(name); }

  call(name, args = [], metadata = {}) {
    const handler = this.handlers.get(name);
    if (!handler) throw new ClientBridgeError(`Unavailable bridge function '${name}'`);
    return handler(args, { ...metadata, context: this.context, functionName: name });
  }
}

module.exports = { ClientBridge, ClientBridgeError };
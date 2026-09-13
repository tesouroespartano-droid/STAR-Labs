'use strict';

class ScriptRepositoryError extends Error {}

class ScriptRepository {
  constructor(initialDocuments = []) {
    this.documents = new Map();
    initialDocuments.forEach((document) => this.create(document.name, document.source || '', document.metadata));
  }

  validateName(name) {
    if (typeof name !== 'string' || !/^[A-Za-z0-9_.-]+\.gs2$/.test(name)) throw new ScriptRepositoryError(`Invalid script name: ${name}`);
  }

  create(name, source = '', metadata = {}) {
    this.validateName(name);
    if (this.documents.has(name)) throw new ScriptRepositoryError(`Script already exists: ${name}`);
    const document = { name, source, savedSource: source, dirty: false, version: 1, metadata: { ...metadata } };
    this.documents.set(name, document);
    return { ...document, metadata: { ...document.metadata } };
  }

  open(name) {
    const document = this.documents.get(name);
    if (!document) throw new ScriptRepositoryError(`Unknown script: ${name}`);
    return { ...document, metadata: { ...document.metadata } };
  }

  update(name, source) {
    const document = this.documents.get(name);
    if (!document) throw new ScriptRepositoryError(`Unknown script: ${name}`);
    document.source = source;
    document.dirty = document.source !== document.savedSource;
    document.version += 1;
    return this.open(name);
  }

  save(name) {
    const document = this.documents.get(name);
    if (!document) throw new ScriptRepositoryError(`Unknown script: ${name}`);
    document.savedSource = document.source;
    document.dirty = false;
    return this.open(name);
  }

  delete(name) {
    if (!this.documents.has(name)) throw new ScriptRepositoryError(`Unknown script: ${name}`);
    this.documents.delete(name);
  }

  list() { return [...this.documents.values()].map((document) => this.open(document.name)); }
}

module.exports = { ScriptRepository, ScriptRepositoryError };
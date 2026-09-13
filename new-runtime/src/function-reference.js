'use strict';

class FunctionReference {
  constructor(registry) {
    this.registry = registry;
  }

  list({ query = '', category, context, status } = {}) {
    const normalizedQuery = query.toLowerCase();
    return [...this.registry.entries.values()]
      .filter((entry) => !category || entry.category === category)
      .filter((entry) => !context || entry.context === context || entry.context === 'shared')
      .filter((entry) => !status || entry.status === status)
      .filter((entry) => !normalizedQuery || entry.name.toLowerCase().includes(normalizedQuery) || entry.aliases.some((alias) => alias.toLowerCase().includes(normalizedQuery)))
      .map((entry) => ({ ...entry, implementation: undefined }));
  }

  details(name, context = 'shared') {
    const entry = this.registry.resolve(name, context);
    if (!entry) return null;
    return { ...entry, implementation: undefined };
  }
}

module.exports = { FunctionReference };
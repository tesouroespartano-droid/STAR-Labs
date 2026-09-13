'use strict';

const { parse, ParseError } = require('./parser');
const { SemanticAnalyzer } = require('./semantic');

class LanguageService {
  constructor({ registry }) {
    this.registry = registry;
    this.semantic = new SemanticAnalyzer({ registry });
  }

  analyze(source, { scriptName = '<memory>', context = 'client' } = {}) {
    try {
      const program = parse(source);
      return { program, diagnostics: this.semantic.analyze(program, { scriptName, context }) };
    } catch (error) {
      if (!(error instanceof ParseError)) throw error;
      return { program: null, diagnostics: [{ script: scriptName, line: error.line || 1, column: error.column || 1, category: 'syntax', message: error.message }] };
    }
  }

  complete(prefix, context = 'client') {
    if (!this.registry) return [];
    return [...this.registry.entries.values()]
      .filter((entry) => entry.available && entry.context === 'shared' || entry.context === context)
      .filter((entry) => entry.name.startsWith(prefix) || entry.aliases.some((alias) => alias.startsWith(prefix)))
      .map((entry) => ({ name: entry.name, signature: entry.signature, documentation: entry.documentation, status: entry.status }));
  }
}

module.exports = { LanguageService };
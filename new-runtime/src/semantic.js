'use strict';

class SemanticAnalyzer {
  constructor({ registry } = {}) {
    this.registry = registry;
  }

  analyze(program, { scriptName = '<memory>', context = 'client' } = {}) {
    const diagnostics = [];
    const declared = new Set();
    const visit = (node) => {
      if (!node || typeof node !== 'object') return;
      if (node.type === 'FunctionDeclaration') {
        declared.add(node.name);
        node.params.forEach((name) => declared.add(name));
        node.body.forEach(visit);
        return;
      }
      if (node.type === 'CallExpression' && node.callee.type === 'Identifier') {
        const name = node.callee.name;
        if (!declared.has(name) && this.registry && !this.registry.resolve(name, context)) {
          diagnostics.push({ script: scriptName, line: node.line || 1, column: node.column || 1, category: 'resolution', message: `Unknown function '${name}'` });
        }
      }
      for (const value of Object.values(node)) {
        if (Array.isArray(value)) value.forEach(visit);
        else visit(value);
      }
    };
    visit(program);
    return diagnostics;
  }
}

module.exports = { SemanticAnalyzer };
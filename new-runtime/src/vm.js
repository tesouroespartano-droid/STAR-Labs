'use strict';

const { ScriptError } = require('./runtime');

class VM {
  constructor({ bridge, maxSteps = 10000 } = {}) { this.bridge = bridge; this.maxSteps = maxSteps; this.steps = 0; this.globals = Object.create(null); }
  run(program) { this.steps = 0; this.executeStatements(program.body, this.globals); return this.globals; }
  tick() { this.steps += 1; if (this.steps > this.maxSteps) throw new ScriptError('Execution quota exceeded'); }
  executeStatements(statements, scope) { for (const statement of statements) { this.tick(); const result = this.execute(statement, scope); if (result && result.returned) return result; } return null; }
  execute(statement, scope) {
    switch (statement.type) {
      case 'EmptyStatement': return null;
      case 'VariableDeclaration': scope[statement.name] = this.evaluate(statement.initializer, scope); return null;
      case 'ExpressionStatement': this.evaluate(statement.expression, scope); return null;
      case 'ReturnStatement': return { returned: true, value: this.evaluate(statement.argument, scope) };
      case 'BlockStatement': return this.executeStatements(statement.body, scope);
      case 'FunctionDeclaration': scope[statement.name] = (...args) => { const local = Object.create(scope); statement.params.forEach((name, index) => { local[name] = args[index]; }); const result = this.executeStatements(statement.body, local); return result?.value; }; return null;
      case 'IfStatement': return this.evaluate(statement.test, scope) ? this.execute(statement.consequent, scope) : statement.alternate ? this.execute(statement.alternate, scope) : null;
      case 'WhileStatement': { let guard = 0; while (this.evaluate(statement.test, scope)) { if (++guard > this.maxSteps) throw new ScriptError('Loop quota exceeded'); const result = this.execute(statement.body, scope); if (result?.returned) return result; } return null; }
      default: throw new ScriptError(`Unsupported AST node: ${statement.type}`);
    }
  }
  evaluate(node, scope) {
    this.tick();
    if (node.type === 'Literal') return node.value;
    if (node.type === 'ArrayExpression') return node.elements.map((element) => this.evaluate(element, scope));
    if (node.type === 'ObjectExpression') return Object.fromEntries(node.properties.map((property) => [property.key, this.evaluate(property.value, scope)]));
    if (node.type === 'Identifier') return scope[node.name];
    if (node.type === 'MemberExpression' || node.type === 'IndexExpression') { const object = this.evaluate(node.object, scope); const key = node.type === 'MemberExpression' ? node.property : this.evaluate(node.property, scope); return object?.[key]; }
    if (node.type === 'AssignmentExpression') { const value = this.evaluate(node.right, scope); if (node.left.type !== 'Identifier') throw new ScriptError('Only identifier assignment is supported'); scope[node.left.name] = value; return value; }
    if (node.type === 'UnaryExpression') { const value = this.evaluate(node.argument, scope); return node.operator === '!' ? !value : -value; }
    if (node.type === 'BinaryExpression') { const left = this.evaluate(node.left, scope); const right = this.evaluate(node.right, scope); return ({ '+': () => left + right, '-': () => left - right, '*': () => left * right, '/': () => left / right, '%': () => left % right, '==': () => left === right, '!=': () => left !== right, '<': () => left < right, '<=': () => left <= right, '>': () => left > right, '>=': () => left >= right, '&&': () => left && right, '||': () => left || right })[node.operator](); }
    if (node.type === 'CallExpression') { const callee = this.evaluate(node.callee, scope); const args = node.arguments.map((argument) => this.evaluate(argument, scope)); if (typeof callee === 'function') return callee(...args); if (node.callee.type === 'Identifier' && this.bridge) return this.bridge.call(node.callee.name, args); throw new ScriptError('Value is not callable'); }
    throw new ScriptError(`Unsupported expression: ${node.type}`);
  }
}

module.exports = { VM };
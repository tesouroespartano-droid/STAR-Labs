'use strict';

const { lex } = require('./lexer');

class ParseError extends Error {}

class Parser {
  constructor(source) { this.tokens = lex(source); this.index = 0; }
  current() { return this.tokens[this.index]; }
  accept(value) { if (this.current().value === value) return this.tokens[this.index++]; return null; }
  expect(value) { const token = this.accept(value); if (!token) throw new ParseError(`Expected '${value}' at line ${this.current().line}`); return token; }
  identifier() { const token = this.current(); if (!['identifier', 'keyword'].includes(token.type)) throw new ParseError(`Expected identifier at line ${token.line}`); this.index += 1; return token.value; }
  parse() { const body = []; while (this.current().type !== 'eof') body.push(this.statement()); return { type: 'Program', body }; }
  statement() {
    const token = this.current();
    if (this.accept(';')) return { type: 'EmptyStatement', line: token.line };
    if (this.accept('let')) { const name = this.identifier(); this.expect('='); return { type: 'VariableDeclaration', name, initializer: this.expression(), line: token.line }; }
    if (this.accept('return')) return { type: 'ReturnStatement', argument: this.current().value === ';' || this.current().value === '}' ? { type: 'Literal', value: null } : this.expression(), line: token.line };
    if (this.accept('function')) return this.functionDeclaration(token.line);
    if (this.accept('if')) return this.ifStatement(token.line);
    if (this.accept('while')) return this.whileStatement(token.line);
    if (this.accept('{')) { const body = this.block(); return { type: 'BlockStatement', body, line: token.line }; }
    const expression = this.expression(); this.accept(';'); return { type: 'ExpressionStatement', expression, line: token.line };
  }
  block() { const body = []; while (this.current().type !== 'eof' && !this.accept('}')) body.push(this.statement()); return body; }
  functionDeclaration(line) { const name = this.identifier(); this.expect('('); const params = []; while (this.current().value !== ')') { params.push(this.identifier()); if (!this.accept(',')) break; } this.expect(')'); this.expect('{'); return { type: 'FunctionDeclaration', name, params, body: this.block(), line }; }
  ifStatement(line) { this.expect('('); const test = this.expression(); this.expect(')'); const consequent = this.statement(); const alternate = this.accept('else') ? this.statement() : null; return { type: 'IfStatement', test, consequent, alternate, line }; }
  whileStatement(line) { this.expect('('); const test = this.expression(); this.expect(')'); return { type: 'WhileStatement', test, body: this.statement(), line }; }
  expression() { return this.assignment(); }
  assignment() { const left = this.binary(0); if (this.accept('=')) return { type: 'AssignmentExpression', left, right: this.assignment() }; return left; }
  binary(minimum) {
    let left = this.unary();
    const precedence = { '||': 1, '&&': 2, '==': 3, '!=': 3, '<': 4, '<=': 4, '>': 4, '>=': 4, '+': 5, '-': 5, '*': 6, '/': 6, '%': 6 };
    while (precedence[this.current().value] > minimum) { const operator = this.current().value; this.index += 1; left = { type: 'BinaryExpression', operator, left, right: this.binary(precedence[operator]) }; }
    return left;
  }
  unary() { if (['!', '-'].includes(this.current().value)) { const operator = this.current().value; this.index += 1; return { type: 'UnaryExpression', operator, argument: this.unary() }; } return this.postfix(this.primary()); }
  postfix(expression) { while (true) { if (this.accept('(')) { const args = []; while (this.current().value !== ')') { args.push(this.expression()); if (!this.accept(',')) break; } this.expect(')'); expression = { type: 'CallExpression', callee: expression, arguments: args }; } else if (this.accept('.')) expression = { type: 'MemberExpression', object: expression, property: this.identifier() }; else if (this.accept('[')) { const property = this.expression(); this.expect(']'); expression = { type: 'IndexExpression', object: expression, property }; } else break; } return expression; }
  primary() { const token = this.current(); if (this.accept('(')) { const value = this.expression(); this.expect(')'); return value; } if (this.accept('{')) { const properties = []; while (this.current().value !== '}') { const key = this.identifier(); this.expect(':'); properties.push({ key, value: this.expression() }); if (!this.accept(',')) break; } this.expect('}'); return { type: 'ObjectExpression', properties }; } if (token.type === 'number') { this.index += 1; return { type: 'Literal', value: Number(token.value) }; } if (token.type === 'string') { this.index += 1; return { type: 'Literal', value: token.value }; } if (this.accept('true')) return { type: 'Literal', value: true }; if (this.accept('false')) return { type: 'Literal', value: false }; if (this.accept('null')) return { type: 'Literal', value: null }; if (token.type === 'identifier' || token.type === 'keyword') { this.index += 1; return { type: 'Identifier', name: token.value }; } throw new ParseError(`Unexpected token '${token.value}' at line ${token.line}`); }
}

function parse(source) { return new Parser(source).parse(); }

module.exports = { ParseError, Parser, parse };
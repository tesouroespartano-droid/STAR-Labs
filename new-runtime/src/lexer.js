'use strict';

class LexError extends Error {}

const keywords = new Set(['let', 'function', 'return', 'if', 'else', 'while', 'true', 'false', 'null']);

function lex(source) {
  const tokens = [];
  let index = 0;
  let line = 1;
  const push = (type, value, start) => tokens.push({ type, value, line, start });
  while (index < source.length) {
    const character = source[index];
    if (/\s/.test(character)) { if (character === '\n') line += 1; index += 1; continue; }
    if (character === '#') { while (index < source.length && source[index] !== '\n') index += 1; continue; }
    const start = index;
    if (/[A-Za-z_]/.test(character)) {
      index += 1;
      while (index < source.length && /[A-Za-z0-9_]/.test(source[index])) index += 1;
      const value = source.slice(start, index);
      push(keywords.has(value) ? 'keyword' : 'identifier', value, start);
      continue;
    }
    if (/\d/.test(character)) {
      index += 1;
      while (index < source.length && /[\d.]/.test(source[index])) index += 1;
      push('number', source.slice(start, index), start);
      continue;
    }
    if (character === '"' || character === "'") {
      const quote = character;
      index += 1;
      let value = '';
      while (index < source.length && source[index] !== quote) {
        if (source[index] === '\\' && index + 1 < source.length) index += 1;
        value += source[index]; index += 1;
      }
      if (source[index] !== quote) throw new LexError(`Unterminated string at line ${line}`);
      index += 1; push('string', value, start); continue;
    }
    const two = source.slice(index, index + 2);
    if (['==', '!=', '<=', '>=', '&&', '||', '=>'].includes(two)) { push('operator', two, start); index += 2; continue; }
    if ('+-*/%<>=!.,(){}[];:'.includes(character)) { push('operator', character, start); index += 1; continue; }
    throw new LexError(`Unexpected character '${character}' at line ${line}`);
  }
  tokens.push({ type: 'eof', value: '', line, start: source.length });
  return tokens;
}

module.exports = { LexError, lex };
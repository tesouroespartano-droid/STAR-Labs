'use strict';

const { Executor, MockBridge } = require('../src/runtime');

const executor = new Executor({ bridge: new MockBridge({}, { ping: () => 'pong' }) });
const result = executor.run('call ping()');
if (result.value !== 'pong') throw new Error('Runtime smoke check failed');
console.log('Independent runtime smoke check: OK');
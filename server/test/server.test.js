'use strict';

const assert = require('node:assert/strict');
const test = require('node:test');
const { LicenseService } = require('../src/server');

test('owns users, devices, plans and entitlements independently', () => {
  const service = new LicenseService({ clock: () => 1000 });
  service.issueKey('STAR-GOLD', 'GOLD', ['runtime.basic', 'panels']);
  service.register('dev@example.test', 'secret');
  const session = service.login('dev@example.test', 'secret', 'install-1');
  const user = service.redeem(session.token, 'STAR-GOLD');
  assert.equal(user.plan, 'GOLD');
  assert.deepEqual(user.entitlements.sort(), ['panels', 'runtime.basic']);
  assert.equal(user.deviceCount, 1);
});

test('rejects expired keys and invalid credentials', () => {
  let now = 1000;
  const service = new LicenseService({ clock: () => now });
  service.register('dev@example.test', 'secret');
  assert.throws(() => service.login('dev@example.test', 'wrong', 'install-1'), /invalid credentials/);
  const session = service.login('dev@example.test', 'secret', 'install-1');
  service.issueKey('OLD', 'GOLD', [], 2000);
  now = 2001;
  assert.throws(() => service.redeem(session.token, 'OLD'), /invalid or expired/);
});
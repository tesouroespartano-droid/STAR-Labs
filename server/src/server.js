'use strict';

const http = require('node:http');
const crypto = require('node:crypto');

class ApiError extends Error {
  constructor(code, message, status = 400) { super(message); this.code = code; this.status = status; }
}

class LicenseService {
  constructor({ clock = () => Date.now() } = {}) { this.clock = clock; this.users = new Map(); this.keys = new Map(); this.sessions = new Map(); }
  hash(value) { return crypto.createHash('sha256').update(value).digest('hex'); }
  register(email, password) {
    if (!email || !password) throw new ApiError('INVALID_INPUT', 'email and password are required');
    if (this.users.has(email)) throw new ApiError('USER_EXISTS', 'user already exists', 409);
    const user = { id: crypto.randomUUID(), email, passwordHash: this.hash(password), plan: 'FREE', entitlements: new Set(['runtime.basic']), devices: new Set() };
    this.users.set(email, user); return this.publicUser(user);
  }
  login(email, password, deviceId) {
    const user = this.users.get(email);
    if (!user || user.passwordHash !== this.hash(password)) throw new ApiError('AUTH_FAILED', 'invalid credentials', 401);
    if (!deviceId) throw new ApiError('DEVICE_REQUIRED', 'deviceId is required');
    user.devices.add(deviceId);
    const token = crypto.randomBytes(32).toString('base64url');
    this.sessions.set(token, { userId: user.id, expiresAt: this.clock() + 3600000 });
    return { token, expiresAt: this.sessions.get(token).expiresAt, user: this.publicUser(user) };
  }
  redeem(token, key) {
    const user = this.authenticate(token);
    const entitlement = this.keys.get(key);
    if (!entitlement || entitlement.revoked || (entitlement.expiresAt && entitlement.expiresAt <= this.clock())) throw new ApiError('KEY_INVALID', 'key is invalid or expired', 403);
    entitlement.userId = user.id; user.plan = entitlement.plan; entitlement.entitlements.forEach((item) => user.entitlements.add(item)); return this.publicUser(user);
  }
  authenticate(token) {
    const session = this.sessions.get(token);
    if (!session || session.expiresAt <= this.clock()) throw new ApiError('SESSION_INVALID', 'session is invalid or expired', 401);
    return [...this.users.values()].find((user) => user.id === session.userId);
  }
  issueKey(key, plan, entitlements = [], expiresAt = null) { this.keys.set(key, { plan, entitlements: new Set(entitlements), expiresAt, revoked: false }); return { key, plan, entitlements, expiresAt }; }
  revokeKey(key) { const value = this.keys.get(key); if (!value) throw new ApiError('KEY_NOT_FOUND', 'key not found', 404); value.revoked = true; }
  publicUser(user) { return { id: user.id, email: user.email, plan: user.plan, entitlements: [...user.entitlements], deviceCount: user.devices.size }; }
}

function json(response, status, body) { response.writeHead(status, { 'content-type': 'application/json; charset=utf-8' }); response.end(JSON.stringify(body)); }
function body(request) { return new Promise((resolve, reject) => { let data = ''; request.on('data', (chunk) => { data += chunk; if (data.length > 1024 * 1024) reject(new ApiError('BODY_TOO_LARGE', 'request body too large', 413)); }); request.on('end', () => { try { resolve(data ? JSON.parse(data) : {}); } catch { reject(new ApiError('INVALID_JSON', 'request body must be JSON')); } }); request.on('error', reject); }); }

function createServer(service = new LicenseService()) {
  return http.createServer(async (request, response) => {
    try {
      if (request.method === 'GET' && request.url === '/health') return json(response, 200, { data: { status: 'ok' } });
      const input = await body(request);
      if (request.method === 'POST' && request.url === '/auth/register') return json(response, 201, { data: service.register(input.email, input.password) });
      if (request.method === 'POST' && request.url === '/auth/login') return json(response, 200, { data: service.login(input.email, input.password, input.deviceId) });
      if (request.method === 'POST' && request.url === '/licenses/redeem') return json(response, 200, { data: service.redeem(request.headers.authorization?.replace(/^Bearer\s+/i, ''), input.key) });
      if (request.method === 'GET' && request.url === '/me') return json(response, 200, { data: service.publicUser(service.authenticate(request.headers.authorization?.replace(/^Bearer\s+/i, ''))) });
      throw new ApiError('NOT_FOUND', 'route not found', 404);
    } catch (error) { const apiError = error instanceof ApiError ? error : new ApiError('INTERNAL_ERROR', 'internal server error', 500); json(response, apiError.status, { error: { code: apiError.code, message: apiError.message } }); }
  });
}

if (require.main === module) createServer().listen(process.env.PORT || 8787, () => console.log(`STAR Labs server listening on ${process.env.PORT || 8787}`));

module.exports = { ApiError, LicenseService, createServer };
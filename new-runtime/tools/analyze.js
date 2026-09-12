'use strict';

const fs = require('node:fs');
const path = require('node:path');

const root = path.resolve(__dirname, '../..');
const required = [
  'analysis/00-evidence.md',
  'analysis/03-modmenu.md',
  'analysis/04-webview-bridge.md',
  'analysis/10-confidence-matrix.md',
  'analysis/recovered/modmenu.json',
];
const missing = required.filter((file) => !fs.existsSync(path.join(root, file)));
if (missing.length) {
  console.error(`Missing analysis artifacts: ${missing.join(', ')}`);
  process.exitCode = 1;
} else {
  console.log(`Analysis artifacts verified: ${required.length}`);
}
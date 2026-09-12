'use strict';

const fs = require('node:fs');
const path = require('node:path');

const projectRoot = path.resolve(__dirname, '..');
if (!fs.existsSync(path.join(projectRoot, 'gradlew')) && !fs.existsSync(path.join(projectRoot, 'android'))) {
  console.error('APK packaging unavailable: the repository contains the runtime harness, not an Android project.');
  process.exitCode = 2;
} else {
  console.log('Android project detected; package its generated APK here.');
}
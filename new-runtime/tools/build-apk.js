'use strict';

const fs = require('node:fs');
const path = require('node:path');
const crypto = require('node:crypto');
const { spawnSync } = require('node:child_process');

const repoRoot = path.resolve(__dirname, '../..');
const androidRoot = path.join(repoRoot, 'android');
const distDir = path.join(repoRoot, 'dist', 'apk');
const javaHome = '/usr/local/sdkman/candidates/java/21.0.12+1-ms';
const sdkHome = '/tmp/android-sdk';

function ensureDir(target) {
  fs.mkdirSync(target, { recursive: true });
}

if (!fs.existsSync(path.join(androidRoot, 'gradlew'))) {
  console.error('APK build unavailable: no independent Android project or Gradle wrapper exists yet.');
  process.exit(2);
}

ensureDir(distDir);

const env = {
  ...process.env,
  ANDROID_HOME: sdkHome,
  ANDROID_SDK_ROOT: sdkHome,
  JAVA_HOME: javaHome,
  PATH: `${javaHome}/bin:${sdkHome}/cmdline-tools/latest/bin:${sdkHome}/platform-tools:${process.env.PATH || ''}`
};

const gradle = spawnSync('bash', ['-lc', `cd "${androidRoot}" && ./gradlew assembleDebug --console=plain`], {
  env,
  stdio: 'inherit'
});

if (gradle.status !== 0) {
  process.exit(gradle.status || 1);
}

const debugApk = path.join(androidRoot, 'app', 'build', 'outputs', 'apk', 'debug', 'app-debug.apk');
if (!fs.existsSync(debugApk)) {
  console.error(`Expected APK not found: ${debugApk}`);
  process.exit(1);
}

const outputName = 'STAR-Labs-Graal-0.1.0.apk';
const outputPath = path.join(distDir, outputName);
const shaPath = `${outputPath}.sha256`;
const manifestPath = path.join(distDir, 'build-manifest.json');

fs.copyFileSync(debugApk, outputPath);
const digest = crypto.createHash('sha256').update(fs.readFileSync(outputPath)).digest('hex');
fs.writeFileSync(shaPath, `${digest}  ${outputName}\n`);
fs.writeFileSync(manifestPath, JSON.stringify({
  name: outputName,
  sha256: digest,
  sourceApk: 'android/app/build/outputs/apk/debug/app-debug.apk',
  baseEvidence: 'analysis/evidence/original-apk/GraalOnlineXCoreExecuter.apk',
  timestamp: new Date().toISOString(),
  toolchain: {
    javaHome,
    androidHome: sdkHome,
    gradleWrapper: 'android/gradlew'
  }
}, null, 2) + '\n');

console.log(`Real APK build succeeded: ${outputPath}`);
console.log(`SHA256: ${digest}`);
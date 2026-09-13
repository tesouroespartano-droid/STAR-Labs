#!/usr/bin/env bash
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
BASE_ZIP="$ROOT/starlabs/GraalOnlineXCoreExecuter(2).zip"
WORK="$ROOT/.build/graal-patched"
OUT="$ROOT/dist/apk"
SDK="/tmp/android-sdk"
JAVA_HOME="/usr/local/sdkman/candidates/java/21.0.12+1-ms"
APKTOOL_JAR="/tmp/apktool.jar"
BUILDTOOLS="$SDK/build-tools/35.0.1"
for required in unzip java javac keytool python3; do
  command -v "$required" >/dev/null || { echo "Missing prerequisite: $required" >&2; exit 1; }
done
command -v readelf >/dev/null || { echo "Missing prerequisite: readelf" >&2; exit 1; }
for required in "$APKTOOL_JAR" "$BUILDTOOLS/aapt2" "$BUILDTOOLS/apksigner" "$BUILDTOOLS/d8" "$SDK/platforms/android-34/android.jar"; do
  test -f "$required" || { echo "Missing Android toolchain file: $required" >&2; exit 1; }
done

(cd "$ROOT" && npm test && npm run lint)

mkdir -p "$WORK" "$OUT"
rm -rf "$WORK"/*

BASE_APK="$WORK/GraalOnlineXCoreExecuter(2).apk"
unzip -p "$BASE_ZIP" 'GraalOnlineXCoreExecuter(2).apk' > "$BASE_APK"
test -s "$BASE_APK"

DECODED="$WORK/decoded"
rm -rf "$DECODED"
export ANDROID_HOME="$SDK"
export ANDROID_SDK_ROOT="$SDK"
export JAVA_HOME="$JAVA_HOME"
export PATH="$JAVA_HOME/bin:$SDK/cmdline-tools/latest/bin:$SDK/platform-tools:$BUILDTOOLS:$PATH"

java -jar "$APKTOOL_JAR" d -f -o "$DECODED" "$BASE_APK"

python3 - "$DECODED" <<'PY'
from pathlib import Path
import sys

decoded = Path(sys.argv[1])
smali = decoded / 'smali_classes2' / 'com' / 'unity3d' / 'player' / 'UnityPlayerActivity.smali'
if not smali.exists():
    raise SystemExit(f'Missing UnityPlayerActivity.smali at {smali}')
text = smali.read_text()
needle = '    invoke-static {p0}, Lcom/player/render/ModMenu;->StartMenu(Landroid/content/Context;)V\n'
if needle not in text:
    raise SystemExit('XCore execution call not found in UnityPlayerActivity.smali')
text = text.replace(needle, '')
smali.write_text(text)
PY

python3 - "$DECODED" <<'PY'
from pathlib import Path
import sys

decoded = Path(sys.argv[1])
smali = decoded / 'smali_classes2' / 'com' / 'unity3d' / 'player' / 'UnityPlayerActivity.smali'
text = smali.read_text()
create_marker = '    invoke-virtual {p1}, Landroid/widget/FrameLayout;->requestFocus()Z\n'
create_call = '    invoke-static {p0}, Lcom/star/labs/graal/StarLabsBootstrap;->start(Landroid/app/Activity;)V\n'
destroy_marker = '    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V\n'
destroy_call = '    invoke-static {p0}, Lcom/star/labs/graal/StarLabsBootstrap;->stop(Landroid/app/Activity;)V\n'
if create_marker not in text or destroy_marker not in text:
  raise SystemExit('Unity lifecycle insertion point not found')
if create_call not in text:
  text = text.replace(create_marker, create_marker + create_call, 1)
if destroy_call not in text:
  text = text.replace(destroy_marker, destroy_call + destroy_marker, 1)
smali.write_text(text)
PY

bash "$ROOT/tools/xcore-regression-gate.sh" "$DECODED"

mkdir -p "$WORK/src/com/star/labs/graal" "$WORK/classes" "$WORK/dex" "$WORK/assets"
cp "$ROOT/tools/integration/StarLabsBootstrapProvider.java" "$WORK/src/com/star/labs/graal/StarLabsBootstrapProvider.java"
cp "$ROOT/tools/integration/StarLabsLifecycleCallbacks.java" "$WORK/src/com/star/labs/graal/StarLabsLifecycleCallbacks.java"
cp "$ROOT/tools/integration/StarLabsBootstrap.java" "$WORK/src/com/star/labs/graal/StarLabsBootstrap.java"
cp "$ROOT/tools/integration/StarLabsWebBridge.java" "$WORK/src/com/star/labs/graal/StarLabsWebBridge.java"
cp "$ROOT/tools/integration/StarLabsRuntimeHost.java" "$WORK/src/com/star/labs/graal/StarLabsRuntimeHost.java"
cp "$ROOT/tools/integration/star_labs.html" "$DECODED/assets/star_labs.html"

javac --release 17 -classpath "$SDK/platforms/android-34/android.jar" -d "$WORK/classes" "$WORK/src/com/star/labs/graal/StarLabsBootstrapProvider.java" "$WORK/src/com/star/labs/graal/StarLabsLifecycleCallbacks.java" "$WORK/src/com/star/labs/graal/StarLabsBootstrap.java" "$WORK/src/com/star/labs/graal/StarLabsWebBridge.java" "$WORK/src/com/star/labs/graal/StarLabsRuntimeHost.java"

d8 --release --lib "$SDK/platforms/android-34/android.jar" --output "$WORK/dex" "$WORK/classes/com/star/labs/graal/"*.class
cp "$WORK/dex/classes.dex" "$DECODED/classes4.dex"

python3 - "$DECODED/AndroidManifest.xml" <<'PY'
import sys
from pathlib import Path

p = Path(sys.argv[1])
text = p.read_text()
needle = '    </application>'
replacement = '''        <provider android:name="com.star.labs.graal.StarLabsBootstrapProvider" android:authorities="com.quattroplay.GraalClassic.starlabs" android:enabled="false" android:exported="false" android:initOrder="-1000"/>
    </application>'''

if 'com.star.labs.graal.StarLabsBootstrapProvider' not in text:
  text = text.replace(needle, replacement)
  p.write_text(text)
PY

keytool -genkeypair -keystore "$WORK/star-labs-debug.jks" -alias starlabs -keyalg RSA -keysize 2048 -validity 10000 -storepass android -keypass android -dname 'CN=STAR Labs, OU=Engineering, O=STAR Labs, L=Local, S=Local, C=US' >/dev/null 2>&1 || true

UNSIGNED_APK="$WORK/STAR-Labs-Graal-0.1.0-unsigned.apk"
APK="$OUT/STAR-Labs-Graal-0.1.0.apk"
java -jar "$APKTOOL_JAR" b "$DECODED" -o "$UNSIGNED_APK" --use-aapt2
test -s "$UNSIGNED_APK"
ZIPALIGN_HELP="$($BUILDTOOLS/zipalign --help 2>&1 || true)"
if [[ "$ZIPALIGN_HELP" == *"-P"* ]]; then
  ZIPALIGN_MODE="page-16k"
  "$BUILDTOOLS/zipalign" -f -P 16 4 "$UNSIGNED_APK" "$APK"
else
  ZIPALIGN_MODE="page-default"
  "$BUILDTOOLS/zipalign" -f -p 4 "$UNSIGNED_APK" "$APK"
fi
test -s "$APK"
if [ "$ZIPALIGN_MODE" = "page-16k" ]; then
  "$BUILDTOOLS/zipalign" -c -P 16 -v 4 "$APK" >/dev/null
else
  "$BUILDTOOLS/zipalign" -c -p -v 4 "$APK" >/dev/null
fi
unzip -t "$APK" >/dev/null
"$BUILDTOOLS/aapt2" dump badging "$APK" >/dev/null
unzip -Z1 "$APK" > "$WORK/apk-entries.txt"
grep -Fxq 'resources.arsc' "$WORK/apk-entries.txt"
for native in lib/arm64-v8a/libunity.so lib/arm64-v8a/libil2cpp.so lib/arm64-v8a/libservice.so; do
  grep -Fxq "$native" "$WORK/apk-entries.txt"
  unzip -p "$APK" "$native" > "$WORK/$(basename "$native")"
  readelf -h "$WORK/$(basename "$native")" | grep -E 'Class:[[:space:]]+ELF64|Machine:[[:space:]]+AArch64'
done
for dex in classes.dex classes2.dex classes3.dex classes4.dex; do
  if grep -Fxq "$dex" "$WORK/apk-entries.txt"; then
    unzip -p "$APK" "$dex" > "$WORK/$dex"
    "$BUILDTOOLS/dexdump" -h "$WORK/$dex" >/dev/null
  fi
done

apksigner sign \
  --ks "$WORK/star-labs-debug.jks" \
  --ks-pass pass:android \
  --key-pass pass:android \
  --v1-signing-enabled true \
  --v2-signing-enabled true \
  --v3-signing-enabled true \
  --out "$APK" "$APK"
test -s "$APK"
unzip -t "$APK" >/dev/null
apksigner verify --verbose --min-sdk-version 28 "$APK" >/dev/null
APK_SIZE_BYTES="$(stat --format='%s' "$APK")"
APK_SIZE_MIB="$(awk -v size="$APK_SIZE_BYTES" 'BEGIN { printf "%.2f", size / 1048576 }')"
APK_TIMESTAMP="$(stat --format='%y' "$APK")"
echo "APK size: $APK_SIZE_BYTES bytes ($APK_SIZE_MIB MiB)"
echo "APK timestamp: $APK_TIMESTAMP"
OUTPUT_SHA256="$(sha256sum "$APK" | awk '{print $1}')"
printf '%s  %s\n' "$OUTPUT_SHA256" "$(basename "$APK")" > "$OUT/STAR-Labs-Graal-0.1.0.apk.sha256"
CERTIFICATE_SHA256="$(apksigner verify --print-certs "$APK" 2>&1 | awk -F': ' '/Signer #1 certificate SHA-256 digest/ { print $2; exit }')"
BASE_CERTIFICATE_SHA256="$(apksigner verify --print-certs "$BASE_APK" 2>&1 | awk -F': ' '/Signer #1 certificate SHA-256 digest/ { print $2; exit }' || true)"
PACKAGE_NAME="$("$BUILDTOOLS/aapt2" dump badging "$APK" | awk -F"'" '/^package:/ { print $2; exit }')"
VERSION_CODE="$("$BUILDTOOLS/aapt2" dump badging "$APK" | awk -F"'" '/^package:/ { print $4; exit }')"
VERSION_NAME="$("$BUILDTOOLS/aapt2" dump badging "$APK" | awk -F"'" '/^package:/ { print $6; exit }')"
LAUNCHER="$("$BUILDTOOLS/aapt2" dump badging "$APK" | awk -F"'" '/^launchable-activity:/ { print $2; exit }')"

INSTALL_STATUS="not-checked"
INSTALL_OUTPUT="adb unavailable"
if command -v adb >/dev/null; then
  if adb get-state >/dev/null 2>&1; then
    INSTALL_OUTPUT="$(adb install -r "$APK" 2>&1)" || {
      echo "$INSTALL_OUTPUT" >&2
      echo "adb installation failed" >&2
      exit 1
    }
    INSTALL_STATUS="passed"
  else
    INSTALL_STATUS="device-unavailable"
    INSTALL_OUTPUT="adb present but no device/emulator is accessible"
  fi
fi
python3 - "$OUT/installation-validation.json" "$INSTALL_STATUS" "$INSTALL_OUTPUT" <<'PY'
import json
import sys
from pathlib import Path

Path(sys.argv[1]).write_text(json.dumps({
    "status": sys.argv[2],
    "output": sys.argv[3],
}, indent=2) + "\n")
PY

cat > "$OUT/build-manifest.json" <<EOF
{
  "name": "STAR-Labs-Graal-0.1.0.apk",
  "filename": "STAR-Labs-Graal-0.1.0.apk",
  "sizeBytes": $APK_SIZE_BYTES,
  "sizeMiB": $APK_SIZE_MIB,
  "buildTimestamp": "$(date -u +%Y-%m-%dT%H:%M:%SZ)",
  "base": "analysis/evidence/original-apk/GraalOnlineXCoreExecuter.apk",
  "baseSha256": "1589cb10f86c171c54ce3bcf1c4ebf4679ee0011c4b6a63ba00f1c9ffa2ef9aa",
  "baseCertificateSha256": "$BASE_CERTIFICATE_SHA256",
  "outputSha256": "$OUTPUT_SHA256",
  "packageName": "$PACKAGE_NAME",
  "versionCode": "$VERSION_CODE",
  "versionName": "$VERSION_NAME",
  "launcher": "$LAUNCHER",
  "certificateSha256": "$CERTIFICATE_SHA256",
  "status": "real-modified-apk-generated",
  "bootstrap": "com.star.labs.graal.StarLabsBootstrap",
  "androidBridge": "com.star.labs.graal.StarLabsWebBridge",
  "runtimeHost": "com.star.labs.graal.StarLabsRuntimeHost",
  "bootstrapProvider": "com.star.labs.graal.StarLabsBootstrapProvider",
  "unityActivity": "com.unity3d.player.UnityPlayerActivity",
  "xCoreActivePathDisabled": "UnityPlayerActivity ModMenu.StartMenu call removed; own STAR Labs bootstrap injected after Unity content initialization",
  "validation": {
    "nonEmpty": true,
    "zipIntegrity": true,
    "manifest": true,
    "dex": true,
    "signature": true,
    "zipalign": "$ZIPALIGN_MODE",
    "installation": "$INSTALL_STATUS"
  },
  "toolchain": {
    "apktool": "2.9.1",
    "java": "/usr/local/sdkman/candidates/java/21.0.12+1-ms",
    "sdk": "/tmp/android-sdk"
  }
}
EOF

echo "Modified APK generated at $OUT/STAR-Labs-Graal-0.1.0.apk"

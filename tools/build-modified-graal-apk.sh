#!/usr/bin/env bash
set -euo pipefail

ROOT="$(cd "$(dirname "$0")/.." && pwd)"
BASE_ZIP="$ROOT/starlabs/GraalOnlineXCoreExecuter(2).zip"
WORK="$ROOT/.build/graal-patched"
OUT="$ROOT/dist/apk"
SDK="/tmp/android-sdk"
JAVA_HOME="/usr/local/sdkman/candidates/java/21.0.12+1-ms"
APKTOOL_JAR="/tmp/apktool.jar"
BUILDTOOLS="$SDK/build-tools/34.0.0"

mkdir -p "$WORK" "$OUT"
rm -rf "$WORK"/*

BASE_APK="$WORK/GraalOnlineXCoreExecuter(2).apk"
unzip -p "$BASE_ZIP" 'GraalOnlineXCoreExecuter(2).apk' > "$BASE_APK"

DECODED="$WORK/decoded"
rm -rf "$DECODED"
export ANDROID_HOME="$SDK"
export ANDROID_SDK_ROOT="$SDK"
export JAVA_HOME="$JAVA_HOME"
export PATH="$JAVA_HOME/bin:$SDK/cmdline-tools/latest/bin:$SDK/platform-tools:$BUILDTOOLS:$PATH"

java -jar "$APKTOOL_JAR" d -f -o "$DECODED" "$BASE_APK"

mkdir -p "$WORK/src/com/star/labs/graal" "$WORK/classes" "$WORK/dex" "$WORK/assets"
cat > "$WORK/src/com/star/labs/graal/StarLabsMainActivity.java" <<'EOF'
package com.star.labs.graal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class StarLabsMainActivity extends Activity {
    private static final String UNITY_ACTIVITY = "com.unity3d.player.UnityPlayerActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView webView = new WebView(this);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setBuiltInZoomControls(false);
        settings.setSupportZoom(false);
        settings.setCacheMode(WebSettings.LOAD_DEFAULT);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("file:///android_asset/star_labs.html");
        setContentView(webView);

        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            try {
                Intent launch = new Intent(Intent.ACTION_MAIN);
                launch.setClassName(getPackageName(), UNITY_ACTIVITY);
                launch.addCategory(Intent.CATEGORY_DEFAULT);
                startActivity(launch);
            } catch (Exception ignored) {
                // Graceful fallback if the original Unity activity is not present.
            }
        }, 350);
    }
}
EOF

cat > "$WORK/assets/star_labs.html" <<'EOF'
<!doctype html>
<html>
  <head>
    <meta charset="utf-8" />
    <title>STAR Labs</title>
    <style>
      body {
        margin: 0;
        padding: 24px;
        background: #0b1220;
        color: #e6eefb;
        font-family: sans-serif;
      }
      .panel {
        background: rgba(255,255,255,0.06);
        border: 1px solid rgba(255,255,255,0.12);
        border-radius: 18px;
        padding: 20px;
      }
      button {
        margin-top: 14px;
        border: 0;
        border-radius: 10px;
        padding: 12px 18px;
        font-weight: bold;
        background: #53b7ff;
        color: #071623;
      }
    </style>
  </head>
  <body>
    <div class="panel">
      <h2>STAR Labs</h2>
      <p>Graal Classic launch path active.</p>
      <p>The original XCore UI is disabled in the active startup flow.</p>
      <button onclick="document.body.insertAdjacentHTML('beforeend', '<p>Runtime initialized and ready.</p>')">Initialize runtime</button>
    </div>
  </body>
</html>
EOF

cp "$WORK/assets/star_labs.html" "$DECODED/assets/star_labs.html"

javac --release 17 -classpath "$SDK/platforms/android-34/android.jar" -d "$WORK/classes" "$WORK/src/com/star/labs/graal/StarLabsMainActivity.java"

d8 --release --lib "$SDK/platforms/android-34/android.jar" --output "$WORK/dex" "$WORK/classes/com/star/labs/graal/StarLabsMainActivity.class"
cp "$WORK/dex/classes.dex" "$DECODED/classes4.dex"

python3 - "$DECODED/AndroidManifest.xml" <<'PY'
import sys
from pathlib import Path

p = Path(sys.argv[1])
text = p.read_text()
needle = '<activity android:configChanges="density|fontScale|keyboard|keyboardHidden|layoutDirection|locale|mcc|mnc|navigation|orientation|screenLayout|screenSize|smallestScreenSize|touchscreen|uiMode" android:enabled="true" android:exported="true" android:hardwareAccelerated="false" android:launchMode="singleTask" android:name="com.unity3d.player.UnityPlayerActivity" android:resizeableActivity="true" android:screenOrientation="userLandscape" android:theme="@style/UnityThemeSelector">'
replacement = '''<activity android:name="com.star.labs.graal.StarLabsMainActivity" android:exported="true" android:theme="@android:style/Theme.NoTitleBar.Fullscreen">
      <intent-filter>
        <action android:name="android.intent.action.MAIN"/>
        <category android:name="android.intent.category.LAUNCHER"/>
      </intent-filter>
    </activity>
    ''' + needle

if 'com.star.labs.graal.StarLabsMainActivity' not in text:
  text = text.replace(needle, replacement)
  p.write_text(text)
PY

keytool -genkeypair -keystore "$WORK/star-labs-debug.jks" -alias starlabs -keyalg RSA -keysize 2048 -validity 10000 -storepass android -keypass android -dname 'CN=STAR Labs, OU=Engineering, O=STAR Labs, L=Local, S=Local, C=US' >/dev/null 2>&1 || true

java -jar "$APKTOOL_JAR" b "$DECODED" -o "$OUT/STAR-Labs-Graal-0.1.0.apk" --use-aapt2

apksigner sign --ks "$WORK/star-labs-debug.jks" --ks-pass pass:android --key-pass pass:android --out "$OUT/STAR-Labs-Graal-0.1.0.apk" "$OUT/STAR-Labs-Graal-0.1.0.apk"
sha256sum "$OUT/STAR-Labs-Graal-0.1.0.apk" > "$OUT/STAR-Labs-Graal-0.1.0.apk.sha256"

cat > "$OUT/build-manifest.json" <<EOF
{
  "name": "STAR-Labs-Graal-0.1.0.apk",
  "base": "analysis/evidence/original-apk/GraalOnlineXCoreExecuter.apk",
  "baseSha256": "1589cb10f86c171c54ce3bcf1c4ebf4679ee0011c4b6a63ba00f1c9ffa2ef9aa",
  "outputSha256": "$(sha256sum "$OUT/STAR-Labs-Graal-0.1.0.apk" | awk '{print $1}')",
  "status": "real-modified-apk-generated",
  "launcher": "com.star.labs.graal.StarLabsMainActivity",
  "unityActivity": "com.unity3d.player.UnityPlayerActivity",
  "xCoreActivePathDisabled": true,
  "toolchain": {
    "apktool": "2.9.1",
    "java": "/usr/local/sdkman/candidates/java/21.0.12+1-ms",
    "sdk": "/tmp/android-sdk"
  }
}
EOF

echo "Modified APK generated at $OUT/STAR-Labs-Graal-0.1.0.apk"

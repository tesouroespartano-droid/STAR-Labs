#!/usr/bin/env bash
set -euo pipefail

DECODED="${1:?decoded APK directory is required}"
ACTIVITY="$DECODED/smali_classes2/com/unity3d/player/UnityPlayerActivity.smali"
MANIFEST="$DECODED/AndroidManifest.xml"

test -f "$ACTIVITY" || { echo "XCore gate: UnityPlayerActivity.smali missing" >&2; exit 1; }
test -f "$MANIFEST" || { echo "XCore gate: AndroidManifest.xml missing" >&2; exit 1; }

if grep -Fq 'ModMenu;->StartMenu(Landroid/content/Context;)V' "$ACTIVITY"; then
  echo "XCore gate failed: UnityPlayerActivity calls ModMenu.StartMenu" >&2
  exit 1
fi

if grep -RIn --include='*.smali' 'invoke-.*ModMenu;->StartMenu(Landroid/content/Context;)V' "$DECODED/smali" "$DECODED/smali_classes2" "$DECODED/smali_classes3" 2>/dev/null | grep -v '/com/player/render/ModMenu.smali:' | grep -q .; then
  echo "XCore gate failed: an external caller invokes ModMenu.StartMenu" >&2
  exit 1
fi

if grep -Fq 'android.intent.category.LAUNCHER' "$MANIFEST" && grep -Fq 'com.player.render' "$MANIFEST"; then
  echo "XCore gate failed: XCore package is registered as a launcher" >&2
  exit 1
fi

if grep -Fq 'com.player.render.ModMenu' "$ACTIVITY"; then
  echo "XCore gate failed: UnityPlayerActivity still references ModMenu" >&2
  exit 1
fi

if ! grep -Fq 'StarLabsBootstrap;->start(Landroid/app/Activity;)V' "$ACTIVITY"; then
  echo "STAR Labs gate failed: UnityPlayerActivity has no own bootstrap call" >&2
  exit 1
fi

if grep -RIn --include='*.java' -E 'ModMenu|menu\.holy|xCoreScripts|WebMessageChannel' "$DECODED" 2>/dev/null | grep -q .; then
  echo "XCore gate failed: STAR Labs integration source references XCore infrastructure" >&2
  exit 1
fi

echo "XCore regression gate: passed"
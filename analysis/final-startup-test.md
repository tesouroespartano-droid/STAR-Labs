# Final startup validation

## Status

The V8 APK exists and passed static/package/alignment validation, but no on-device startup test was performed.

- APK: `dist/apk/STAR-Labs-Graal-0.1.0.apk`
- Package: `com.quattroplay.GraalClassic`
- Launcher: `com.unity3d.player.UnityPlayerActivity`
- STAR Labs bootstrap: `com.star.labs.graal.StarLabsBootstrapProvider`
- `adb` is present, but no Android device/emulator is accessible.

## Required acceptance test

The V5 prompt expects an Android validation flow equivalent to:

1. launch final APK
2. Graal starts
3. XCore key/login screen does not appear
4. STAR Labs initializes
5. editor/executor opens
6. real script loads and executes
7. panel renders
8. logs/errors work
9. server communication works

## Actual environment status

- `adb` installation status: `device-unavailable`, recorded in `dist/apk/installation-validation.json`.
- No Android emulator/device launch log exists.
- `npm test` passes 11/11 and `npm run lint` passes for the independent runtime, but those checks do not prove APK startup.
- Build Tools 35.0.1 verified 16 KiB page alignment; the final APK uses APK Signature Scheme v3.

## Conclusion

A real startup validation remains unverified until the APK is installed on an Android device/emulator. The V8 build artifact, static checks, alignment, certificate metadata, and local runtime corpus are complete; runtime behavior inside Android is not claimed from them.

## Confidence

- APK startup test environment: **BLOCKED / UNAVAILABLE**
- Final startup validation result: **UNVERIFIED**
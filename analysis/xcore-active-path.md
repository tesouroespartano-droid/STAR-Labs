# XCore active path assessment

## Question

Can XCore still start, control the scripting UI, run its own scripting runtime, or control licensing in the final application?

## Evidence and conclusion

This repository contains evidence only for the original supplied APK and its custom overlay layer. The active path that is proven in the APK is:

1. `ModMenu` is initialized from the custom class path in `classes2.dex`.
2. `ModMenu.<clinit>` loads `libservice.so` with `System.loadLibrary("service")`.
3. The custom Android overlay creates a fullscreen `WebView`.
4. A `WebMessageChannel` is created and a JS bootstrap message is sent: `{"type":"init"}`.
5. Native JSON messages are forwarded through the Java/native bridge (`xC`, `xJ`, `xF`, `xG`, etc.).
6. External directory `xCoreScripts` is created and used as the script host path.

This establishes that the supplied APK contains a custom XCore-like active path in the application lifecycle as observed by analysis. However, it does not establish that a final modified Graal APK exists in this repository or that the XCore path remains active in a real production build.

## Final finding for this repository

- For the base APK evidence: **XCore is active as a custom runtime/overlay path and is user-facing in the observed application behavior.**
- For the final deliverable required by the V5 prompt: **no final modified Graal APK is present, no Android build has been produced, and the repository intentionally blocks the APK build because no independent Android project or Gradle wrapper exists.**
- Therefore, the current honest status is: **the XCore active path is proven in the evidence APK, while the final integrated product is not built and cannot be claimed as complete.**

## Confidence

- `ModMenu` active path: **VERIFIED**
- final product integration: **BLOCKED / UNVERIFIED**
- final XCore deactivation in a built APK: **NOT YET IMPLEMENTED**
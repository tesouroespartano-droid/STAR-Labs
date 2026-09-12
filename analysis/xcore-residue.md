# XCore residue assessment

## Question

What recognizable XCore artifacts remain in the package and why?

## Recognizable residue in the evidence APK

The following artifacts are still recognizable and are consistent with an added XCore-like layer:

- `com.player.render.ModMenu` in the DEX classes.
- `System.loadLibrary("service")` in the custom Java code.
- `lib/arm64-v8a/libservice.so` as the native bridge library.
- `xCoreScripts` as an externally managed script directory.
- `http://menu.holy/` as the overlay base URL.
- Java native methods `xA` through `xQ`.
- WebView/`WebMessageChannel`/`WebMessagePort` bridge logic.
- Native registration and JNI startup path for the Java-to-native bridge.

## Why these artifacts are residue rather than proof of a complete final system

These items are evidence of an added scripting/overlay subsystem in the APK. They are recognizable as custom components, but the repository does not contain:

- the full final Java/Kotlin Android project;
- the integrated Graal client source modified to remove the active XCore UI;
- the real script runtime/compiler pipeline;
- the final signed APK;
- the installation/startup validation output.

Therefore, the residue is best characterized as **forensic evidence of an embedded custom layer** rather than a fully functioning production integration.

## Active vs inert distinction

This distinction matters:

- **Active**: the code path that starts the custom menu, loads the native bridge, initializes the WebView, and routes script messages.
- **Inert residue**: strings, class names, and library names that remain in the package but are not necessarily controlling the final user experience.

The present repository proves the active path in the evidence APK, but not a final deactivated or replaced path in a produced app. That is exactly why the build is intentionally blocked until a real Android integration exists.

## Confidence

- XCore-like active path in evidence APK: **VERIFIED**
- Residue classification: **VERIFIED**
- Final APK deactivation status: **BLOCKED / UNVERIFIED**
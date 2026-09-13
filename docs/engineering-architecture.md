# STAR Labs — Engineering Architecture

## V12-4 runtime decision

The Android execution host is implemented in Java inside the Graal APK process. The first proof of concept uses `StarLabsRuntimeHost`, a pure-Java component with no Node.js, HTTP server, XCore dependency, `libservice.so`, or external backend.

### Alternatives evaluated

- JavaScript engine embedded in Android: not selected for the first checkpoint because it would add a second language runtime and duplicate the current GS2 core semantics.
- Node.js on Android: rejected for the local APK because it would add a large runtime and does not establish a native in-process contract with the current client.
- C/C++ VM: deferred; useful for later performance work, but unnecessary for proving the execution path and increases JNI surface.
- Java/Kotlin VM: selected for the POC because it compiles with the existing Android toolchain, runs in-process, has low startup overhead, and can later share registry/bridge contracts.
- Transpilation/bytecode: deferred until the supported AST/semantic contract is broader and measured.

## Real APK flow

```text
WebView star_labs.html
  -> StarLabsWebBridge.runScript(source)
  -> StarLabsRuntimeHost.run(source)
  -> Java parser/expression evaluator
  -> Result { state, code, message, output }
  -> WebView Console
```

The Android bridge also persists settings and scripts through `SharedPreferences`. The bridge is STAR Labs-owned and does not call `ModMenu`, `menu.holy`, `xCoreScripts`, `WebMessageChannel`, or `libservice.so`.

## Classes and files

- `tools/integration/StarLabsBootstrap.java`: creates the own WebView inside `UnityPlayerActivity` after Unity content initialization.
- `tools/integration/StarLabsWebBridge.java`: JavaScript bridge for persistence, runtime status, and real execution.
- `tools/integration/StarLabsRuntimeHost.java`: first in-process Java execution host.
- `tools/integration/star_labs.html`: editor/navigation/console surface; it does not contain the VM.
- `new-runtime/src/engine.js`: Node adapter used by tests and development.
- `new-runtime/src/function-registry.js`: shared metadata contract direction for future Android registry integration.
- `new-runtime/src/client-bridge.js`: independent bridge contract direction.
- `tools/build-modified-graal-apk.sh`: compiles the Java host into `classes4.dex` and packages it in the modified Graal APK.

## POC behavior

The proof-of-concept source is:

```gs2
function add(a, b) { return a + b; }
echo(add(10, 20));
```

The host returns output `30.0` and the WebView appends the returned message/output to Console. Unknown functions return an explicit error code such as `GS2_UNKNOWN_FUNCTION`; no successful result is pre-programmed.

## Lifecycle

`UnityPlayerActivity.onCreate()` remains the real launcher and Unity initializes first. The build injects `StarLabsBootstrap.start(Activity)` after Unity's content frame has requested focus. `onDestroy()` calls `StarLabsBootstrap.stop(Activity)`, which removes and destroys only the STAR Labs WebView.

## Client bridge

The POC currently reaches the Android runtime host and returns execution output. Graal/Unity client APIs are not fabricated: a future handler without a validated client surface must return an explicit unavailable error. No XCore component is used as a bridge or executor.

## Known limitations

- The Java host currently covers only the POC subset: function declarations with simple `return` expressions, arithmetic, local `let`, calls, literals, and `echo`.
- The full Node parser/VM is not duplicated into Java yet; the shared-core/adapter boundary is the next engineering step.
- `//#CLIENTSIDE`, `this`, `temp`, arrays, objects, loops, and documented client APIs are represented in the Node analysis fixtures but are not yet fully executable by the Android POC host.
- Physical E2E validation requires an accessible Android device/emulator. Static APK checks do not prove the UI interaction on hardware.

## What did not work

The previous `runtimeStatus()` returned `unavailable` because only the Node harness existed and no Android runtime host was packaged. V12-4 replaces that path with the Java host and an executable `runScript` bridge; the status now reports the in-process host as ready.

## Next steps

1. Expand the Android host from the POC grammar using the documented/reversed language coverage.
2. Share or generate a common AST/IR contract instead of maintaining independent parser semantics.
3. Connect validated registry entries and explicit Graal/Unity adapters.
4. Add device E2E tests for Run, Console, Problems, Stop, Save, and multiple tabs.
# XCore / Executor APK — Reverse Engineering & Reconstruction Brief

## Mission
Analyze the supplied modified Android APK as a black box and distinguish the original GraalOnline client from the added XCore/executor layer.

The goal is **not** to reproduce the original game's source code. The goal is to map the added editor/runtime/bridge architecture so a new, independently implemented GS2 execution system can be designed later.

Do not modify the original evidence. Keep all recovered/decompiled artifacts separate from any new implementation.

## Evidence already established
- APK contains exactly 3 DEX files: classes.dex, classes2.dex, classes3.dex.
- APK is Unity/IL2CPP-based.
- `lib/arm64-v8a/libil2cpp.so` is ~44.5 MB.
- `lib/arm64-v8a/libunity.so` is ~21 MB.
- `lib/arm64-v8a/libservice.so` is ~301 KB.
- `assets/bin/Data/Managed/Metadata/global-metadata.dat` is ~11.7 MB.
- `classes2.dex` contains a custom-looking package `com.player.render` and class `com.player.render.ModMenu`.
- `ModMenu` contains a string/field for `xCoreScripts` and has `initScriptsDir()`.
- `ModMenu` creates a WebView and uses a WebMessageChannel/WebMessagePort bridge.
- `ModMenu.<clinit>` loads `libservice.so`.
- `ModMenu` has native methods named `xA`, `xB`, `xC`, `xE`, `xF`, `xG`, `xH`, `xI`, `xJ`, `xK`, `xP`, `xQ`.
- `ModMenu` includes `StartMenu`, `setupChannel`, `initScriptsDir`, and helper methods that load HTML into the WebView.
- The WebView base URL observed in code is `http://menu.holy/`.
- `libservice.so` imports `dlopen`, `dlsym`, `__system_property_get`, socket/network APIs, and exports/contains `JNI_OnLoad`.
- Prior binary inspection identified `gl_ctx_init` and `gl_set_scripts_dir` as relevant symbols/strings in `libservice.so`.
- APK contains Unity/Quattro/NativeScript-related metadata strings, including `TGraalVar`, `TGraalClientVar`, `TActionScriptVar`, `TriggerGet`, `TriggerSet`, `TriggerFunction`, and Quattro-related assembly names.
- APK contains no obvious `.gs` script files in its ZIP entry list; scripts are expected to be external in `xCoreScripts`.

## Key questions to answer
1. Which classes/files are original game code vs added XCore code?
2. Is `com.player.render.ModMenu` entirely custom, and what exactly does each method do?
3. What is the complete WebView protocol between the editor UI and Android/native code?
4. What do native methods xA..xQ actually perform?
5. What does `libservice.so` load, where from, and why?
6. What are `gl_ctx_init` and `gl_set_scripts_dir` used for?
7. Is there an encrypted/downloaded runtime payload? Identify its format, location, verification flow, and loader path. Do not bypass protected access; document the mechanism.
8. Where does `.gs` text enter the system?
9. Where is GS2 parsed/interpreted/compiled/executed?
10. How are GS2 names resolved to game objects/functions/properties?
11. How do `player.chat`, `hook_func`, `getcalltrace`, and panel APIs map to underlying runtime mechanisms?
12. Which Quattro/NativeScript types belong to the original client and which are used by the added executor?
13. What is the license/key gate? Identify client/server interfaces and state machine, without attempting to defeat or bypass it.
14. What part of the editor is HTML/CSS/JS and what part is native Android/Unity?
15. Can the architecture be reproduced independently without copying proprietary implementation details?

## Analysis procedure
### Phase A — Inventory
- Extract APK without changing it.
- Record SHA-256 of APK and all native libraries.
- Produce a full file tree with sizes.
- Detect duplicate files and compression methods.
- Identify all DEX, ELF, Unity metadata, assets, resources, and manifests.

### Phase B — Android/DEX
- Decompile all 3 DEX files.
- Build a package/class inventory.
- Flag packages not obviously belonging to standard Android/Google/Firebase/Unity/Jetpack.
- Prioritize `com.player.render.*`.
- For each custom-looking class, record methods, fields, native methods, strings, and references/callers.
- Construct a call graph for ModMenu and related classes.
- Recover the exact WebView message protocol.

### Phase C — Native
- Analyze `libservice.so` as a stripped ARM64 ELF.
- Enumerate dynamic symbols, imports, relocations, strings, JNI registration, init/fini arrays, and exported/located symbols.
- Recover the `JNI_OnLoad` registration path.
- Resolve what each native Java method xA..xQ maps to.
- Trace file/network operations and dynamic loading.
- Search for string/byte patterns associated with XCore, GS2, script, menu.holy, xCoreScripts, payload/hash/signature names.

### Phase D — IL2CPP
- Use `global-metadata.dat` + `libil2cpp.so` with appropriate IL2CPP tooling.
- Generate metadata/dump artifacts rather than editing binaries.
- Locate namespaces/types/methods containing:
  - Graal
    - Quattro
      - NativeScript
        - Script
          - Hook
            - Trace
              - Var
                - Reflection
                  - VisualScripting
                  - Determine actual cross-boundary calls and object/property/function resolution.
                  - Distinguish Unity/Graal official systems from XCore-specific call paths using references and call flow, not names alone.

                  ### Phase E — Runtime model
                  Build a verified pipeline diagram for:

                  `xCoreScripts/<any>.gs`
                  → script discovery/load
                  → parser/compiler/interpreter
                  → runtime object model
                  → function/property dispatch
                  → native/Quattro bridge
                  → game client object
                  → return/callback/log

                  Also map:
                  - hook installation/removal
                  - function call tracing
                  - callback dispatch
                  - panel creation/update/destroy
                  - external HTML/CSS/JS loading
                  - script lifecycle
                  - error handling

                  ### Phase F — Licensing
                  Document only observable mechanics:
                  - where key/session data enters the app
                  - what server endpoints are used
                  - what client state gates the runtime
                  - what capabilities/plan flags appear to be enforced
                  - what happens on expired/invalid authorization

                  Do not remove, bypass, forge, or weaken third-party licensing protections.

                  ## Deliverables
                  Create these files:

                  - `analysis/00-evidence.md`
                  - `analysis/01-apk-tree.txt`
                  - `analysis/02-custom-components.md`
                  - `analysis/03-modmenu.md`
                  - `analysis/04-webview-bridge.md`
                  - `analysis/05-libservice.md`
                  - `analysis/06-il2cpp-runtime.md`
                  - `analysis/07-gs2-execution-pipeline.md`
                  - `analysis/08-quattro-nativescript-boundary.md`
                  - `analysis/09-licensing-architecture.md`
                  - `analysis/10-confidence-matrix.md`
                  - `analysis/callgraphs/*.dot`
                  - `analysis/strings/*.txt`
                  - `analysis/recovered/*.json`

                  ## Confidence rules
                  Every conclusion must be labeled:
                  - VERIFIED — directly supported by disassembly/decompiled code/metadata.
                  - STRONG — supported by multiple independent references.
                  - PLAUSIBLE — architecture inferred from names/structure but not yet proven.
                  - UNKNOWN — insufficient evidence.

                  Never label something VERIFIED only because a class or method name sounds relevant.

                  ## New implementation target
                  Only after the reverse-engineering report is complete, design an independent implementation under `new-runtime/`.

                  Target architecture:

                  Editor UI
                    → script store
                      → GS2 parser/runtime
                        → independent object/binding API
                          → bridge abstraction
                            → client integration owned by the project

                            Requirements for the new system:
                            - own source code
                            - own protocol
                            - own server
                            - own license/key system
                            - own UI
                            - clean separation of editor/runtime/bridge/server
                            - test harness with mocked game objects
                            - unit tests for parser, variables, function dispatch, callbacks, hooks, tracing, and panels
                            - never copy third-party proprietary binaries, encrypted payloads, private keys, credentials, or source code

                            ## Build pipeline
                            The final repository should expose scripts such as:

                            `npm run analyze`
                            - regenerate reports without modifying evidence

                            `npm run generate-runtime`
                            - generate/compile the independent runtime components

                            `npm run build-apk`
                            - run the complete local build pipeline

                            `npm run package-apk`
                            - produce the final installable APK

                            The build must be reproducible from a clean checkout.

                            ## Agent behavior
                            - Work incrementally.
                            - Do not make destructive edits to the original APK or evidence directory.
                            - Before implementing a replacement component, document the observed interface it replaces.
                            - Prefer small validated steps over a giant rewrite.
                            - When an artifact cannot be recovered exactly, implement an independent substitute and clearly state the difference.
                            
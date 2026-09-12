# STAR LABS — MASTER EXECUTION PROMPT V5
## ONE source of truth: build the actual modified Graal APK with STAR Labs integrated

---

## 1. READ THIS FIRST — THIS REPLACES ALL PREVIOUS PROMPTS

This document is the single authoritative directive for this project.

Do NOT copy, append, merge, restate, or preserve earlier STAR Labs prompts as additional instructions.

Older prompts are historical context only.

There must be ONE plan, ONE architecture, ONE final objective.

Do not introduce a second competing architecture merely because an older prompt described one differently.

Do not repeatedly redesign things that this prompt has already settled.

When a requirement is complete, move forward.

When something is uncertain, investigate it and record the evidence.

---

# 2. THE FINAL PRODUCT

The final deliverable is ONE installable APK.

That APK must be based on the supplied/base GraalOnline Classic APK and must contain the original Graal client plus the independently engineered STAR Labs system.

Conceptually:

    BASE GRAAL APK
          +
       STAR LABS
          =
    MODIFIED GRAAL APK

The user installs that one APK.

The user opens it.

The Graal client starts.

STAR Labs is already integrated into the same application.

The user can open the STAR Labs executor/editor/panels while the game is running.

This is NOT a request for:

- a separate STAR Labs APK;
- a launcher;
- a mock Android application;
- a standalone script interpreter;
- a new game that resembles Graal.

Those do not satisfy the project.

THE MODIFIED GRAAL APK IS THE PRODUCT.

---

# 3. SUCCESS CRITERION

Do not declare the project complete until the repository contains evidence for the complete path:

    supplied/base Graal APK
            ↓
    deep analysis
            ↓
    STAR Labs implementation
            ↓
    integration into that APK
            ↓
    unwanted active XCore path removed/deactivated
            ↓
    build/package/sign
            ↓
    final APK
            ↓
    installation/startup validation
            ↓
    Graal running with STAR Labs available

A parser, VM, server, editor, or Android shell by itself is not completion.

If a genuine blocker prevents the final APK from being built or tested, state the exact blocker instead of pretending the project is finished.

---

# 4. GRAAL REMAINS THE BASE APPLICATION

Start from the supplied/base GraalOnline Classic APK or a reproducibly extracted/project representation of that APK.

Preserve, as technically possible:

- original game assets;
- original resources;
- original libraries required by the client;
- original managed metadata required by the client;
- original game data;
- original networking/runtime components required by the game;
- original package functionality needed for normal client operation.

Do not replace the game with a new implementation.

Every intentional change must be recorded in an integration manifest.

The final package must still be a Graal client, with STAR Labs added to it.

---

# 5. XCORE: REMOVE THE ACTIVE SCRIPTING SYSTEM FROM THE FINAL EXPERIENCE

The unwanted XCore scripting system must not remain the active scripting UI/runtime.

In particular, the old XCore startup key/login/editor screen must not appear in the final application.

Do not simply place another window on top of it.

Determine what actually causes the XCore system to initialize:

- Android startup;
- Activity/Application code;
- WebView;
- JavaScript interface;
- WebMessageChannel;
- JNI;
- native loading;
- background service/process;
- persistent configuration;
- licensing/key flow;
- editor initialization;
- script runtime initialization.

Trace the startup path and remove or deactivate the XCore path from the active application.

Then initialize STAR Labs in its place.

The desired state is:

    launch APK
       ↓
    Graal starts
       ↓
    STAR Labs initializes
       ↓
    STAR Labs is the scripting environment
       ↓
    XCore is not controlling the user experience

Do not reuse XCore private credentials, secret keys, private licensing material, or proprietary server authentication.

STAR Labs must have its own backend, licensing and project-owned signing material.

---

# 6. XCORE RESIDUAL FORENSICS

Perform two separate checks.

First:

    analysis/xcore-active-path.md

This answers:

> Can XCore still start, control the scripting UI, run its own scripting runtime, or control licensing in the final application?

Second:

    analysis/xcore-residue.md

This answers:

> What recognizable XCore artifacts remain in the package and why?

Do not confuse inert strings/resources with an active subsystem.

The requirement is that XCore is not active or user-facing as the scripting system.

---

# 7. DEEP APK REVERSE ENGINEERING

Do the hard investigation instead of guessing.

Use the strongest available tools, such as:

- apktool;
- JADX;
- baksmali/smali;
- Androguard;
- Ghidra;
- rizin/radare2;
- readelf;
- nm;
- objdump/llvm-objdump;
- strings;
- IL2CPP metadata tools;
- Python binary/DEX/ELF tooling;
- Frida in an authorized environment;
- binary diffing;
- cross-reference analysis.

Investigate:

- Android startup;
- manifest;
- Activities;
- services;
- WebViews;
- JS bridges;
- WebMessageChannel;
- JNI registration;
- dynamic loading;
- native libraries;
- libservice.so;
- libqplayandroid.so;
- libil2cpp.so;
- global-metadata.dat;
- custom DEX;
- script loader;
- VM/runtime initialization;
- function lookup;
- event dispatch;
- panels;
- editor;
- licensing paths.

If a tool fails, use another and document the limitation.

---

# 8. USE THE OKHO / HOOKSGC RESEARCH AS ARCHITECTURAL EVIDENCE

The supplied historical reverse-engineering work and hooksgc_classic_to.js are important research references.

Use them to understand concepts such as:

- function lookup;
- VM context;
- values/variants;
- variable resolution;
- script object creation;
- descriptors;
- bytecode loading;
- registration;
- event dispatch;
- function calls;
- hooks;
- call tracing.

Historical offsets are historical evidence only.

Never assume an old address is valid in the current APK.

For every important historical concept, determine:

    historical concept
        ↓
    current equivalent, if found
        ↓
    evidence
        ↓
    confidence
        ↓
    STAR Labs abstraction

Use:

- VERIFIED
- STRONG
- PLAUSIBLE
- UNKNOWN

---

# 9. GS2 IS THE COMPATIBILITY TARGET

The executor is meant to support a broad GS2 language/runtime surface, not a tiny command list.

Build one compatibility inventory from:

1. supplied GS2 documentation;
2. current APK evidence;
3. historical reverse-engineering evidence;
4. authorized runtime observations where available;
5. compiler/runtime behavior.

The inventory should cover the documented language and runtime surface, including as applicable:

- variables and scopes;
- expressions and operators;
- strings;
- arrays/collections;
- objects;
- properties;
- functions;
- parameters/returns;
- conditions;
- loops;
- callbacks;
- events;
- timers;
- NPC/game-world APIs;
- graphics;
- GUI/panels;
- file/config APIs;
- audio;
- math;
- utility/debug functionality;
- hooks;
- call tracing;
- panel APIs;
- _gs2call;
- additional documented APIs discovered during research.

Do not call it complete merely because common examples work.

Every discovered feature must be classified as:

    IMPLEMENTED
    IMPLEMENTED + CLIENT ADAPTER
    PARTIAL
    STUB/ARCHITECTURAL PLACEHOLDER
    UNSUPPORTED
    UNKNOWN

---

# 10. NO ARTIFICIAL SCRIPT LENGTH LIMIT

There is no arbitrary 1200-line ceiling.

1200 lines is only a stress-test example.

The user may create scripts of 10, 500, 1200, 5000, 10000+ lines, or larger when device/runtime resources allow.

The architecture must therefore support genuinely large source files and programs.

Do not implement a design that inherently caps programs at a small number of lines.

---

# 11. REAL GS2 LANGUAGE PIPELINE

Replace the old regex/line-oriented implementation as the main execution model.

Use:

    source
      ↓
    lexer
      ↓
    parser
      ↓
    AST
      ↓
    semantic analysis
      ↓
    IR / bytecode
      ↓
    VM

The parser must understand nested syntax.

The AST must represent actual program structure.

The compiler must generate explicit control flow.

The VM must execute compiled functions/programs.

---

# 12. RUNTIME CORE

Implement a real runtime with clear subsystems:

    VM
      ├── values/variants
      ├── frames/call stack
      ├── scopes
      ├── function resolver
      ├── object resolver
      ├── property system
      ├── event system
      ├── timer scheduler
      ├── hook registry
      ├── call tracing
      ├── panel manager
      ├── diagnostics
      └── client adapter

Do not put the whole runtime into the parser.

---

# 13. VALUES, OBJECTS AND FUNCTIONS

Implement proper runtime representations for supported semantics.

At minimum distinguish:

- null;
- boolean;
- number;
- string;
- array/collection;
- object reference;
- function reference;
- native/client binding reference.

Operations such as:

    player.chat = "hello";

and:

    this.counter += 1;

must be represented through the runtime/object system, not parser-specific hacks.

---

# 14. EVENTS AND TIMERS

Implement a proper event system and timer scheduler.

Support documented events that can be established from the evidence.

Support:

- delayed execution;
- recurring behavior when required;
- cancellation;
- callbacks;
- deterministic test time;
- Android-safe scheduling.

Do not block the Android UI thread.

---

# 15. HOOKS AND TRACE

Implement STAR Labs abstractions for:

- hook_func;
- hookfunction;
- getcalltrace;
- stopcalltrace.

Support, where applicable:

- hook chains;
- ordering;
- removal;
- recursion protection;
- diagnostics;
- bounded call history;
- caller/callee;
- target;
- depth;
- timestamp;
- safe argument information.

Do not claim a hook reaches a real internal client function until an actual integration test proves it.

---

# 16. PANELS ARE SCRIPT-DEFINED

Provide a real panel engine supporting the documented panel operations, including where applicable:

- HTML;
- CSS;
- JavaScript;
- show/hide;
- refresh;
- event sending;
- URL loading;
- CSS/JS additions;
- _gs2call.

The executor must not impose a fixed script-menu layout.

The script author chooses the interface.

A script may create a tiny overlay, a large dashboard, a multi-tab panel, a custom HTML/CSS/JS interface, or something else within the supported APIs.

STAR Labs provides the execution machinery and panel primitives.

The script author provides the actual application logic and UI.

---

# 17. REAL MOBILE EDITOR

Build the editor as part of the integrated application.

It must support:

- create/open/save;
- rename/delete;
- script list;
- syntax highlighting;
- autocomplete;
- snippets;
- line numbers;
- search/replace;
- diagnostics;
- error navigation;
- logs;
- run/stop;
- runtime state;
- settings.

It must handle large scripts without a fundamentally inefficient implementation.

---

# 18. SERVER

Build an independent STAR Labs backend.

Provide suitable modules for:

- authentication;
- users;
- installations/devices;
- sessions;
- keys/licenses;
- plans;
- entitlements;
- audit;
- administration;
- health;
- runtime/version metadata where needed.

Use consistent API envelopes:

Success:

    {
      "data": {}
    }

Error:

    {
      "error": {
        "code": "...",
        "message": "..."
      }
    }

The STAR Labs server must not depend on the XCore server.

---

# 19. ADMINISTRATION

Provide a real administrative interface, either web, separate admin Android application, or both.

Manage, as appropriate:

- users;
- keys;
- plans;
- devices/installations;
- sessions;
- entitlements;
- revocation;
- runtime versions;
- audit logs;
- operational status.

Sensitive changes must be auditable.

---

# 20. CLIENT ADAPTER

Keep the runtime independent from client-specific implementation details.

Define:

    ClientAdapter

for operations such as:

- object resolution;
- property get/set;
- function call;
- event subscription;
- event unsubscription;
- timers;
- diagnostics.

Provide:

    MockClientAdapter
    AuthorizedTestClientAdapter

The real adapter must be based on evidence from the current target APK.

Do not invent current memory addresses.

---

# 21. INTEGRATE STAR LABS INTO THE GRAAL APK

This is mandatory.

Do not stop at creating an Android project that is unrelated to the target APK.

The Android build must take the Graal client as the base and produce the modified client containing STAR Labs.

The resulting application must include:

- Graal;
- STAR Labs runtime;
- STAR Labs editor;
- panel system;
- client bridge;
- server client;
- configuration;
- authentication/entitlements.

Where technically appropriate, STAR Labs should run in the same application/process context instead of being a completely separate application.

---

# 22. ONE BUILD COMMAND

The primary product build command is:

    npm run build-apk

It must perform the real pipeline:

    verify base Graal APK
        ↓
    verify toolchain
        ↓
    build runtime/editor/server client
        ↓
    integrate STAR Labs into Graal
        ↓
    remove/deactivate active XCore path
        ↓
    package
        ↓
    align
        ↓
    sign
        ↓
    validate
        ↓
    output final APK

Expected output:

    dist/apk/STAR-Labs-Graal-<version>.apk

Also output:

    dist/apk/STAR-Labs-Graal-<version>.apk.sha256
    dist/apk/build-manifest.json

The command must fail if the APK does not actually exist.

Never print “build successful” because only the Node tests passed.

---

# 23. FINAL APK VALIDATION

After producing the final APK, compare it against the base.

Validate:

- structure;
- manifest;
- DEX;
- native libraries;
- resources;
- permissions;
- startup components;
- STAR Labs components;
- active XCore components;
- network endpoints used by STAR Labs;
- signing;
- hashes.

Produce:

    analysis/final-apk-diff.md

and:

    analysis/final-startup-test.md

---

# 24. STARTUP ACCEPTANCE TEST

Where an authorized Android test environment is available:

    launch final APK
        ↓
    Graal starts
        ↓
    no XCore key/login screen
        ↓
    STAR Labs initializes
        ↓
    STAR Labs editor/executor can open
        ↓
    real script loads
        ↓
    real script executes
        ↓
    panel renders
        ↓
    logs/errors work
        ↓
    server communication works

Use adb or equivalent tooling where available.

If physical-device validation is impossible because of an environment constraint, state exactly what is unverified.

---

# 25. TEST CORPUS

Build tests from the supplied GS2 materials.

Cover:

- variables;
- expressions;
- nested control flow;
- functions;
- arrays;
- object/property access;
- callbacks;
- events;
- timers;
- graphics;
- panels;
- hooks;
- tracing;
- large scripts.

At least one test should be genuinely large.

A “pong” or tiny toy script is not sufficient proof.

---

# 26. BEFORE/AFTER FORENSICS

Maintain:

    analysis/before/
    analysis/after/

and produce:

    analysis/graal-vs-star-labs-diff.md

Compare:

- package contents;
- DEX;
- native libraries;
- resources;
- manifest;
- permissions;
- startup path;
- relevant strings;
- dynamic loaders;
- network behavior.

---

# 27. INTEGRATION MANIFEST

Create:

    analysis/integration-manifest.json

It must identify:

- base APK SHA-256;
- base version;
- output APK SHA-256;
- added files;
- modified files;
- removed files;
- replaced files;
- DEX modifications;
- native modifications;
- resource modifications;
- manifest modifications;
- STAR Labs components;
- XCore changes;
- signing information;
- tool versions;
- build metadata.

This must make the transformation auditable.

---

# 28. DO NOT REPEAT OLD DESIGNS

The biggest failure mode is prompt accumulation.

Do NOT later paste V2/V3/V4 sections into the project and tell the agent to follow both documents.

This V5 is the authoritative specification.

Do not add contradictory layouts.

Do not suddenly introduce a different UI architecture.

Do not replace the agreed final product with a separate application.

Do not stop because an earlier implementation phase was completed.

Move forward toward the final APK.

---

# 29. CONTINUOUS IMPLEMENTATION

Work through the entire project instead of stopping after documentation.

Recommended progression:

    1. audit repository
    2. map current APK/XCore startup and runtime
    3. map historical findings to current evidence
    4. lock architecture
    5. finish language frontend
    6. finish compiler/IR
    7. finish VM
    8. finish GS2 bindings
    9. finish events/timers/hooks/tracing/panels
   10. finish editor
   11. finish server/admin
   12. integrate into base Graal APK
   13. remove/deactivate active XCore path
   14. build final APK
   15. install/test
   16. write final status

Do not loop back to documentation simply because implementation is harder.

Solve the implementation problems.

---

# 30. FINAL STATUS FILE

At the end, create:

    STAR_LABS_FINAL_STATUS.md

Include only the real final state:

### Completed
Actual completed components.

### Verified
Actual tests/evidence.

### Partial
Parts that work but remain incomplete.

### Blocked
Exact blocker and why.

### Final APK
Exact output path and SHA-256 if built.

### Graal integration
Exactly what was integrated into the base APK.

### XCore status
Exactly what was removed/deactivated and what inert residue remains.

### GS2 compatibility
Actual compatibility inventory and known gaps.

### Server
Actual backend capabilities.

### Android
Actual build/install/startup results.

### Render hosting
At the very end, answer explicitly:

> Can the completed STAR Labs server be hosted on Render?

Do not answer by assumption.

Inspect the actual server implementation and, if the question depends on current Render capabilities, verify against current Render documentation.

Explain:

- which STAR Labs server components can run on Render;
- required runtime/service type;
- environment variables/secrets;
- persistent storage/database requirements;
- HTTP/WebSocket requirements, if used;
- domain/TLS requirements;
- any component that should live elsewhere;
- any architectural change needed to deploy it correctly.

---

# 31. FINAL NON-NEGOTIABLE STATEMENT

There is one final product:

    THE GRAALONLINE CLASSIC APK
    MODIFIED TO CONTAIN STAR LABS

There is one primary scripting environment:

    STAR LABS

The user chooses:

- what code to write;
- how large the script is;
- what logic it contains;
- what interface the script builds.

STAR Labs provides:

- the GS2 language implementation;
- compiler/IR;
- VM;
- runtime;
- APIs/bindings;
- editor;
- panels;
- hooks/tracing;
- client adapter;
- server;
- administration;
- Android integration;
- build pipeline.

The previous prototype is not the destination.

The documentation is not the destination.

The parser is not the destination.

The server is not the destination.

The Android shell is not the destination.

THE FINAL MODIFIED, INSTALLABLE GRAAL APK IS THE DESTINATION.

Build toward that result and do not declare completion without evidence.

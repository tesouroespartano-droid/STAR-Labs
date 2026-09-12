# Graal vs STAR Labs diff

## Scope

This document compares the base APK evidence to the independently engineered STAR Labs artifacts that exist in this repository.

## Baseline evidence

- Base APK path: `analysis/evidence/original-apk/GraalOnlineXCoreExecuter.apk`
- SHA-256: `1589cb10f86c171c54ce3bcf1c4ebf4679ee0011c4b6a63ba00f1c9ffa2ef9aa`
- Observed custom XCore layer: `com.player.render.ModMenu`, `libservice.so`, `xCoreScripts`, `WebMessageChannel` bridge

## Independent STAR Labs artifacts present

- `new-runtime/` contains a GS2-inspired lexer/parser/VM and runtime harness.
- `server/` contains an independent server model for auth, keys, plans, entitlements, and sessions.
- `docs/` contains architecture and product documentation.
- `analysis/` contains forensic and engineering documentation.

## Gap

There is no actual final APK produced from the Graal base with STAR Labs integrated into it. There is no Android project, no final package, no signed APK, and no startup/installation validation in this workspace.

## Conclusion

The repository has a strong evidence baseline and a valid independent runtime/server prototype, but it is not yet a real integrated Graal + STAR Labs APK. The build is intentionally blocked until the real Android integration exists.

## Confidence

- Evidence baseline: **VERIFIED**
- Independent runtime prototype: **VERIFIED**
- Real final APK integration: **BLOCKED / NOT PRESENT**

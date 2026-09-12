# Final APK diff report

## Status

The V6 pipeline produced a non-empty signed APK. This report does not claim device functionality that was not tested.

## Base evidence checked

- Base APK: `analysis/evidence/original-apk/GraalOnlineXCoreExecuter.apk`
- SHA-256: `1589cb10f86c171c54ce3bcf1c4ebf4679ee0011c4b6a63ba00f1c9ffa2ef9aa`
- Observed active custom path: `com.player.render.ModMenu`, `libservice.so`, `xCoreScripts`, `WebMessageChannel`

## Required final output

The V5 prompt requires:

- `dist/apk/STAR-Labs-Graal-<version>.apk`
- `dist/apk/STAR-Labs-Graal-<version>.apk.sha256`
- `dist/apk/build-manifest.json`

Current repository state:

- APK: `dist/apk/STAR-Labs-Graal-0.1.0.apk`
- SHA-256: `2295f00142e814f75620dffd34e52c6f364c60c16f6de25eaeef4703edc356f3`
- Size: `88064781` bytes.
- `unzip -t`, AAPT2 badging, and `apksigner verify --verbose` passed.

## Diff result

Added: `classes4.dex`, `assets/star_labs.html`, `com.star.labs.graal.StarLabsBootstrapProvider`, and its lifecycle callback. Preserved: the Unity launcher, Graal package identity, `libunity.so`, and `libil2cpp.so`. The supplied APK remains the evidence baseline; no clean official Graal APK was available for differential reconstruction.

## Conclusion

The APK packaging milestone is complete. Native XCore removal, real device launch, Unity game-loop reachability, and end-to-end GS2/panel/bridge execution remain open validation items.

## Confidence

- Evidence baseline: **VERIFIED**
- Missing final APK output: **VERIFIED**
- Final packaged diff: **VERIFIED for injected Android layer; native/runtime behavior UNVERIFIED**

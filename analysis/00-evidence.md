# Evidências e escopo

## Identificação

- **VERIFIED** — A evidência fornecida é `starlabs/GraalOnlineXCoreExecuter(2).zip`, um ZIP com uma entrada: `GraalOnlineXCoreExecuter(2).apk`.
- **VERIFIED** — SHA-256 do ZIP: `15a7a6c8859349b058099c0fc08b8b406c42f96006b91bd388bfa3ebee14fa65`.
- **VERIFIED** — SHA-256 da cópia de análise do APK: `1589cb10f86c171c54ce3bcf1c4ebf4679ee0011c4b6a63ba00f1c9ffa2ef9aa`.
- **VERIFIED** — A cópia analisada está em `analysis/evidence/original-apk/`; o APK original não foi reempacotado nem alterado.

## Inventário inicial

- **VERIFIED** — O APK tem 325 entradas ZIP, três DEX (`classes.dex`, `classes2.dex`, `classes3.dex`) e ABI nativa `arm64-v8a`.
- **VERIFIED** — Estão presentes `libil2cpp.so` (44.471.456 bytes), `libunity.so` (21.043.552 bytes), `libservice.so` (301.408 bytes) e `assets/bin/Data/Managed/Metadata/global-metadata.dat`.
- **VERIFIED** — `libservice.so` é ELF64 AArch64, carrega `libandroid.so`, `liblog.so`, `libdl.so`, `libm.so` e `libc.so`, e exporta `JNI_OnLoad`.
- **VERIFIED** — Não há entrada `.gs` nem entrada evidente de `xCoreScripts` no ZIP; o caminho de scripts observado no código Java é externo ao APK.

## Método e limites

Os artefatos derivados ficam em `analysis/evidence/` e `analysis/work/`. O código recuperado por JADX é uma representação de análise, não uma reconstrução byte-a-byte. Conclusões sobre comportamento têm uma etiqueta explícita: **VERIFIED**, **STRONG**, **PLAUSIBLE** ou **UNKNOWN**.

- **VERIFIED** — A camada Java customizada pode ser analisada estaticamente a partir de `classes2.dex`.
- **STRONG** — `com.player.render.ModMenu` é uma camada adicionada: seu namespace, nomes `xA..xQ`, caminho `xCoreScripts`, URL `menu.holy` e carregamento de `libservice.so` são distintos da infraestrutura padrão Unity/Android.
- **UNKNOWN** — O significado completo de cada método nativo não pode ser derivado apenas dos nomes ofuscados; a tabela JNI é montada dinamicamente e seus textos são decodificados em tempo de inicialização.
- **UNKNOWN** — Não foi observada evidência suficiente para afirmar a existência, formato ou caminho de um payload criptografado baixado.

## Artefatos principais

- Inventário ZIP: `analysis/01-apk-tree.txt`.
- Código Java recuperado: `analysis/work/jadx-src/sources/com/player/render/ModMenu.java`.
- Desmontagem do início de `JNI_OnLoad`: `analysis/work/libservice-jni-disassembly.txt`.
- APK descompactado somente para leitura: `analysis/evidence/apk-unpacked/`.
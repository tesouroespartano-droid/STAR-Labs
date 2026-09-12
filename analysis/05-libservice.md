# libservice.so

## ELF e inicializacao

- **VERIFIED** — ELF64 little-endian AArch64, tipo `DYN`, SONAME `libservice.so`.
- **VERIFIED** — Importa `libandroid.so`, `liblog.so`, `libdl.so`, `libm.so` e `libc.so`.
- **VERIFIED** — Exporta somente `JNI_OnLoad` entre os símbolos definidos dinamicamente observáveis.
- **VERIFIED** — `JNI_OnLoad` obtém `JNIEnv`, constrói strings/estruturas em buffers locais e chama uma função JNI de registro com contagem `12`; isso é compatível com `RegisterNatives`.
- **STRONG** — O registro dinâmico explica por que `xA..xQ` não aparecem como exports ELF e por que a tabela precisa ser analisada no fluxo de inicialização.

## Metodos Java/nativos

O Java declara 12 métodos nativos: `xA`, `xB`, `xC`, `xE`, `xF`, `xG`, `xH`, `xI`, `xJ`, `xK`, `xP`, `xQ`. A declaração e as assinaturas estão em `analysis/03-modmenu.md`.

- **VERIFIED** — O binário registra uma tabela nativa durante `JNI_OnLoad`.
- **UNKNOWN** — O mapeamento função por função não deve ser afirmado a partir do endereço ou da ordem local: os nomes são materializados/decodificados e os ponteiros são preparados no mesmo fluxo.
- **UNKNOWN** — Não há evidência estática suficiente nesta amostra para afirmar uma URL, algoritmo criptográfico, payload ou servidor específico.

## Carregamento e arquivos

- **VERIFIED** — O carregamento de `libservice.so` ocorre no inicializador estático de `ModMenu` por `System.loadLibrary("service")`.
- **STRONG** — O ponto de entrada nativo é acionado quando `StartMenu` chama `xA(context)` e configura o WebView com `xB`/`xE`.
- **UNKNOWN** — `gl_ctx_init` e `gl_set_scripts_dir` são nomes relevantes do briefing, mas não são símbolos dinâmicos definidos neste ELF; é necessário atribuí-los por referência cruzada em outro binário ou em código carregado em runtime.
- **UNKNOWN** — A amostra não prova um download/decifração de runtime. Não foi tentado contornar proteção, licença ou acesso protegido.

## Artefatos

O recorte de desmontagem de `JNI_OnLoad` está em `analysis/work/libservice-jni-disassembly.txt`. A busca de strings nativas está em `analysis/strings/libservice.txt`.
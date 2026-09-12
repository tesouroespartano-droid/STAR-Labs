# Pipeline GS2

## Pipeline observado versus lacunas

```text
xCoreScripts/<any>.gs
  -> descoberta externa por diretório: STRONG
  -> leitura/parse GS2: UNKNOWN
  -> runtime/dispatch: UNKNOWN
  -> JNI/libservice: STRONG como fronteira, detalhes UNKNOWN
  -> cliente Unity/IL2CPP: VERIFIED como plataforma, chamada específica UNKNOWN
  -> yA(JSON)/Toast/WebView: VERIFIED para os caminhos expostos
```

- **VERIFIED** — O diretório esperado é o armazenamento externo `xCoreScripts`.
- **VERIFIED** — O diretório não está empacotado no APK.
- **UNKNOWN** — Extensão `.gs` e parser não aparecem como um fluxo comprovado nos artefatos recuperados.
- **PLAUSIBLE** — O executor possui um runtime adicional atrás de `libservice.so`, pois Java expõe ações JSON e a biblioteca tem inicialização própria; isso não identifica a gramática nem a engine.

## Operações citadas no briefing

`player.chat`, `hook_func`, `getcalltrace` e APIs de painel não foram localizadas em um caminho verificável nos artefatos lidos. Devem permanecer **UNKNOWN**, não serem implementadas como fatos da amostra.

## Substituto independente

`new-runtime/` implementa uma pipeline pequena e própria: parser de comandos GS2 documentados, ambiente de variáveis, bindings mockados, callbacks, hooks, tracing e panels. Não usa nomes, payloads, chaves ou código do executor analisado.
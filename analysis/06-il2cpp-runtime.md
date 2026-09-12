# Runtime IL2CPP

- **VERIFIED** — O APK contém `libil2cpp.so` e `global-metadata.dat`, portanto o cliente usa Unity IL2CPP.
- **VERIFIED** — O APK contém `libunity.so` e bibliotecas adicionais de plataforma/anúncios; isso separa a base do cliente da biblioteca customizada `libservice.so`.
- **STRONG** — Strings de Graal/Quattro/NativeScript em IL2CPP representam tipos e componentes do cliente original ou de assemblies integrados. A presença textual não estabelece que o executor os invoca.
- **UNKNOWN** — Nesta análise não foi gerado um dump completo de metadata IL2CPP nem uma relação verificável de chamadas de `libservice.so` para métodos IL2CPP.
- **UNKNOWN** — A localização exata do parser, compilador ou interpretador GS2 não pode ser provada a partir do APK sem uma ponte de chamadas identificada.

## O que pode ser afirmado

O caminho seguro de atribuição é:

```text
ModMenu Java -> JNI registrado por libservice.so -> (ponte não resolvida) -> cliente IL2CPP
```

Qualquer diagrama que acrescente parser GS2, resolução de objetos ou hooks dentro de IL2CPP deve ser rotulado como hipótese até que referências de código/dados confirmem a chamada.
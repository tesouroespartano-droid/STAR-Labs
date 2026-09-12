# Componentes customizados

## Separacao por evidencia

- **VERIFIED** — A maior parte do APK pertence a Unity/IL2CPP, AndroidX, Kotlin, Google/Firebase, anúncios e bibliotecas auxiliares. Esses pacotes formam a base do cliente e não são tratados como XCore apenas por conterem a palavra `native` ou `WebView`.
- **STRONG** — `com.player.render.*` é o conjunto Android customizado mais diretamente associado ao XCore. `ModMenu` é a classe central; as classes `ModMenu$1`, `$2`, `$3` e lambdas são classes auxiliares geradas pelo compilador.
- **VERIFIED** — O namespace `com.player.render` aparece em `classes2.dex`; a classe carrega `libservice.so` e contém os símbolos Java `xA..xQ`.
- **VERIFIED** — `libservice.so` é a biblioteca nativa própria que contém `JNI_OnLoad`; seus nomes exportados não revelam as implementações xA..xQ.
- **VERIFIED** — `libil2cpp.so`, `libunity.so`, `global-metadata.dat` e os assemblies/strings de Graal/Quattro são evidências do cliente e runtime Unity/IL2CPP. Nomes de tipos nesses artefatos, sozinhos, não provam uso pelo executor.

## Artefatos gerados

- `analysis/work/jadx-src/` contém a saída de JADX; erros de decompilação são esperados em métodos ofuscados e não alteram a evidência.
- `analysis/work/custom-inventory.txt` registra a enumeração inicial via Androguard.
- `analysis/evidence/apk-unpacked/` contém uma extração somente leitura para hash, strings, ELF e metadata.

## Regra de atribuição

Uma classe só é atribuída à camada adicionada quando há combinação de namespace/strings, chamadas cruzadas e papel de integração. APIs padrão de WebView, Unity Ads ou Android permanecem classificadas como infraestrutura original, mesmo quando chamadas a partir de `ModMenu`.
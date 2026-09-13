# STAR Labs — Status forense e correção do caminho real de XCore

## Estado do problema

O último APK instalado em dispositivo real ainda mostrava UVs do XCore sobrepondo o Graal. A investigação confirmou a causa real: o caminho de execução do XCore não era apenas um launcher alternativo; ele era disparado diretamente do ciclo de vida da Unity.

Evidência direta encontrada no bytecode reconstruído:

- [analysis/work/jadx-src/sources/com/unity3d/player/UnityPlayerActivity.java](analysis/work/jadx-src/sources/com/unity3d/player/UnityPlayerActivity.java) chama `ModMenu.StartMenu(this)` dentro de `onCreate()`.
- [analysis/work/jadx-src/sources/com/player/render/ModMenu.java](analysis/work/jadx-src/sources/com/player/render/ModMenu.java) cria `WebView`, inicializa `xCoreScripts`, carrega a origem `http://menu.holy/`, cria `WebMessageChannel`, e dispara o runtime XCore.

Essa é a cadeia real observada:

UnityPlayerActivity.onCreate()
  -> ModMenu.StartMenu(Context)
  -> ModMenu.xA / xB / xE / xQ / WebView bootstrap
  -> UI XCore visível + bridge ativo

## O que foi corrigido

A correção foi aplicada no caminho de execução real, não em um noop superficial:

- [tools/build-modified-graal-apk.sh](tools/build-modified-graal-apk.sh) agora remove a instrução `invoke-static {p0}, Lcom/player/render/ModMenu;->StartMenu(Landroid/content/Context;)V` antes do rebuild do APK.
- O restante do Graal / UnityPlayer continua preservado.
- O provider de bootstrap do STAR Labs foi mantido sem reativar o runtime XCore.

## Baseline forense preservada

Antes da correção do caminho real, o APK atual/instalado foi congelado como artefato de referência em:

- [apk-forensics/current-device-baseline.apk](apk-forensics/current-device-baseline.apk)

Também foram registrados: SHA-256, tamanho, package e assinatura no build e no terminal durante a investigação.

## Verificação executada

Comando executado e confirmado:

- `aapt2 dump badging dist/apk/STAR-Labs-Graal-0.1.0.apk | egrep "package:|launchable-activity:"`

Resultado observado:

- `package: name='com.quattroplay.GraalClassic'`
- `launchable-activity: name='com.unity3d.player.UnityPlayerActivity'`

Também foi verificado que o call site direto `ModMenu.StartMenu` não aparece mais no patched classes2 após o rebuild.

## Limitação atual

Ainda não há dispositivo/emulador Android disponível neste ambiente para validar a execução real no aparelho. Portanto:

- a correção do caminho real do XCore foi aplicada e verificada estaticamente;
- a validação funcional em device continua pendente;
- não se pode dizer que o XCore foi removido no aparelho real até o teste efetivo em hardware/emulador.

## Conclusão correta

O erro real do XCore foi identificado e removido no ponto de entrada que o iniciava: a chamada direta de `ModMenu.StartMenu` dentro do `UnityPlayerActivity`. Isso é a correção forense correta do V9, e o projeto foi reconstruído com esse trigger removido.

O próximo passo obrigatório é a validação real no device com o APK novo, para confirmar que Graal abre, STAR Labs funciona e XCore não reaparece.

## V10 — avanço da fundação do engine

Após a confirmação no device de que o XCore não reaparece, a implementação passou a proteger esse estado antes de cada build:

- [tools/xcore-regression-gate.sh](tools/xcore-regression-gate.sh) falha se houver chamada executável a `ModMenu.StartMenu`, caller externo ou launcher XCore.
- [new-runtime/src/function-registry.js](new-runtime/src/function-registry.js) fornece `GS2FunctionRegistry` e `RegistryBridge` com metadados, aliases, contexto client/server, disponibilidade, evidência e estados de implementação.
- [docs/gs2-compatibility-matrix.md](docs/gs2-compatibility-matrix.md) registra apenas capacidades comprovadas, sem declarar GS2 completo ou um número fictício de funções.
- O corpus do runtime passou de 11 para 15 testes, incluindo dispatch pelo registry e rejeição de alegações sem implementação/evidência.

## Verificação V10 mais recente

`npm run build-apk` foi executado com sucesso após a restauração do toolchain local. A gate XCore passou durante o build.

- package: `com.quattroplay.GraalClassic`
- launcher: `com.unity3d.player.UnityPlayerActivity`
- APK: [dist/apk/STAR-Labs-Graal-0.1.0.apk](dist/apk/STAR-Labs-Graal-0.1.0.apk)
- SHA-256: `46f70bd819c0e713cc4ff227ae85f885776e6944c1adb9aace1171b5a64901bd`
- testes: `15/15`
- alinhamento: 16 KiB validado
- assinatura: `apksigner verify` aprovado

Este avanço não é declarado como “GS2 completo” nem como integração funcional final do Executor no device. O editor profissional, a integração própria com o cliente Graal e o catálogo amplo validado permanecem fases de implementação posteriores.

## V11 — checkpoint do engine

O relatório técnico inicial está em [docs/v11-phase1-technical-report.md](docs/v11-phase1-technical-report.md).

Implementações adicionais concluídas sem tocar no call site protegido do XCore:

- [new-runtime/src/client-bridge.js](new-runtime/src/client-bridge.js): contrato independente de bridge com contexto explícito.
- [new-runtime/src/script-repository.js](new-runtime/src/script-repository.js): documentos, múltiplos arquivos, versão e dirty state.
- [new-runtime/src/semantic.js](new-runtime/src/semantic.js): análise de chamadas desconhecidas separada do parser e da UI.
- [new-runtime/src/language-service.js](new-runtime/src/language-service.js): diagnostics e completion derivados do parser e do registry.
- [new-runtime/corpus/complex-script.gs2](new-runtime/corpus/complex-script.gs2): fixture com objetos aninhados, arrays, funções, escopos, branches e loops.

O parser/VM também foi corrigido para distinguir acesso a propriedades (`player.name`) de funções namespaced (`player.chat(...)`) encaminhadas pelo bridge.

Validação mais recente:

- `npm run lint`: aprovado
- `npm test`: `21/21` aprovados
- `npm run build-apk`: aprovado
- XCore regression gate durante o build: aprovado
- Graal/Unity, bibliotecas nativas, assinatura e empacotamento: preservados pelo pipeline existente

Ainda não é correto declarar concluídos o editor profissional no APK, a integração funcional do Executor no device ou o catálogo GS2 amplo. Esses são os próximos checkpoints previstos pelo V11.

## V12 — bootstrap próprio do Executor

A causa da ausência visual do STAR Labs foi confirmada: o provider estava disabled, o lifecycle callback era noop e a `UnityPlayerActivity` não chamava nenhuma classe STAR Labs. Foi criado um caminho próprio, sem `ModMenu`, `menu.holy`, `xCoreScripts` ou bridge XCore:

- [tools/integration/StarLabsBootstrap.java](tools/integration/StarLabsBootstrap.java) valida a Activity Unity, inicializa uma única WebView própria, adiciona o Executor sobre a hierarquia da Unity e remove a view no destroy.
- [tools/build-modified-graal-apk.sh](tools/build-modified-graal-apk.sh) injeta `StarLabsBootstrap.start(Activity)` depois de `setContentView`/`requestFocus` e `stop(Activity)` no destroy.
- [tools/integration/star_labs.html](tools/integration/star_labs.html) agora renderiza o Executor com header, abas, toolbar, editor, status e Script Logs recolhíveis.
- [tools/xcore-regression-gate.sh](tools/xcore-regression-gate.sh) exige o bootstrap próprio na Unity e continua bloqueando `ModMenu.StartMenu` e callers executáveis do XCore.

Verificação estática do APK V12:

- `StarLabsBootstrap.start/stop` presentes na `UnityPlayerActivity` empacotada;
- `ModMenu.StartMenu` ausente do call site;
- asset `star_labs.html` presente;
- package `com.quattroplay.GraalClassic`;
- launcher `com.unity3d.player.UnityPlayerActivity`;
- zipalign 16 KiB e assinatura aprovados;
- SHA-256 atual: `5288122549c93e55531a16d7868dcd209c76cd27ec10fa1b1b5e7b4911d42889`.

O build passou com `21/21` testes, lint, compilação Java/D8, gate XCore e validações do APK. A confirmação visual em device deste novo APK ainda é obrigatória; não foi declarada como concluída neste ambiente.

## V12-2 — plataforma de execução real e referência avançada

Implementações concluídas nesta etapa:

- [new-runtime/src/engine.js](new-runtime/src/engine.js): fluxo real `source -> LanguageService -> Parser/Semantic -> VM -> ClientBridge`, com estado `ready/running/error`, logs, duração, passos, múltiplos documentos e limite de execução.
- [new-runtime/src/function-registry.js](new-runtime/src/function-registry.js): categorias, estados `METADATA_ONLY/STUB/PARTIAL/IMPLEMENTED/VALIDATED` normalizados, evidência, handlers e contagem somente de funções validadas.
- [new-runtime/src/function-reference.js](new-runtime/src/function-reference.js): listagem, pesquisa, filtro por categoria/contexto/status e detalhes derivados do registry único.
- [new-runtime/src/vm.js](new-runtime/src/vm.js): cancelamento cooperativo e atribuição a propriedades/indexação.
- [new-runtime/test/scale.test.js](new-runtime/test/scale.test.js): fixture estruturada com aproximadamente 400 linhas e 100 funções, estado aninhado, loops, chamadas entre funções e teste multi-arquivo.

Validação V12-2 mais recente:

- `npm run lint`: aprovado
- `npm test`: `29/29` aprovados
- `npm run build-apk`: aprovado
- XCore regression gate: aprovado
- package: `com.quattroplay.GraalClassic`
- launcher: `com.unity3d.player.UnityPlayerActivity`
- zipalign 16 KiB: aprovado
- assinatura: aprovada
- SHA-256: `a0810aedcddefd031f6b19187610f7808cab6af9e7b48be9f01c19aa4a8c16c8`

Limitações não ocultadas:

- O engine real está comprovado no harness Node e o APK contém o bootstrap/Executor próprio, mas o runtime Node ainda não é empacotado como VM Android dentro do APK.
- A referência de funções é baseada no registry local; não há alegação de catálogo completo nem de 2040 funções.
- `adb` está presente, porém sem device/emulador acessível (`device-unavailable`); portanto o teste físico de Run, Console, Problems, Settings, tabs e resize desta etapa não foi declarado concluído.

## V12-3 — APK atualizado e integração Android própria

O APK foi atualizado sem reintroduzir o XCore. A UI agora possui uma ponte Android STAR Labs própria:

- [tools/integration/StarLabsWebBridge.java](tools/integration/StarLabsWebBridge.java) persiste settings e scripts via `SharedPreferences` e expõe status explícito do host de runtime.
- [tools/integration/StarLabsBootstrap.java](tools/integration/StarLabsBootstrap.java) registra a ponte como `StarLabs` na WebView própria.
- [tools/integration/star_labs.html](tools/integration/star_labs.html) possui navegação Executor/Dashboard/Functions/Settings, abas editáveis, dirty state, save, copy, format, search, delete, logs e settings persistentes.

O botão `Run` não fabrica uma execução: quando o host GS2 Android não está empacotado, registra o estado real `unavailable` e a razão. O engine Node continua sendo validado separadamente com 29 testes; a próxima integração necessária é hospedar esse engine de forma própria no processo Android.

Validação do APK atualizado:

- `npm run build-apk`: aprovado
- `npm test`: `29/29` aprovados
- `npm run lint`: aprovado
- XCore regression gate: aprovado
- código STAR Labs sem `ModMenu`, `menu.holy`, `xCoreScripts` ou `WebMessageChannel`
- package: `com.quattroplay.GraalClassic`
- launcher: `com.unity3d.player.UnityPlayerActivity`
- zipalign 16 KiB: aprovado
- assinatura: aprovada
- SHA-256: `1c81dab36548715bcce915324feacc9d8a9e89497e0200bdf13d4eddeb6f9dea`

## V12-4 — runtime GS2 dentro do APK

O problema `Run -> runtime unavailable` foi resolvido para o primeiro POC sem Node externo, servidor ou XCore.

- [tools/integration/StarLabsRuntimeHost.java](tools/integration/StarLabsRuntimeHost.java) é um host Java in-process empacotado em `classes4.dex`.
- [tools/integration/StarLabsWebBridge.java](tools/integration/StarLabsWebBridge.java) expõe `runScript(source)` e retorna estado, código, mensagem e saída reais para o Console.
- O POC executa `function add(a, b) { return a + b; } echo(add(10, 20));` e retorna `30.0`.
- O caminho de erro executa de fato e retorna `GS2_UNKNOWN_FUNCTION` para função inexistente.
- [docs/engineering-architecture.md](docs/engineering-architecture.md) registra a decisão Java, alternativas avaliadas, fluxo, lifecycle, bridge, limitações e próximos passos.

Provas recentes:

- teste Java independente do host: `StarLabsRuntimeHost POC: PASS`
- `classes4.dex` contém `StarLabsRuntimeHost`, parser de expressão, `runScript`, `runtimeStatus`, `GS2_UNKNOWN_FUNCTION` e `GS2_UNSUPPORTED_STATEMENT`
- build oficial: aprovado
- `npm test`: `29/29` aprovados
- XCore regression gate: aprovado
- package: `com.quattroplay.GraalClassic`
- launcher: `com.unity3d.player.UnityPlayerActivity`
- zipalign 16 KiB e assinatura: aprovados
- APK atualizado: [dist/apk/STAR-Labs-Graal-0.1.0.apk](dist/apk/STAR-Labs-Graal-0.1.0.apk)
- SHA-256: `021d7e02a746b47137ddfe71666ef755af06f43ae04fa71463f73b867182d1db`

Limitação precisa: este é o primeiro host Android executável e ainda cobre somente o subconjunto POC documentado na arquitetura. A expansão para `//#CLIENTSIDE`, `this`, `temp`, arrays/objetos, loops e APIs reais do cliente segue como trabalho de engine. A validação física ainda depende de um device/emulador acessível via ADB.
# STAR Labs Master Status

Data da avaliação: 2026-09-12

## Resumo executivo

O repositório já contém uma cópia somente leitura do APK, um inventário inicial, uma análise estática de `ModMenu`/`libservice.so`, um harness JavaScript independente e um servidor próprio de desenvolvimento. Ainda não contém o produto STAR Labs definido no prompt V2: não há VM de bytecode final, parser GS2 compatível completo, editor móvel, administração, projeto Android ou APK construído.

Status global: **EM INVESTIGAÇÃO / NÃO PRONTO PARA PRODUÇÃO**.

## O que já foi descoberto

- **VERIFIED** — A evidência é `starlabs/GraalOnlineXCoreExecuter(2).zip`, contendo um APK de 325 entradas.
- **VERIFIED** — O APK contém `classes.dex`, `classes2.dex`, `classes3.dex`, Unity/IL2CPP (`libil2cpp.so`, `global-metadata.dat`) e `lib/arm64-v8a/libservice.so`.
- **VERIFIED** — A cópia de análise está em `analysis/evidence/original-apk/`; a extração está em `analysis/evidence/apk-unpacked/`.
- **VERIFIED** — `com.player.render.ModMenu` está em `classes2.dex`, carrega `libservice.so`, cria um WebView overlay, usa `Native.init/showKeyboard/hideKeyboard`, cria um `WebMessageChannel` e encaminha JSON para `xC`.
- **VERIFIED** — A mensagem inicial observada é `{"type":"init"}` e o caminho de scripts observado é o armazenamento externo `xCoreScripts`.
- **VERIFIED** — `libservice.so` é ELF64 AArch64, depende de bibliotecas Android nativas, exporta `JNI_OnLoad` e registra métodos JNI dinamicamente.
- **STRONG** — A camada `com.player.render`/`libservice.so` é uma camada adicional de integração, enquanto a maior parte dos pacotes Unity/Android/Firebase pertence à infraestrutura do cliente ou a SDKs. A atribuição de cada assembly Quattro/NativeScript permanece aberta.

## O que está provado

| Área | Estado | Referência |
|---|---|---|
| Integridade da evidência | VERIFIED | `analysis/00-evidence.md`, `analysis/recovered/evidence-index.json` |
| Inventário ZIP | VERIFIED | `analysis/01-apk-tree.txt` |
| Overlay WebView | VERIFIED | `analysis/03-modmenu.md` |
| Protocolo inicial do bridge | VERIFIED | `analysis/04-webview-bridge.md` |
| Diretório externo `xCoreScripts` | VERIFIED | fonte recuperada de `ModMenu` |
| Registro JNI dinâmico | STRONG | `analysis/05-libservice.md` |
| Parser GS2 no APK | UNKNOWN | ainda sem caminho de chamada demonstrado |
| Payload remoto/criptografado | UNKNOWN | não afirmado sem evidência direta |
| Licenciamento XCore | UNKNOWN | endpoint e máquina de estados não localizados |
| Compatibilidade do runtime novo com o jogo | UNKNOWN | ainda não há adapter autorizado |

## O que permanece incerto

- O significado individual dos 12 métodos `xA..xQ` além do papel observável no Java.
- Se `gl_ctx_init`, `gl_set_scripts_dir`, `/holy.enc` ou `/holy.hash` pertencem a este fluxo e qual é sua proveniência.
- Onde o texto `.gs` entra, se é compilado para bytecode, e qual componente executa o bytecode.
- Como nomes, propriedades, funções e eventos são resolvidos no cliente atual.
- Quais tipos Quattro/NativeScript são originais, adicionais ou apenas interfaces compartilhadas.
- Endpoints, credenciais, flags, planos e estado da licença XCore.
- Conteúdo e protocolo do HTML editor, pois o HTML/CSS/JS não foi localizado como entrada evidente do APK.

## O que o `new-runtime` implementa hoje

- **VERIFIED** — Um parser mínimo baseado em linhas para `let/set`, `call`, `return`, `hook` e `panel`.
- **VERIFIED** — Variáveis simples, chamadas por nome via `MockBridge`, registro/emissão de hooks, armazenamento de panels e log de statements.
- **VERIFIED** — Sete testes Node cobrem lexer/parser/VM, funções, propriedades, quotas, variáveis/chamadas, hooks/tracing, panels e rejeição de sintaxe não suportada.
- **VERIFIED** — Scripts raiz `analyze`, `generate-runtime` e `test` executam.
- **VERIFIED** — `server/` possui serviço próprio de usuários, sessões, dispositivos, chaves, planos e entitlements, com dois testes.

## O que o `new-runtime` NÃO implementa

- Análise semântica completa, recuperação de erros e source spans ricos.
- Gramática GS2 documentada completa, indexação avançada, arrays, eventos e built-ins de cliente.
- IR/bytecode final, variantes tipadas e frames avançados; a VM inicial já suporta AST, funções, propriedades, controle de fluxo e quotas.
- `ObjectRegistry`, `PropertyBinding`, `FunctionBinding`, `EventBus`, `TimerScheduler` e `ScriptManager` como contratos separados.
- Hooks com alvo/função, ordenação, chamada original, unhook seguro e proteção contra recursão.
- Call tracing estruturado com frames, limites, callbacks e start/stop.
- Editor móvel, armazenamento `STARLabs/scripts/`, autocomplete, logs de linha, preview ou status de licença.
- Servidor de autenticação/licenças/entitlements, dispositivos, sessões, auditoria ou painel administrativo.
- Persistência durável, rate limiting, TLS, refresh tokens, auditoria e administração web do servidor.
- Projeto Android, bridge nativa própria, adapter autorizado ou APK instalável.

## Ferramentas disponíveis

Disponíveis: `unzip`, `file`, `sha256sum`, `readelf`, `nm`, `llvm-objdump`, `strings`, `java`, `node`, `npm`, `python3`, `gradle`.

Usados: JADX 1.5.6 em `analysis/work/tools/`, Androguard 4.1.4, `readelf`, `nm`, `llvm-objdump`, `strings` e parsers locais.

Não disponíveis no ambiente: `adb`, `apktool`, `baksmali`, `smali`, `Ghidra`, `radare2/rizin`, `Frida`, `aapt/aapt2` e uma ferramenta de dump IL2CPP dedicada.

## Pré-requisitos de build

- Node.js/npm estão disponíveis.
- Gradle está disponível, mas não existe projeto Android nem `gradlew` no repositório.
- Android SDK/ADB não estão disponíveis no PATH.
- Não existe chave de assinatura STAR Labs, e nenhuma chave da evidência será reutilizada.
- Não há backend ou banco para autenticação/licenciamento.

Consequentemente, `npm run build-apk` deve falhar explicitamente até que o projeto Android independente e suas dependências sejam adicionados. Não será tratado como sucesso simulado.

## Próximas experiências de investigação

1. Enumerar manifest, componentes, permissões, recursos e classes com um relatório estruturado.
2. Extrair e catalogar todos os arquivos de `assets/StreamingAssets.zip` sem modificar a cópia de evidência.
3. Procurar referências cruzadas de strings e funções de `libservice.so`, incluindo `dlopen`, `dlsym`, arquivos e crypto; marcar resultados por endereço e não por nome isolado.
4. Gerar mapa de namespaces/tipos/métodos IL2CPP com uma ferramenta compatível ou parser próprio somente para leitura.
5. Procurar no workspace por material histórico autorizado (`hooksgc_classic_to.js`, guias GS2) antes de escrever testes de compatibilidade.
6. Fechar `analysis/15-custom-vs-original.md` com categorias original, adicional e incerta.
7. Implementar o runtime novo em camadas: lexer/parser/AST, semântica, bytecode/VM, bindings, eventos, hooks, trace e panels.
8. Criar servidor e editor próprios antes do adapter Android.

## Regra de decisão

Nenhum comportamento ausente será declarado compatível com o cliente real. O runtime STAR Labs usará interfaces próprias, testes com mocks e uma integração Android/autorizada somente quando houver contrato demonstrável.
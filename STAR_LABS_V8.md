# # STAR Labs — MASTER EXECUTION DIRECTIVE 

## PARTE 1/6 — OBJETIVO, ESTADO ATUAL E REGRA CENTRAL 

ESTA DIRETIVA É A CONTINUAÇÃO DO ESTADO ATUAL DO PROJETO. 

NÃO RECOMECE DO ZERO. 

NÃO APAGUE TRABALHO CORRETO. NÃO REINTRODUZA ARQUITETURAS JÁ DESCARTADAS. NÃO CRIE NOVO LAUNCHER STAR LABS. 

O objetivo absoluto é: 

GRAALONLINE MODIFICADO 

+ 

STAR LABS = UM ÚNICO APK 

O GraalOnline continua sendo o jogo/aplicativo. 

O STAR Labs é um subsistema incorporado dentro desse APK e inicializado junto do processo real do Graal/Unity. 

NÃO quero: 

- aplicativo STAR Labs separado; 

- launcher STAR Labs que depois abre o Graal; 

- Activity intermediária; 

- HTML de demonstração sendo tratado como runtime; 

- mini-DSL chamada de GS2; 

- APK considerado "final" apenas porque foi reconstruído e assinado. 

# QUERO: 

- Graal preservado; 

- Unity/IL2CPP preservados; 

- STAR Labs incorporado; 

- runtime real; 

- executor GS2 real; 

- bridge real; 

- painéis reais; 

- APK efetivamente instalável; 

- regressões impedidas conforme novas funcionalidades forem adicionadas. 

============================================================ ESTADO ATUAL 

============================================================ 

O trabalho anterior já conseguiu: 

- preservar o package `com.quattroplay.GraalClassic`; 

- preservar `com.unity3d.player.UnityPlayerActivity` como launcher; 

- preservar `libunity.so`; 

- preservar `libil2cpp.so`; 

- inserir uma camada Android STAR Labs; 

- criar `StarLabsBootstrapProvider`; 

- criar `StarLabsLifecycleCallbacks`; 

- criar pipeline `npm run build-apk`; 

- gerar SHA-256; 

- validar ZIP; 

- validar assinatura; 

- validar Manifest; 

- adicionar testes do runtime. 

Isso deve ser preservado. 

PORÉM: 

O APK ainda foi recusado pelo Android durante a instalação. 

E o runtime existente ainda não é um executor GS2 real. 

Portanto o projeto NÃO está concluído. 

============================================================ PRIORIDADES 

============================================================ 

PRIORIDADE 1: 

Fazer o APK final ser aceito pelo Android. 

PRIORIDADE 2: 

Garantir que o Graal continue iniciando e funcionando. 

PRIORIDADE 3: 

Garantir que o caminho ativo do XCore seja corretamente desativado/substituído. 

PRIORIDADE 4: 

Construir um runtime/executor GS2 real. 

PRIORIDADE 5: 

Integrar o runtime real ao APK/Graal. 

PRIORIDADE 6: 

Criar infraestrutura de regressão para impedir que novos recursos quebrem funcionalidades anteriores. 

============================================================ REGRA ABSOLUTA DE ERRO 

============================================================ 

QUALQUER ERRO ENCONTRADO É UM BLOQUEADOR ATÉ SER EXPLICADO E CORRIGIDO. 

Fluxo obrigatório: 

FALHOU ↓ DIAGNOSTICAR ↓ CORRIGIR ↓ TESTAR NOVAMENTE ↓ SÓ ENTÃO CONTINUAR 

Não acumular defeitos conhecidos enquanto continua implementando outras camadas. 

Não marcar uma etapa como PASS apenas porque uma ferramenta terminou com exit code 0. 

============================================================ REGRA ABSOLUTA DE EVIDÊNCIA 

============================================================ 

Separar claramente: 

IMPLEMENTADO TESTADO VALIDADO NO APK VALIDADO NO ANDROID PARTIAL STUB UNVERIFIED BLOCKED 

Não transformar: 

"arquivo existe" 

# em: 

"feature funciona". 

Não transformar: 

"apksigner verify" 

em: 

"APK instalável". 

Não transformar: 

"parser aceita" 

em: 

"runtime executa". 

Não transformar: 

"MockBridge funciona" 

# em: 

"GraalBridge funciona". 

============================================================ PRINCÍPIO FINAL 

============================================================ 

# A missão é MODIFICAR O GRAAL. 

Não criar um programa que apenas abre o Graal. 

E a missão do runtime é EXECUTAR GS2 REAL. 

Não criar uma pequena linguagem experimental e chamá-la de GS2. 

O APK final precisa ser um produto executável, verificável e resistente a regressões. 

# PARTE 2/6 — APK INSTALLATION + ANDROID 13+ 

============================================================ 

PROBLEMA ATUAL 

============================================================ 

O APK anterior chegou a ser entregue com 0 bytes. 

Isso já foi corrigido no workspace. 

O APK atual possui aproximadamente: 

88.064.781 bytes ≈ 83.99 MiB 

No ZArchiver ele aparece com aproximadamente: 

83.98 MB 

Mesmo assim o Android mostra: 

"O app não foi instalado" 

IMPORTANTE: 

O aplicativo anterior foi DESINSTALADO antes do teste. 

Portanto NÃO assumir conflito com instalação antiga. 

============================================================ DIAGNÓSTICO OBRIGATÓRIO 

============================================================ 

Descobrir a causa real da rejeição. 

Se `adb` e dispositivo/emulador estiverem disponíveis: 

usar instalação real: 

adb install APK 

Capturar: 

- stdout; 

- stderr; 

- PackageManager; 

- INSTALL_FAILED_*; 

- logcat. 

Quando necessário consultar: 

adb logcat 

e filtrar: 

PackageManager PackageInstaller installd AndroidRuntime 

NÃO aceitar: 

"O app não foi instalado" 

como diagnóstico técnico. 

============================================================ ANDROID 13+ 

============================================================ 

O APK deve ser preparado para Android 13+. 

Verificar: 

minSdk targetSdk compileSdk versionCode versionName 

Não basta alterar `targetSdkVersion`. 

Verificar compatibilidade real do: 

- Manifest; 

- Activity; 

- Provider; 

- Permissions; 

- DEX; 

- Native libraries; 

- ABI; 

- resources; 

- assinatura; - packaging. 

============================================================ PACKAGE 

============================================================ 

Preservar: 

# com.quattroplay.GraalClassic 

Não alterar package sem necessidade técnica. 

# Preservar: 

com.unity3d.player.UnityPlayerActivity 

como launcher, salvo evidência concreta em contrário. 

============================================================ MANIFEST AUDIT 

============================================================ 

Comparar Manifest de entrada com Manifest final. 

Registrar: 

- application; 

- activity; 

- provider; 

- service; 

- receiver; 

- exported; 

- authorities; 

- process; 

- permissions; 

- metadata; 

- features; 

- SDK. 

Qualquer mudança precisa ser justificada. 

============================================================ STAR LABS PROVIDER 

============================================================ 

Auditar: 

com.star.labs.graal.StarLabsBootstrapProvider 

Verificar: 

- classe presente; 

- DEX correto; 

- authorities; 

- exported; 

- initOrder; 

- processo; 

- dependências; 

- lifecycle; 

- exceções; 

- referências a classes inexistentes. 

O Provider NÃO pode tornar o pacote inválido ou quebrar o startup. 

Se a inicialização pesada no Provider for um risco, manter o Provider somente para bootstrap seguro e mover o trabalho pesado para o ciclo de vida apropriado do processo Unity. 

NÃO voltar para `StarLabsMainActivity` como launcher. 

============================================================ RESOURCES.ARSC 

============================================================ 

Auditar explicitamente: 

resources.arsc 

Verificar: 

- existência; 

- integridade; 

- compressão; 

- alinhamento; 

- reconstrução correta. 

Consultar a documentação Android atual sempre que houver dúvida sobre requisitos específicos de Android 13+. 

============================================================ NATIVE LIBRARIES 

============================================================ 

Inventariar: 

lib/*/*.so 

Especialmente: 

libunity.so libil2cpp.so libservice.so 

Para cada biblioteca: 

- ABI; 

- ELF class; 

- machine; 

- LOAD alignment; 

- tamanho; 

- dependências; 

- presença no APK; 

- compressão; 

- alinhamento. 

Não modificar bibliotecas originais sem necessidade e sem evidência. 

============================================================ ABI 

============================================================ 

Se houver dispositivo: 

adb shell getprop ro.product.cpu.abi adb shell getprop ro.product.cpu.abilist 

Comparar com: 

lib/arm64-v8a lib/armeabi-v7a etc. 

Se surgir: 

# INSTALL_FAILED_NO_MATCHING_ABIS 

tratar como erro de ABI e corrigir. 

============================================================ ZIPALIGN 

============================================================ 

A sequência final deve ser: 

BUILD 

↓ REBUILD APK ↓ ZIPALIGN ↓ VERIFY ALIGNMENT 

↓ SIGN 

↓ 

VERIFY SIGNATURE 

↓ FINAL VALIDATION 

Nunca assinar antes do alinhamento final. 

Como o APK contém native libraries, verificar também compatibilidade com dispositivos de página de 16 KiB quando aplicável. 

Usar as ferramentas oficiais disponíveis. 

Quando suportado: 

zipalign -c -P 16 -v 4 APK 

Também verificar alinhamento ELF quando necessário. 

============================================================ ASSINATURA 

============================================================ 

Comparar entrada e saída. 

Registrar: 

- certificate; 

- certificate SHA-256; 

- signature schemes; 

- package; 

- version. 

Depois de qualquer alteração no APK: 

rebuild 

↓ align ↓ sign ↓ verify 

Não modificar o APK depois da assinatura. 

============================================================ 

ARTEFATO FINAL 

============================================================ 

O build só termina com sucesso se: 

APK existe AND size > 0 AND ZIP válido AND Manifest válido AND DEX válido AND libs válidas AND package correto AND launcher correto AND alignment válido AND assinatura válida AND SHA-256 correto 

Se não houver dispositivo: 

INSTALLATION = UNVERIFIED 

Nunca inventar PASS. 

# PARTE 3/6 — REGRESSION-SAFE ENGINEERING 

============================================================ OBJETIVO 

============================================================ 

A partir desta execução, nenhuma nova funcionalidade do STAR Labs pode ser adicionada de forma que quebre silenciosamente alguma funcionalidade já existente. 

Cada feature nova precisa passar por uma bateria de regressão. 

A regra é: 

FEATURE NOVA ↓ IMPLEMENTAÇÃO ↓ UNIT TEST ↓ RUNTIME TEST ↓ BUILD TEST ↓ APK STRUCTURAL TEST ↓ REGRESSION TEST 

↓ E2E TEST quando aplicável 

Se uma etapa quebrar uma funcionalidade existente: 

STOP 

↓ identificar regressão ↓ corrigir ↓ repetir testes 

============================================================ BASELINE DE REGRESSÃO 

============================================================ 

Criar uma suíte permanente que seja executada em TODO build relevante. 

Ela deve testar pelo menos: 

# ## Parser 

- expressions; 

- assignments; 

- functions; 

- events; 

- loops; 

- arrays; 

- objects; 

- property access; 

- indexing; 

- GUI construction; 

- callbacks; 

- errors. 

# ## Runtime 

- scopes; 

- `this`; 

- `temp`; 

- globals; 

- calls; 

- returns; 

- loops; 

- timers; 

- events; 

- objects; 

- arrays; 

- strings; 

- errors. 

# ## Bridge 

- builtin registration; - function dispatch; 

- property access; 

- game objects; 

- event dispatch; 

- timer dispatch. 

# ## Panels 

- create; 

- show; 

- hide; 

- update; 

- destroy; 

- events. 

# ## APK 

- package; 

- launcher; 

- DEX; 

- native libraries; 

- Manifest; 

- assets; 

- resources; 

- alignment; 

- signing. 

============================================================ 

# GOLDEN TESTS 

============================================================ 

Criar testes "golden" para comportamentos já aprovados. 

Cada golden test possui: 

input expected AST/runtime result expected observable result 

Se o parser mudar: 

comparar AST antes/depois. 

Se a VM mudar: 

comparar resultado antes/depois. 

Se bridge mudar: 

comparar eventos/efeitos esperados. 

Isso permite detectar regressão antes de gerar APK. 

============================================================ FIXTURE VERSIONING 

============================================================ 

Manter scripts de teste versionados. 

Nunca modificar um teste antigo simplesmente para fazer o novo código passar. 

Se a semântica realmente tiver que mudar: 

1. documentar a razão; 

2. criar novo teste; 

3. atualizar expectativa explicitamente; 

4. registrar incompatibilidade. 

============================================================ FULL BUILD GATE 

============================================================ 

`npm run build-apk` deve funcionar como um gate. 

Se qualquer uma dessas falhar: 

tests lint parser runtime build apk validation signature alignment 

o comando deve retornar: 

exit code != 0 

Não gerar um artefato marcado como final depois de uma falha. 

============================================================ NO REGRESSION POLICY 

============================================================ 

Não aceitar: 

"essa feature nova quebrou uma antiga, mas depois arrumamos" 

como estado permanente. 

O código só pode avançar depois da correção ou com o problema explicitamente bloqueado e documentado. 

============================================================ 

FEATURE FLAGS / ISOLATION 

============================================================ 

Recursos experimentais podem ser isolados. 

Exemplo: 

STAR_FEATURE_X = experimental 

Mas uma feature experimental não pode modificar silenciosamente: 

- parser existente; 

- runtime existente; 

- Graal lifecycle; 

- bridge existente; 

- package; 

- launcher. 

Sempre que possível, mudanças novas devem ser isoladas em módulos. 

============================================================ API CONTRACTS 

============================================================ 

Definir contratos claros entre: 

parser runtime bridge panels Android Graal 

Uma mudança interna de um componente não deve quebrar outro sem o teste detectar. 

============================================================ SNAPSHOT DO APK ============================================================ Depois de um APK conhecido como funcional: guardar metadata: package version size SHA-256 native library inventory manifest hash DEX inventory alignment result certificate 

Isso não significa reutilizar a assinatura ou o APK como código-fonte. 

Serve como baseline de comparação. ============================================================ BEFORE / AFTER ============================================================ Toda modificação importante do APK deve gerar: BEFORE AFTER DIFF Registrar: 

|- arquivos adicionados;|
|---|
|- removidos;|
|- modificados;|
|- Manifest;|
|- DEX;|
|- libs;|
|- resources;|
|- assets.|
|============================================================|
|REGRESSION CHECKLIST|



============================================================ 

Antes de aceitar nova feature: 

[ ] parser continua funcionando [ ] VM continua funcionando [ ] eventos continuam funcionando [ ] timers continuam funcionando [ ] panels continuam funcionando [ ] bridge continua funcionando [ ] Graal package continua correto [ ] launcher continua correto [ ] libs continuam presentes [ ] APK continua íntegro [ ] alignment continua correto [ ] assinatura continua correta [ ] build continua reprodutível 

============================================================ REGRA 

============================================================ 

A evolução do STAR Labs deve ser acumulativa. 

Feature nova deve adicionar capacidade. 

Não pode destruir capacidade anterior sem uma mudança de versão/semântica conscientemente documentada. 

# PARTE 4/6 — GS2 REAL RUNTIME 

============================================================ SITUAÇÃO ATUAL 

============================================================ 

O runtime atual possui: 

lexer.js parser.js vm.js runtime.js 

Mas a implementação atual ainda representa uma mini-DSL experimental. 

Construções como: 

let function 

return if else while call hook panel 

não constituem compatibilidade GS2. 

NÃO continuar simplesmente adicionando keywords aleatórias. 

============================================================ ESPECIFICAÇÃO 

============================================================ 

Os guias e scripts reais disponíveis no projeto são a principal referência de compatibilidade. 

O runtime deve ser adaptado à linguagem real demonstrada pelos arquivos. 

A pergunta não é: 

"o que o parser atual consegue aceitar?" 

A pergunta é: 

"o que os scripts reais exigem?" 

============================================================ ARQUITETURA 

============================================================ 

Implementar uma cadeia coerente: 

GS2 SOURCE 

↓ LEXER 

↓ PARSER 

↓ AST 

↓ SEMANTIC / RUNTIME PREPARATION ↓ EXECUTION ENGINE / VM ↓ BUILTIN DISPATCH ↓ 

GAME BRIDGE 

↓ GRAAL 

Não reduzir tudo a regex. 

============================================================ CONCEITOS OBRIGATÓRIOS 

============================================================ 

Modelar corretamente: 

|- nil;<br>- booleans;<br>- strings;<br>- numbers;<br>- arrays;<br>- objects;<br>- functions;|
|---|
|- scopes;<br>- `this`;<br>- `temp`;<br>- globals;|
|- locals;|
|- properties;|
|- indexing;<br>- methods;|
|- arguments;<br>- return;<br>- break;|
|- continue;<br>- loops;<br>- events;<br>- timers;<br>- callbacks;<br>- errors;|
|- call stack.|



============================================================ 

# SOURCE LOCATION 

============================================================ 

AST nodes devem preservar: 

source line column 

Erros devem conseguir informar algo como: 

script.gs2:184:17 onTimeout() Property does not exist: ... 

Não usar apenas: 

Unsupported expression 

============================================================ FUNCTION CALLS 

============================================================ 

Criar CallFrame ou equivalente: 

function arguments locals temp this return source location parent frame 

Isso permitirá: 

onCreated() → initialize() → process() → update() 

com call trace. 

============================================================ EVENTS 

============================================================ 

Suportar handlers como: 

onCreated onTimeout onPlayerChats onDestroy 

com lifecycle real. 

Timers devem reinvocar o handler com o contexto correto. 

============================================================ LOOPS 

============================================================ 

Suportar formas reais encontradas no corpus. 

# Exemplo: 

for (temp.i = 0; temp.i < 100; temp.i++) { 

... 

} 

E iteração: 

for (temp.p : players) { 

... 

} 

Ambas exigem semântica apropriada. 

============================================================ OPERADORES 

============================================================ 

Implementar os operadores realmente encontrados nos scripts. 

Especialmente: 

= 

== 

!= 

< 

<= 

> 

>= 

! 

&& 

|| 

+ 

- * 

/ 

% 

++ 

-- 

@ 

O operador `@` deve possuir a semântica correta para o ambiente GS2. 

Não substituí-lo cegamente por comportamento JavaScript. 

============================================================ OBJECT MODEL 

============================================================ 

O runtime deve ter objetos próprios para representar: 

Value Object Array Function Scope ExecutionContext Event Timer Panel GameObject Os nomes podem mudar. 

Os conceitos não. 

============================================================ THIS / TEMP / GLOBAL 

============================================================ Não misturar: this temp global local Exemplo: this.counter = 1; temp.counter = 2; precisa manter estados distintos. 

============================================================ PROPERTY ACCESS ============================================================ 

Suportar: 

object.property object["property"] array[index] 

# e encadeamento: 

this.entries[temp.i].active 

============================================================ BUILTINS 

============================================================ 

Separar: 

LANGUAGE CORE RUNTIME ENGINE API GAME BRIDGE 

Exemplo: 

function if for 

são linguagem. 

Enquanto: 

setTimer findobject findimg showtext hideimg 

são engine/runtime APIs. 

============================================================ STUBS ============================================================ 

Recursos ainda não implementados podem ser: 

STUB PARTIAL UNAVAILABLE 

Mas não podem ser reportados como: 

PASS 

O relatório precisa diferenciar. 

============================================================ IMPORTANTE 

============================================================ 

Não declare o runtime "completo" porque: 

npm test = PASS 

Os testes atuais podem provar somente os recursos que estão realmente cobertos. 

A compatibilidade deverá ser medida contra os scripts reais. 

# PARTE 5/6 — CORPUS REAL E COMPLEXIDADE DO EXECUTOR 

============================================================ REGRA 

============================================================ 

Um script "large" com linhas repetidas não prova capacidade de execução. 

Não criar: 

echo("x"); echo("x"); echo("x"); ... 

1300 vezes. 

Não criar: 

let x = 1; 

repetido milhares de vezes. 

O objetivo é DENSIDADE DE LINGUAGEM. 

============================================================ EXEMPLO 1 — EVENTOS + STATE + ARRAYS + OBJECTS ============================================================ 

function onCreated() { 

this.enabled = true; this.counter = 0; this.page = 1; this.entries = {}; this.cache = {}; this.selected = nil; 

this.initializeState(); this.createInterface(); this.refreshInterface(); setTimer(0.05); } 

function initializeState() { for (temp.i = 0; temp.i < 32; temp.i++) { this.entries[temp.i] = { active: false, label: "", value: 0, timestamp: 0 }; } 

this.cache["initialized"] = true; } function addEntry(label, value) { temp.index = this.counter; this.entries[temp.index] = { active: true, label: label, value: value, timestamp: timevar }; this.counter++; } 

function updateEntry(index) { temp.entry = this.entries[index]; if (temp.entry == nil) { return; } if (!temp.entry.active) { 

return; } temp.entry.value += 1; 

if (temp.entry.value > 100) { temp.entry.value = 0; temp.entry.active = false; } } function processEntries() { for (temp.index = 0; temp.index < 32; temp.index++) { temp.entry = this.entries[temp.index]; 

if (temp.entry != nil) { if (temp.entry.active) { updateEntry(temp.index); } } } } 

function refreshInterface() { temp.panel = findobject("STARPanel"); if (temp.panel == nil) { return; } temp.panel.findobject("Status").text = "ENTRIES: " @ this.counter; } function onTimeout() { if (!this.enabled) { setTimer(0.1); return; } this.processEntries(); this.refreshInterface(); this.counter++; if (this.counter >= 1000) { this.counter = 0; this.compactState(); 

} 

setTimer(0.05); } 

function compactState() { temp.newEntries = {}; temp.newIndex = 0; 

for (temp.index = 0; temp.index < 32; temp.index++) { temp.entry = this.entries[temp.index]; 

if (temp.entry != nil) { if (temp.entry.active || temp.entry.value != 0) { temp.newEntries[temp.newIndex] = temp.entry; temp.newIndex++; } } } this.entries = temp.newEntries; } 

============================================================ EXEMPLO 2 — GUI + OBJECT CONSTRUCTION + EVENT HANDLERS 

============================================================ 

function criarPainel() { if (findobject("STARPanel") != nil) { findobject("STARPanel").destroy(); } 

new GuiWindowCtrl("STARPanel") { title = "STAR Labs Runtime"; x = 5; y = 15; width = 450; height = 500; canmove = true; canresize = false; new GuiControl("Navigation") { x = 10; y = 50; width = 420; height = 50; new GuiButtonCtrl("Home") { 

text = "HOME"; x = 0; y = 0; width = 120; height = 35; } new GuiButtonCtrl("Scripts") { text = "SCRIPTS"; x = 130; y = 0; width = 120; height = 35; } new GuiButtonCtrl("Settings") { text = "SETTINGS"; x = 260; y = 0; width = 120; height = 35; } } new GuiTextCtrl("Status") { text = "Runtime online"; x = 20; y = 125; width = 390; height = 30; } }; } function Home.onAction() { findobject("Status").text = "Home"; } function Scripts.onAction() { findobject("Status").text = "Scripts carregados: " @ this.scriptCount; } function Settings.onAction() { findobject("Status").text = "Settings"; } 

============================================================ 

EXEMPLO 3 — COMPLEXIDADE COM PLAYERS/NPCS/EVENTOS ============================================================ 

function onTimeout() { for (temp.i = 1000; temp.i < 1100; temp.i++) { hideimg(temp.i); showtext(temp.i, 0, 0, "", "", ""); } this.adminDetectado = false; this.adminsDetectados = 0; for (temp.p : players) { if (temp.p != player) { if (ehAdmin(temp.p)) { this.adminDetectado = true; this.adminsDetectados++; temp.p.alpha = 1; temp.p.zoom = 5; } } } if (this.adminDetectado) { Status.text = "ADMIN DETECTADO"; } else { Status.text = "STATUS: SEGURO"; if (this.espInsetosAtivo) { temp.idx = 200; for (temp.ni : npcs) { if ( temp.ni.bugid != nil && temp.ni.ani != "" ) { temp.dx = temp.ni.x - player.x; temp.dy = temp.ni.y - player.y; temp.dist = (temp.dx^2 + temp.dy^2)^0.5; if (temp.dist < 120) { DrawLine( 

temp.idx, player.x + 1.5, player.y + 1.5, temp.ni.x + 1, temp.ni.y + 1, 0.08, 1, 1, 0, 0.6 ); showtext( temp.idx + 1, temp.ni.x, temp.ni.y - 1.5, "Arial", "b", "TARGET [" @ int(temp.dist) @ "m]" ); temp.idx += 2; } } } } } setTimer(0.05); } ============================================================ REGRA SOBRE OS EXEMPLOS 

============================================================ 

Esses exemplos demonstram o nível estrutural esperado. 

O runtime precisa ser capaz de modelar progressivamente: 

- multiple functions; 

- event handlers; 

- nested blocks; 

- nested objects; 

- this; 

- temp; 

- arrays; 

- object properties; 

- indexing; 

- loops; 

- foreach-like iteration; 

- math; - string concatenation; 

- timers; - callbacks; - GUI; - game objects; - builtins; - lifecycle. 

============================================================ LARGE-SCRIPT TEST 

============================================================ 

O `large-script.gs2` deve ser realmente grande e realmente complexo. 

Meta: 

- centenas/milhares de linhas; - dezenas de funções; - vários handlers; - loops; - arrays; - objects; - GUI; - callbacks; - timers; - strings; - matemática; - state; - error paths. 

Não repetir linhas artificialmente. 

============================================================ CORPUS REAL 

============================================================ 

Usar os scripts reais disponíveis no projeto como corpus de conformidade. 

Para cada script: 

parse ↓ AST 

↓ runtime ↓ bridge ↓ observação 

Quando uma construção ainda não for suportada: 

registrar; classificar; implementar; testar novamente. 

Não simplificar o script para caber no runtime. 

============================================================ TEST MATRIX ============================================================ Criar matriz: feature source parser AST runtime bridge Android test result Status: PASS PARTIAL STUB UNAVAILABLE UNVERIFIED ============================================================ EXECUTION TEST ============================================================ Separar: syntax test parse test 

AST test runtime test bridge test panel test Android test E2E test 

Parser PASS não significa runtime PASS. 

Runtime PASS não significa APK PASS. 

Mock bridge PASS não significa Graal bridge PASS. 

# PARTE 6/6 — INTEGRAÇÃO REAL + BUILD + REGRESSION GATE 

============================================================ STAR LABS DENTRO DO APK 

============================================================ 

O runtime final não pode existir somente no Node.js/workspace. 

Precisamos de uma cadeia real dentro do APK: 

Android ↓ Graal/Unity ↓ STAR Labs bootstrap ↓ STAR Labs runtime ↓ GS2 script loader ↓ GS2 execution ↓ builtin dispatcher ↓ Graal/client bridge ↓ UI/panels/game 

Não usar: 

star_labs.html 

como substituto do runtime. 

O HTML pode continuar como parte da UI, mas não é o executor. 

============================================================ XCORE ============================================================ 

Usar os relatórios existentes: 

xcore-residue.md xcore-active-path.md 

Os componentes identificados incluem: 

com.player.render.ModMenu libservice.so xCoreScripts menu.holy WebView WebMessageChannel JNI bridge 

# Mapear: 

startup ↓ ModMenu ↓ JNI ↓ libservice ↓ XCore runtime 

Classificar: 

ORIGINAL XCORE MODIFIED_BY_XCORE SHARED STAR_LABS 

Somente depois desativar/substituir o caminho ativo. 

Não apagar componentes por nome. ============================================================ GRAAL PRESERVATION TEST ============================================================ 

Sempre verificar: 

package unchanged launcher unchanged Unity libs present IL2CPP present required assets present metadata present manifest sane 

Se qualquer um quebrar: 

BUILD FAIL 

============================================================ BUILD PIPELINE 

============================================================ 

Manter: 

npm run build-apk 

como comando oficial. 

Pipeline: 

validate source ↓ run regression tests ↓ extract base/evidence APK ↓ analyze ↓ patch ↓ compile ↓ generate DEX ↓ rebuild APK ↓ zipalign ↓ verify alignment ↓ sign ↓ 

verify signature ↓ APK structural validation ↓ SHA-256 ↓ installation test when possible ↓ final regression validation 

============================================================ BUILD MUST FAIL CLOSED 

============================================================ 

O build deve falhar com exit code != 0 se houver: 

- source test failure; 

- parser test failure; 

- runtime test failure; 

- lint failure; 

- compilation failure; 

- APK zero bytes; 

- ZIP corruption; 

- bad Manifest; 

- missing DEX; 

- missing native libs; 

- alignment failure; 

- signature failure; 

- metadata mismatch; 

- package mismatch; 

- regression. 

Não entregar APK "mesmo assim". 

============================================================ REPRODUCIBILITY 

============================================================ 

Sempre que possível, garantir que: 

mesma entrada + mesmo source + mesma toolchain = estrutura equivalente 

Registrar: 

- versions; 

- toolchain; 

- hashes; 

- input; 

- output. 

============================================================ APK DIFF 

============================================================ 

Gerar relatório: 

base APK versus final APK 

Mostrar: 

added modified removed 

Para alterações importantes: motivo risco teste correspondente ============================================================ FINAL ACCEPTANCE 

============================================================ 

# Antes de declarar sucesso: 

# ## APK 

[ ] não vazio [ ] ZIP íntegro [ ] resources válidos [ ] alignment válido [ ] Manifest válido [ ] package correto [ ] launcher correto [ ] DEX válido [ ] native libs válidas [ ] assinatura válida 

[ ] SHA correto 

# ## ANDROID 

[ ] Android 13+ target/config validado 

[ ] ABI compatível 

[ ] instalação real PASS se dispositivo disponível [ ] caso contrário UNVERIFIED explicitamente 

# ## GRAAL 

[ ] launcher Unity preservado 

[ ] jogo inicia 

[ ] Unity funciona 

[ ] native stack preservada 

# ## XCORE 

[ ] active path identificado 

[ ] active path desativado/substituído 

[ ] nenhuma remoção cega 

# ## STAR LABS 

[ ] bootstrap 

[ ] runtime [ ] GS2 parser [ ] GS2 VM [ ] object model [ ] events [ ] timers [ ] builtins [ ] bridge [ ] panels [ ] error system 

# ## GS2 

[ ] script real pequeno [ ] script real médio [ ] script real grande [ ] large-script real [ ] corpus real [ ] efeitos observáveis 

# ## REGRESSÃO 

[ ] testes antigos continuam PASS 

- [ ] nova feature passa 

[ ] APK continua válido 

[ ] Graal continua preservado 

============================================================ STATUS 

============================================================ 

Usar somente: 

PASS FAIL PARTIAL STUB UNVERIFIED BLOCKED 

Nunca escrever: 

"completo" 

enquanto houver partes essenciais PARTIAL/STUB/UNVERIFIED. 

============================================================ ERRO NO FUTURO 

============================================================ 

A partir de agora, toda feature nova do STAR Labs deve seguir: 

feature proposta ↓ impacto analisado ↓ implementação ↓ unit tests ↓ runtime tests ↓ regression suite ↓ APK build ↓ APK validation ↓ E2E quando aplicável 

Se quebrar qualquer coisa: 

STOP FIX RETEST 

Não normalizar regressões. 

============================================================ GIT 

============================================================ 

Ao finalizar uma etapa consistente: 

git status git diff git add git commit git push 

Nunca incluir: 

- tokens; - senhas; - chaves privadas; - credenciais. 

Registrar: 

branch 

commit 

push APK path size SHA256 

test result installation result 

============================================================ REGRA FINAL 

============================================================ 

Não declarar sucesso porque: 

"o APK foi gerado". 

Não declarar sucesso porque: 

"o APK foi assinado". 

Não declarar sucesso porque: 

"o parser passou". 

Não declarar sucesso porque: 

"1301 linhas foram processadas". 

O sucesso real é: 

GRAALONLINE + STAR LABS + GS2 RUNTIME REAL + BRIDGE REAL + UI REAL + REGRESSION SAFETY + APK INSTALÁVEL = PRODUTO FUNCIONAL 

Toda nova versão deve ser melhor que a anterior sem quebrar aquilo que já funcionava. 

Esse é o princípio de engenharia do projeto daqui para frente. 


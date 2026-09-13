# STAR Labs — DEEP FORENSIC ENGINEERING ## PARTE 1/6 — MISSÃO, ESCOPO E MÉTODO 

ESTA É A DIRETIVA ATUAL. 

Use o estado ATUAL do repositório. 

NÃO recomece. 

NÃO apague trabalho correto. 

NÃO recrie `StarLabsMainActivity`. 

NÃO transforme STAR Labs em launcher. 

NÃO trate relatórios antigos como verdade quando houver evidência nova do dispositivo. 

============================================================ 1. OBJETIVO 

============================================================ 

Transformar: 

GRAALONLINE + XCORE 

# em: 

GRAALONLINE + STAR LABS 

O produto final é UM ÚNICO APK. 

O Graal permanece sendo o aplicativo/jogo. 

O STAR Labs é o único subsistema adicional desejado. 

O XCore deve ser completamente removido do produto final, inclusive sua interface, inicialização, runtime, bridge e demais componentes que sejam exclusivamente dele. 

============================================================ 2. PRESERVAÇÃO 

============================================================ 

PRINCÍPIO: 

# PRESERVE O GRAAL POR PADRÃO. 

Não modificar partes do cliente Graal sem necessidade técnica comprovada. 

Preservar: 

- package; 

- Unity; 

- IL2CPP; 

- assets; 

- metadata; 

- rendering; 

- networking necessário; 

- input; 

- lifecycle; 

- recursos; 

- bibliotecas necessárias; 

- comportamento normal do jogo. 

Modificar somente: 

XCORE 

ou integração STAR LABS 

quando houver evidência suficiente. 

============================================================ 3. REMOÇÃO DO XCORE 

============================================================ 

Queremos remover o XCore da cópia local que estamos transformando. 

Não é para adaptar o XCore. 

Não é para fazer o XCore continuar funcionando. 

Não é para substituir a licença do XCore. 

Não é para manter a interface XCore. 

É para identificar os componentes adicionados pelo XCore e removê-los/desativá-los de maneira segura, preservando o Graal. 

A transformação é: 

XCORE ↓ IDENTIFICAR ↓ MAPEAR ↓ 

CLASSIFICAR 

↓ REMOVER/DESATIVAR ↓ VALIDAR 

============================================================ 

# 4. EVIDÊNCIA DE DISPOSITIVO 

============================================================ 

O APK atual foi instalado com sucesso em dispositivo Android real. 

O comportamento observado foi: 

Graal abre 

+ 

STAR Labs aparece 

+ 

XCore aparece 

A interface XCore observada contém: 

XCORE 

Editor GraalScript 2 Dispositivo identificado TENTAR NOVAMENTE Chave inválida Entrar no Discord 

Isso confirma: 

# XCORE ACTIVE PATH = VERIFIED 

Não tratar mais isso como simples hipótese. 

============================================================ 5. DEFINIÇÃO DE ENGENHARIA FORENSE 

============================================================ 

Não procurar somente: 

"XCore" 

Procurar o comportamento. 

A metodologia deve ser: 

INDICADOR 

↓ REFERÊNCIA ↓ CALLER ↓ CALLEE ↓ DEPENDÊNCIA ↓ LIFECYCLE ↓ EXECUTION PATH ↓ UI / RUNTIME ↓ CLASSIFICAÇÃO 

Uma string é evidência de localização. 

Uma cadeia de execução é evidência de comportamento. 

============================================================ 6. NÃO USAR HARD-CODED ANSWERS 

============================================================ 

NÃO fornecer antecipadamente: 

- offsets finais; 

- endereços finais; 

- funções específicas como "apague esta"; - índices mágicos; 

- assumptions de layout; 

- "esta biblioteca é XCore" sem prova. 

Os dados históricos existentes podem ser usados como: 

HIPÓTESES 

PONTOS DE PARTIDA REFERÊNCIAS 

Mas devem ser revalidados no binário atual. 

============================================================ 7. OUTPUT FORENSE 

============================================================ 

Antes de alterar significativamente o APK, produzir: 

apk-forensics/ 

com: 

inventory.json dex-report.json native-report.json manifest-diff.json resources-report.json startup-graph.json xcore-components.json dependency-graph.json confidence.json 

Cada conclusão importante deve ter: 

evidence confidence source references 

============================================================ 8. CLASSIFICAÇÃO DOS COMPONENTES 

============================================================ 

Cada componente deve receber uma categoria: 

GRAAL_ORIGINAL UNITY_ORIGINAL SHARED XCORE MODIFIED_BY_XCORE STAR_LABS UNKNOWN 

UNKNOWN é permitido. 

É melhor UNKNOWN do que apagar algo incorretamente. 

============================================================ 9. REGRA DE ALTERAÇÃO 

============================================================ 

Antes: 

ANALISAR 

Depois: 

CLASSIFICAR 

Depois: 

MODIFICAR 

Nunca: 

MODIFICAR 

↓ 

VER O QUE ACONTECE 

O APK é complexo demais para engenharia por tentativa cega. 

============================================================ 10. META DA FASE 

============================================================ 

Ao final desta investigação precisamos conseguir explicar: 

COMO O GRAAL INICIA 

COMO O XCORE INICIA 

COMO A UI XCORE É CRIADA 

COMO O RUNTIME XCORE É INICIADO 

COMO O XCORE ACESSA O CLIENTE 

QUAIS ARQUIVOS/CÓDIGOS SÃO NECESSÁRIOS PARA ISSO 

O QUE PRECISA SER REMOVIDO 

O QUE PRECISA SER PRESERVADO 

ONDE O STAR LABS SERÁ INSERIDO 

Não começar a remoção em massa antes de conseguir responder essas perguntas. 

# PARTE 2/6 — TOOLCHAIN FORENSE AVANÇADA 

Use as ferramentas disponíveis no ambiente. 

Quando uma ferramenta especializada não estiver instalada, verificar se pode ser instalada de forma reproduzível. 

Não limitar a análise a grep/find. 

|============================================================<br>1. APK / ZIP<br>============================================================|
|---|
|Usar:|
|apktool<br>aapt2|
|apksigner<br>zipalign<br>zipinfo<br>unzip|
|apkanalyzer|
|Para:|
|- estrutura;|
|- Manifest;|
|- resources;|
|- DEX;|
|- libs;|
|- ZIP entries;<br>- alignment;|
|- signing.|
|============================================================<br>2. DEX / ANDROID JAVA<br>============================================================|



Usar preferencialmente: 

JADX / jadx-gui baksmali/smali 

JADX é capaz de decompilar APK/DEX e também decodificar Manifest/resources, além de fornecer busca de uso e navegação entre declarações. 

Use-o para produzir: 

Java decompilado classes methods fields references strings native methods 

Depois utilize smali para confirmar instruções quando o decompilado Java for ambíguo. 

NÃO confiar cegamente no Java decompilado. 

============================================================ 3. NATIVE / ELF 

============================================================ 

Usar ferramentas fortes de engenharia reversa quando disponíveis: 

Ghidra IDA Pro Binary Ninja 

Preferir uma análise cruzada quando possível. 

Para cada biblioteca importante: 

libunity.so libil2cpp.so libservice.so 

analisar: 

- ELF headers; 

- sections; - segments; 

- imports; 

- exports; 

- symbols; 

- strings; 

- relocations; 

- NEEDED; 

- dynamic symbols; - JNI; 

- functions; 

- cross-references; 

- call graph. 

Ferramentas como Ghidra, IDA e Binary Ninja devem ser usadas como instrumentos de análise, não como fonte automática de verdade. 

============================================================ 4. UNITY / IL2CPP 

============================================================ 

O cliente contém: 

libil2cpp.so global-metadata.dat 

Usar ferramentas especializadas de IL2CPP. 

Prioridade: 

Il2CppDumper 

quando compatível com a versão do cliente. 

Ele pode reconstruir metadata útil, gerar: 

Dummy DLLs dump.cs il2cpp.h scripts Ghidra scripts IDA suporte Binary Ninja 

Use essas estruturas para enriquecer a análise do IL2CPP. 

Não assumir que "dump.cs" representa código-fonte original. 

Ele é uma representação da metadata/estrutura disponível. 

============================================================ 

5. DYNAMIC ANALYSIS 

============================================================ 

Quando houver dispositivo de teste acessível e for apropriado ao build local: 

considerar instrumentação dinâmica com: 

Frida 

para OBSERVAR: 

- lifecycle; 

- library loading; 

- method invocation; 

- JNI; 

- WebView; 

- file access; 

- threads; 

- startup; 

- comportamento da interface. 

O objetivo é confirmação dinâmica da cadeia. 

Não substituir análise estática por hooks temporários. 

Não alterar o comportamento do APK final através da ferramenta de investigação. 

============================================================ 

# 6. ANDROID DEBUGGING 

============================================================ 

Usar: 

adb logcat dumpsys am pm run-as quando permitido profiler/debugging tools disponíveis 

Durante o startup: 

capturar process start library loading Activity lifecycle Provider lifecycle crashes WebView initialization XCore UI creation 

============================================================ 

# 7. BINARY DIFFERENTIAL ANALYSIS 

============================================================ 

Se houver múltiplos APKs/binaries: 

comparar: 

hash 

strings sections symbols DEX Manifest resources assets native libs 

Usar ferramentas de diff binário quando disponíveis. 

Exemplos de categorias de ferramenta: 

BinDiff Diaphora Ghidra Version Tracking BinExport 

A ferramenta exata pode variar pelo ambiente. 

O importante é gerar correspondências entre: 

BASE XCORE-MODIFIED 

============================================================ 

# 8. AUTOMATION 

============================================================ 

Criar scripts Python para produzir índices. 

Exemplo: 

apk_inventory.py dex_inventory.py elf_inventory.py xcore_scan.py startup_graph.py apk_diff.py 

Não criar scripts descartáveis que precisam ser executados manualmente e depois esquecidos. 

Integrar os resultados ao processo do projeto. 

============================================================ 9. STRING INDEX 

============================================================ 

Criar índice de strings: 

all_strings.json 

Mas classificar: 

exact match 

fuzzy match UI text endpoint path symbol debug text unrelated 

Strings são pistas. 

Não são prova suficiente. 

============================================================ 10. RESULTADO ESPERADO 

============================================================ 

Ao terminar esta fase deve existir um mapa: 

APK ├── Android ├── DEX ├── Unity ├── IL2CPP ├── Native ├── Resources ├── Assets ├── XCORE └── STAR LABS 

com dependências conhecidas. 

============================================================ 11. REGRA 

============================================================ 

Nenhuma ferramenta isolada deve determinar sozinha: 

"isto é XCore" 

Correlacionar: 

static evidence + references + lifecycle + runtime observation 

+ 

behavior 

JADX é particularmente apropriado para a parte DEX/Android, e o Il2CppDumper é particularmente útil porque consegue gerar artefatos para Ghidra/IDA/Binary Ninja a partir de libil2cpp.so + metadata. 

# # PARTE 3/6 — XCORE FORENSICS + SAFE REMOVAL 

============================================================ 1. O QUE PROCURAR 

============================================================ 

Investigar completamente: 

com.player.render.ModMenu libservice.so xCoreScripts menu.holy WebView WebMessageChannel WebMessagePort JNI dynamic loading custom startup custom UI script loading local configuration custom endpoints 

Mas NÃO assumir que todos esses componentes são 100% XCore. 

============================================================ 2. MODMENU 

============================================================ 

Construir o caminho: 

quem instancia ↓ constructor ↓ lifecycle ↓ StartMenu ↓ setupChannel ↓ 

WebView 

↓ WebMessage 

↓ JNI/native ↓ runtime 

Identificar cada caller. 

============================================================ 3. LIBSERVICE 

============================================================ 

# Mapear: 

JNI_OnLoad RegisterNatives exports imports dynamic symbols dlopen dlsym filesystem networking pthread WebView bridge callers 

Para cada função relevante: 

function caller callee purpose confidence 

============================================================ 4. UI XCORE 

============================================================ 

A tela observada: 

XCORE Editor GraalScript 2 Dispositivo identificado TENTAR NOVAMENTE Chave inválida 

Entrar no Discord 

deve ser rastreada até o código que a produz. 

Descobrir se vem de: 

HTML CSS JavaScript Android View WebView Canvas native drawing Unity IL2CPP resources assets native library 

Não apagar o componente anterior sem saber como a UI é produzida. 

============================================================ 5. STARTUP 

============================================================ 

Determinar exatamente: 

process start ↓ Application ↓ Provider ↓ Activity ↓ Unity ↓ native initialization ↓ XCore initialization ↓ XCore UI Identificar o primeiro ponto em que XCore se torna inevitável. 

============================================================ 6. MINIMUM SAFE REMOVAL SET 

============================================================ 

Depois de construir o grafo de dependências: 

determinar: 

menor conjunto de mudanças 

necessário para impedir: 

XCore startup XCore UI XCore script runtime XCore bridge 

sem quebrar: 

Graal 

Unity IL2CPP rendering networking input lifecycle 

============================================================ 

# 7. REMOVER VS DESATIVAR 

============================================================ 

Preferir, na ordem: 

1. remover componente exclusivamente XCore; 

2. remover referência a componente exclusivamente XCore; 

3. impedir inicialização do caminho exclusivamente XCore; 

4. remover asset/recurso exclusivamente XCore; 

5. manter componente compartilhado mas separar seu uso, quando necessário. 

Não remover biblioteca compartilhada do Graal apenas porque contém algumas funções XCore. 

============================================================ 

# 8. SAFE REMOVAL 

============================================================ 

Antes: 

snapshot 

Modificar: 

uma categoria por vez 

Depois: rebuild 

Depois: 

validation 

Depois: 

startup test 

Se quebrar: 

rollback da última alteração identificar dependência corrigir estratégia 

============================================================ 9. TESTE DE AUSÊNCIA 

============================================================ 

Depois da remoção, testar especificamente: 

XCore UI não aparece XCore login/key screen não aparece ModMenu não inicia WebView XCore não inicia xCoreScripts não é inicializado pelo caminho antigo XCore runtime não assume controle 

Ao mesmo tempo: 

Graal inicia Unity inicia jogo funciona 

============================================================ 

# 10. REGRA DE SUCESSO 

============================================================ 

Não marcar: 

# XCORE_REMOVED = TRUE 

apenas porque: 

`ModMenu` não aparece no DEX. 

É necessário provar que o comportamento desapareceu. 

============================================================ 

11. RESIDUE 

============================================================ 

Depois da remoção pode existir: 

strings 

metadata 

código morto resources símbolos arquivos inertes 

Isso é diferente de: 

ACTIVE XCORE PATH 

Registrar ambos separadamente. 

============================================================ 12. RELATÓRIO 

============================================================ 

# Produzir: 

xcore-removal-report.json 

com: 

component classification 

evidence 

action 

reason 

risk 

test 

result 

Não esconder incertezas. 

# # PARTE 4/6 — STAR LABS GS2 RUNTIME REAL 

============================================================ 1. NÃO ACEITAR A VM ATUAL COMO PRODUTO FINAL ============================================================ 

O runtime atual contendo: 

lexer.js parser.js vm.js runtime.js 

é uma base experimental. 

A mini-DSL existente: 

let call hook panel 

# não é a definição de GS2. 

Não chamá-la de executor completo. 

============================================================ 2. TARGET 

============================================================ 

Construir: 

GS2 SOURCE 

↓ LEXER ↓ PARSER ↓ AST ↓ SEMANTIC MODEL ↓ EXECUTION ENGINE / VM ↓ BUILTIN API ↓ 

GAME BRIDGE 

↓ GRAAL 

============================================================ 

# 3. LANGUAGE CORE 

============================================================ 

# Implementar progressivamente a linguagem demonstrada nos materiais. 

Cobrir conforme evidência: 

variables functions events if else for foreach while return break continue operators strings numbers booleans nil arrays objects properties indexing methods scopes this temp global callbacks 

============================================================ 

# 4. OBJECT MODEL 

============================================================ 

Criar conceitos equivalentes a: 

GS2Value GS2Object GS2Array 

GS2Function GS2Scope GS2CallFrame GS2ExecutionContext GS2Event GS2Timer 

Não precisa usar esses nomes exatos. 

O modelo precisa existir de maneira clara. 

============================================================ 5. THIS / TEMP / GLOBAL 

============================================================ 

Não reduzir tudo a JavaScript global. 

Exemplo: 

this.counter = 10; temp.counter = 20; 

devem ser estados diferentes. 

Também suportar: 

this.entries[temp.i] global.someState temp.localValue 

conforme demonstrado no corpus. 

============================================================ 

# 6. EVENTS 

============================================================ 

Suportar lifecycle: 

onCreated 

onTimeout onPlayerChats onDestroy 

com: 

registration dispatch context 

persistence errors 

============================================================ 

# 7. TIMERS 

============================================================ 

Timers devem realmente interagir com lifecycle. 

Exemplo: function onCreated() { this.counter = 0; setTimer(0.05); } function onTimeout() { this.counter++; if (this.counter < 100) { setTimer(0.05); } } O estado `this.counter` deve sobreviver entre chamadas. ============================================================ 8. FORMS OF LOOP ============================================================ Implementar progressivamente as formas observadas. 

Exemplo: for (temp.i = 0; temp.i < 100; temp.i++) { ... } E: for (temp.p : players) { ... } Não fingir que ambos são o mesmo construct. ============================================================ 9. OPERATORS 

============================================================ 

Implementar operadores realmente encontrados. 

Especialmente: 

= == != < <= > >= ! && || + - * / % ++ 

-- @ 

Confirmar semântica através do corpus. ============================================================ 10. PROPERTY MODEL ============================================================ 

Suportar: 

player.x player.y this.value object.property object["property"] array[index] 

e acesso encadeado. 

============================================================ 11. GUI OBJECT MODEL ============================================================ 

Suportar progressivamente construções como: 

new GuiWindowCtrl("STARPanel") { title = "STAR Labs"; x = 5; y = 15; width = 450; height = 500; 

new GuiTextCtrl("Status") { text = "Runtime online"; x = 20; y = 100; width = 400; height = 30; } new GuiButtonCtrl("Refresh") { text = "REFRESH"; x = 20; y = 150; width = 180; height = 35; } }; 

Essa construção exige: 

object construction nesting properties lifecycle child objects 

Não armazenar isso simplesmente como string. 

============================================================ 12. GUI EVENTS 

============================================================ 

Suportar estruturas como: 

function Refresh.onAction() { findobject("Status").text = "UPDATED"; } 

Relacionar: 

object event 

# function 

============================================================ 13. ERROR MODEL ============================================================ 

Erros devem informar: 

source line column function event call stack cause Exemplo: script.gs2:184:12 onTimeout() PropertyError: `entry.active` não pode ser resolvido. ============================================================ 14. CALL STACK 

============================================================ 

Uma chamada: A() → B() → C() deve preservar a cadeia. Isso servirá para: debug tracing errors 

============================================================ 15. EXECUTION SAFETY 

============================================================ 

Pode existir: 

step budget 

max call depth callback safeguard 

Mas NÃO: 

max 1200 lines 

Um script grande deve ser limitado somente por recursos reais. 

============================================================ 16. ENGINE API ============================================================ Separar: language core runtime engine bridge Exemplos: function / if / for = linguagem. Enquanto: showtext hideimg findimg findobject setTimer 

= APIs do ambiente. 

============================================================ 17. BRIDGE ============================================================ 

Criar interface explícita: 

GS2 ↓ builtin dispatcher ↓ game bridge ↓ 

# Graal/Unity/native 

# Mocks podem existir para testes. 

Mocks não contam como integração final. 

============================================================ 

# 18. STATUS 

============================================================ 

Cada API: 

IMPLEMENTED PARTIAL 

STUB UNAVAILABLE 

Nunca marcar STUB como PASS. 

# # PARTE 5/6 — CORPUS GS2 REAL E REGRESSION ENGINEERING 

============================================================ 1. CORPUS 

============================================================ 

Usar os arquivos reais já existentes no projeto. 

Os guias e scripts reais são a referência principal. 

Não definir GS2 pelo parser atual. 

============================================================ 

# 2. SCRIPT REAL GRANDE 

============================================================ 

O `large-script.gs2` precisa ser realmente grande E complexo. 

Não usar: 

echo("x"); 

1300 vezes. 

Não usar: 

let x = 1; 

1300 vezes. 

Deve conter: 

- dezenas de funções; - múltiplos eventos; 

- timers; - loops; - arrays; - objects; - indexing; - `this`; - `temp`; - properties; - callbacks; - GUI; - strings; - matemática; - bridge calls; 

- error paths. 

============================================================ 

# 3. BENCHMARK REAL 

============================================================ 

Usar como referência estruturas desse nível: 

function onCreated() { this.enabled = true; this.counter = 0; this.items = {}; this.cache = {}; 

for (temp.i = 0; temp.i < 64; temp.i++) { this.items[temp.i] = { active: false, value: 0, label: "" }; } this.createPanel(); this.refresh(); setTimer(0.05); } function processItems() { for (temp.i = 0; temp.i < 64; temp.i++) { temp.item = this.items[temp.i]; 

if (temp.item != nil) { if (temp.item.active) { temp.item.value++; 

if (temp.item.value > 100) { temp.item.value = 0; temp.item.active = false; } } } } } 

function refresh() { temp.panel = findobject("STARPanel"); if (temp.panel != nil) { temp.panel.findobject("Status").text = "COUNT: " @ this.counter; } } function onTimeout() { if (!this.enabled) { setTimer(0.1); return; } processItems(); refresh(); this.counter++; if (this.counter >= 1000) { this.counter = 0; } setTimer(0.05); } function onPlayerChats() { if (player.chat == "/star") { this.createPanel(); player.chat = ""; } } 

function onDestroy() { this.enabled = false; 

temp.panel = findobject("STARPanel"); 

if (temp.panel != nil) { temp.panel.destroy(); } } 

Isso é apenas referência de complexidade estrutural. 

============================================================ 4. OUTRO BENCHMARK 

============================================================ 

Também testar código estruturalmente semelhante a: 

function onTimeout() { for (temp.i = 1000; temp.i < 1100; temp.i++) { hideimg(temp.i); showtext( temp.i, 0, 0, "", "", "" ); } 

this.detected = false; this.count = 0; for (temp.p : players) { if (temp.p != player) { if (checkSomething(temp.p)) { this.detected = true; this.count++; temp.p.alpha = 1; temp.p.zoom = 5; } } } if (this.detected) { Status.text = "DETECTED"; 

} else { Status.text = "SAFE"; for (temp.ni : npcs) { if ( temp.ni != nil && temp.ni.bugid != nil && temp.ni.ani != "" ) { temp.dx = temp.ni.x - player.x; temp.dy = temp.ni.y - player.y; temp.dist = (temp.dx^2 + temp.dy^2)^0.5; if (temp.dist < 120) { drawTarget( temp.ni, temp.dist ); } } } } setTimer(0.05); } 

============================================================ 5. PARSE ≠ EXECUTE 

============================================================ 

Separar testes: 

lexer parser AST semantic VM runtime builtin bridge panel E2E 

Um parser PASS não significa runtime PASS. 

============================================================ 

# 6. REGRESSION SUITE 

============================================================ 

Toda nova feature deve executar: 

unit tests parser tests runtime tests bridge tests panel tests build tests APK structural tests regression tests Se houver dispositivo: install startup E2E ============================================================ 7. GOLDEN TESTS ============================================================ 

Criar resultados esperados para scripts importantes. Guardar: source expected AST expected result expected events expected errors 

Não alterar o golden test apenas para fazer o novo código passar. 

Se a semântica realmente mudar: documentar atualizar conscientemente ============================================================ 8. REGRESSION GATE ============================================================ 

# Se: 

parser antes PASS feature nova → parser FAIL 

BUILD = FAIL. 

Se: 

runtime antes PASS feature nova → runtime FAIL 

BUILD = FAIL. 

Se: 

APK antes instala feature nova → APK rejeitado 

BUILD = FAIL. 

Não permitir regressão silenciosa. 

============================================================ 9. APK SNAPSHOT 

============================================================ 

Guardar metadata de um APK conhecido como funcional: 

package version manifest hash DEX inventory native inventory resources hash alignment SHA-256 certificate 

Usar como comparação. 

============================================================ 10. BEFORE/AFTER 

============================================================ 

Toda alteração importante deve produzir: 

BEFORE 

AFTER DIFF 

Comparar: 

Manifest DEX libs resources assets package launcher 

============================================================ 

# 11. FAIL-CLOSED 

============================================================ 

O build deve retornar exit code diferente de zero se: 

- testes falharem; 

- lint falhar; 

- parser falhar; 

- runtime falhar; 

- APK estiver vazio; 

- ZIP inválido; 

- Manifest inválido; 

- resources inválidos; 

- DEX inválido; 

- native library inválida; 

- alignment inválido; 

- assinatura inválida; 

- metadata inconsistentes; 

- regressão detectada. 

Não entregar APK conhecido como quebrado. 

============================================================ 12. PRINCÍPIO 

============================================================ 

Cada feature nova deve: 

ADICIONAR CAPACIDADE 

sem: 

DESTRUIR CAPACIDADE EXISTENTE. 

# # PARTE 6/6 — APK FINAL, ANDROID 13+, E ENTREGA 

============================================================ 

# 1. ANDROID 13+ 

============================================================ 

O APK final deve ser preparado para: 

Android 13+ API 33+ 

Verificar: 

minSdk targetSdk compileSdk Manifest permissions exported providers activities ABI native libraries resources signing 

Não interpretar: 

targetSdk >= 33 

como prova de compatibilidade completa. 

============================================================ 2. APK BUILD ORDER 

============================================================ 

A ordem oficial é: 

TESTS 

↓ EXTRACT ↓ MODIFY ↓ COMPILE ↓ REBUILD ↓ 

RESOURCES VALIDATION ↓ ZIPALIGN ↓ ALIGNMENT VERIFICATION ↓ SIGN ↓ SIGNATURE VERIFICATION ↓ FINAL APK VALIDATION ↓ INSTALLATION ↓ STARTUP ↓ E2E 

Nunca: 

SIGN ↓ MODIFY ============================================================ 3. ZIPALIGN 

============================================================ 

Como existem bibliotecas nativas, validar o alinhamento. 

Quando suportado: 

zipalign -c -P 16 -v 4 APK 

Também verificar alinhamento das próprias ELF quando aplicável. 

A documentação atual do Android possui orientação específica para suporte a dispositivos com páginas de 16 KiB. 

============================================================ 

4. RESOURCES.ARSC 

============================================================ 

Validar: 

resources.arsc 

Verificar: 

- existência; 

- integridade; 

- compressão; 

- alinhamento; 

- estrutura; 

- compatibilidade com Android alvo. 

============================================================ 

# 5. NATIVE LIBRARIES 

============================================================ 

Validar cada: 

lib/*/*.so 

Para: 

- ABI; 

- ELF; 

- machine; 

- LOAD segments; 

- alignment; 

- dependencies; 

- ZIP entry; 

- presença. 

Especialmente: 

libunity.so libil2cpp.so libservice.so 

============================================================ 6. DEX 

============================================================ 

Verificar: 

classes*.dex 

incluindo o DEX do STAR Labs. 

Validar: 

- estrutura; 

- classes; - references; 

- ausência de classes quebradas; 

- métodos; 

- native declarations. 

============================================================ 7. SIGNATURE 

============================================================ 

Depois de qualquer alteração: 

rebuild 

align sign verify 

Registrar: 

certificate SHA-256 

signature schemes 

============================================================ 

# 8. PACKAGE 

============================================================ 

Preservar: 

com.quattroplay.GraalClassic 

Preservar: 

com.unity3d.player.UnityPlayerActivity 

O STAR Labs NÃO deve se tornar o launcher. 

============================================================ 

# 9. INSTALLATION TEST 

============================================================ 

Se houver dispositivo: 

adb install APK 

Capturar erro exato se falhar. 

Se: 

INSTALL_FAILED_... 

identificar causa. 

Corrigir. 

Rebuild. 

Reinstalar. 

Repetir. 

# A mensagem: 

"O app não foi instalado" 

não é diagnóstico suficiente. 

============================================================ 10. STARTUP TEST 

============================================================ 

Depois da instalação: 

launch Graal ↓ Unity ↓ STAR Labs bootstrap ↓ Graal startup ↓ verify XCore absent 

Não deve aparecer: 

XCORE Editor GraalScript 2 key/login screen Chave inválida UI XCore 

============================================================ 11. STAR LABS TEST 

============================================================ 

Verificar: 

STAR Labs initialization runtime initialization 

editor executor script loader GS2 parser GS2 execution bridge panels errors logs ============================================================ 12. E2E SCRIPT 

============================================================ 

Executar um script GS2 real. 

Fluxo: 

source ↓ lexer ↓ parser ↓ AST ↓ runtime ↓ builtins ↓ bridge ↓ game/UI 

Registrar evidências. 

============================================================ 13. PANEL E2E 

============================================================ 

Um script deve conseguir: 

criar painel ↓ mostrar painel ↓ usuário interage ↓ 

evento ↓ callback ↓ alteração de estado 

Isso prova integração real. 

============================================================ 

# 14. REGRESSION AFTER E2E 

============================================================ 

Depois de validar uma feature no dispositivo: 

rodar novamente: 

npm test npm run lint npm run build-apk 

E verificar: 

package launcher native libs resources alignment signature 

Não aceitar uma feature que funciona manualmente mas quebra o pipeline automatizado. 

============================================================ 15. ARTIFACT CHECK 

============================================================ 

O APK final deve: 

existir > 0 bytes ZIP válido Manifest válido DEX válido resources válido native libraries válidas alignment válido assinatura válida SHA-256 correto 

# Se houver dispositivo: 

instalação PASS 

Sem dispositivo: 

instalação UNVERIFIED 

============================================================ 16. RELATÓRIO FINAL 

============================================================ 

Atualizar uma fonte única de verdade. 

Registrar: 

BASE APK BASE SHA FINAL APK FINAL SHA SIZE PACKAGE VERSION LAUNCHER CERTIFICATE ALIGNMENT RESOURCES DEX NATIVE LIBRARIES XCORE STATUS STAR LABS STATUS GS2 STATUS BRIDGE STATUS PANEL STATUS INSTALL STATUS DEVICE STATUS REGRESSION STATUS 

============================================================ 17. GIT SAFETY 

============================================================ 

# ANTES DE COMMIT: 

git status git diff 

Prestar atenção especial a: 

.build/ 

Não deixar arquivos importantes aparecerem como `D` por terem sido apagados pelo pipeline temporário. 

Separar: 

source evidence generated build distribution 

Se `.build` for gerado, não deve apagar acidentalmente arquivos-fonte versionados. 

============================================================ 18. GIT DELIVERY 

============================================================ 

Quando a etapa estiver realmente consistente: 

git add git commit git push 

Não adicionar: 

passwords tokens private keys credentials 

Registrar: 

branch commit push status 

============================================================ 19. DEFINIÇÃO DE "PRONTO" 

============================================================ 

PRONTO NÃO SIGNIFICA: 

APK foi gerado. 

PRONTO NÃO SIGNIFICA: 

assinatura passou. 

# PRONTO NÃO SIGNIFICA: 

parser aceitou um script artificial. 

# PRONTO NÃO SIGNIFICA: 

1301 linhas existiram. 

# PRONTO SIGNIFICA: 

Android aceita instalação + Graal abre + Graal continua funcionando + XCore não inicia + STAR Labs inicia + GS2 real é interpretado + runtime executa + bridge funciona + panel funciona + regressions são detectadas + novos recursos não quebram o sistema. 

============================================================ 

# 20. REGRA FINAL DE DESENVOLVIMENTO 

============================================================ 

A partir desta fase, toda mudança segue: 

OBSERVAR ↓ ENTENDER ↓ IMPLEMENTAR ↓ TESTAR ↓ 

REGRESSION TEST ↓ BUILD ↓ APK VALIDATION ↓ DEVICE TEST ↓ DOCUMENTAR Se falhar: 

STOP ↓ DIAGNOSE ↓ FIX ↓ RETEST 

Nunca mascarar falha. 

Nunca marcar PASS sem evidência. 

============================================================ 21. OBJETIVO FINAL ============================================================ Produzir: GRAALONLINE + STAR LABS + GS2 RUNTIME REAL + BRIDGE REAL + UI REAL + REGRESSION SAFETY = UM ÚNICO APK FUNCIONAL. 

O Graal é preservado. O XCore é removido. 

O STAR Labs assume sua própria arquitetura. 

A integração é rastreável. 

As modificações são mínimas e justificadas. 

O build é reproduzível. 

E cada nova feature deve passar pelo mesmo conjunto de gates antes de ser considerada integrada. 


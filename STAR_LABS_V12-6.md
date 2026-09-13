STAR LABS — ENGINEERING ARCHITECTURE BOOK DOCUMENTAÇÃO CANÔNICA DO PROJETO 

IMPORTANTE: 

Nesta tarefa NÃO implementar novas funcionalidades. 

NÃO redesenhar UI. NÃO alterar parser. NÃO alterar VM. NÃO alterar bootstrap. NÃO alterar build. NÃO alterar XCore gate. 

A tarefa é produzir uma documentação técnica COMPLETA e permanente: 

engineering-architecture.md 

Esse arquivo será o LIVRO DE BORDO TÉCNICO do STAR Labs. 

Um novo agente, em outro repositório/ambiente, deve conseguir ler SOMENTE esse arquivo e entender: 

- o que é o projeto; 

- onde estamos; 

- o que já foi descoberto; 

- como o APK é construído; 

- como o Graal funciona dentro do pacote; 

- como o XCore foi localizado; 

- como o XCore foi removido; 

- como o STAR Labs entra na Unity; 

- o que já funciona; 

- o que é apenas POC; 

- o que é placeholder; 

- quais arquiteturas foram abandonadas; 

- quais erros já aconteceram; 

- quais regras são inegociáveis; 

- como o runtime deve evoluir; 

- como o Executor deve funcionar; 

- como o GS2 deve ser implementado; 

- como usar documentação + APK + DEX + IL2CPP; 

- como o projeto deve continuar. 

NÃO escrever um changelog superficial. 

NÃO resumir demais. 

Documentar conhecimento, decisões, invariantes, dependências, evidências e estratégias. 

============================================================ 1. MISSÃO DO STAR LABS 

============================================================ 

Descrever claramente: 

STAR Labs é um sistema próprio de desenvolvimento/execution de Graal Script 2 (GS2), integrado ao cliente Graal dentro do mesmo APK/processo. 

Arquitetura conceitual final: 

Graal/Unity ↓ STAR Labs Bootstrap ↓ STAR Labs UI 

↓ STAR Labs Executor ↓ GS2 Language Service ↓ GS2 Parser 

↓ Semantic Layer ↓ GS2 Runtime / VM 

↓ GS2 Function Registry ↓ STAR Labs Client Bridge ↓ Graal/Unity/native 

O STAR Labs não é: 

- launcher separado; 

- aplicação separada; 

- XCore rebrand; 

- wrapper de um executor externo; 

- mini-DSL. 

============================================================ 

# 2. ESTADO REAL ATUAL 

============================================================ 

Registrar o estado REAL, sem marketing. 

Atualmente: 

GRAAL: 

✅ inicia 

✅ continua funcionando 

# XCORE: 

- ✅ caminho de startup removido 

- ✅ ausência confirmada em device 

- ✅ regression gate criada 

# STAR LABS: 

- ✅ bootstrap próprio existe 

- ✅ Executor aparece no APK 

- ✅ WebView própria existe 

- ⚠ UI ainda possui problemas de duplicação 

- ⚠ navegação ainda não possui arquitetura correta 

- ⚠ engine Android ainda não possui cobertura GS2 real 

- ⚠ integração UI → runtime ainda é incompleta 

- ⚠ catálogo GS2 ainda não está conectado 

- ⚠ syntax highlighting ainda incompleto 

- ⚠ autocomplete ainda incompleto 

- ⚠ client bridge ainda não representa APIs amplas do Graal 

NÃO escrever “Executor funcional completo”. 

NÃO escrever “GS2 completo”. 

============================================================ 

3. REGRA ABSOLUTA — XCORE 

============================================================ 

A remoção do XCore é uma INVARIANTE do projeto. 

Registrar: 

O XCore já foi removido do caminho de startup por meio da remoção do call site: 

UnityPlayerActivity 

→ ModMenu.StartMenu(Context) 

O teste físico confirmou: 

Graal funciona 

XCore não aparece. 

A partir disso: 

NUNCA reintroduzir: 

- ModMenu.StartMenu 

- ModMenu como bootstrap 

- xCoreScripts 

- menu.holy 

- bridge XCore 

- WebMessageChannel do XCore 

- libservice.so como runtime do STAR Labs 

- launcher XCore 

- startup XCore 

Toda nova build deve executar a XCore regression gate. 

Se a gate falhar: BUILD FAIL. 

============================================================ 

# 4. DESCOBERTA FORENSE DO XCORE 

============================================================ 

Documentar detalhadamente as descobertas já obtidas. 

Componentes encontrados: 

- com.player.render.ModMenu 

- System.loadLibrary("service") 

- libservice.so 

- xCoreScripts 

- WebView 

- WebMessageChannel 

- métodos nativos xA...xQ 

- menu.holy 

- endpoints observados 

- JNI 

- dlopen 

- dlsym 

Cadeia de execução comprovada: 

UnityPlayerActivity.onCreate() 

↓ ModMenu.StartMenu(Context) 

↓ ModMenu bootstrap ↓ WebView 

↓ 

XCore UI 

Esse conhecimento deve ficar registrado para impedir que um futuro agente repita toda a investigação. 

============================================================ 

5. EVIDÊNCIA HISTÓRICA 

============================================================ 

Registrar que existem materiais históricos de engenharia sobre versões/binaries antigos. 

Esses materiais podem conter: 

- script loader; 

- script objects; 

- function lookup; 

- Graal hash; 

- execution; 

- event dispatch; 

- global context; 

- value resolution; 

- manager; 

- script registration; 

- bridges. 

# REGRA: 

Offsets históricos são somente hipóteses. 

Nunca usar um offset antigo diretamente no APK atual sem validação. 

O build atual deve ser investigado por: 

- DEX; 

- JADX; 

- smali; 

- Ghidra; 

- IDA/Binary Ninja; 

- readelf; 

- nm; - objdump; 

- strings; - JNI; - metadata; - IL2CPP; - runtime instrumentation quando disponível. 

============================================================ 

# 6. APK / FORENSICS 

============================================================ 

Registrar os componentes importantes conhecidos: 

- classes.dex; 

- classes2.dex; 

- classes3.dex; 

- classes4.dex; 

- global-metadata.dat; 

- libil2cpp.so; 

- libunity.so; 

- libservice.so; 

- StreamingAssets; 

- Manifest; 

- resources; 

- assets; 

- APK tooling. 

Registrar por que cada artefato é importante. 

============================================================ 7. BUILD PIPELINE 

============================================================ 

Official build: 

npm run build-apk 

Documentar pipeline: 

- source preparation; 

- Apktool; 

- smali patching; 

- Java compilation; 

- D8; 

- asset packaging; 

- APK reconstruction; 

- zipalign; 

- signing; 

- badging; 

- ELF checks; 

- regression gates. 

# Validations obrigatórias: 

- APK exists; 

- size > 0; 

- ZIP valid; 

- resources.arsc valid; 

- Manifest valid; 

- package correct; 

- launcher correct; 

- native libraries preserved; 

- zipalign; 

- apksigner; 

- XCore gate; 

- runtime tests. 

============================================================ 

# 8. STAR LABS BOOTSTRAP 

============================================================ 

Documentar: 

StarLabsBootstrap.java 

O bootstrap deve: 

- iniciar uma única instância; 

- detectar a Unity Activity; 

- adicionar a UI à hierarquia correta; 

- destruir a UI corretamente; 

- não fechar a Unity; 

- não iniciar XCore; 

- não duplicar WebViews. 

# ATUAL PROBLEMA OBSERVADO NO DEVICE: 

O último build apresentou DOIS EXECUTORES na mesma WebView. 

Isso é uma falha arquitetural. 

Registrar como BUG: 

DOUBLE-BOOT / DOUBLE-RENDER 

Possíveis causas a investigar: 

- bootstrap chamado duas vezes; 

- Activity lifecycle duplicado; 

- UI montada novamente sem cleanup; 

- HTML carregado duas vezes; 

- state inicializado duas vezes; 

- múltiplos containers; 

- reentrada após Activity recreation. 

NÃO resolver agora. Somente documentar. 

Critério futuro: 

EXATAMENTE UMA instância do STAR Labs Executor por Activity. 

============================================================ 9. WEBVIEW 

============================================================ 

Descrever a arquitetura: 

Unity Activity ↓ STAR Labs container ↓ STAR Labs WebView ↓ STAR Labs UI 

A WebView do STAR Labs é própria. 

Nunca usar: 

- XCore WebView; 

- menu.holy; 

- XCore bridge. 

============================================================ 

# 10. NAVEGAÇÃO 

============================================================ 

O Executor NÃO deve ser uma única página monolítica. 

Arquitetura desejada: 

STAR Labs ├── Dashboard ├── Executor ├── Scripts ├── Functions ├── Console ├── Runtime └── Settings 

IMPORTANTE: 

Dashboard / Functions / Settings NÃO devem ser pequenas caixas ou overlays improvisados sobre o Executor. 

Cada área deve possuir: 

- espaço dedicado; 

- estado próprio; 

- layout próprio; 

- navegação; 

- título; 

- conteúdo completo; 

- botão/rota de retorno quando apropriado. 

No mobile: 

navegação drawer/sidebar. 

No tablet: 

sidebar recolhível. 

No desktop: 

sidebar completa e recolhível. 

============================================================ 11. EXECUTOR — DESIGN CANÔNICO 

============================================================ 

Header: 

🔴 🟡 🟢  STAR Labs Executor 

Abaixo: 

abas de documentos 

[ main.gs2 × ] [ player.gs2 × ] [ ui.gs2 × ] [ + ] 

Abaixo das tabs: 

toolbar. 

A área do editor deve ser a parte DOMINANTE da tela. 

============================================================ 12. TOOLBAR 

============================================================ 

NÃO usar textos grandes como: 

Run Stop Save Copy Format Search Delete 

A toolbar deve usar ícones profissionais. 

Funções: 

- Run 

- Stop 

- Save 

- Copy 

- Format 

- Search 

- Delete 

- Undo 

- Redo 

- Go to line 

- Comment/Uncomment quando aplicável 

Tooltips podem mostrar os nomes. 

# Estados: 

- enabled; 

- disabled; 

- hover; 

- active; 

- loading; 

- error. 

============================================================ 

13. TABS 

============================================================ 

Cada arquivo aberto é uma aba real. 

Exemplo: 

[ main.gs2 × ] [ player.gs2 × ] [ ui.gs2 × ] [ test.gs2 × ] 

[ + ] 

Cada documento possui: 

- source; 

- dirty state; 

- version; 

- cursor; 

- scroll; 

- diagnostics. 

Se fechar documento alterado: confirmar. 

Não duplicar aba do mesmo arquivo desnecessariamente. 

============================================================ 14. EDITOR 

============================================================ 

O editor deve ser IDE-grade. 

Recursos alvo: 

- line numbers; 

- column; 

- syntax highlighting; 

- autocomplete; 

- signature help; 

- diagnostics; 

- search; 

- replace; 

- format; 

- indentation; 

- bracket matching; 

- go-to-line; 

- outline; 

- symbols; 

- undo/redo; 

- clipboard; 

- large documents; 

- multi-file. 

O editor precisa lidar com código GS2 complexo. 

Não limitar arbitrariamente por número de linhas. 

============================================================ 

# 15. SCRIPT LOGS 

============================================================ 

A barra correta é: 

< Script Logs 

O chevron vem IMEDIATAMENTE antes de “Script Logs”. 

NÃO: 

Script Logs > 

Painel aberto: 

Console | Output | Problems | Runtime | Call Stack 

Essas são TABS REAIS. 

============================================================ 16. CONSOLE 

============================================================ 

Aparência de terminal profissional. 

- monoespaçado; - compacto; - timestamps discretos; 

- info; 

- warn; 

- error; 

- scroll; - clear; 

- auto-scroll. 

Não usar cards enormes para cada linha. 

============================================================ 17. STATUS BAR 

============================================================ 

Pequena e discreta. 

Esquerda: 

Ln X, Col Y 

Direita: 

GS2 Functions: N 

Fonte menor. 

Cor secundária. 

N deve ser real. 

Nunca hardcode 2040. 

============================================================ 

18. THEME 

============================================================ 

O tema externo do Executor deve ser azul/cinza escuro, inspirado na linguagem visual de IDEs modernas. 

Não copiar VS Code. 

Criar identidade própria STAR Labs. 

Separar: 

- app chrome; 

- editor; 

- panels; 

- status; 

- terminal. 

O editor pode ter uma superfície distinta do restante da UI. 

============================================================ 

19. RESPONSIVE / RESIZABLE 

============================================================ 

O usuário precisa conseguir redimensionar: 

- editor; 

- sidebar; 

- Script Logs; 

- painéis inferiores; 

- janela/área do Executor. 

Mobile: 

- drag; 

- expand editor; 

- collapse panels; 

- navigation drawer. 

Tablet: 

- touch resize. 

Desktop: 

- mouse drag. 

============================================================ 20. WINDOW CONTROLS 

============================================================ 

Executor deve possuir: 

Minimize Restore Close 

Minimize: reduzir sem destruir estado. 

Restore: retornar. 

Close: remover somente STAR Labs. 

NÃO fechar Graal. 

============================================================ 21. SETTINGS 

============================================================ 

Settings deve ser uma área dedicada. 

Categorias: 

Editor Runtime Appearance Behavior 

Exemplos: 

Editor: 

- font size 

- tab size 

- word wrap 

- minimap 

- line numbers 

Runtime: 

- execution budget 

- logging level 

- diagnostics 

Behavior: 

- autosave 

- restore tabs 

- confirm close 

Appearance: 

- theme 

- density 

Persistir configurações reais. 

============================================================ 22. FUNCTIONS 

============================================================ 

Área dedicada para referência das APIs. 

Buscar: 

- name; 

- category; 

- context; 

- status. 

Mostrar: 

- signature; - parameters; 

- return; 

- documentation; - evidence; - availability. 

Fonte única: 

GS2FunctionRegistry. 

============================================================ 23. SCRIPTS ============================================================ 

Área dedicada. 

# Permitir: 

- list; - create; 

- open; 

- rename; 

- delete; 

- search; 

- filter. 

Abrir arquivo no Executor. 

============================================================ 24. DASHBOARD 

============================================================ Mostrar apenas métricas reais: 

- Runtime status; 

- open documents; - validated functions; - diagnostics; - last execution; 

- engine version. 

Não fake. 

- ============================================================ 25. GS2 — DEFINIÇÃO 

============================================================ 

GS2 = Graal Script 2 / New Engine GScript. 

# Não é: 

- JavaScript; - mini-DSL; - pseudo-GScript. ============================================================ 26. GS2 ENGINE 

============================================================ 

Arquitetura: 

Source ↓ Lexer ↓ Parser ↓ AST ↓ Semantic Analysis ↓ IR/Bytecode ↓ VM ↓ Function Registry ↓ Client Bridge ↓ Graal ============================================================ 

# 27. EXEMPLO DE COMPLEXIDADE 

============================================================ 

Registrar como benchmark estrutural um script contendo construções como: 

//#CLIENTSIDE 

function onCreated() { this.value = 10; temp.list = { a: 1, b: 2 }; for (temp.item : players) { if (temp.item != player) { temp.distance = ((temp.item.x - player.x)^2 + (temp.item.y - player.y)^2)^0.5; } } } 

public function calculate(a, b) { return a + b; } 

O exemplo é usado para medir a capacidade do parser/semantic/runtime. 

Não é necessário marcar toda construção como executável antes da implementação correspondente existir. 

============================================================ 28. GS2 LANGUAGE INVENTORY 

============================================================ 

Registrar e manter: 

- directives; 

- keywords; 

- literals; 

- comments; 

- operators; 

- expressions; 

- assignments; 

- functions; 

- public functions; 

- events; 

- scopes; 

- this; 

- temp; 

- params; 

- global; 

- nil; 

- arrays; 

- objects; 

- member access; 

- indexing; 

- callbacks; 

- object construction; 

- nested GUI; 

- client/server; 

- built-ins; 

- events; 

- timers. 

Cada item: 

DOCUMENTED OBSERVED 

# REVERSED INFERRED UNKNOWN 

============================================================ 

# 29. PARSER 

============================================================ 

O parser atual é insuficiente. 

NÃO continuar expandindo uma mini-DSL com regex. 

A linguagem precisa de um parser estrutural. 

Lexer → Parser → AST. 

A AST deve preservar: 

- line; 

- column; 

- span; 

- context; 

- declarations; 

- operators; 

- properties; 

- calls; 

- objects; 

- events. 

============================================================ 

# 30. SEMANTIC ENGINE 

============================================================ 

Separar parsing de semântica. 

Resolver: 

- local; 

- parameter; 

- script variable; 

- global; 

- temp; 

- this; 

- function; 

- built-in; 

- member; 

- event; 

- client/server. 

Não diagnosticar somente por ausência do registry. 

============================================================ 

# 31. RUNTIME / VM 

============================================================ 

O runtime precisa representar: 

- script context; 

- object context; 

- function frame; 

- call stack; 

- global state; 

- script state; 

- local scope; 

- temp scope; 

- params; 

- return values; 

- events; 

- callbacks; 

- scheduler; 

- cancellation; 

- diagnostics. 

Não usar um único JavaScript object global como substituto de todos os conceitos. 

============================================================ 32. FUNCTION REGISTRY 

============================================================ 

Registry é fonte única de verdade. 

Metadata: 

- name; 

- category; 

- signature; 

- parameters; 

- return; 

- context; 

- build; 

- version; 

- aliases; 

- documentation; - evidence; - implementation; - bridge; 

- status. 

Statuses: 

METADATA_ONLY STUB PARTIAL IMPLEMENTED VALIDATED 

Somente VALIDATED conta em: 

GS2 Functions: N 

============================================================ 

# 33. 2040 FUNCTIONS 

============================================================ 

“~2040 functions” é referência/meta, não valor hardcoded. 

Investigar: 

- documentação; 

- cliente; 

- referências; 

- function list; 

- build atual. 

Objetivo arquitetural: 

permitir crescimento para: 

100 500 1000 1500 2000+ 

sem alterar a VM central. 

============================================================ 34. CLIENT BRIDGE 

============================================================ 

Arquitetura: 

GS2 Runtime 

↓ 

STAR Labs ClientBridge 

↓ Adapter 

↓ Graal/Unity/native 

Nunca: 

GS2 Runtime 

↓ 

XCore 

============================================================ 

35. ANDROID RUNTIME 

============================================================ 

O projeto já possuiu um POC Java: 

StarLabsRuntimeHost 

que demonstrou: 

function add(a,b) { return a+b; } echo(add(10,20)); 

→ 30.0 

Isso deve ser documentado como: 

ANDROID POC 

e NÃO como: 

GS2 engine completo. 

O POC aceita somente um subconjunto mínimo. 

Não transformar esse parser Java em uma coleção infinita de regexes. 

Objetivo: 

ter uma arquitetura de runtime comum/compartilhada ou uma especificação de AST/IR comum entre Node e Android. 

============================================================ 36. NODE VS ANDROID 

============================================================ 

Atual: 

Node: Lexer → Parser → AST → Semantic → VM 

Android POC: 

Java host → parser simples → evaluator 

Problema arquitetural: 

duas semânticas diferentes. 

Objetivo futuro: 

GS2 Core comum 

↓ Node adapter ↓ Android adapter 

ou outra arquitetura tecnicamente justificada. 

Criar testes de equivalência. 

============================================================ 37. EXECUTOR → ENGINE 

============================================================ 

Fluxo esperado: 

Editor 

↓ LanguageService ↓ Parser 

↓ Semantic 

↓ Runtime ↓ ClientBridge 

↓ Graal 

NÃO: 

Editor 

↓ 

fake Java parser ↓ resultado fake ============================================================ 38. RUN ============================================================ 

Run deve: 

|- obter source;|
|---|
|- analisar;|
|- interromper em diagnostics fatais;|
|- executar runtime;|
|- retornar output;|
|- atualizar Console;|
|- atualizar Runtime;|
|- atualizar Call Stack;<br>- atualizar Problems.|
|Não apenas escrever “Execution completed”.|
|============================================================<br>39. STOP<br>============================================================|
|Stop deve controlar a execução real.|



Não apenas adicionar uma mensagem ao console. 

============================================================ 40. SAVE ============================================================ Save: UI ↓ ScriptRepository ↓ persistent storage Não apenas trocar o dirty indicator. ============================================================ 41. AUTOCOMPLETE ============================================================ 

UI: 

typing ↓ LanguageService ↓ Registry ↓ suggestions 

Não hardcode no HTML. 

============================================================ 42. SYNTAX HIGHLIGHTING 

============================================================ 

Derivado do lexer/parser real. 

Categorias: 

- keyword; 

- function; 

- identifier; 

- string; 

- number; 

- comment; 

- operator; 

- built-in; - diagnostic. 

============================================================ 

# 43. COMPLEXITY / LARGE FILES 

============================================================ 

Não impor limite artificial. 

Testar: 

500 1000 5000 10000+ 

quando razoável. 

Múltiplos arquivos. 

Código estruturalmente complexo. 

Medir: 

- parse; 

- diagnostics; 

- autocomplete; 

- memory; 

- typing; 

- execution. 

Se houver limite real: 

documentar. 

============================================================ 

# 44. SOURCE-DRIVEN ENGINEERING 

============================================================ 

Para qualquer construção GS2: 

DOCUMENTAÇÃO → CLIENT → EVIDÊNCIA → IMPLEMENTAÇÃO → TESTE → STATUS 

Nunca: 

ASSUMPTION → CODE → CLAIM COMPLETE 

============================================================ 

# 45. SOURCES 

============================================================ 

Registrar no documento: 

https://www.graalonline.net/index.php/Creation/Dev/GScript https://graalonline.net/index.php?title=Creation/Dev/GScript/GScript_for_Dummies https://graalonline.net/Creation/Dev/Script/Clientside_Functions https://graalonline.net/index.php/Creation/Dev/Script/Client https://graalonline.net/index.php/Creation/Dev/Script/Starting_Guide https://graalonline.net/Category:Scripting_Reference https://www.graalonline.net/Creation/Dev/GS1_To_GS2 https://graalonline.net/Creation/Dev/Script/Helpful_Posts https://forums.graalonline.com/forums/forumdisplay.php?f=8 

https://pt.scribd.com/document/55585384/npcprogramming 

Também registrar: 

- documentos internos fornecidos; 

- materiais históricos; 

- vídeos fornecidos; 

- evidências obtidas do APK. 

============================================================ 

# 46. EVIDENCE CLASSIFICATION 

============================================================ 

Cada descoberta deve ser marcada: 

DOCUMENTED 

OBSERVED REVERSED INFERRED UNKNOWN 

Explicar no arquivo como interpretar cada classificação. 

============================================================ 47. O QUE JÁ FALHOU 

============================================================ 

Documentar abordagens descartadas. 

# Exemplos: 

- launcher customizado; 

- provider como solução de startup; 

- lifecycle noop; 

- desligar bootstrap para esconder XCore; 

- considerar executor visual como engine; 

- host Java mínimo como solução final; 

- parser legado de linhas; 

- catálogo fictício; 

- número 2040 hardcoded. 

# Para cada uma: 

- o que foi feito; 

- por que parecia razoável; 

- por que falhou; 

- o que aprendemos; 

- qual arquitetura substituiu. 

Objetivo: evitar repetir erros. 

============================================================ 48. BUG ATUAL DA UI 

============================================================ 

Registrar exatamente: 

O APK atual apresentou DOIS EXECUTORES na mesma WebView. 

Primeiro Executor contém: 

- navigation; 

- tabs; 

- toolbar; 

- editor; 

- status; 

- Script Logs; 

- console. 

Segundo Executor aparece novamente abaixo. 

Isso NÃO deve ser tratado como “detalhe visual”. 

É bug de lifecycle/render/bootstrap. 

Futuro critério: 

UMA ÚNICA INSTÂNCIA. 

============================================================ 49. BUG ATUAL DE NAVEGAÇÃO 

============================================================ 

Dashboard / Functions / Settings atualmente não estão funcionando como páginas dedicadas. 

Eles aparecem como partes da interface sobre o Executor. 

Arquitetura final desejada: 

NAVIGATION 

↓ ROUTE ↓ FULL VIEW 

↓ DEDICATED CONTENT 

Não: 

button 

↓ small overlay ↓ same editor remains underneath. 

============================================================ 50. BUG ATUAL DE TOOLBAR 

============================================================ 

A toolbar atual ainda mostra: 

Run 

Stop Save Copy Format Search Delete 

como texto. 

Isso não atende à especificação final. 

Objetivo: 

toolbar profissional baseada em ícones. 

============================================================ 51. BUG ATUAL DE TEMA 

============================================================ 

Tema atual ainda não atende à especificação. 

Objetivo: 

outer UI: dark blue / dark gray inspired by professional developer tools. 

editor: 

separate dark surface. 

status: small/subtle. 

============================================================ 

# 52. BUG ATUAL DE SCRIPT LOGS 

============================================================ 

Atual: 

Script Logs > 

Problema: 

chevron está no lado errado. 

Desejado: 

< Script Logs 

Depois: 

Console | Output | Problems | Runtime | Call Stack 

Como TABS reais. 

============================================================ 53. BUG ATUAL DO STATUS 

============================================================ 

Atual: 

Ln 1, Col 1 GS2 Functions: 0 

Visual ainda grande demais. 

Objetivo: 

menor; mais discreto; cor secundária. 

Mais importante: 

GS2 Functions precisa ser dado REAL. 

============================================================ 54. ENGINEERING JOURNAL 

============================================================ 

Além da arquitetura, registrar: 

# ## Checkpoint History 

Cada checkpoint deve incluir: 

- date/time; 

- phase; 

- changed files; 

- reason; 

- tests; 

- build; 

- APK SHA; 

- device result; 

- discovered bugs; 

- lessons learned. 

============================================================ 

# 55. FUTURO BACKEND 

============================================================ 

Backend futuro: 

Render. 

Função: 

- authentication; 

- account; 

- synchronization; 

- script catalog; 

- metadata; 

- marketplace; 

- versions; 

- community. 

Não fazer backend obrigatório para execução local. 

============================================================ 56. FUTURO MARKETPLACE 

============================================================ 

Arquitetura preparada para: 

- scripts free; 

- scripts paid; 

- authors; 

- versions; 

- categories; 

- ratings; 

- ownership; 

- downloads; 

- updates. 

Não implementar pagamentos agora. 

============================================================ 57. FUTURO PRODUTO 

============================================================ 

Visão: 

STAR Labs ↓ Dashboard ↓ Executor ↓ Functions ↓ Scripts ↓ Runtime 

↓ Settings ↓ Backend 

↓ Marketplace 

============================================================ 

# 58. SEGURANÇA DE ARQUITETURA 

============================================================ 

Não permitir que: 

- UI conheça detalhes do runtime; 

- parser conheça Android; 

- runtime conheça HTML; 

- Android bridge conheça XCore; 

- registry seja duplicado; 

- WebView mantenha lógica GS2; 

- dois runtimes divergentes sejam usados silenciosamente. 

============================================================ 

# 59. REGRESSION GATES 

============================================================ 

# XCORE: 

- startup path absent; 

- ModMenu.StartMenu absent; 

- XCore bootstrap absent. 

GRAAL: 

- Unity launcher; 

- Unity initialization; 

- native libs; 

- assets; 

- resources. 

STAR LABS: 

- bootstrap; 

- one instance; 

- UI; 

- runtime; 

- registry; 

- repository; 

- language service; 

- bridge. 

# APK: 

- size > 0; 

- valid ZIP; 

- resources; 

- Manifest; 

- zipalign; 

- signature. 

============================================================ 

# 60. CRITÉRIOS DE VERDADE 

============================================================ 

“Parsed” NÃO significa “executed”. 

“Metadata” NÃO significa “implemented”. 

“Implemented” NÃO significa “validated on client”. 

“Node test passed” NÃO significa “Android works”. 

“APK contains class” NÃO significa “feature works”. 

“UI exists” NÃO significa “feature works”. 

“2040 entries” NÃO significa “2040 functions supported”. 

Documentar sempre a diferença. 

============================================================ 

# 61. CHECKPOINTS FUTUROS 

============================================================ 

# Planejar: 

# CHECKPOINT A 

XCore regression + bootstrap one-instance. 

# CHECKPOINT B 

Real Android ↔ Engine bridge. 

CHECKPOINT C 

Common GS2 core / AST / IR. 

CHECKPOINT D Real GS2 parser. 

CHECKPOINT E Semantic engine. 

CHECKPOINT F Runtime/VM. 

CHECKPOINT G 

Function registry expansion. 

CHECKPOINT H Client bridge. 

CHECKPOINT I Executor IDE. 

CHECKPOINT J Device E2E. 

CHECKPOINT K Performance. 

CHECKPOINT L Backend. 

============================================================ 

# 62. REGRA DE IMPLEMENTAÇÃO 

============================================================ 

Não fazer grandes patches sem checkpoint. 

Não criar cinco sistemas concorrentes. 

Não colocar implementação provisória em arquivos que serão tratados como definitivos sem marcar isso. 

Usar: 

POC 

→ benchmark → validation → production implementation 

============================================================ 

# 63. TRANSFERÊNCIA DE CONHECIMENTO 

============================================================ 

O arquivo deve poder ser entregue a: 

- outro Copilot; 

- outro agente; 

- outro desenvolvedor; 

- outro repositório. 

A pessoa deve conseguir compreender o sistema sem acessar esta conversa. 

============================================================ 

# 64. ÚLTIMA SEÇÃO OBRIGATÓRIA 

============================================================ 

NO FINAL DO engineering-architecture.md deve existir: 

# # CURRENT REQUIREMENTS — CANONICAL 

Esta seção deve conter as exigências atuais do projeto, em linguagem objetiva e inequívoca. 

Incluir: 

1. XCore permanece permanentemente fora da arquitetura. 

2. Graal precisa continuar funcionando. 

3. STAR Labs precisa iniciar dentro da mesma Unity Activity/processo. 

4. Deve existir exatamente UMA instância do Executor por Activity. 

5. Executor deve possuir UI profissional. 

6. Header: 

- 🔴 🟡 🟢 STAR Labs Executor 

7. Tabs reais de arquivos. 

8. Toolbar profissional com ÍCONES. 

9. Editor largo. 

10. Syntax highlighting GS2. 

11. Autocomplete. 

12. Diagnostics. 

13. Function signatures. 

14. Search/replace. 

15. Format. 

16. Save. 

17. Copy. 

18. Delete. 

19. Run. 

20. Stop. 

21. Minimize. 

22. Restore. 

23. Close. 

24. Script Logs com: 

< Script Logs 

25. Console/Output/Problems/Runtime/Call Stack como TABS REAIS. 

26. Console com aparência de terminal profissional. 

27. Status bar pequena e discreta. 

28. Ln/Col reais. 

29. GS2 Functions baseado no registry real. 

30. Dashboard dedicado. 

31. Scripts dedicado. 

32. Functions dedicado. 

33. Settings dedicado. 

34. Navegação real entre áreas. 

35. Sidebar/drawer responsivo. 

36. Resize real de painéis. 

37. Mobile/tablet/desktop. 

38. Multi-file. 

39. ScriptRepository real. 

40. LanguageService real. 

41. GS2FunctionRegistry real. 

42. Runtime real. 

43. ClientBridge real. 

44. Android integration real. 

45. Backend futuro no Render. 

46. Runtime local NÃO depende do backend. 

47. Não hardcodar 2040. 

48. Não usar mini-DSL como GS2. 

49. Não criar parser Java separado como solução definitiva. 

50. Documentação GS2 é fonte. 

51. APK/DEX/IL2CPP/metadata são fontes. 

52. Engenharia histórica é evidência, não contrato. 

53. Toda capacidade precisa de teste. 

54. Toda feature precisa funcionar de verdade. 

55. Não considerar UI como implementação. 

56. Não considerar Node harness como prova de Android. 

57. Não considerar POC como runtime final. 

58. Atualizar este arquivo ao final de cada grande checkpoint. 

59. Registrar bugs e abordagens fracassadas. 

60. Nunca reintroduzir XCore. 

Essa seção deve ser a parte mais importante para um agente futuro. 

============================================================ 65. FINALIZAÇÃO DESTA TAREFA 

============================================================ 

Nesta tarefa: 

NÃO alterar código. 

NÃO gerar APK. 

NÃO modificar runtime. 

NÃO modificar UI. 

Somente: 

1. ler o projeto; 

2. consolidar todo conhecimento; 

3. escrever/reorganizar `engineering-architecture.md`; 

4. verificar se não faltou nenhum conhecimento relevante; 

5. registrar o estado atual real; 

6. registrar os bugs atuais; 

7. registrar as exigências atuais; 

8. salvar o arquivo. 

Ao terminar, informe apenas: 

- arquivo criado/atualizado; 

- número aproximado de seções; 

- principais áreas cobertas; 

- confirmação de que nenhuma implementação foi alterada. 


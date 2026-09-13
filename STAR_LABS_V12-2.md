STAR LABS V12.2 

FASE: REAL EXECUTION PLATFORM + ADVANCED IDE NAVIGATION 

# CONTINUAÇÃO DIRETA DO V12/V12.1. 

============================================================ ESTADO PROTEGIDO 

============================================================ 

# CONFIRMADO NO DEVICE: 

- ✅ Graal inicia. 

- ✅ XCore foi removido do startup. 

- ✅ XCore permanece ausente. 

- ✅ STAR Labs Executor aparece dentro da Unity Activity. 

- ✅ Bootstrap próprio funciona. 

- ✅ APK é produzido e validado. 

- ✅ Gate XCore existe e deve permanecer obrigatória. 

# NÃO REINTRODUZIR: 

- ModMenu.StartMenu 

- xCoreScripts 

- menu.holy 

- bridge XCore 

- bootstrap XCore 

- launcher XCore 

O XCore está FORA da arquitetura do STAR Labs. 

- ============================================================ 1. OBJETIVO AGORA 

============================================================ 

O V12 provou que: 

Unity 

↓ STAR Labs Bootstrap ↓ Executor UI 

funciona. 

Agora precisamos provar: 

Unity ↓ STAR Labs Bootstrap 

↓ Executor ↓ Editor ↓ Language Service ↓ GS2 Runtime ↓ Client Bridge ↓ Graal 

funciona DE VERDADE. 

Não manter um frontend estático. 

============================================================ 

2. MOTOR — PRIORIDADE ABSOLUTA 

============================================================ 

O runtime atual ainda é insuficiente para GS2 real. 

NÃO continuar expandindo a mini-DSL legada. 

NÃO adicionar dezenas de keywords arbitrariamente ao `runtime.js`. 

NÃO usar o runtime legado baseado em: 

let set call return hook panel 

como fundamento de compatibilidade GS2. 

O objetivo é um runtime próprio de Graal Script 2 / New Engine GScript. 

============================================================ 3. “QUALQUER CÓDIGO” — DEFINIÇÃO TÉCNICA 

============================================================ 

O objetivo do STAR Labs é NÃO possuir um limite artificial de: 

- tamanho do arquivo; 

- número de linhas; 

- número de funções; 

- profundidade estrutural; 

- número de scripts; 

- complexidade das expressões; 

- tamanho das estruturas de dados; 

desde que o código esteja dentro da semântica GS2 suportada pelo build-alvo e dos recursos reais do dispositivo. 

NÃO criar um limite arbitrário como: 

1000 linhas 5000 tokens 50 funções 

apenas porque é conveniente. 

Quando existir uma limitação real: 

documentar: 

LIMITATION REASON SCOPE TEST 

Não fingir compatibilidade. 

============================================================ 

4. COMPLEX SCRIPT SUPPORT 

============================================================ 

Construir testes reais com scripts complexos. 

O corpus deve incluir: 

- centenas/milhares de linhas; 

- dezenas/centenas de funções; 

- múltiplos escopos; 

- arrays grandes; 

- objetos aninhados; 

- expressões complexas; 

- loops; 

- callbacks; 

- eventos; 

- múltiplos parâmetros; 

- funções recursivas quando aplicável; 

- múltiplos arquivos; 

- chamadas entre scripts; 

- comentários; 

- strings grandes; 

- código fortemente estruturado. 

Não gerar milhares de linhas repetitivas artificialmente. 

Os fixtures devem representar programas plausíveis de GS2. 

============================================================ 

# 5. ANÁLISE DAS FONTES GS2 

============================================================ 

Use como material de engenharia: 

https://www.graalonline.net/index.php/Creation/Dev/GScript 

https://graalonline.net/index.php?title=Creation/Dev/GScript/GScript_for_Dummies https://graalonline.net/Creation/Dev/Script/Clientside_Functions https://graalonline.net/index.php/Creation/Dev/Script/Client https://graalonline.net/index.php/Creation/Dev/Script/Starting_Guide https://graalonline.net/Category:Scripting_Reference https://www.graalonline.net/Creation/Dev/GS1_To_GS2 https://graalonline.net/Creation/Dev/Script/Helpful_Posts https://forums.graalonline.com/forums/forumdisplay.php?f=8 https://pt.scribd.com/document/55585384/npcprogramming 

# Também utilizar: 

- documentos já fornecidos; 

- materiais de engenharia já existentes; 

- vídeos anteriormente fornecidos, quando disponíveis. 

============================================================ 

# 6. USE O PRÓPRIO CLIENTE COMO FONTE 

============================================================ 

Além da documentação, o projeto já possui: 

- APK; 

- DEX; 

- classes; 

- libil2cpp.so; 

- libunity.so; 

- metadata; 

- assets; 

- arquivos do cliente; 

- materiais de engenharia histórica. 

Use-os. 

Quando a documentação disser que determinada capacidade existe: 

→ localizar evidência no cliente quando possível. 

Quando existir comportamento no cliente sem documentação suficiente: → classificar OBSERVED/REVERSED/INFERRED. 

Não inventar. 

Não assumir que material histórico vale para o build atual. 

============================================================ 

7. GS2 FUNCTION REGISTRY 

============================================================ 

Continuar o `GS2FunctionRegistry` como fonte única de verdade. 

Adicionar suporte para: 

- categorias; 

- signatures; 

- parameters; 

- return values; 

- client/server/shared; 

- build/version; 

- aliases; 

- documentation; 

- evidence; 

- implementation state; 

- bridge handler. 

Estados: 

METADATA_ONLY STUB PARTIAL IMPLEMENTED VALIDATED 

Somente VALIDATED entra em: 

GS2 Functions: N 

Não mostrar 2040 apenas porque essa é a referência de outro executor. 

A meta é construir progressivamente um catálogo real. 

============================================================ 

# 8. FUNCTION REFERENCE 

============================================================ 

Criar uma área navegável: 

FUNCTIONS 

Essa área deve permitir: 

- listar funções; 

- pesquisar; 

- filtrar por categoria; 

- filtrar client/server; 

- visualizar assinatura; 

- parâmetros; 

- documentação; 

- estado; 

- versão; 

- evidência. 

Clicar em uma função deve mostrar detalhes. 

Essa mesma fonte alimenta o autocomplete. 

Não duplicar dados. 

============================================================ 9. EXECUTOR NAVIGATION 

============================================================ 

O Executor precisa deixar de ser uma única tela monolítica. 

Criar navegação profissional. 

Estrutura conceitual: 

STAR LABS 

├── Dashboard ├── Executor ├── Scripts ├── Functions ├── Console ├── Runtime └── Settings 

Não precisa implementar tudo de uma vez. 

As áreas podem entrar gradualmente. 

============================================================ 

# 10. DASHBOARD 

============================================================ 

# Criar Dashboard simples e profissional. 

Mostrar somente dados reais: 

- runtime status; 

- scripts abertos; 

- scripts salvos; 

- GS2 validated functions; 

- current engine version; 

- last execution; 

- diagnostics count. 

Não inventar estatísticas. 

============================================================ 11. EXECUTOR 

============================================================ 

O Executor continua sendo a área principal. 

Header: 

🔴 🟡 🟢  STAR Labs Executor 

# Abaixo: 

[ script.gs2 × ] [ player.gs2 × ] [ + ] 

Depois: 

toolbar de ícones. 

Centro: 

editor. 

Rodapé: 

Ln X, Col Y        GS2 Functions: N 

Abaixo: 

# < Script Logs 

============================================================ 

12. SETTINGS 

============================================================ 

Adicionar uma área própria: 

# ⚙ Settings 

Settings NÃO devem ser apenas uma tela decorativa. 

Criar estrutura preparada para: 

Editor 

- font size; 

- tab size; 

- word wrap; 

- minimap; 

- line numbers; 

- syntax highlighting; 

- autocomplete. 

Runtime 

- execution budget; 

- logging level; 

- diagnostics; 

- script timeout/cancellation. 

# Appearance 

- theme; 

- density; 

- panel behavior. 

Behavior 

- autosave; 

- confirm close; 

- restore tabs; 

- reopen last workspace. 

Todas as configurações devem possuir estado persistente quando aplicável. 

Não criar dezenas de opções sem função. 

============================================================ 13. SIDEBAR / NAVIGATION 

============================================================ 

Criar navegação que não roube espaço do editor. 

Desktop/tablet: 

- sidebar pode ser recolhida; 

- expandida; 

- redimensionada. 

# Mobile: 

- navigation drawer; 

- editor pode ocupar quase toda a tela; 

- sidebar pode desaparecer temporariamente. 

O editor continua sendo a área dominante. 

============================================================ 14. SCRIPT MANAGEMENT 

============================================================ 

Criar área: 

Scripts 

Permitir: 

- listar; 

- criar; 

- abrir; 

- renomear; 

- deletar; 

- procurar; 

- ordenar; 

- filtrar. 

Cada script abre como aba no Executor. 

ScriptRepository continua sendo a fonte de armazenamento. 

============================================================ 15. MULTI-TAB IDE 

============================================================ 

As abas precisam funcionar de verdade. 

Exemplo: 

[ main.gs2 × ] [ player.gs2 × ] [ weapons.gs2 × ] 

[ ui.gs2 × ] [ + ] 

Cada aba tem: 

- source; 

- dirty state; 

- cursor; 

- scroll position; 

- diagnostics; 

- version. 

Ao trocar de aba: 

- preservar estado; 

- não recarregar desnecessariamente. 

============================================================ 

# 16. EDITOR PROFISSIONAL 

============================================================ 

O editor deve evoluir para ergonomia real de IDE. 

# Implementar progressivamente: 

- syntax highlighting; 

- autocomplete; 

- signature help; 

- diagnostics; 

- go to line; 

- search; 

- replace; 

- code formatting; 

- bracket matching; 

- indentation; 

- undo/redo; 

- clipboard; 

- symbol outline; 

- function navigation. 

O editor deve trabalhar com documentos grandes. 

============================================================ 17. SYNTAX HIGHLIGHTING 

============================================================ 

Basear highlight no lexer/parser real. 

Categorias: 

- keywords; 

- built-ins; 

- functions; 

- variables; 

- strings; 

- numbers; 

- comments; 

- operators; 

- diagnostics. 

Não fazer somente regex superficial. 

============================================================ 18. AUTOCOMPLETE 

============================================================ 

Autocompletion: 

Editor ↓ LanguageService ↓ Registry / Parser 

Pesquisar por: 

- nome; 

- prefixo; - contexto. Mostrar: 

- nome; - assinatura; - documentação curta; 

- disponibilidade. 

============================================================ 19. DIAGNOSTICS 

============================================================ 

Diagnostics devem ser tempo-real quando possível, mas sem bloquear a UI. 

Exemplo: 

main.gs2:42:17 

Unknown function 'foo' 

Mostrar no editor. 

Problems recebe os diagnósticos. 

Ao tocar/clicar: 

navegar até a posição. 

============================================================ 

# 20. EXECUTION FLOW 

============================================================ 

Run: 

Editor 

↓ LanguageService ↓ Parser ↓ Semantic ↓ Runtime ↓ Bridge ↓ Graal 

Se houver erro: 

Runtime NÃO executa. 

Problems/Console recebem erro. 

Se iniciar: 

Runtime = Running 

No término: 

Runtime = Ready 

============================================================ 21. RUNTIME OBSERVABILITY 

============================================================ 

Área: 

Runtime 

Mostrar dados reais: 

- current state; 

- active script; 

- active function; 

- execution time; 

- instruction count quando disponível; 

- call stack; 

- errors; 

- cancellation state. 

Não mostrar métricas falsas. 

============================================================ 

# 22. CONSOLE PROFISSIONAL 

============================================================ 

Script Logs deve ser: 

< Script Logs 

com a seta no lado esquerdo. 

Ao abrir: 

Console | Output | Problems | Runtime | Call Stack 

Essas são TABS REAIS. 

Console: 

- aparência de terminal; 

- monoespaçado; 

- linhas compactas; 

- scroll; 

- timestamps discretos; 

- info; 

- warning; 

- error; 

- clear; 

- auto-scroll. 

Exemplo: 

[12:41:03] INFO  Runtime initialized [12:41:04] INFO  main.gs2 started [12:41:04] ERROR Unknown function "foo" [12:41:04] RUNTIME stopped 

============================================================ 

23. MINIMIZE / RESTORE / CLOSE 

============================================================ 

Executor: 

MINIMIZE 

RESTORE CLOSE 

# Minimize: 

- reduz UI sem destruir estado. 

Restore: 

- restaura. 

Close: 

- remove somente a UI STAR Labs. 

# NÃO fechar o Graal. 

Ao reabrir: 

- reconstruir UI; 

- restaurar documentos quando possível. 

============================================================ 

# 24. RESIZE 

============================================================ 

# Permitir: 

- redimensionar painel de Script Logs; 

- expandir editor; 

- recolher sidebar; 

- ajustar largura; 

- ajustar altura; 

- maximizar editor. 

MOBILE: touch drag. 

TABLET: 

touch drag. 

DESKTOP: mouse drag. 

============================================================ 

# 25. ENGINE E UI DESCONECTADOS 

============================================================ 

A UI não deve conter runtime. 

Arquitetura: 

UI 

↓ 

Application State 

↓ 

Language Service ↓ 

Runtime 

↓ 

Bridge 

A UI solicita operações. 

O runtime executa. 

============================================================ 

26. REAL CLIENT BRIDGE 

============================================================ 

Agora começar a transformar: 

ClientBridge 

de contrato/test double 

em integração concreta com o cliente Graal. 

Investigar o APK atual e identificar as superfícies reais que podem ser integradas. 

Não usar XCore. 

Não reativar os mecanismos removidos. 

Não copiar offsets históricos cegamente. 

Confirmar estruturas no build atual. 

============================================================ 27. JS ↔ ANDROID ↔ RUNTIME 

============================================================ 

Se WebView continuar sendo a UI: 

WebView ↓ STAR Labs JS bridge ↓ Android STAR Labs layer ↓ 

Runtime 

↓ 

ClientBridge 

↓ Graal 

Operações: 

- run; 

- stop; 

- save; 

- load; 

- diagnostics; 

- autocomplete; 

- function info; 

- logs; 

- runtime status. 

Não duplicar VM na UI. 

============================================================ 28. SCRIPT LOADER 

============================================================ 

Construir carregamento real de scripts. 

Fluxo: 

Repository 

↓ Language Service ↓ Parser ↓ Runtime 

# Permitir posteriormente: 

- workspace; 

- dependencies; 

- multiple scripts; 

- reload; 

- caching. 

============================================================ 

# 29. PERFORMANCE 

============================================================ 

Testar documentos grandes. 

# Testar: 

- 500 linhas; 

- 1.000; 

- 5.000; 

- 10.000 quando razoável; 

- múltiplos arquivos. 

Não existe “10.000 linhas mágicas” como limite funcional. 

O objetivo do teste é descobrir gargalos reais. 

Medir: 

- editor latency; 

- parse latency; 

- diagnostics; 

- autocomplete; 

- memory; 

- runtime execution. 

============================================================ 

# 30. BUILD / REGRESSION 

============================================================ 

# Antes de cada build: 

XCORE GATE. 

Garantir: 

- ModMenu.StartMenu ausente; 

- startup XCore ausente; 

- bootstrap XCore ausente; 

- Unity intacta. 

# STAR LABS: 

- bootstrap; 

- executor; 

- runtime; 

- registry; 

- repository; 

- language service; 

- bridge; 

- UI. 

APK: 

- > 0 bytes; 

- ZIP válido; 

- resources; 

- Manifest; 

- alignment; 

- assinatura; 

- package; 

- launcher. 

============================================================ 

# 31. DEVICE TEST 

============================================================ 

Teste físico obrigatório após integração: 

1. Graal inicia. 

2. XCore não aparece. 

3. STAR Labs inicia. 

4. Executor abre. 

5. criar script. 

6. abrir múltiplos arquivos. 

7. syntax highlighting. 

8. autocomplete. 

9. function lookup. 

10. Save. 

11. Run. 

12. Console. 

13. Problems. 

14. Stop. 

15. minimizar. 

16. restaurar. 

17. fechar. 

18. abrir novamente. 19. Settings. 20. redimensionar painéis. 

============================================================ 32. QUALIDADE DA IMPLEMENTAÇÃO 

============================================================ 

Não aceitar: 

- botões sem função; 

- números fake; 

- abas fake; 

- settings fake; 

- console fake; 

- autocomplete fake; 

- parser fake; 

- runtime fake. 

Cada recurso deve possuir: 

UI 

+ 

state 

+ 

implementation 

+ 

test 

- ============================================================ 33. NÃO REESCREVER O QUE JÁ FUNCIONA 

============================================================ 

Preservar: 

- remoção do XCore; 

- Graal funcionando; 

- bootstrap próprio; 

- gate; 

- registry; 

- repository; 

- language service; 

- bridge contracts. 

Só substituir componentes quando necessário. 

Preferir evolução incremental. 

============================================================ 34. PRIMEIRA META DESTA FASE 

============================================================ 

A primeira meta NÃO é ter 2.000 funções implementadas. 

A primeira meta é: 

um script GS2 real e relativamente complexo 

ser capaz de passar por: 

EDITOR ↓ PARSER ↓ SEMANTIC ↓ RUNTIME ↓ BRIDGE ↓ CLIENT 

com diagnostics e logs reais. 

Depois aumentar cobertura. 

============================================================ 35. META DE COBERTURA 

============================================================ 

Construir progressivamente: 

GS2 syntax → semantics → standard functions → client functions → objects → events → GUI-related APIs → client integration → build-specific APIs 

Até onde a documentação + engenharia do build permitirem. 

Não prometer cobertura que ainda não existe. 

============================================================ 36. RESULTADO ESPERADO 

============================================================ 

STAR Labs deixa de ser: 

“um frontend bonito com alguns contratos Node” 

e passa a ser: 

- “um ambiente de desenvolvimento/execution real de GS2 integrado ao Graal”. 

Com: 

- ✅ Editor profissional 

- ✅ Multi-tab 

- ✅ Script Repository 

- ✅ Language Service 

- ✅ GS2 Function Registry 

- ✅ Parser 

- ✅ Semantic Analysis 

- ✅ Runtime 

- ✅ Client Bridge 

- ✅ Console 

- ✅ Problems 

- ✅ Runtime 

- ✅ Call Stack 

- ✅ Settings 

- ✅ Scripts 

- ✅ Functions Reference 

- ✅ Responsive/resizable UI 

- ✅ Minimize/Restore/Close 

- ✅ XCore permanentemente ausente 

============================================================ 

37. REGRA FINAL 

============================================================ 

Você possui: 

- documentação GS2; 

- materiais já fornecidos; 

- APK; 

- DEX; 

- native binaries; 

- metadata; 

- assets; 

- engenharia histórica; 

- testes; 

- baseline funcional do Graal sem XCore. 

Use esse conjunto. 

Não faça suposições quando a informação puder ser encontrada. 

Procure primeiro na documentação. 

Depois procure no cliente. 

Depois valide experimentalmente. 

Depois implemente. 

Cada descoberta deve melhorar o runtime. 

NÃO REATIVE O XCORE. 

CONSTRUA O STAR LABS. 


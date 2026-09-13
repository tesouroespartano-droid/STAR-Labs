STAR LABS V10 — PARTE 1/2 

GS2 ENGINE + PROFESSIONAL IDE + SAFE IN-PROCESS INTEGRATION 

LEIA TODO ESTE PROMPT ANTES DE ALTERAR QUALQUER ARQUIVO. 

============================================================ 

0. ESTADO REAL E CONFIRMADO DO PROJETO 

============================================================ 

O APK atual foi instalado e testado em dispositivo físico. 

# RESULTADO COMPROVADO: 

- Graal/Unity inicia normalmente. 

- XCore NÃO aparece. 

- STAR Labs atualmente NÃO está inicializando funcionalmente. 

- O APK está praticamente no estado original do Graal. 

A remoção do XCore FOI CONFIRMADA NO DEVICE. 

A cadeia identificada anteriormente foi: 

UnityPlayerActivity.onCreate() 

- -> ModMenu.StartMenu(Context) 

- -> XCore WebView/bootstrap 

- -> UI XCore 

O call site direto foi removido. 

NÃO reverta essa remoção. 

NÃO reintroduza esse caminho. 

NÃO use XCore como bootstrap ou runtime do STAR Labs. 

A partir deste ponto, a ausência do XCore é uma REGRESSION GATE PROTEGIDA. 

============================================================ 

1. OBJETIVO DESTA FASE 

============================================================ 

Transformar o STAR Labs em: 

1. um runtime GS2 sério e extensível; 

2. um editor/executor com aparência de IDE profissional; 

3. uma integração in-process com o cliente Graal; 

4. uma base preparada para catálogo amplo de funções; 

5. uma fundação preparada para backend futuro. 

Não criar uma demo. 

Não criar uma mini-DSL. 

Não criar uma textarea com botões. 

Não usar números ou funcionalidades fictícias para aparentar compatibilidade. 

============================================================ 

2. REGRA ABSOLUTA — XCORE É INTOCÁVEL 

============================================================ 

A remoção atual do XCore deve ser tratada como parte protegida do sistema. 

Qualquer alteração futura DEVE possuir regression checks que garantam: 

- UnityPlayerActivity NÃO chama ModMenu.StartMenu(); 

- nenhum caminho de startup XCore restaurado; 

- nenhum bootstrap conhecido do XCore restaurado; 

- nenhum launcher XCore restaurado; 

- nenhum componente do XCore reativado para iniciar o STAR Labs. 

# NÃO: 

- restaurar ModMenu.StartMenu; 

- restaurar xCoreScripts; 

- restaurar UI XCore; 

- restaurar bootstrap XCore; 

- usar XCore como backend; 

- usar XCore como executor; 

- reativar componentes apenas porque parecem convenientes. 

Se o STAR Labs precisar de uma capacidade, implemente uma camada própria ou uma integração comprovadamente separada do XCore. 

# ANTES DE CADA BUILD: 

executar uma regression gate XCORE. 

# SE A GATE FALHAR: 

O BUILD DEVE FALHAR. 

============================================================ 3. O QUE É GS2 

============================================================ 

GS2 = Graal Script 2 / New Engine GScript. 

NÃO tratar GS2 como JavaScript simplificado. 

NÃO tratar GS2 como DSL inventada pelo projeto. 

NÃO considerar o parser atual como implementação suficiente. 

A implementação deve ser fundamentada em documentação real e evidência do cliente. 

Use como fontes técnicas: 

- Graal Script / GS2 documentation 

- GScript for Dummies 

- Clientside Functions 

- Starting Guide 

- GS1 to GS2 

- Scripting Reference 

- fóruns de New Scripting Engine / GS2 

- materiais locais de engenharia já existentes 

- documentos fornecidos anteriormente 

- vídeos fornecidos anteriormente no projeto/contexto, quando acessíveis 

DISTINGUIR: 

- documentação; 

- comportamento observado; 

- engenharia do cliente atual; 

- hipótese. 

Não converter hipótese em fato. 

============================================================ 

# 4. FONTES EXTERNAS OBRIGATÓRIAS 

============================================================ 

Consulte as seguintes fontes durante a engenharia do runtime: 

Graal GScript: 

https://www.graalonline.net/index.php/Creation/Dev/GScript 

GScript for Dummies: 

https://graalonline.net/index.php?title=Creation%2FDev%2FGScript%2FGScript_for_Dummi es 

Clientside Functions: 

https://graalonline.net/Creation/Dev/Script/Clientside_Functions 

Client: 

https://graalonline.net/index.php/Creation/Dev/Script/Client 

Starting Guide: 

https://graalonline.net/index.php/Creation/Dev/Script/Starting_Guide 

Scripting Reference: 

https://graalonline.net/Category:Scripting_Reference 

GS1 -> GS2: 

https://www.graalonline.net/Creation/Dev/GS1_To_GS2 

Graal Forums / NPC Scripting / New Engine GS2: https://forums.graalonline.com/forums/forumdisplay.php?f=8 

Helpful/forum material: 

https://graalonline.net/Creation/Dev/Script/Helpful_Posts 

NPC Programming reference: 

https://pt.scribd.com/document/55585384/npcprogramming 

Use essas fontes para enriquecer o catálogo, parser, semântica, objetos, funções e comportamento. 

Os 4 vídeos do YouTube fornecidos anteriormente também devem ser utilizados quando estiverem acessíveis no projeto/contexto. 

NÃO invente URLs dos vídeos se elas não estiverem disponíveis. 

============================================================ 5. INVENTÁRIO GS2 

============================================================ 

A alegação de “2040 GS2 functions” deve ser tratada como HIPÓTESE/REFERÊNCIA até ser validada. 

O sistema NÃO deve hardcodar: 

GS2 Functions = 2040 

em nenhum lugar apenas para imitar outro executor. 

Construa um GS2FunctionRegistry real. 

Esse registry deve ser capaz de armazenar: 

- nome; 

- assinatura; 

- parâmetros; 

- retorno; 

- lado client/server; 

- versão/build; 

- disponibilidade; 

- aliases; 

- documentação; 

- status; 

- implementação; 

- origem/evidência. 

O contador mostrado na UI deve ser: 

COUNT(registry.validatedFunctions) 

e nunca um número falso. 

Busque também meios de extrair/validar o catálogo do cliente/build-alvo quando tecnicamente possível. 

A documentação atual indica que o ecossistema possui listas client-side e server-side e que a lista pode ser obtida do próprio cliente em determinadas versões. Use essa informação como uma direção de engenharia, não como desculpa para inventar um total. 

============================================================ 6. ARQUITETURA DO RUNTIME 

============================================================ 

A arquitetura deve ser modular: 

GS2 Source ↓ Lexer ↓ Parser ↓ AST ↓ Semantic Analysis ↓ IR / Bytecode quando apropriado ↓ GS2 VM / Runtime ↓ Built-in Registry ↓ Event Runtime ↓ Client Bridge ↓ Graal/Unity 

A UI NÃO interpreta GS2. 

A UI envia scripts para o runtime. 

O runtime não deve conhecer Android UI. 

O parser não deve conhecer WebView. 

O Client Bridge é a fronteira explícita. 

============================================================ 

7. PARSER / LINGUAGEM 

============================================================ 

Reestruture o parser para suportar a linguagem real progressivamente. 

Cobrir de forma testável: 

- identifiers; 

- literals; 

- strings; 

- números; 

- arrays; 

- expressions; 

- operators; 

- assignments; 

- function definitions; 

- function calls; 

- parameters; 

- return; 

- conditionals; 

- loops; 

- scopes; 

- event functions; 

- objects/classes conforme evidência; 

- member access; 

- indexing; 

- callbacks; 

- built-ins; 

- comments; 

- client/server markers; 

- syntax diagnostics. 

Não implementar recursos apenas por aparência. 

Para cada recurso: 

SUPPORTED PARTIAL UNSUPPORTED 

com testes correspondentes. 

============================================================ 

8. VM / EXECUTION MODEL 

============================================================ 

O runtime precisa suportar scripts maiores e mais complexos. 

Implementar arquitetura para: 

- execution context; 

- call stack; 

- function frames; 

- local/global scope; 

- script state; 

- events; 

- callbacks; 

- scheduling; 

- cancellation; 

- errors; 

- diagnostics; 

- call trace; 

- multi-script execution; 

- persistent script state. 

Scripts longos não devem bloquear indefinidamente a thread principal. 

Projetar budget/yield/scheduling quando necessário. 

============================================================ 9. BUILT-IN FUNCTION SYSTEM 

============================================================ 

NÃO espalhar milhares de funções diretamente pelo parser. 

Usar registry. 

Exemplo conceitual: 

GS2FunctionRegistry ├── math ├── string ├── array ├── object 

├── GUI ├── player ├── rendering ├── input ├── networking ├── file/data ├── utility └── build-specific 

Cada função deve possuir: 

- metadata; 

- signature; 

- validation; 

- execution handler; 

- documentation; 

- availability. 

Permitir crescimento para centenas/milhares de entries sem alterar a VM central. 

============================================================ 10. CLIENT / SERVER SEMÂNTICA 

============================================================ 

Não misturar indiscriminadamente funções client-side e server-side. 

O registry deve conhecer o contexto esperado. 

O compilador/runtime deve emitir diagnóstico quando uma função não está disponível naquele contexto. 

A documentação de GS2 diferencia funções client-side e server-side. Preserve essa distinção na arquitetura. 

============================================================ 

11. CLIENT BRIDGE 

============================================================ 

Criar uma camada explícita: 

GS2 Runtime 

↓ STAR Labs Bridge ↓ Android / Native / Unity 

↓ Cliente Graal 

Não: 

GS2 Runtime 

↓ XCore 

Nunca. 

O bridge deve ser independente do XCore. 

Qualquer integração com binários nativos deve ser baseada em engenharia do cliente atual e testes. 

Não copiar offsets históricos cegamente. 

Não assumir que um offset antigo funciona no APK atual. 

============================================================ 12. PRINCÍPIOS DE IMPLEMENTAÇÃO 

============================================================ 

Não tente implementar milhares de funções manualmente dentro da VM central. 

Construa primeiro: 

- registry; - ABI/interop layer; 

- dispatcher; 

- metadata; 

- context; 

- error handling; 

- test harness. 

Depois aumente o catálogo progressivamente. 

Uma função do registry deve poder evoluir de: 

metadata-only ↓ stub claramente marcado ↓ partial ↓ fully implemented 

SEM alterar a arquitetura da VM. 

Nunca registrar uma função como totalmente suportada sem implementação/teste correspondente. 

============================================================ 13. TEST CORPUS DO ENGINE 

============================================================ 

Criar corpus realista de GS2. 

Não usar apenas: 

let a=1; let b=2; 

... 

para fabricar milhares de linhas. 

Criar testes por categorias: 

- lexical; 

- syntax; 

- expressions; 

- variables; 

- scopes; 

- functions; 

- parameters; 

- return; 

- conditions; 

- loops; 

- arrays; 

- objects; 

- events; 

- callbacks; 

- built-ins; 

- client/server; 

- errors; 

- call stack; 

- multi-script; 

- long-running; 

- integration; 

- large scripts. 

Adicionar casos derivados da documentação e dos materiais de engenharia disponíveis. 

============================================================ 14. PERFORMANCE 

============================================================ 

O runtime deve ser projetado para crescer. 

Avaliar: 

- parse caching; 

- AST reuse; 

- IR; 

- bytecode; 

- lookup; 

- dispatch; 

- allocations; 

- memory pressure; 

- event queue; 

- callback overhead; 

- bridge overhead. 

Não otimizar cegamente. 

Não construir uma arquitetura que obrigue a reescrever a VM inteira quando scripts maiores forem usados. 

============================================================ 15. DEBUG / DIAGNOSTICS 

============================================================ 

Preparar desde o início: 

- erro com arquivo; 

- linha; 

- coluna; 

- categoria; 

- mensagem; 

- stack/call trace; 

- runtime state; 

- function resolution errors; 

- bridge errors; 

- script lifecycle errors. 

Exemplo: 

test.gs2:42:17 Unknown function 'example' 

A infraestrutura deve permitir exibir isso posteriormente no editor. 

============================================================ 

16. INVESTIGAÇÃO DO CLIENTE 

============================================================ 

Use os materiais históricos já levantados como evidência. 

Há referências anteriores a: 

- script loader; 

- script object; 

- bytecode; 

- function lookup; 

- Graal hash; 

- event dispatch; 

- execution; 

- value resolution; 

- global/context manager; 

- script registration; 

- event tables; 

- client bridge. 

Também existem binários e materiais relacionados ao cliente Graal atual. 

# ANALISE-OS. 

Não copie offsets antigos cegamente. 

# Para o APK atual: 

- confirmar símbolos; 

- confirmar referências; 

- confirmar calling conventions; 

- confirmar estruturas; 

- confirmar comportamento; 

- confirmar no runtime quando possível. 

Use builds antigos para formar hipóteses. 

Use o APK-alvo para validar. 

============================================================ 17. WORKFLOW TÉCNICO 

============================================================ 

Antes de alterar arquivos: 

1. mapear runtime atual; 

2. separar código real de placeholder; 

3. montar matriz de compatibilidade; 

4. projetar registry; 

5. projetar parser; 

6. projetar AST/IR; 

7. projetar VM; 

8. projetar bridge; 

9. proteger XCore regression. 

Só depois implementar. 

Não reescrever tudo cegamente. 

Não fazer grandes modificações sem testes correspondentes. 

STAR LABS V10 — PARTE 2/2 

EDITOR PROFISSIONAL + UI + BACKEND + REGRESSION + BUILD 

CONTINUAÇÃO EXATA DA PARTE 1. 

- ============================================================ 18. EDITOR — STAR LABS EXECUTOR 

============================================================ 

O Editor do STAR Labs deve parecer um ambiente profissional de desenvolvimento. 

Inspiração visual e funcional: 

- VS Code; 

- IDEs modernas; 

- editores de código profissionais; 

- ferramentas desktop modernas. 

Não copiar identidade, código, assets ou branding de terceiros. 

Criar identidade própria: STAR Labs Executor. 

A interface deve parecer um produto pronto, não um protótipo. 

============================================================ 19. HEADER SUPERIOR 

============================================================ 

Topo da janela: 

🔴 🟡 🟢  STAR Labs Executor 

As três bolinhas funcionam como referência visual ao estilo de janela/editor profissional. 

NÃO usar: 

# STAR Labs Connected 

como título principal. 

O título deve ser: 

# STAR Labs Executor 

Toda a região superior deve estar perfeitamente alinhada. 

- ============================================================ 20. ABAS DE ARQUIVOS 

============================================================ 

Logo abaixo do header: 

- [ script.gs2 × ] [ player.gs2 × ] [ test.gs2 × ] [ + ] 

Cada arquivo aberto ocupa uma aba real. 

Cada aba deve possuir: 

- nome; 

- estado ativo; 

- X para fechar; 

- indicador de não salvo; 

- hover; 

- foco; 

- scroll quando houver muitas abas. 

Comportamento: 

- clicar na aba troca o documento; 

- X fecha; 

- documento modificado pede confirmação; 

- + cria novo script; 

- abrir arquivo adiciona aba; 

- múltiplos arquivos podem permanecer abertos; 

- estado de cada documento é preservado. 

============================================================ 

# 21. TOOLBAR 

============================================================ 

# A toolbar fica ABAIXO DAS ABAS. 

Ela deve conter, de forma organizada: 

Run Stop Save Copy Format Search Delete 

E, quando apropriado: 

Undo Redo Indent Outdent Comment Go to line 

Não utilizar botões enormes. 

Preferir: 

ícone + tooltip + estado visual. 

Cada operação deve ter comportamento real. 

Exemplo: 

Run: 

- envia script ao runtime; 

- mostra estado Running; 

- captura saída/erro; 

- respeita cancellation. 

Stop: 

- solicita interrupção da execução; 

- atualiza estado. 

Save: 

- salva no repository; - remove dirty state. 

Format: 

- utiliza formatter real; 

- nunca destrói código. 

# Delete: 

- confirma quando necessário; 

- remove arquivo do repository; 

- atualiza abas. 

============================================================ 

# 22. EDITOR DE CÓDIGO 

============================================================ 

A área central deve ser DOMINANTE. 

O editor pode ocupar grande parte da tela. 

Deve possuir: 

- numeração de linhas; 

- cursor; 

- coluna; 

- seleção; 

- fonte monoespaçada; 

- syntax highlighting GS2; 

- matching de parênteses/chaves; 

- auto indentation; 

- bracket matching; 

- scroll vertical; 

- scroll horizontal; 

- word wrap configurável; 

- busca; 

- replace; 

- undo; 

- redo; 

- copiar; 

- colar; 

- format; 

- go to line; 

- dirty state. 

Quando tecnicamente viável: 

- autocomplete; - function signature help; 

- diagnostics; 

- hover; 

- symbols; 

- outline; 

- navigation. 

============================================================ 

# 23. GS2 LANGUAGE SERVICE 

============================================================ 

O editor e o runtime devem compartilhar a mesma fonte de verdade. 

Utilizar: 

GS2FunctionRegistry 

+ 

Parser 

+ 

Semantic Information 

para alimentar: 

- autocomplete; 

- documentation; 

- function signatures; 

- diagnostics; 

- search; 

- symbols; 

- status bar; 

- syntax highlighting contextual. 

Não duplicar catálogo em arquivos separados. 

Não manter “2040 funções” manualmente na UI. 

============================================================ 24. STATUS BAR 

============================================================ 

No rodapé imediato do editor: 

lado esquerdo: 

Ln X, Col Y 

e demais informações editoriais quando disponíveis. 

Lado direito: 

GS2 Functions: N 

Runtime: Ready ou 

Runtime: Running 

ou Runtime: Error 

N deve ser baseado no registry validado. 

Exemplo: 

GS2 Functions: 137 

não pode virar: 

GS2 Functions: 2040 

apenas para parecer grande. 

============================================================ 25. SCRIPT LOGS 

============================================================ 

Na parte inferior: 

Script Logs    > 

A seta/chevron permite expandir. 

Quando fechado: 

- ocupar somente uma pequena barra inferior. 

- Quando aberto: - expandir o console/painel. 

Painel inferior deve ser redimensionável verticalmente. 

Dentro dele, usar tabs: 

Console Output Problems Runtime Call Stack 

Script Logs deve receber: 

- print/log; 

- warnings; 

- errors; 

- runtime events; 

- execution diagnostics. 

============================================================ 

# 26. LAYOUT RESIZABLE 

============================================================ 

# Toda a interface deve ser redimensionável. 

# MOBILE: 

# permitir: 

- puxar lateral; 

- expandir editor; 

- reduzir painel; 

- maximizar editor; 

- recolher logs; 

- navegar pelas abas; 

- adaptar toolbar. 

# TABLET: 

- editor amplo; 

- regiões ajustáveis; 

- abas funcionais; 

- painel inferior redimensionável. 

# DESKTOP: 

- editor dominante; 

- painéis redimensionáveis; 

- abas completas; 

- área opcional para sidebar/ferramentas. 

Os componentes devem se encaixar em um sistema de layout comum. 

Não criar três UIs completamente diferentes. 

- ============================================================ 27. DESIGN SYSTEM 

============================================================ 

Criar tokens centralizados para: 

- background; 

- surface; 

- panel; 

- border; 

- text; 

- muted; 

- primary; 

- success; 

- warning; 

- error; 

- radius; 

- spacing; 

- typography; 

- shadow. 

Não espalhar valores aleatórios. 

Tudo deve seguir um grid e uma escala consistente. 

============================================================ 28. ALINHAMENTO PROFISSIONAL 

============================================================ 

# PRIORIDADE VISUAL ABSOLUTA: 

Nada pode parecer amador. 

Toda a interface deve respeitar: 

- alinhamento; 

- grid; 

- spacing; 

- padding; 

- baseline; 

- proporções; 

- consistência; 

- estados; 

- foco; 

- hover; - disabled; 

- active; 

- borders; 

- radius. 

Nada solto. 

Nada deslocado. 

Nada sobreposto. 

Nada com espaçamento arbitrário. 

O header, tabs, toolbar, editor, status bar e Script Logs devem parecer uma única peça. 

============================================================ 

# 29. SCRIPT REPOSITORY 

============================================================ 

Criar camada independente: 

ScriptRepository 

Responsabilidades: 

- create; 

- open; 

- save; 

- rename; 

- delete; 

- list; 

- load; 

- dirty state; 

- document state; 

- version/state. 

A UI não deve manipular armazenamento diretamente. 

============================================================ 30. ERROR / DEBUG SYSTEM 

============================================================ 

O sistema de diagnóstico precisa ligar runtime e editor. 

Erros devem informar quando possível: 

- script; 

- linha; 

- coluna; 

- tipo; 

- mensagem; 

- stack trace. 

Exemplo: 

player.gs2:15:9 Unknown function 'foo' 

O editor deve ser capaz de: 

- marcar a linha; 

- mostrar erro; 

- abrir Problems; 

- navegar até a posição. 

============================================================ 31. UI + ENGINE DEVEM SER DESACOPLADOS 

============================================================ 

Arquitetura: 

Editor UI ↓ Editor State ↓ Script Repository ↓ GS2 Language Service ↓ GS2 Parser / AST / IR ↓ GS2 Runtime ↓ Client Bridge Nunca: Editor UI ↓ XCore Nunca. 

A UI não deve conter regras de execução do Graal. O runtime não deve conhecer a UI. ============================================================ 32. BACKEND FUTURO — RENDER ============================================================ 

O backend será hospedado no Render e deverá poder permanecer online continuamente. 

# PORÉM: 

backend NÃO pode ser requisito para execução local inicial. 

O cliente precisa funcionar sem servidor. 

Primeira etapa: 

- local runtime; 

- local scripts; 

- local registry; 

- local configuration. 

Futuro: 

- authentication; 

- sync; 

- remote catalog; 

- accounts; 

- script metadata; 

- versions; 

- community; 

- analytics. 

============================================================ 

33. SCRIPT MARKETPLACE — FUTURO 

============================================================ 

Arquitetura preparada para: 

Script Author Version Category Price Rating Downloads Ownership Updates 

A loja poderá suportar: 

- scripts gratuitos; 

- scripts pagos; 

- autores; 

- avaliações; 

- versões; 

- atualizações; 

- catálogo. 

Não implementar pagamentos nesta fase. 

Não criar marketplace fake. 

============================================================ 34. BUILD PIPELINE 

============================================================ 

O build oficial continua sendo: 

npm run build-apk 

O pipeline DEVE parar em erro se: 

- APK não existir; 

- APK tiver 0 bytes; 

- ZIP inválido; 

- resources.arsc inválido; 

- Manifest inválido; 

- assinatura inválida; 

- zipalign inválido; 

- bibliotecas nativas inválidas; 

- regression gate XCore falhar; 

- testes críticos do runtime falharem. 

# Validar: 

- tamanho em bytes; 

- SHA-256; 

- aapt2; 

- apkanalyzer; 

- ZIP integrity; 

- resources.arsc; 

- Manifest; 

- zipalign; 

- apksigner; 

- DEX; 

- native libraries; 

- assets; 

- presença do Graal; 

- presença do STAR Labs. 

============================================================ 

# 35. XCORE REGRESSION GATE 

============================================================ 

Antes de empacotar o APK: 

# CONFIRMAR: 

- UnityPlayerActivity não chama ModMenu.StartMenu; 

- nenhum startup path conhecido do XCore reapareceu; 

- nenhum launcher XCore reapareceu; 

- nenhum bootstrap XCore reapareceu; 

- componentes removidos não foram reativados. 

Se houver qualquer regressão: 

BUILD FAIL. 

Não “corrigir depois”. 

============================================================ 

# 36. GRAAL REGRESSION GATE 

============================================================ 

# Confirmar: 

- UnityPlayerActivity permanece launcher correto; 

- Unity initialization intact; 

- required native libraries preservadas; 

- resources preservados; 

- assets preservados; 

- package correto; 

- APK instalável. 

Não alterar a base Graal sem necessidade. 

============================================================ 37. STAR LABS REGRESSION GATE 

============================================================ 

# Confirmar: 

- bootstrap STAR Labs presente; - runtime presente; - parser presente; 

- registry presente; 

- editor presente; 

- UI presente; 

- integração presente; 

- testes fundamentais passando. 

IMPORTANTE: 

STAR Labs não deve depender de ModMenu/XCore. 

============================================================ 38. TESTE FUNCIONAL 

============================================================ 

Quando houver device/emulator: 

1. instalar APK; 

2. abrir; 

3. Graal inicia; 4. XCore não aparece; 

5. STAR Labs inicia; 

6. abrir Executor; 

7. abrir múltiplos scripts; 

8. editar; 

9. salvar; 

10. executar; 

11. verificar Script Logs; 

12. abrir Console; 

13. verificar erros; 

14. fechar/abrir abas; 

15. redimensionar editor/painéis; 

16. verificar estado de runtime. 

Se XCore aparecer novamente: STOP. 

Investigar a regressão antes de continuar. 

============================================================ 39. PERFORMANCE / UX 

============================================================ 

O editor deve ser responsivo. 

Não permitir que: 

- autocomplete congele a UI; 

- parsing congele a tela; 

- logs causem travamento; 

- scripts longos travem a UI; 

- renderização do editor cause frames desnecessariamente pesados. 

Separar operações pesadas quando necessário. 

============================================================ 40. PHASE PLAN 

============================================================ 

Implementar em etapas: 

PHASE 1 Protect XCore removal. 

PHASE 2 

Audit current STAR Labs runtime. 

PHASE 3 GS2FunctionRegistry. 

PHASE 4 Lexer/parser. 

PHASE 5 

AST/semantic layer. 

PHASE 6 VM/runtime. 

PHASE 7 Client bridge. 

PHASE 8 Language service. 

PHASE 9 

Professional Executor UI. 

PHASE 10 Integration. 

PHASE 11 Build/validation. 

PHASE 12 Device testing. 

PHASE 13 Backend preparation. 

Não pular diretamente para marketplace. 

============================================================ 41. NÃO FAKE ============================================================ 

Nunca afirmar: 

“GS2 completo” 

sem evidência. 

Nunca afirmar: 

“2040 funções” 

sem catálogo validado. 

Nunca afirmar: 

“runtime avançado” 

se ainda for uma mini-DSL. 

Nunca afirmar: 

“XCore removido” 

sem regression evidence. 

Nunca afirmar: 

“APK válido” 

sem validar o arquivo real. 

============================================================ 42. PRINCÍPIO FINAL 

============================================================ 

O limite do STAR Labs deve crescer junto com: 

- qualidade do parser; 

- qualidade da VM; 

- quantidade/qualidade do registry; 

- client bridge; 

- conhecimento real do cliente; 

- testes; 

- documentação. 

O projeto deve poder evoluir: 

GS2 runtime 

→ function registry → client bridge → editor → debugger → UI → backend → marketplace 

sem reescrever a fundação. 

============================================================ 43. NÃO DESTRUIR O QUE JÁ FOI CONQUISTADO 

============================================================ 

Estado protegido: 

GRAAL: 

✅ funcionando 

XCORE: 

✅ removido do startup 

✅ confirmado ausente no device 

STAR LABS: 

⚠ atualmente precisa ser reativado/implementado corretamente 

Qualquer nova alteração deve preservar os dois primeiros fatos. 

============================================================ 44. OBJETIVO FINAL 

============================================================ 

Resultado esperado: 

GRAAL 

✅ inicia 

✅ continua funcional 

XCORE 

❌ não inicia 

❌ não aparece 

❌ não é usado pelo STAR Labs 

STAR LABS 

✅ inicia 

✅ possui runtime próprio 

✅ possui parser GS2 real e extensível 

✅ possui registry de funções real 

✅ possui integração com o cliente 

✅ possui Executor profissional 

✅ abas 

✅ toolbar 

- ✅ status bar 

- ✅ Script Logs expansível 

- ✅ Console 

✅ Problems 

- ✅ Call Stack 

- ✅ diagnostics 

- ✅ layout resizable 

- ✅ mobile/tablet/desktop 

- ✅ UI alinhada 

- ✅ identidade visual própria 

A meta não é reproduzir o XCore. 

A meta é construir um ambiente próprio e tecnicamente sólido para GS2. 

============================================================ 45. PRIMEIRA AÇÃO OBRIGATÓRIA 

============================================================ 

Antes de qualquer redesign: 

1. preservar a remoção do XCore; 

2. auditar o runtime atual; 

3. identificar placeholders/DSL; 

4. consultar as fontes GS2; 

5. criar matriz de compatibilidade; 

6. projetar GS2FunctionRegistry; 

7. projetar parser → AST/IR → VM; 

8. projetar Client Bridge; 

9. criar regression gates; 

10. só então implementar. 

Não gastar a primeira etapa apenas fazendo UI. 

O motor é a fundação. 

A interface profissional deve ser construída sobre uma fundação real. 

NÃO REATIVE O XCORE. 


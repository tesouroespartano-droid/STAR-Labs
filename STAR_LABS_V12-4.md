STAR LABS V12.4 — NÃO ACEITAR “RUNTIME UNAVAILABLE” 

EXECUTION ENGINE DENTRO DO APK 

O V12-3 resolveu persistência/navegação/estado Android, porém NÃO resolveu o problema central. 

O próprio relatório final confirma: 

“o engine GS2 ainda é validado no harness Node e não está hospedado dentro do processo Android.” 

Isso NÃO é o objetivo final e NÃO deve ser tratado como uma limitação aceitável desta fase. 

A próxima tarefa é justamente descobrir e implementar como hospedar o engine do STAR Labs DENTRO DO APK. 

============================================================ 

# 1. REGRA 

============================================================ 

NÃO reativar XCore. 

NÃO usar: 

- ModMenu; 

- xCoreScripts; 

- menu.holy; 

- XCore bridge; 

- libservice.so como executor; 

- XCore runtime. 

A remoção do XCore continua protegida pela regression gate. 

============================================================ 

# 2. PROBLEMA EXATO 

============================================================ 

Hoje: 

# WebView 

↓ 

StarLabsWebBridge 

↓ 

persistência/settings ✅ 

Mas: 

Run ↓ ??? 

RuntimeEngine ↓ Node harness externo 

Isso não serve. 

Precisamos: 

WebView ↓ StarLabsWebBridge 

↓ Android Runtime Host ↓ GS2 Engine 

↓ ClientBridge ↓ Graal/Unity 

TUDO DENTRO DO APK/PROCESSO. 

============================================================ 3. NÃO PRESUMA “NODE NO ANDROID” 

============================================================ 

Não assuma que o runtime precisa ser literalmente Node.js. 

Investigue tecnicamente as opções. 

# Avaliar: 

A) JavaScript engine embutido no Android; 

B) engine compilado/portado; 

C) implementação da VM diretamente em Java/Kotlin; 

D) implementação da VM em C/C++; 

E) transpilation/bytecode generation apropriado; 

F) outra solução tecnicamente justificável. 

Critérios: 

- execução in-process; 

- sem servidor obrigatório; 

- baixa latência; 

- acesso ao estado do runtime; 

- integração com Android; 

- possibilidade de bridge para Unity/native; 

- escalabilidade para scripts grandes; 

- manutenção futura. 

Escolher a arquitetura com base em evidência e protótipo. 

============================================================ 4. PROVA DE CONCEITO OBRIGATÓRIA 

============================================================ 

Antes de fazer UI nova: 

Faça um POC mínimo: 

APK 

↓ STAR Labs ↓ Run ↓ GS2 code ↓ Android runtime host ↓ resultado ↓ Console 

Exemplo de código simples do próprio runtime: 

function add(a, b) { return a + b; } 

echo(add(10, 20)); 

O resultado precisa chegar à UI. 

Isso deve funcionar SEM Node externo. 

============================================================ 5. NÃO FAZER MOCK 

============================================================ 

Proibido: 

Run 

→ “Execution successful” 

sem executar. 

Proibido: 

Console → resultado pré-programado. 

Proibido: 

Android 

→ chama endpoint HTTP externo → Node executa → retorna resultado. 

O runtime deve estar dentro do APK. 

Backend futuro NÃO participa da execução local. 

============================================================ 6. GS2 RUNTIME 

============================================================ 

O runtime não pode continuar baseado na mini-DSL atual. 

Reconstruir progressivamente: 

Lexer → Parser → AST → Semantic → IR/Bytecode quando apropriado → VM → Function Registry → Client Bridge 

O código abaixo é um teste estrutural relevante: 

//#CLIENTSIDE 

function onCreated() { this.value = 10; 

temp.list = { a: 1, 

b: 2 }; 

for (temp.item : players) { if (temp.item != player) { temp.distance = ((temp.item.x - player.x)^2 + (temp.item.y - player.y)^2)^0.5; } } } 

public function sum(a, b) { return a + b; } 

Esse script NÃO precisa ser imediatamente 100% executável no cliente. 

Mas o parser, AST e semantic layers precisam conseguir REPRESENTÁ-LO e identificar corretamente o que falta. 

============================================================ 7. DOCUMENTAÇÃO 

============================================================ 

Use: 

https://www.graalonline.net/index.php/Creation/Dev/GScript https://graalonline.net/index.php?title=Creation/Dev/GScript/GScript_for_Dummies https://graalonline.net/Creation/Dev/Script/Clientside_Functions https://graalonline.net/index.php/Creation/Dev/Script/Client https://graalonline.net/index.php/Creation/Dev/Script/Starting_Guide https://graalonline.net/Category:Scripting_Reference https://www.graalonline.net/Creation/Dev/GS1_To_GS2 https://graalonline.net/Creation/Dev/Script/Helpful_Posts https://forums.graalonline.com/forums/forumdisplay.php?f=8 https://pt.scribd.com/document/55585384/npcprogramming 

Também: 

- documentos existentes; 

- vídeos fornecidos; 

- APK; 

- DEX; 

- global-metadata.dat; 

- libil2cpp.so; 

- libunity.so; 

- demais libs; 

- assets; 

- engenharia histórica. 

============================================================ 

# 8. NÃO LIMITAR AO NODE HARNESS 

============================================================ 

O Node harness continua sendo útil para testes unitários. 

Mas agora precisa existir uma implementação equivalente dentro do APK. 

Arquitetura: 

Shared GS2 Core ↓ Node Test Adapter ↓ 

Android Runtime Adapter 

Ou arquitetura equivalente. 

Não duplicar o parser inteiro. 

Preferir núcleo compartilhado. 

============================================================ 

# 9. CLIENT BRIDGE REAL 

============================================================ 

Depois do runtime Android funcionar, começar a implementar: 

GS2 Runtime 

↓ 

STAR Labs ClientBridge ↓ 

Unity/native/client 

Funções sem bridge devem retornar erro explícito: 

UNAVAILABLE_CLIENT_API 

Não: 

success falso. ============================================================ 10. ENGINEERING ARCHITECTURE 

============================================================ 

# Atualizar: 

# engineering-architecture.md 

# Registrar obrigatoriamente: 

- arquitetura escolhida para runtime Android; 

- por que foi escolhida; 

- alternativas avaliadas; 

- POC; 

- fluxo WebView → Android → VM; 

- classes; 

- arquivos; 

- lifecycle; 

- bridge; 

- limitações; 

- próximos passos. 

Outro agente precisa conseguir clonar o projeto e entender imediatamente: 

COMO O GS2 EXECUTA NO APK. 

============================================================ 11. GS2 LANGUAGE COVERAGE 

============================================================ 

Começar a substituir o lexer/parser atual por uma implementação preparada para: 

- `//#CLIENTSIDE` - `public function` - `this` - `temp` - `params` - `nil` - globals - arrays - objects - indexing - member access - function calls - callbacks - events - loops - object creation - GUI syntax - operators reais encontrados na documentação - strings 

- comments 

- directives 

Não inventar semântica. 

Marcar: 

DOCUMENTED OBSERVED REVERSED INFERRED UNKNOWN 

============================================================ 

12. COMPLEX CODE TEST 

============================================================ 

Criar um arquivo: 

new-runtime/corpus/gs2-real-complex.gs2 

com código representativo da linguagem documentada. 

Ele deve incluir: 

- directive; 

- globals; 

- this; 

- temp; 

- functions; 

- public functions; 

- params; 

- arrays; 

- objects; 

- loops; 

- conditions; 

- events; 

- member access; 

- calls; 

- GUI structure quando parser suportar. 

Não usar milhares de linhas repetidas. 

============================================================ 13. EDITOR 

============================================================ 

Agora ligar o Executor à infraestrutura real. 

Run: 

Editor 

→ Android Bridge 

→ Runtime → result 

→ Console 

Problems: 

→ diagnostics reais. 

Autocomplete: 

→ LanguageService real. 

GS2 Functions: 

→ registry real. 

Save: → repository real. 

============================================================ 14. UI — NÃO IGNORAR 

============================================================ 

O V12 mostrou que a UI ainda precisa de acabamento. 

Nesta fase, NÃO fazer redesign completo antes do engine. 

Mas corrigir os problemas funcionais: 

- toolbar com ícones reais; 

- tabs reais; 

- Script Logs com chevron à esquerda; 

- Console/Output/Problems/Runtime/Call Stack como tabs reais; 

- status bar discreta; 

- editor sem limites artificiais; 

- syntax highlighting; 

- autocomplete. 

============================================================ 15. SETTINGS / NAVIGATION 

============================================================ 

Preservar as áreas existentes: 

Dashboard Executor 

Scripts Functions Settings 

Settings devem funcionar. 

Functions deve consumir o registry. 

Scripts deve consumir repository. 

============================================================ 16. TESTES APK 

============================================================ 

Criar teste E2E dentro do APK. 

Obrigatório: 

1. abrir Executor; 

2. criar script; 

3. digitar GS2; 

4. Run; 

5. código executa dentro do APK; 

6. resultado aparece no Console; 

7. error aparece em Problems; 

8. Stop funciona; 

9. Save funciona; 

10. múltiplas abas funcionam. 

============================================================ 17. BUILD GATES 

============================================================ 

Antes: 

XCore gate. 

Durante: 

tests. 

Depois: 

- APK > 0; 

- resources; 

- Manifest; 

- signature; 

- zipalign; 

- Graal; 

- STAR Labs; 

- XCore absent. 

============================================================ 18. NÃO CONCLUIR COM “UNAVAILABLE” 

============================================================ 

Nesta fase, NÃO aceitar a seguinte conclusão: 

“o engine não está hospedado no Android, portanto Run permanece unavailable.” 

Essa é precisamente a tarefa que deve ser resolvida. 

Se a arquitetura inicialmente escolhida não funcionar: 

documentar a falha → escolher outra → testar → continuar. 

Não encerrar apenas declarando a limitação. 

============================================================ 19. META 

============================================================ 

Ao final desta fase: 

GRAAL ✅ XCORE ❌ STAR LABS ✅ EXECUTOR ✅ RUNTIME DENTRO DO APK ✅ RUN REAL ✅ CONSOLE REAL ✅ ERRORS REAIS ✅ 

Depois disso podemos continuar aumentando a cobertura da linguagem GS2. 

============================================================ 20. DOCUMENTAÇÃO PERMANENTE 

============================================================ 

Ao final de cada checkpoint: 

atualizar: 

engineering-architecture.md 

Esse documento deve ser a memória técnica permanente do STAR Labs. 

Registrar também o que NÃO funcionou. 

Não esconder falhas. 

============================================================ 

21. REGRA FINAL 

============================================================ 

Não quero mais uma camada de UI em cima de uma infraestrutura que não executa. 

Quero a primeira cadeia REAL: 

GS2 SOURCE 

→ STAR LABS ENGINE 

→ ANDROID RUNTIME 

→ CLIENT BRIDGE 

→ GRAAL 

Sem XCore. 

Sem Node externo. 

Sem mock. 

Sem “unavailable” como solução. 

FAZER O RUN FUNCIONAR DENTRO DO APK. 


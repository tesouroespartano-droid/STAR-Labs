STAR LABS V10.1 

PRÓXIMA ETAPA: GS2 ENGINE REAL + EDITOR PROFISSIONAL 

IMPORTANTE: 

A Fase 1 da V10 já foi executada. 

# ESTADO CONFIRMADO: 

- Graal inicia. 

- XCore está removido do startup. 

- Isso foi confirmado em dispositivo físico. 

- A regression gate XCore existe e está passando. 

- GS2FunctionRegistry foi criado. 

- Matriz de compatibilidade foi criada. 

- 15 testes estão passando. 

- Build oficial está funcionando. 

- O APK está válido. 

NÃO VOLTE PARA A FASE 1. NÃO REFAÇA A AUDITORIA. NÃO DESATIVE O STAR LABS. 

NÃO MEXA NOVAMENTE NO CALL SITE QUE REMOVEU O XCORE. 

A partir de agora: ENGINE + EDITOR. 

============================================================ 1. REGRA DE PROTEÇÃO DO XCORE 

============================================================ 

A gate XCore existente permanece obrigatória. 

Toda nova alteração deve ser validada contra ela. 

# NUNCA: 

- restaurar ModMenu.StartMenu; 

- restaurar o startup path XCore; 

- usar ModMenu como bootstrap; 

- usar xCoreScripts; 

- usar XCore como executor; 

- restaurar a UI XCore; 

- recuperar o comportamento XCore como “atalho” de implementação. 

O STAR Labs deve ser independente. 

O XCore removido é uma condição protegida, não uma funcionalidade temporariamente desativada. 

============================================================ 

# 2. PROBLEMA REAL AGORA 

============================================================ 

A auditoria já confirmou: 

O runtime atual é um protótipo híbrido/mini-DSL. 

Portanto, NÃO continuar aumentando o número de comandos do parser atual. 

NÃO transformar: 

let call return hook panel 

em “suposto GS2 completo” apenas adicionando mais keywords. 

O núcleo precisa ser reconstruído para representar Graal Script 2 de verdade. 

GS2 = Graal Script 2 / New Engine GScript. 

Não é JavaScript. Não é uma DSL nossa. Não é uma linguagem inventada para o STAR Labs. 

============================================================ 

# 3. FONTES TÉCNICAS 

============================================================ 

Use estas referências para alimentar a engenharia: 

https://www.graalonline.net/index.php/Creation/Dev/GScript https://graalonline.net/index.php?title=Creation/Dev/GScript/GScript_for_Dummies https://graalonline.net/Creation/Dev/Script/Clientside_Functions https://graalonline.net/index.php/Creation/Dev/Script/Client https://graalonline.net/index.php/Creation/Dev/Script/Starting_Guide https://graalonline.net/Category:Scripting_Reference https://graalonline.net/Creation/Dev/Script/Helpful_Posts https://www.graalonline.net/Creation/Dev/GS1_To_GS2 https://forums.graalonline.com/forums/forumdisplay.php?f=8 https://pt.scribd.com/document/55585384/npcprogramming 

Os documentos já fornecidos anteriormente no projeto também são fontes obrigatórias. 

Os vídeos do YouTube fornecidos anteriormente devem ser utilizados quando estiverem acessíveis. 

Não inventar conteúdo que não esteja sustentado pela documentação, pelos materiais locais ou pela observação do cliente. 

Classificar evidência como: 

DOCUMENTED OBSERVED REVERSED INFERRED UNKNOWN 

============================================================ 

4. O EDITOR PRECISA SUPORTAR CÓDIGO COMPLEXO 

============================================================ 

Isto é requisito técnico, não apenas visual. 

O Editor do STAR Labs precisa conseguir: 

- abrir scripts grandes; 

- manter múltiplas abas; 

- editar código longo; 

- navegar entre funções; 

- preservar indentação; 

- fazer busca; 

- substituir; 

- lidar com blocos grandes; 

- lidar com comentários; 

- lidar com strings complexas; 

- lidar com arrays/objetos; 

- mostrar erros em linhas específicas; 

- analisar sintaxe incrementalmente; 

- autocomplete; 

- function signature; 

- diagnostics. 

Não construir um editor que só funciona bem para snippets pequenos. 

Crie fixtures de scripts reais e complexos derivados das documentações públicas e dos materiais do projeto. 

O editor precisa permanecer responsivo com eles. 

============================================================ 

5. TESTE O EDITOR COM CÓDIGO REALMENTE COMPLEXO 

============================================================ 

Crie um corpus de testes que exercite a linguagem em profundidade. 

Inclua: 

- funções longas; 

- funções aninhadas quando suportado; 

- muitas variáveis; 

- escopos; - condições; 

- loops; 

- arrays; 

- objetos; 

- callbacks; - eventos; - chamadas encadeadas; - acesso a membros; - múltiplas funções no mesmo arquivo; - múltiplos arquivos; 

- dependências entre scripts; 

- comentários; 

- strings; 

- expressões complexas; 

- chamadas de funções com vários parâmetros; - estruturas profundas. 

Não utilizar apenas um arquivo artificial de milhares de linhas repetidas. 

O objetivo é testar semântica e ergonomia. 

============================================================ 6. PARSER REAL 

============================================================ 

O parser atual deve evoluir substancialmente. 

Separar: 

Lexer Parser AST Semantic Analysis IR/Bytecode Runtime 

Não colocar toda a linguagem dentro de um único parser monolítico. 

Implementar incrementalmente e testar cada camada. 

============================================================ 

7. AST / IR 

============================================================ 

O AST precisa representar corretamente as construções da linguagem suportadas. 

Não utilizar árvores genéricas que percam informação necessária ao runtime. 

Avaliar uma IR intermediária quando isso facilitar: 

- otimização; 

- caching; 

- diagnostics; 

- debugging; 

- execução. 

A arquitetura deve permitir evolução posterior para bytecode sem reescrever todo o editor. 

============================================================ 

# 8. EXECUTION ENGINE 

============================================================ 

Construir runtime real: 

GS2 Source → Lexer → Parser → AST → Semantic Analysis → IR/Bytecode → GS2 VM → Built-ins → Events → Client Bridge 

A VM deve possuir: 

- execution context; 

- stack; 

- frames; 

- scopes; 

- function dispatch; 

- return; 

- events; 

- callbacks; 

- state; 

- errors; 

- diagnostics; 

- cancellation; 

- scheduling; 

- multi-script support. 

============================================================ 

# 9. GS2 FUNCTION REGISTRY 

============================================================ 

O registry criado na Fase 1 NÃO é o fim. 

Agora ele precisa virar a base do catálogo real. 

Para cada função: 

- name; 

- signature; 

- parameter types quando conhecidos; 

- return type quando conhecido; 

- client/server; 

- version; 

- aliases; 

- documentation; 

- evidence; 

- implementation status; 

- implementation handler. 

Os dados das páginas públicas devem alimentar o registry. 

A página Clientside Functions contém muitas funções e também variáveis com tipo e observações. 

Use essa estrutura. 

Não copiar cegamente texto para a interface. 

Transformar informação em metadata estruturada. 

============================================================ 

10. 2040 FUNCTIONS 

============================================================ 

A referência existente de aproximadamente 2040 funções pode ser usada como META DE COBERTURA. 

Não declarar 2040 sem validação. 

A UI precisa mostrar a contagem REAL do registry validado. 

O objetivo de longo prazo pode ser chegar às funções disponíveis do build-alvo. 

O sistema deve permitir: 

100 → 300 → 700 → 1000 → 1500 → 2000+ 

sem alteração estrutural da VM. 

============================================================ 11. FUNÇÕES NÃO PODEM SER “FAKE” 

============================================================ 

Proibido: 

function foo(...) { return null; } 

e marcar como fully implemented. 

Estados: 

METADATA_ONLY STUB PARTIAL IMPLEMENTED VALIDATED 

Somente VALIDATED deve aparecer como suportado integralmente. 

============================================================ 12. CLIENT BRIDGE 

============================================================ 

Criar uma camada própria: 

GS2 Runtime ↓ STAR Labs Client Bridge ↓ cliente Graal / Unity / native 

O parser não chama Android. 

A UI não chama native. 

O runtime não depende da UI. 

O bridge concentra integração. 

Qualquer chamada nativa deve ser validada no build atual. 

Offsets históricos somente como hipótese. 

============================================================ 

13. EDITOR LANGUAGE SERVICE 

============================================================ 

O editor deve consumir o mesmo parser/registry. 

Recursos progressivos: 

- syntax highlighting; 

- autocomplete; 

- function signatures; 

- diagnostics; 

- hover documentation; 

- search symbols; 

- outline; 

- function navigation; 

- go to line; 

- format; 

- code actions quando possível. 

Exemplo: 

digitar: 

getplayer... 

deve consultar o registry real. 

Não hardcodar uma lista paralela de sugestões. 

============================================================ 14. EXECUTOR 

============================================================ 

O botão Run deve executar pelo: 

Editor 

→ Runtime 

→ Client Bridge 

Não executar por um interpretador separado dentro da UI. 

O mesmo código editado deve ser o código enviado ao runtime real. 

Run: 

- compilar/parsing; 

- diagnostics; 

- executar; 

- produzir logs; 

- produzir errors; 

- preservar estado. 

Stop: 

- interromper execução conforme o modelo do runtime. 

- ============================================================ 15. EDITOR UI 

============================================================ 

A UI deve seguir esta composição: 

HEADER 

🔴 🟡 🟢  STAR Labs Executor 

ABAIXO: 

[ script.gs2 × ] [ player.gs2 × ] [ test.gs2 × ] [ + ] 

ABAIXO DAS ABAS: 

[ Run ] [ Stop ] [ Save ] [ Copy ] [ Format ] [ Search ] [ Delete ] 

CENTRO: 

EDITOR DE CÓDIGO LARGO 

COM: 

- line numbers; 

- current line; 

- cursor; 

- selection; 

- syntax highlighting; 

- diagnostics; 

- autocomplete; 

- scroll; 

- search; 

- replace. RODAPÉ DO EDITOR: 

Ln X, Col Y                         GS2 Functions: N ABAIXO: Script Logs    > 

Ao tocar/clicar: 

Console Output Problems Runtime Call Stack 

============================================================ 16. UI PROFISSIONAL ============================================================ 

O visual deve ser: 

- dark; - cinza; - inspirado em IDEs modernas; - profissional; - limpo; - consistente. 

Referência de ergonomia: VS Code e ferramentas profissionais. 

Não copiar identidade visual. 

STAR Labs deve possuir identidade própria. 

Toda a UI deve respeitar: 

- grid; 

- spacing; 

- alignment; 

- typography; 

- consistent borders; 

- consistent radius; 

- states; 

- focus; 

- hover; 

- disabled; 

- responsive layout. 

Nenhum elemento deve parecer improvisado. 

============================================================ 

# 17. RESPONSIVE LAYOUT 

============================================================ 

# MOBILE: 

O usuário deve conseguir redimensionar/regulamentar as áreas: 

- expandir editor; 

- recolher Script Logs; 

- aumentar/reduzir painéis; 

- navegar abas; 

- ajustar lateral; 

- usar toolbar adaptável. 

TABLET: 

editor amplo; painéis ajustáveis. 

DESKTOP: 

editor dominantemente largo; abas completas; painéis redimensionáveis. 

Uma arquitetura de layout comum. 

============================================================ 18. PERFORMANCE DO EDITOR 

============================================================ 

O editor deve suportar arquivos grandes sem travamento desnecessário. 

Medir: 

- parse latency; 

- syntax highlight latency; 

- autocomplete latency; 

- memory; 

- render/update frequency. 

Não fazer parsing completo do documento em cada tecla se isso inviabilizar performance. 

Utilizar parsing incremental/cache quando necessário. 

============================================================ 

# 19. PERFORMANCE DO RUNTIME 

============================================================ 

Medir: 

- parse time; 

- compile time; 

- execution time; 

- registry lookup; 

- function dispatch; 

- bridge call; 

- memory; 

- allocations. 

Não bloquear a UI. 

Não bloquear indefinidamente o cliente. 

Projetar scheduling/budget/yield quando necessário. 

============================================================ 

20. DEBUGGING 

============================================================ 

O runtime deve fornecer: 

- script name; 

- line; 

- column; 

- error type; 

- message; 

- call stack; 

- function name; 

- runtime state quando possível. 

O Editor deve usar essas informações. 

# Erro: 

script.gs2:42:17 Unknown function 'foo' 

deve aparecer no Problems e Console. 

============================================================ 21. MULTI-FILE 

============================================================ 

# Suportar: 

script A script B script C 

abertos simultaneamente. 

Preparar arquitetura para referências entre scripts quando a semântica do GS2 exigir. 

Cada documento deve ter estado próprio. 

============================================================ 

# 22. SCRIPT REPOSITORY 

============================================================ 

Separar armazenamento: 

ScriptRepository 

Responsável por: 

- create; 

- open; - save; 

- rename; - delete; - list; - dirty state; - metadata. 

A UI não implementa isso diretamente. 

============================================================ 

# 23. SOURCE-DRIVEN DEVELOPMENT 

============================================================ 

Para cada recurso implementado: 

1. origem; 

2. comportamento esperado; 

3. teste; 

4. implementação; 

5. status. 

Não inventar semântica. 

Quando a documentação não for suficiente: 

analisar cliente atual. 

Quando a análise também não for suficiente: 

marcar UNKNOWN. 

============================================================ 24. NÃO FAZER AGORA 

============================================================ 

Não gastar esta etapa com: 

- marketplace; 

- pagamento; 

- sistema social; 

- dezenas de páginas secundárias; 

- animações inúteis; 

- redesign fora do Executor; 

- recursos cosméticos. 

A prioridade é: 

GS2 

+ 

Runtime + Bridge + Editor. 

============================================================ 25. ORDEM DE EXECUÇÃO 

============================================================ 

1. manter XCore gate; 

2. analisar runtime atual; 

3. construir catálogo GS2; 

4. melhorar lexer; 

5. parser; 

6. AST; 

7. semantic layer; 

8. runtime; 

9. client bridge; 

10. language service; 

11. editor; 

12. integração; 

13. testes complexos; 

14. build; 

15. device test. 

Não pular o motor. 

============================================================ 26. CRITÉRIO DE QUALIDADE 

============================================================ 

O resultado NÃO deve ser: 

“um menu que aceita alguns comandos GS2”. 

O resultado deve caminhar para: 

“uma ferramenta profissional capaz de editar, analisar e executar GS2 dentro do cliente Graal”. 

A diferença é fundamental. 

============================================================ 27. CRITÉRIO DE REGRESSÃO 

============================================================ 

Antes de cada build: 

XCORE 

- startup path ausente; 

- ModMenu.StartMenu não utilizado; 

- nenhum bootstrap XCore. 

GRAAL 

- launcher correto; 

- Unity funciona; 

- assets preservados; 

- native libs preservadas. 

STAR LABS 

- registry; 

- parser; 

- runtime; 

- editor; 

- bootstrap; 

- bridge. 

APK 

- tamanho > 0; 

- ZIP válido; 

- Manifest; 

- resources.arsc; 

- zipalign; 

- signature. 

============================================================ 

# 28. RESULTADO ESPERADO 

============================================================ 

Ao final desta etapa: 

GRAAL ✅ funcionando 

XCORE ❌ ausente 

STAR LABS 

✅ inicializa de forma própria 

✅ possui runtime GS2 em desenvolvimento real 

✅ possui registry baseado em evidência 

✅ editor profissional 

✅ suporta scripts complexos no editor 

✅ diagnostics 

✅ autocomplete 

✅ múltiplas abas 

✅ logs 

✅ console 

✅ layout redimensionável 

Não declarar o engine “completo”. 

Declarar exatamente a cobertura comprovada. 

============================================================ 

29. PRIMEIRA ENTREGA DESTA ETAPA 

============================================================ 

Antes de fazer todo o trabalho: 

produza um pequeno relatório técnico: 

- arquitetura atual; 

- arquivos que serão substituídos; 

- arquivos preservados; 

- cobertura GS2 atual; 

- cobertura alvo; 

- design do registry; 

- design do parser; 

- design da VM; 

- design do bridge; 

- design do editor. 

Depois implemente em incrementos testáveis. 

Não fazer uma grande reescrita sem checkpoints. 

============================================================ 30. REGRA FINAL 

============================================================ 

O XCore já foi derrotado. 

Não deixe nenhum trabalho novo reintroduzi-lo. 

Agora o problema é outro: 

CONSTRUIR O STAR LABS. 

E a fundação para isso é: 

GS2 REAL 

+ 

VM REAL + 

BRIDGE REAL + 

EDITOR REAL. 

Não uma demo. Não uma mini-DSL. Não um contador fictício de funções. 

Construa a base para suportar código GS2 complexo de verdade. 


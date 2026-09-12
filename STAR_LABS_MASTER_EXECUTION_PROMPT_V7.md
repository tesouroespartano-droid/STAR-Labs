# STAR Labs — MASTER EXECUTION PROMPT V7
## Objetivo: transformar o GraalOnline em um APK modificado com STAR Labs realmente integrado

Você já trabalhou neste repositório em versões anteriores e já possui análises, código, scripts de build, relatórios e evidências. NÃO recomece o projeto do zero e NÃO fique repetindo arquiteturas antigas. Use o estado atual do repositório como ponto de partida, preserve o que está correto e corrija o que está incompleto.

Este documento é a diretiva atual e substitui decisões contraditórias de prompts anteriores.

---

# 0. OBJETIVO INEGOCIÁVEL

O produto final é:

    GRAALONLINE MODIFICADO
    =
    GRAALONLINE + STAR LABS

É UM ÚNICO APK.

O GraalOnline continua sendo o aplicativo/jogo. O STAR Labs é um subsistema incorporado dentro desse APK e inicializado dentro do processo real do Graal/Unity.

NÃO criar:
- um aplicativo STAR Labs separado;
- um launcher STAR Labs que depois abre o Graal;
- uma Activity intermediária que apenas mostra HTML e chama Unity;
- uma demonstração visual chamada de runtime;
- um APK “válido” apenas porque foi assinado;
- uma implementação parcial declarada como completa.

O resultado esperado é um APK que eu consiga instalar no Android, abrir e usar como Graal, com o STAR Labs executando junto.

---

# 1. CONTEXTO REAL DOS ARQUIVOS

O arquivo disponível:

    GraalOnlineXCoreExecuter(2).zip

contém um APK que representa um GraalOnline que já recebeu modificações/camada do XCore para fornecer executor.

Portanto, NÃO trate esse APK automaticamente como “Graal limpo”.

O raciocínio correto é:

    GraalOnline original
            +
        camada XCore
            =
    APK que possuímos

O objetivo é chegar em:

    GraalOnline original
            +
        STAR Labs
            =
    APK final

Como o APK oficial/base original não está atualmente disponível no workspace, isso deve ser registrado explicitamente. NÃO invente um baseline limpo. Quando houver um APK oficial do Graal disponível no ambiente, ele deve ser usado como referência canônica.

Enquanto isso, use o APK XCore como evidência, fonte de forensics e referência de integração, e faça uma separação conservadora entre:
- conteúdo original;
- conteúdo adicionado pelo XCore;
- conteúdo original modificado pelo XCore;
- conteúdo compartilhado;
- conteúdo novo do STAR Labs.

---

# 2. ESTADO ATUAL JÁ ALCANÇADO

A implementação atual já corrigiu um erro conceitual importante:
- o `StarLabsMainActivity` launcher foi removido;
- `com.unity3d.player.UnityPlayerActivity` voltou a ser a entrada real;
- STAR Labs passou a ser inicializado por `ContentProvider` dentro do processo;
- `libunity.so` e `libil2cpp.so` foram preservados;
- o package do Graal foi preservado;
- arquivos STAR Labs já aparecem no APK;
- existe um pipeline de rebuild/re-sign;
- existem relatórios de forensics;
- testes de empacotamento, ZIP e assinatura já foram executados;
- a última execução produziu um APK de aproximadamente 88 MB no workspace.

Isso é progresso real e deve ser PRESERVADO.

Mas isso ainda NÃO significa que o produto esteja pronto.

---

# 3. PROBLEMA ATUAL DE INSTALAÇÃO — PRIORIDADE ZERO

O APK que foi entregue para mim anteriormente chegou com 0 bytes e não pôde ser instalado.

Na execução atual, o workspace relata um APK de ~88,06 MB e no meu dispositivo o ZArchiver mostra aproximadamente 83,98 MB.

Eu já DESINSTALEI o aplicativo anterior antes de tentar instalar o novo APK.

Portanto:

    NÃO ASSUMA QUE O ERRO É CONFLITO COM APP ANTIGO.

O teste foi feito com instalação limpa do aplicativo anterior desinstalado.

Quando tento instalar o APK atual, o Android mostra:

    "O app não foi instalado"

O fato de:
    unzip -t
    aapt/aapt2
    apksigner verify
passarem NÃO é suficiente.

A prioridade absoluta agora é descobrir por que o Package Installer rejeita o APK e corrigir a causa.

---

# 4. GARANTIA DE APK INSTALÁVEL

O build deve ser tratado como falho até que TODAS as verificações abaixo sejam concluídas.

## 4.1 Integridade física

Antes de qualquer distribuição:
    test -s APK
    stat APK
    sha256sum APK
    unzip -t APK

Registrar:
- tamanho em bytes;
- tamanho em MiB;
- SHA-256;
- timestamp;
- caminho exato;
- sucesso/falha.

O build DEVE parar se o arquivo tiver zero bytes ou estiver incompleto.

## 4.2 Estrutura APK

Validar:
- `AndroidManifest.xml`;
- package;
- versionCode;
- versionName;
- minSdk;
- targetSdk;
- launcher;
- activities;
- providers;
- services;
- receivers;
- permissões;
- DEX;
- recursos;
- assets;
- bibliotecas nativas;
- ABI.

## 4.3 Assinatura

Validar:
- APK Signature Scheme v1/v2/v3/v4 quando aplicável;
- certificado;
- SHA-256 do certificado;
- consistência depois de qualquer alteração.

Registrar claramente:
    assinatura do APK base
    assinatura do APK final

A mudança esperada de certificado por re-sign deve ser documentada.

## 4.4 Diagnóstico real de instalação

Se houver `adb`, use obrigatoriamente o PackageManager e capture o erro exato.

Executar algo equivalente a:
    adb install -r APK
e, se necessário:
    adb install APK

Capturar stderr/stdout.

Se falhar, descobrir a causa real, como:
- `INSTALL_FAILED_*`;
- ABI incompatível;
- SDK incompatível;
- parser/manifest;
- assinatura;
- package;
- biblioteca nativa;
- componente inválido;
- arquivo APK malformado;
- qualquer outra causa reportada pelo sistema.

NÃO aceite "O app não foi instalado" como diagnóstico.

Se o dispositivo não estiver acessível, faça TODOS os testes estáticos possíveis e diga claramente:
    "instalação em dispositivo não comprovada"

Nunca transforme isso em "APK instalável garantido".

---

# 5. CHECKSUM E TRANSFERÊNCIA

Também verifique o próprio artefato entregue.

O APK no workspace e o APK que será apresentado como artefato precisam ser verificáveis.

Gerar:
    dist/apk/STAR-Labs-Graal-<versão>.apk
    dist/apk/STAR-Labs-Graal-<versão>.apk.sha256

E um manifesto contendo:
- filename;
- sizeBytes;
- sha256;
- packageName;
- versionCode;
- versionName;
- certificate digest;
- build timestamp;
- status das validações.

Nunca declarar que o APK foi entregue corretamente sem confirmar que o arquivo final existe e não está vazio.

---

# 6. NÃO CONFUNDA EMPACOTAMENTO COM INTEGRAÇÃO

O estado atual possui coisas como:
    classes4.dex
    StarLabsBootstrapProvider
    StarLabsLifecycleCallbacks
    star_labs.html

Isso é evidência de que uma camada Android foi incorporada.

Mas não prova que o runtime STAR Labs esteja funcional.

Não declarar "runtime completo" com base nesses arquivos.

Precisamos provar a cadeia:

    Android startup
        ↓
    Unity/Graal
        ↓
    STAR Labs bootstrap
        ↓
    STAR Labs runtime
        ↓
    GS2 execution engine
        ↓
    Graal bridge
        ↓
    jogo

---

# 7. STAR LABS RUNTIME — EXIGÊNCIA DE COMPLETUDE

Quero o runtime completo, não uma coleção de mocks.

A arquitetura deverá suportar o máximo possível da superfície GS2 descrita nos guias fornecidos no projeto.

A implementação deve possuir pelo menos:
    lexer
    parser
    AST
    semantic analysis
    runtime/IR
    bytecode quando aplicável
    VM/executor
    values
    variables
    arrays
    objects
    functions
    scopes
    control flow
    events
    timers
    strings
    numerics
    operators
    error handling
    console/logging
    script lifecycle

Depois:
    Graal bridge
    native/client bridge
    game-facing APIs
    event dispatch
    panel APIs
    hook/tracing APIs onde comprovadamente viáveis

Não criar artificialmente uma linguagem "parecida com GS2" com meia dúzia de comandos.

---

# 8. TAMANHO DO SCRIPT

NÃO impor uma limitação artificial de 1200 linhas.

O executor deve trabalhar com scripts muito maiores, limitados somente por memória, runtime e limites técnicos reais.

Evite:
- parser que assume poucos tokens;
- arrays fixos pequenos;
- buffers arbitrariamente reduzidos;
- número artificial de linhas;
- limites escondidos em editor;
- truncamento de source.

Se existir algum limite técnico real, documente a causa.

---

# 9. COMPATIBILIDADE GS2

Os guias fornecidos no projeto são a especificação primária para a superfície compatível.

Use os recursos documentados neles como corpus de teste.

Cobrir, conforme aplicabilidade e evidência:
- variáveis;
- condicionais;
- loops;
- funções;
- retorno;
- arrays;
- tokenize;
- strings;
- GUI;
- imagens;
- eventos;
- triggers;
- timers;
- drawing;
- camera;
- cores;
- áudio;
- partículas;
- NPC APIs;
- pathfinding;
- scheduleEvent;
- request/network APIs;
- configuração;
- console/debug;
- key handling;
- ESP/rendering relacionados ao runtime;
- hooks;
- tracing;
- panels.

Não invente semântica incompatível somente para fazer os testes passarem.

---

# 10. HOOKS E COMPONENTES ESPECIAIS

Os alvos históricos conhecidos incluem APIs como:
    hook_func
    hookfunction
    getcalltrace
    stopcalltrace

e funções relacionadas a panels.

Os offsets e endereços históricos NÃO podem ser assumidos como válidos no build atual.

Eles são evidências históricas e hipóteses para investigação.

A implementação atual precisa:
- redescobrir endereços/símbolos;
- validar estruturas;
- verificar ABI;
- confirmar offsets no binário atual;
- registrar nível de confiança.

Nunca colocar endereços antigos diretamente como se fossem fatos.

---

# 11. PAINÉIS E UI

STAR Labs deve conseguir fornecer UI real dentro do aplicativo.

O objetivo é:
    script
      ↓
    STAR Labs API
      ↓
    panel
      ↓
    HTML/CSS/JS
      ↓
    interface sobre o jogo

O HTML de demonstração NÃO conta como implementação final.

Precisamos de uma camada de painel funcional com:
- criação;
- destruição;
- mostrar;
- esconder;
- refresh;
- HTML;
- CSS;
- JS;
- eventos;
- comunicação script ↔ painel;
- comunicação painel ↔ runtime;
- lifecycle.

As APIs de panel documentadas nos materiais devem ser consideradas targets de compatibilidade.

---

# 12. BRIDGE COM O GRAAL

O ponto mais importante da engenharia é o bridge real.

O STAR Labs precisa sair de:
    Java/HTML isolado

e chegar em:
    STAR Labs runtime
          ↓
    bridge real
          ↓
    Graal/Unity/native

A UI não pode ser somente um navegador desenhado sobre o jogo sem capacidade de executar ações reais.

---

# 13. XCORE — NÃO APAGAR CEGAMENTE

Os relatórios atuais já registraram evidências importantes:
- `com.player.render.ModMenu`
- `System.loadLibrary("service")`
- `libservice.so`
- `xCoreScripts`
- `http://menu.holy/`
- `WebMessageChannel`
- JNI bridge
- caminho de inicialização do XCore

Use:
    xcore-residue.md
    xcore-active-path.md

como evidência.

A tarefa é identificar a cadeia real:
    ModMenu
      ↓
    libservice
      ↓
    JNI
      ↓
    native init
      ↓
    WebView/bridge
      ↓
    script runtime
      ↓
    XCore behavior

Depois classificar:
    ORIGINAL
    XCORE
    MODIFIED BY XCORE
    SHARED
    STAR LABS

Somente então desativar o caminho ativo do XCore.

Não remover `libservice.so` simplesmente porque o nome parece XCore.
Não remover uma classe simplesmente porque o package parece customizado.
Não destruir dependências do Graal.

---

# 14. CRITÉRIO PARA XCORE DESATIVADO

Só marque:
    xCoreActivePathDisabled = true

quando houver evidência verificável de que o caminho ativo não inicia.

Exemplos de evidência:
- código de startup alterado;
- referência removida/redirecionada;
- JNI initialization não é mais acionada;
- WebView XCore não inicia;
- login/key screen não aparece;
- `xCoreScripts` não é criado pelo caminho antigo;
- comportamento antigo não acontece;
- ou uma substituição funcional comprovadamente assume o ponto de entrada.

Strings residuais podem continuar no APK.

Residue != active path.

---

# 15. GRAAL PRECISA CONTINUAR FUNCIONANDO

O jogo não pode ser sacrificado para integrar STAR Labs.

Preservar o necessário para:
- Unity;
- IL2CPP;
- Graal;
- assets;
- metadata;
- libs;
- networking;
- input;
- ciclo de vida;
- rendering;
- atividades originais.

Qualquer arquivo removido precisa ter justificativa e análise de dependências.

---

# 16. TESTE DE STARTUP REAL

A aceitação do APK deve ser:
    1. instalar
    2. abrir
    3. Graal inicia
    4. não aparece o startup/login do XCore
    5. STAR Labs inicializa
    6. STAR Labs está dentro do mesmo aplicativo/processo
    7. editor/executor fica acessível
    8. script GS2 real é carregado
    9. script executa
   10. painel real aparece
   11. eventos funcionam
   12. logs/erros funcionam
   13. Graal continua jogável

Não declare estes itens como PASS sem evidência.

---

# 17. TESTE DO RUNTIME

Crie um corpus de testes dentro do repositório.

No mínimo:
    hello.gs2
    variables.gs2
    control-flow.gs2
    functions.gs2
    arrays.gs2
    strings.gs2
    events.gs2
    timers.gs2
    panels.gs2
    error-handling.gs2
    large-script.gs2

O `large-script.gs2` deve ser deliberadamente grande o suficiente para demonstrar que não existe o antigo limite artificial.

Os testes precisam verificar resultado, não somente parsing.

---

# 18. SE ALGO FALHAR

Esta regra é OBRIGATÓRIA:

> Se houver erro em qualquer etapa, NÃO prossiga fingindo que está tudo certo. Pare naquela etapa, investigue a causa, corrija imediatamente e execute novamente o teste que falhou.

Exemplos:
    build falhou
        → corrigir
        → rebuild

    APK inválido
        → corrigir empacotamento
        → reconstruir
        → validar novamente

    instalação falhou
        → capturar INSTALL_FAILED_*
        → corrigir
        → reinstalar

    Graal não inicia
        → logcat/forensics
        → corrigir
        → testar novamente

    STAR Labs não inicia
        → corrigir bootstrap/bridge
        → testar novamente

    GS2 não executa
        → corrigir parser/runtime/bridge
        → executar corpus novamente

    panel não funciona
        → corrigir bridge/UI
        → testar novamente

Não acumule uma lista de problemas e continue para outras partes sem tratar os bloqueadores.

---

# 19. BANCO DE DADOS / SERVIDOR

Não deixe servidor/banco bloquear a primeira versão funcional do cliente.

Primeiro:
    GRAAL
      +
    STAR LABS
      +
    RUNTIME
      +
    GS2
      +
    UI
      +
    BRIDGE

funcionando localmente.

Depois integrar:
    autenticação
    licença
    conta
    sincronização
    scripts
    admin
    telemetria necessária

Quando for implementar backend, mantenha a arquitetura preparada para um servidor HTTP/WebSocket e banco apropriado.

Não transformar backend em desculpa para deixar o cliente incompleto.

---

# 20. BUILD ÚNICO

Mantenha um comando de build principal:
    npm run build-apk

Esse comando deve:
1. validar pré-requisitos;
2. localizar o APK base/evidência;
3. extrair;
4. aplicar modificações;
5. compilar componentes;
6. gerar DEX;
7. reconstruir APK;
8. assinar;
9. validar;
10. calcular SHA-256;
11. gerar manifest;
12. falhar imediatamente se qualquer verificação falhar.

Nunca gerar um APK defeituoso e ainda assim sair com código 0.

---

# 21. VERIFICAÇÃO DO ARTEFATO FINAL

O pipeline só pode terminar com sucesso se:
    APK existe
    AND tamanho > 0
    AND ZIP válido
    AND Manifest válido
    AND DEX válido
    AND libs presentes
    AND package correto
    AND launcher correto
    AND assinatura válida
    AND SHA-256 gerado

Se `adb` estiver disponível:
    AND instalação real passou

Se `adb` não estiver disponível:
    NÃO fingir que instalação passou.

---

# 22. DOCUMENTAÇÃO FINAL

Atualizar os relatórios existentes sem criar uma coleção confusa de documentos duplicados.

Manter uma fonte de verdade clara.

Registrar:
- o que foi alterado;
- o que foi preservado;
- o que foi removido/desativado;
- como STAR Labs inicia;
- onde o runtime está;
- como o bridge funciona;
- como XCore foi desativado;
- quais partes continuam não comprovadas;
- tamanho final;
- SHA-256;
- package;
- assinatura;
- resultados dos testes.

Não alterar o status para "final" somente para parecer concluído.

---

# 23. GIT

Ao terminar o trabalho desta execução:
    git status
    git diff
    git add
    git commit
    git push

Faça push do repositório inteiro para o remote/branch já configurado.

Não inclua segredos, tokens, chaves privadas ou credenciais.

No relatório final informar:
- branch;
- commit;
- push realizado;
- principais alterações;
- APK final;
- tamanho;
- SHA-256.

---

# 24. CONDIÇÃO FINAL DE SUCESSO

Só considere o objetivo cumprido quando existirem evidências para:

## APK
- não está vazio;
- é íntegro;
- é assinado;
- instala;
- abre.

## GRAAL
- Graal continua sendo o jogo;
- Unity funciona;
- package/launcher coerentes;
- jogo alcança o runtime real.

## XCORE
- caminho ativo identificado;
- caminho ativo desativado/substituído;
- nenhum componente foi removido de forma cega.

## STAR LABS
- inicialização real;
- runtime real;
- VM/executor real;
- GS2 real;
- scripts maiores funcionam;
- eventos/timers funcionam;
- bridge funciona;
- panels funcionam;
- erros/logs funcionam.

## INTEGRAÇÃO
- tudo está no mesmo APK;
- STAR Labs está integrado ao processo do aplicativo;
- não é launcher;
- não é mock.

## ENTREGA
- APK final verificável;
- SHA-256;
- documentação atualizada;
- git push realizado.

---

# 25. REGRA MAIS IMPORTANTE

Não confunda:

    "consegui gerar um APK"

com:

    "consegui modificar o Graal e integrar STAR Labs".

O objetivo real é o segundo.

O APK precisa ser tratado como produto executável, e qualquer erro encontrado precisa ser corrigido imediatamente antes de prosseguir.

Continue do estado atual do repositório. Preserve o que já foi corretamente implementado. Não reintroduza `StarLabsMainActivity` launcher. Não recrie prompts/arquiteturas anteriores. Não invente sucesso.

**Transforme o GraalOnline em um APK modificado que contenha o STAR Labs funcional de verdade.**

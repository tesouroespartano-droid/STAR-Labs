STAR LABS V11.1 — BOOTSTRAP REAL DO EXECUTOR DENTRO DA UNITY 

# ESTADO CONFIRMADO NO DEVICE: 

- Graal inicia normalmente. 

- XCore NÃO aparece. 

- A remoção de `UnityPlayerActivity -> ModMenu.StartMenu()` foi confirmada. 

- Portanto, o XCore foi removido do startup com sucesso. 

- Porém, o STAR Labs também não aparece. 

- O APK atual inicia como praticamente o Graal original. 

O problema desta etapa é MUITO ESPECÍFICO: 

O STAR Labs precisa ter um bootstrap próprio dentro do processo do Graal para que o Executor realmente apareça. 

NÃO reative o XCore. 

NÃO restaure `ModMenu.StartMenu()`. 

NÃO reutilize ModMenu como classe do STAR Labs. 

NÃO reative xCoreScripts. 

NÃO reative o WebView/XCore bootstrap. 

============================================================ 1. O QUE PRECISAMOS AGORA 

============================================================ 

Criar um: 

# STAR LABS BOOTSTRAP PRÓPRIO 

que seja inicializado pelo ciclo de vida da Unity/Graal. 

Arquitetura desejada: 

UnityPlayerActivity 

↓ STAR Labs Bootstrap 

↓ STAR Labs Runtime/UI 

↓ 

STAR Labs Executor 

Tudo dentro do MESMO APK e do MESMO PROCESSO. 

O Graal continua sendo o aplicativo principal. 

Não criar segundo launcher. 

Não criar segundo aplicativo. 

Não criar Activity separada como aplicativo principal. 

============================================================ 2. USE A ESTRATÉGIA ARQUITETURAL DO XCORE COMO REFERÊNCIA 

============================================================ 

A engenharia anterior mostrou que o XCore conseguia entrar no app através do ciclo de vida da Unity e adicionar sua UI à Activity. 

Use esse fato como REFERÊNCIA ARQUITETURAL. 

Queremos descobrir qual é o ponto mais seguro do ciclo de vida da `UnityPlayerActivity` para inicializar o STAR Labs sem interferir na inicialização do Graal. 

Exemplo conceitual: 

UnityPlayerActivity.onCreate() 

↓ super.onCreate(...) ↓ Unity initialization ↓ STAR Labs bootstrap ↓ STAR Labs UI 

ou outro ponto mais adequado caso a investigação mostre que a Unity precisa estar completamente criada antes. 

NÃO copie código do XCore. 

Implemente um mecanismo próprio. 

============================================================ 

3. INVESTIGAR PRIMEIRO 

============================================================ 

Antes de alterar o APK: 

analise a implementação atual de: 

- UnityPlayerActivity 

- UnityPlayer 

- Android Activity lifecycle 

- scripts de integração já existentes 

- `StarLabsBootstrapProvider` 

- `StarLabsLifecycleCallbacks` 

- qualquer código Java/Kotlin/HTML existente do STAR Labs 

Descubra por que o STAR Labs atual não aparece. 

Não suponha. 

Identifique exatamente: 

- qual componente deveria iniciar; 

- quem chama esse componente; 

- em que momento; 

- por que atualmente não é chamado. 

============================================================ 

4. STARLABSBOOTSTRAP 

============================================================ 

Criar um bootstrap funcional. 

Responsabilidades: 

- iniciar uma única vez; 

- detectar a Activity correta; 

- preservar o lifecycle da Unity; 

- criar a UI do STAR Labs; 

- registrar lifecycle quando necessário; 

- permitir destruir/recriar corretamente; 

- não iniciar o XCore; 

- não depender do XCore. 

Evitar inicialização duplicada. 

Adicionar logs claros: 

[STARLABS] bootstrap start [STARLABS] activity detected [STARLABS] ui initialized [STARLABS] executor ready 

============================================================ 5. NÃO REUSAR O XCORE 

============================================================ 

É permitido estudar a arquitetura do XCore para entender: 

- onde ele entrava no ciclo de vida; 

- como obtinha a Activity; 

- como adicionava sua UI; 

- como comunicava UI/runtime. 

Mas o STAR Labs deve possuir: 

- suas próprias classes; 

- seus próprios IDs; 

- seu próprio bootstrap; 

- seu próprio UI state; 

- seu próprio runtime; 

- seu próprio bridge. 

Não depender de: 

`ModMenu` 

como infraestrutura. 

============================================================ 

6. UI DO EXECUTOR 

============================================================ 

Depois que o bootstrap estiver funcionando, o primeiro objetivo visual é fazer o: 

STAR Labs Executor 

aparecer de verdade. 

NÃO precisa implementar toda a IDE nesta etapa. 

# Primeiro: 

- abrir Executor; 

- renderizar header; 

- renderizar abas; 

- renderizar editor; 

- renderizar toolbar; 

- renderizar Script Logs; 

- permitir abrir/recolher a área de logs. 

Layout: 

- 🔴 🟡 🟢  STAR Labs Executor 

[ script.gs2 × ] [ + ] 

[ Run ] [ Stop ] [ Save ] [ Copy ] [ Format ] [ Search ] [ Delete ] 

EDITOR 

Ln X, Col Y                         GS2 Functions: N 

Script Logs > 

Ao tocar: 

Console Output Problems Runtime Call Stack 

============================================================ 

7. WEBVIEW 

============================================================ 

Caso a implementação do Executor utilize WebView: 

# crie a WebView DO STAR LABS. 

Não reutilize: 

- `menu.holy`; 

- HTML do XCore; 

- bridge XCore; 

- WebMessageChannel do XCore; 

- objetos JS do XCore. 

Use uma origem própria/local. 

Exemplo arquitetural: 

Android Activity 

- ↓ STAR Labs WebView 

- ↓ STAR Labs JS bridge 

- ↓ STAR Labs runtime 

A UI deve poder existir independentemente do XCore. 

============================================================ 

# 8. POSIÇÃO DA UI 

============================================================ 

A UI precisa estar efetivamente dentro da Unity Activity. 

Pode ser: 

Activity content hierarchy ↓ Unity view + 

STAR Labs overlay/container 

desde que: 

- Graal continue funcional; 

- touch continue funcionando; 

- STAR Labs receba os próprios eventos; 

- não haja dependência do XCore. 

Não bloquear a Unity desnecessariamente. 

============================================================ 9. RUNTIME NÃO É UI 

============================================================ 

Mesmo com o Executor aparecendo: 

não colocar o interpretador GS2 dentro do HTML. 

Arquitetura: 

Editor 

↓ 

Language Service ↓ 

Parser 

↓ 

Runtime 

↓ ClientBridge 

A WebView é apenas interface. 

============================================================ 10. BUILD REGRESSION 

============================================================ 

Antes do build: 

XCORE GATE ✅ 

Depois do build: 

- `ModMenu.StartMenu` continua ausente do startup; 

- XCore gate passa; 

- STAR Labs classes presentes; 

- STAR Labs bootstrap presente. 

# APK: 

- > 0 bytes; 

- válido; 

- zipalign; 

- assinatura; 

- Manifest; 

- libs; 

- assets. 

============================================================ 

# 11. DEVICE TEST 

============================================================ 

O teste desta fase é obrigatório: 

1. instalar APK; 

2. iniciar Graal; 

3. confirmar: XCore = NÃO APARECE 

4. confirmar: STAR Labs = APARECE 

5. abrir Executor; 

6. confirmar que UI está dentro da Activity do Graal. 

Se: 

Graal ✅ XCore ❌ STAR Labs ❌ 

não declarar sucesso. 

Investigar o bootstrap. 

============================================================ 12. IMPORTANTE 

============================================================ 

NÃO gastar esta etapa implementando milhares de funções GS2. 

NÃO fazer marketplace. 

NÃO fazer backend. 

NÃO reescrever a VM inteira agora. 

Primeiro precisamos de: 

GRAAL 

+ 

STAR LABS BOOTSTRAP + EXECUTOR VISÍVEL 

com: 

XCORE = 0 dependência. 

============================================================ 13. CRITÉRIO DE CONCLUSÃO 

============================================================ 

Só considere esta etapa concluída quando um APK instalado em device apresentar: 

Graal funcionando + STAR Labs Executor visível + XCore ausente. 

O ponto mais importante: 

O STAR Labs precisa aprender a entrar no ciclo de vida da Unity por conta própria. 

Use a engenharia do XCore como referência de integração, mas não como dependência. 


# Runtime independente

Este diretório é uma implementação nova para validar a arquitetura proposta no briefing. Ele não interpreta o protocolo observado do APK e não reutiliza código, binários, payloads, chaves ou servidores da evidência.

O harness inclui:

- parser mínimo documentado para `let/set`, `call`, `return`, `hook` e `panel`;
- variáveis e dispatch por `MockBridge`;
- hooks removíveis, tracing e ciclo de vida de panels;
- testes com objetos/funções mockados.

O parser é deliberadamente pequeno. Antes de transformá-lo em uma linguagem de produção, a gramática GS2 independente deve ser especificada e testada separadamente.
# Arquitetura de licenciamento

- **UNKNOWN** — A amostra estática analisada não fornece um endpoint de licença verificável nem um protocolo de sessão atribuível ao XCore.
- **UNKNOWN** — Não foi possível determinar planos, flags, expiração ou estado de autorização a partir de `ModMenu.java` e das strings nativas disponíveis.
- **VERIFIED** — Nenhuma tentativa de remover, forjar, enfraquecer ou contornar proteção de terceiros foi feita.
- **PLAUSIBLE** — Se a autorização existir, ela pode ser aplicada dentro da camada nativa antes de aceitar comandos, mas essa hipótese não deve ser tratada como fato.

## Projeto independente

O novo runtime usa uma política local explícita (`LicenseGate`) apenas para o harness, sem relação com chaves ou servidores da evidência. Um produto real deverá definir servidor, assinatura, expiração e flags próprios antes de integrar essa política.
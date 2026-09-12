# Fronteira Quattro / NativeScript

- **VERIFIED** — O APK contém metadata/strings com `TGraalVar`, `TGraalClientVar`, `TActionScriptVar`, `TriggerGet`, `TriggerSet` e `TriggerFunction`, conforme inventário do briefing e busca de strings.
- **STRONG** — Esses nomes são compatíveis com um modelo de variáveis, triggers e funções do cliente/NativeScript.
- **UNKNOWN** — Não há referência cruzada suficiente para separar, tipo por tipo, o que é exclusivamente cliente original e o que é usado pelo executor.
- **UNKNOWN** — Não foi demonstrado que `player.chat`, `hook_func` ou `getcalltrace` chamam qualquer tipo Quattro específico.

## Regra de não cópia

O novo runtime representa bindings por interfaces próprias (`ObjectBinding`, `Bridge`, `HookRegistry`), com objetos mockados nos testes. Isso preserva a separação arquitetural sem copiar a implementação ou a nomenclatura proprietária.
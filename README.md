# STAR-Labs

Reconstrucao independente da arquitetura de editor/runtime/bridge descrita em
`instructions.md`.

## Entregas

- `analysis/` — inventario, relatorios de engenharia reversa, callgraphs,
  strings selecionadas e JSONs recuperados.
- `analysis/evidence/` — copia somente leitura do APK e sua extracao.
- `new-runtime/` — runtime independente com parser minimo, bindings mockados,
  hooks, tracing, panels e testes.

## Comandos

```sh
npm run analyze
npm run generate-runtime
npm test
```

`build-apk` e `package-apk` estao expostos, mas permanecem bloqueados ate que
um projeto Android independente e um Gradle wrapper sejam adicionados. Nenhum
binario, payload, chave ou codigo proprietario da evidencia e usado pelo novo
runtime.

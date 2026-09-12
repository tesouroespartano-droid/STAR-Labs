# Execution Pipeline

```text
GS2 source -> lexer -> parser/AST -> VM -> capability bindings
           -> authorized adapter -> client/test environment
```

- **VERIFIED** — A primeira metade existe independentemente em `new-runtime/src`.
- **UNKNOWN** — A ponte para o cliente do APK nao esta implementada nem demonstrada.
- **VERIFIED** — O servidor STAR Labs e separado em `server/` e nao depende do XCore.
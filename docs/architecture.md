# Arquitetura

STAR Labs separa linguagem, runtime, capacidades, bridge e serviços. O fluxo autorizado é:

```text
GS2 source -> lexer -> parser/AST -> semantic checks -> bytecode/VM
          -> ObjectRegistry/Capability Layer -> authorized adapter
          -> events/hooks/trace/panels
```

O adapter não pode ser necessário para testar o VM. Os testes usam bridges e objetos mockados.
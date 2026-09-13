# Matriz de compatibilidade GS2

Esta matriz descreve somente capacidades comprovadas pelo código e pelos testes atuais. Ela não representa compatibilidade total com o cliente Graal.

| Recurso | Estado | Evidência atual |
| --- | --- | --- |
| Identificadores e literais | SUPPORTED | lexer, parser e corpus |
| Strings e números | SUPPORTED | lexer, parser e `strings.gs2` |
| Arrays | SUPPORTED | AST `ArrayExpression`, VM e `arrays.gs2` |
| Objetos e acesso a propriedades | SUPPORTED | AST `ObjectExpression`/`MemberExpression` e testes |
| Indexação | SUPPORTED | AST `IndexExpression` e testes |
| Operadores básicos | SUPPORTED | parser Pratt e corpus |
| Atribuição | SUPPORTED | `AssignmentExpression` e testes |
| Funções e parâmetros | SUPPORTED | `FunctionDeclaration`, frames lexicais e corpus |
| `return` | SUPPORTED | VM e corpus |
| `if` / `else` | SUPPORTED | VM e corpus |
| `while` com quota | PARTIAL | VM possui limite; não é ainda o scheduler GS2 do cliente |
| Eventos e hooks | PARTIAL | abstração local de hooks; sem semântica comprovada do cliente |
| Timers | PARTIAL | dispatch por bridge no corpus; scheduler persistente ainda não implementado |
| Built-ins | PARTIAL | disponíveis somente quando registrados no `GS2FunctionRegistry` |
| Contexto client/server | SUPPORTED | registry bloqueia resolução fora do contexto declarado |
| Diagnósticos ricos com arquivo/linha/coluna | PARTIAL | linhas existem; spans e integração com editor ainda pendentes |
| Classes e objetos GS2 do cliente | UNKNOWN | requer documentação e evidência do cliente atual |
| Bytecode/IR final | UNSUPPORTED | VM atual executa AST |
| Bridge Graal/Unity próprio | UNSUPPORTED | contrato independente ainda precisa ser implementado e testado |
| Catálogo amplo validado | UNSUPPORTED | registry existe; catálogo real ainda não foi extraído/validado |

## Regra de atualização

Uma capacidade só pode avançar de `UNKNOWN` ou `UNSUPPORTED` quando houver uma implementação própria, teste correspondente e evidência documentada. Números de funções não são estimados nem hardcoded.
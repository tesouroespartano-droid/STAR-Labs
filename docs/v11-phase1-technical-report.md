# STAR Labs V11 — Relatório técnico inicial

## Estado protegido

O Graal/Unity continua sendo a entrada do APK. O call site `UnityPlayerActivity -> ModMenu.StartMenu` foi removido pelo pipeline e não deve ser alterado para reintroduzir o XCore. A gate em [tools/xcore-regression-gate.sh](../tools/xcore-regression-gate.sh) permanece obrigatória antes de qualquer empacotamento.

O XCore pode permanecer como evidência estática no APK-base, mas não pode ser usado como bootstrap, executor, bridge ou implementação do STAR Labs.

## Arquitetura atual

```text
GS2-like source
  -> lexer.js
  -> parser.js -> AST
  -> vm.js
  -> MockBridge / registry bridge
```

O runtime atual contém uma VM AST inicial, quota de execução, funções, arrays, objetos, propriedades, controle de fluxo, hooks, painéis e trace básico. `runtime.js` também contém um executor legado baseado em linhas (`let`, `set`, `call`, `return`, `hook`, `panel`); ele é mantido apenas por compatibilidade dos testes existentes e não será ampliado como se fosse GS2.

## Arquivos preservados

- APK e artefatos em `analysis/evidence/`.
- `UnityPlayerActivity` e a remoção do call site XCore no script de build.
- `tools/xcore-regression-gate.sh`.
- Bibliotecas, assets, metadata e identidade do Graal/Unity.
- Testes existentes do runtime e a matriz de compatibilidade.

## Arquivos a evoluir

- `new-runtime/src/lexer.js`: spans, comentários, tokens e diagnósticos.
- `new-runtime/src/parser.js`: AST explícita e erros com posição.
- Novo `semantic.js`: resolução de símbolos e built-ins pelo registry.
- `new-runtime/src/vm.js`: contexto, frames, cancelamento, scheduling e diagnósticos.
- `new-runtime/src/function-registry.js`: catálogo estruturado e evidência.
- Novo `new-runtime/src/client-bridge.js`: fronteira independente entre runtime e cliente.
- Novo `new-runtime/src/language-service.js`: símbolos, completions e diagnostics usando parser/registry.
- Novo `new-runtime/src/script-repository.js`: documentos, abas e estado persistente da camada de editor.
- UI Android/HTML: só depois que os contratos do engine e repository estiverem testados.

## Cobertura GS2 atual

`SUPPORTED` no harness: literals, strings, números, arrays, objetos, propriedades, indexação, operadores básicos, atribuição, funções, parâmetros, `return`, `if`, `else`, `while` com quota e chamadas via bridge.

`PARTIAL`: eventos/hooks, timers, built-ins registrados, diagnostics e scripts longos.

`UNKNOWN` ou `UNSUPPORTED`: semântica específica do cliente Graal, classes GS2 do cliente, bytecode/IR final, bridge Graal/Unity próprio e catálogo amplo validado.

O executor legado baseado em linhas não é evidência de compatibilidade GS2 e não receberá novas keywords.

## Cobertura alvo desta etapa

1. Lexer e parser com spans estáveis e AST sem perda de informação.
2. Análise semântica separada, usando o mesmo registry do runtime e do editor.
3. Execution context, call frames, cancellation, scheduling e diagnósticos estruturados.
4. Client Bridge independente de Android UI e XCore.
5. Language service para diagnostics, symbols, autocomplete e signatures.
6. ScriptRepository para múltiplos documentos e dirty state.
7. Corpus complexo com funções, escopos, callbacks, eventos, objetos aninhados e múltiplos arquivos.

## Design do registry

`GS2FunctionRegistry` é a fonte única de verdade. Cada entrada contém nome, assinatura, parâmetros, retorno, contexto client/server/shared, versão, aliases, documentação, evidência, disponibilidade, status e handler. Apenas handlers com implementação e evidência podem ser `fully-implemented`; a UI deve contar `validatedCount`, nunca um total fixo.

## Design do parser e semântica

O lexer produz tokens com posição. O parser produz nós AST específicos. A análise semântica percorre a AST, mantém escopos, resolve funções pelo registry e emite diagnostics com script, linha, coluna, categoria e mensagem. O parser não conhece Android, WebView ou o cliente.

## Design da VM

A VM recebe AST/IR e um `ExecutionContext` com globals, frames, trace, quota, cancelamento, scheduler e bridge. Chamadas de função são resolvidas primeiro no escopo local e depois no bridge/registry. Eventos e callbacks são capacidades do runtime; não são atalhos para o XCore.

## Design do bridge

```text
GS2 VM -> ClientBridge -> adapter autorizado Graal/Unity/native
```

O contrato deve ser testável sem Android. Adapters ausentes são explicitamente indisponíveis, nunca marcados como implementados. Nenhum offset histórico será tratado como contrato atual sem validação.

## Design do editor

O editor consumirá `ScriptRepository`, `LanguageService` e `GS2FunctionRegistry`. A primeira camada funcional deve suportar documentos múltiplos, dirty state, busca, diagnostics, symbols, autocomplete e signature help. A UI profissional virá sobre esses contratos, com abas, toolbar, editor largo, logs e layout redimensionável. Não será criada uma textarea que contenha regras do runtime.

## Checkpoints

- Checkpoint 1: gate XCore e build preservados.
- Checkpoint 2: contratos de bridge, repository e language service com testes.
- Checkpoint 3: parser/semantic diagnostics em corpus complexo.
- Checkpoint 4: VM com cancellation/scheduling e multi-script.
- Checkpoint 5: Executor UI consumindo os mesmos contratos.
- Checkpoint 6: build APK e device validation.

## Classificação de evidência

Documentação pública será marcada `DOCUMENTED`; comportamento observado no APK/device, `OBSERVED`; código recuperado, `REVERSED`; conclusões derivadas, `INFERRED`; lacunas, `UNKNOWN`. Nenhuma hipótese será apresentada como compatibilidade comprovada.
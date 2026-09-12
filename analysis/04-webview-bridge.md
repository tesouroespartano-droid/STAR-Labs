# Ponte WebView

## Protocolo recuperado

```text
HTML/JS --Native.init()--> ModMenu.setupChannel()
ModMenu --postWebMessage--> JS: {"type":"init"} + WebMessagePort
JS --port.postMessage(JSON string)--> Android callback
Android --xC(JSON)--> libservice.so
Android --xJ(JSON), condicional--> camada nativa de retorno/log
libservice/native --yA(JSON)--> JS WebMessagePort
```

- **VERIFIED** — O primeiro pacote é exatamente `{"type":"init"}`.
- **VERIFIED** — O transporte é `android.webkit.WebMessagePort`, não `addJavascriptInterface` para o fluxo de dados principal.
- **VERIFIED** — A interface JavaScript `Native` existe apenas para inicialização e teclado: `init`, `showKeyboard`, `hideKeyboard`.
- **VERIFIED** — O callback recebe texto sem esquema validado em Java; `xC` é o parser/dispatcher efetivo.
- **VERIFIED** — Código de retorno `5` representa o evento de painel (`ACT_PANEL`) no adaptador e controla foco/IME.
- **UNKNOWN** — Campos, nomes de comandos, respostas e erros dos JSON além de `type=init` não estão disponíveis: o HTML não aparece no ZIP e o parser está em nativo.

## Segurança/limites observáveis

- **VERIFIED** — `loadDataWithBaseURL` usa a origem literal `http://menu.holy/` para HTML fornecido por `yB`.
- **VERIFIED** — A URI usada por `postWebMessage` é `ProxyConfig.MATCH_ALL_SCHEMES`; a filtragem do conteúdo não é feita nesta classe.
- **PLAUSIBLE** — `xJ` parece ser um espelho de mensagens para uma camada nativa, mas o sentido exato depende da implementação decodificada de `libservice.so`.

## Interface independente proposta

O runtime novo usa o mesmo conceito de mensagens tipadas, mas um protocolo próprio e explícito:

```json
{"version":1,"id":"...","type":"script.run","script":"main.gs","source":"..."}
{"version":1,"id":"...","type":"script.result","ok":true,"value":null}
{"version":1,"id":"...","type":"script.error","ok":false,"error":{"code":"...","message":"..."}}
```

Essa forma é deliberadamente independente da mensagem `type=init` observada.
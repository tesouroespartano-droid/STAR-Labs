# ModMenu

## Classificação

- **STRONG** — `com.player.render.ModMenu` é inteiramente customizada em relação às APIs Android/Unity usuais. A classe está em `classes2.dex`, chama `System.loadLibrary("service")`, usa o diretório `xCoreScripts` e publica a origem `http://menu.holy/`.
- **VERIFIED** — A classe não contém o interpretador GS2. Ela é um adaptador Android/UI e delega a execução nativa para `libservice.so`.

## Estado e inicialização

Campos observados: `appContext`, `webView`, `androidPort`, `scriptsPath` e `started`.

- **VERIFIED** — `StartMenu(Context)` é idempotente por `started`; resolve um `Activity`, registra o contexto, verifica `MANAGE_APP_ALL_FILES_ACCESS_PERMISSION`, cria `xCoreScripts` no armazenamento externo quando possível e chama `xA(context)`.
- **VERIFIED** — Em Android 11+, quando a permissão de armazenamento amplo falta, `StartMenu` abre a tela de configurações e aguarda a permissão em uma thread; ao obtê-la, inicializa o diretório e chama `xQ()` no thread principal.
- **VERIFIED** — O WebView é adicionado como overlay de tela inteira ao `decorView`, com elevação 50 e sem fundo.
- **VERIFIED** — `xB(webView)` configura o WebView nativo; `xE()` é chamado depois de registrar a interface JavaScript `Native`.

## Interface exposta ao HTML

- **VERIFIED** — `Native.init()` agenda `setupChannel()` no WebView.
- **VERIFIED** — `Native.showKeyboard()` chama `xI(true)`, solicita foco e abre o IME após 150 ms.
- **VERIFIED** — `Native.hideKeyboard()` chama `xI(false)` e oculta o IME.
- **VERIFIED** — `yB(html)` injeta HTML com `loadDataWithBaseURL("http://menu.holy/", html, "text/html", "UTF-8", null)`.

## Entrada e saída do canal

- **VERIFIED** — `setupChannel()` cria um `WebMessageChannel`, conserva a porta Android, instala callback e envia `{"type":"init"}` à página com a outra porta.
- **VERIFIED** — Cada mensagem recebida é lida como `String`, enviada para `xC(json)` e, quando `xF()` é verdadeiro, também é encaminhada a `xJ(json)`.
- **VERIFIED** — Quando `xC` retorna `5` (`ACT_PANEL`), `xG()` decide se o WebView deve ganhar ou perder foco.
- **VERIFIED** — `yA(json)` envia JSON nativo para a porta JavaScript; se o canal ainda não existe, descarta silenciosamente.
- **VERIFIED** — `yD(msg)` mostra um Toast no thread principal.
- **VERIFIED** — `yC()` é um método vazio na recuperação atual.

O protocolo semântico dos demais JSON não é recuperável nesta classe: o parser/dispatcher está em `xC` e o conteúdo da página não está empacotado no APK observado.

## Métodos nativos observados

| Método | Assinatura Java | Papel observável | Confiança |
|---|---|---|---|
| `xA` | `(Context)` | inicialização do serviço com contexto | VERIFIED |
| `xB` | `(WebView)` | configuração do WebView | VERIFIED |
| `xC` | `(String): int` | recebe JSON e retorna código de ação | VERIFIED |
| `xE` | `()` | ação pós-configuração do WebView | PLAUSIBLE |
| `xF` | `(): boolean` | habilita encaminhamento para `xJ` | VERIFIED |
| `xG` | `(): boolean` | estado de foco do painel | VERIFIED |
| `xH` | `(): boolean` | estado de editor de texto do WebView | VERIFIED |
| `xI` | `(boolean)` | altera estado de teclado/editor | VERIFIED |
| `xJ` | `(String)` | encaminha JSON para uma camada nativa | STRONG |
| `xK` | `(String)` | recebe texto/evento nativo; não chamado por `ModMenu` recuperada | UNKNOWN |
| `xP` | `(View,float,float): boolean` | hit-test/decisão de toque | VERIFIED |
| `xQ` | `()` | reinicialização após permissão de armazenamento | STRONG |

`xD`, `xL`, `xM`, `xN` e `xO` não aparecem na declaração recuperada; a sequência de letras não deve ser tratada como uma API contínua.
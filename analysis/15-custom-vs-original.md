# Custom vs Original

## A. Componentes do cliente original ou infraestrutura

| Artefato | Evidência | Confiança |
|---|---|---|
| `libil2cpp.so` | Unity IL2CPP principal, 44 MB | VERIFIED |
| `libunity.so` | runtime Unity | VERIFIED |
| `global-metadata.dat` | metadata IL2CPP | VERIFIED |
| AndroidX/WebKit/Kotlin/Firebase | dependências e APIs padrão no DEX | VERIFIED |
| assemblies/strings Graal, Quattro e NativeScript | nomes presentes em metadata/recursos | VERIFIED |

Presença de Quattro/NativeScript não prova uso pelo XCore. Esses componentes permanecem como cliente ou interfaces compartilhadas até haver referência cruzada de chamada.

## B. Componentes adicionais atribuídos ao XCore

| Artefato | Evidência XCore | Evidência original | Confiança |
|---|---|---|---|
| `com.player.render.ModMenu` | `xCoreScripts`, `menu.holy`, `xA..xQ`, overlay e bridge | nenhuma função padrão Unity equivalente observada | STRONG |
| `com.player.render.ModMenu$1/$2/$3` | callbacks/lambdas que implementam o fluxo de ModMenu | são classes Android, mas papel é customizado | STRONG |
| `libservice.so` | SONAME próprio, `JNI_OnLoad`, tabela JNI dinâmica ligada a ModMenu | depende apenas de libs Android comuns | STRONG |
| `xCoreScripts` | diretório externo criado exclusivamente por ModMenu observada | não aparece como entrada APK | VERIFIED |

## C. Interfaces compartilhadas ou incertas

| Artefato/conceito | Por que é incerto | Confiança |
|---|---|---|
| `gl_ctx_init`, `gl_set_scripts_dir` | nomes relevantes do briefing, mas não exports de `libservice.so` | UNKNOWN |
| `TGraalVar`, `TGraalClientVar`, `TActionScriptVar` | metadata pode pertencer ao cliente; uso pelo executor não demonstrado | UNKNOWN |
| parser/VM GS2 | nenhuma chamada comprovada a partir de Java/JNI | UNKNOWN |
| `/holy.enc`, `/holy.hash` | não confirmados na busca estática reproduzida | UNKNOWN |
| licenciamento | endpoint, sessão e flags não localizados | UNKNOWN |

## Regra para STAR Labs

Somente os contratos conceituais podem inspirar STAR Labs. Nenhum binário, payload, offset, chave, servidor ou implementação XCore é dependência do novo runtime.
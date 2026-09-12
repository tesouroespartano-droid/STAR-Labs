# Matriz de confiança

| Area | Conclusao | Nivel | Base |
|---|---|---|---|
| APK | tres DEX, IL2CPP, libservice | VERIFIED | inventario ZIP/ELF |
| ModMenu | overlay WebView e bridge | VERIFIED | fonte JADX |
| Scripts | diretorio externo xCoreScripts | VERIFIED | `initScriptsDir` |
| Mensagem inicial | `{"type":"init"}` | VERIFIED | `setupChannel` |
| Mensagens de comandos | JSON passa por xC | VERIFIED | callback WebMessage |
| xA..xQ | tabela JNI dinamica | STRONG | JNI_OnLoad/desmontagem |
| Significado individual xA..xQ | somente alguns papéis do Java | MIXED | chamadas e assinaturas |
| Parser GS2 | existe e onde executa | UNKNOWN | sem ponte confirmada |
| Payload criptografado | formato/local/verificação | UNKNOWN | sem evidência suficiente |
| Quattro/NativeScript | presença textual | VERIFIED | metadata/strings |
| Quattro usado pelo executor | relação de chamadas | UNKNOWN | cross-reference ausente |
| Licenciamento | endpoints/estado/flags | UNKNOWN | não localizado |
| Reprodução independente | viável em arquitetura separada | STRONG | interfaces próprias |
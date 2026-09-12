# Runtime

O runtime atual já possui lexer, parser Pratt, AST e VM inicial em `new-runtime/src`. A compatibilidade GS2 ainda é parcial. A API pública deve evoluir por interfaces próprias, sem assumir memória, offsets ou tipos do cliente analisado.
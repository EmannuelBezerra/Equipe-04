# Nome do executável
EXECUTAVEL = shell_sort

# Arquivos fonte
SOURCES = main.c shell_sort.c lista_encadeada.c

# Compilador
CC = gcc

# Flags de compilação
CFLAGS = -Wall -Wextra -g

# Regra padrão: compila e gera o executável
all: $(EXECUTAVEL)

$(EXECUTAVEL): $(SOURCES)
	$(CC) $(CFLAGS) $(SOURCES) -o $(EXECUTAVEL)

# Regra para executar o programa
run: $(EXECUTAVEL)
	./$(EXECUTAVEL)

# Regra para limpar arquivos gerados
clean:
	rm -f $(EXECUTAVEL)

.PHONY: all run clean

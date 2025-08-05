# Shell Sort com Lista Encadeada (C)
Aluno: José Carlos

Este projeto implementa o algoritmo Shell Sort diretamente sobre uma lista encadeada em C.
Observação importante:

O algoritmo Shell Sort pode ser implementado de duas formas principais:
Com vetor (array):
mais eficiente devido ao acesso direto por índice. É a abordagem mais comum e performática.

Diretamente na lista encadeada:
mais desafiadora e menos eficiente, pois exige simular o acesso por índice usando ponteiros.

## Funcionalidades
- Ordenação usando gaps (sequência de Knuth)
- Contagem de comparações e trocas
- Impressão da lista antes e depois

## Como compilar

```bash
gcc src/main.c src/shell_sort.c src/lista_encadeada.c -o shell_sort
```

## Como executar

```bash
./shell_sort
```

## Estrutura

- `src/`: Código-fonte


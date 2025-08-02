#ifndef SHELL_SORT_H
#define SHELL_SORT_H

#include "lista_encadeada.h"

// Variáveis globais para contagem de comparações e trocas
extern int trocas;
extern int comparacoes;

// Função principal de ordenação Shell Sort
void shellSortLista(Node *head);

#endif

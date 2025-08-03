#include <stdio.h>
#include "lista_encadeada.h"
#include "shell_sort.h"

int main() {
    // Array com os valores iniciais
    int valores[] = {2, 4, 8, 10, 1, 5, 7, 6, 3, 9};
    int n = sizeof(valores) / sizeof(valores[0]);
    // Cria uma lista encadeada a partir dos valores
    Node *head = criar_lista(valores, n);

    printf("Lista original:\n");
    imprimir_lista(head);
    // Mostra a lista antes da ordenação

    shellSortLista(head);
    // Ordena a lista com Shell Sort diretamente sobre a estrutura encadeada

    printf("\nLista ordenada:\n");
    imprimir_lista(head);
    // Mostra a lista após a ordenação

    printf("\nComparações: %d\nTrocas: %d\n", comparacoes, trocas);
    // Mostra as estatísticas do algoritmo
    liberar_lista(head);
    return 0;
}

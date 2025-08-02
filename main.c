// Arquivo principal: cria lista, imprime, ordena com Shell Sort e mostra estatísticas
#include <stdio.h>
#include "lista_encadeada.h"
#include "shell_sort.h"

int main() {
    int valores[] = {2, 4, 8, 10, 1, 5, 7, 6, 3, 9};
    int n = sizeof(valores) / sizeof(valores[0]);

    Node *head = criar_lista(valores, n);

    printf("Lista original:\n");
    imprimir_lista(head);

    shellSortLista(head);

    printf("\nLista ordenada:\n");
    imprimir_lista(head);

    printf("\nComparações: %d\nTrocas: %d\n", comparacoes, trocas);

    liberar_lista(head);
    return 0;
}

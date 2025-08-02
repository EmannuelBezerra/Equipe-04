#include <stdio.h>
#include "lista_encadeada.h"
#include "shell_sort.h"

// Função principal do programa: cria a lista, imprime, ordena e imprime novamente
int main() {
    // Array com os valores iniciais
    int valores[] = {2, 4, 8, 10, 1, 5, 7, 6, 3, 9};
    int n = sizeof(valores) / sizeof(valores[0]); // Calcula o tamanho do array

    // Cria uma lista encadeada a partir dos valores
    Node *head = criar_lista(valores, n);

    printf("Lista original:\n");
    imprimir_lista(head); // Mostra a lista antes da ordenação

    // Ordena a lista com Shell Sort diretamente sobre a estrutura encadeada
    shellSortLista(head);

    printf("\nLista ordenada:\n");
    imprimir_lista(head); // Mostra a lista após a ordenação

    // Mostra as estatísticas do algoritmo
    printf("\nComparações: %d\nTrocas: %d\n", comparacoes, trocas);

    liberar_lista(head); // Libera a memória alocada
    return 0;
}

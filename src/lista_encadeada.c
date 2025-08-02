#include <stdio.h>
#include <stdlib.h>
#include "lista_encadeada.h"

// Cria uma lista encadeada a partir de um array
Node* criar_lista(int *valores, int n) {
    Node *head = NULL, *tail = NULL;
    for (int i = 0; i < n; i++) {
        Node *novo = (Node *)malloc(sizeof(Node));
        novo->data = valores[i];
        novo->next = NULL;
        if (head == NULL) head = tail = novo;
        else {
            tail->next = novo;
            tail = novo;
        }
    }
    return head;
}
// Imprime todos os elementos da lista
void imprimir_lista(Node *head) {
    while (head != NULL) {
        printf("%d ", head->data);
        head = head->next;
    }
    printf("\n");
}
// Libera toda a memória alocada pela lista
void liberar_lista(Node *head) {
    while (head != NULL) {
        Node *tmp = head;
        head = head->next;
        free(tmp);
    }
}

// Implementação da lista encadeada: criação, impressão, liberação
#include <stdio.h>
#include <stdlib.h>
#include "lista_encadeada.h"

Node* criar_lista(int *valores, int n) {
    Node *head = NULL, *tail = NULL;
    for (int i = 0; i < n; i++) {
        Node *novo = (Node *)malloc(sizeof(Node));
        novo->data = valores[i];
        novo->next = NULL;
        if (head == NULL)
            head = tail = novo;
        else {
            tail->next = novo;
            tail = novo;
        }
    }
    return head;
}

void imprimir_lista(Node *head) {
    while (head != NULL) {
        printf("%d ", head->data);
        head = head->next;
    }
    printf("\n");
}

void liberar_lista(Node *head) {
    while (head != NULL) {
        Node *tmp = head;
        head = head->next;
        free(tmp);
    }
}

#ifndef LISTA_ENCADEADA_H
#define LISTA_ENCADEADA_H

// Estrutura de nó para lista encadeada
typedef struct Node {
    int data;
    struct Node *next;
} Node;

// Funções básicas da lista
Node* criar_lista(int *valores, int n);
void imprimir_lista(Node *head);
void liberar_lista(Node *head);

#endif

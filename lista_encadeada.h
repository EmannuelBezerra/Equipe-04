// Header da lista encadeada: define estrutura e funções públicas
#ifndef LISTA_ENCADEADA_H
#define LISTA_ENCADEADA_H

typedef struct Node {
    int data;
    struct Node *next;
} Node;

Node* criar_lista(int *valores, int n);
void imprimir_lista(Node *head);
void liberar_lista(Node *head);

#endif

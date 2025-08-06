#include "shell_sort.h"
#include <stdlib.h>  

// Variáveis globais para contagem de desempenho
int trocas = 0;
int comparacoes = 0;

// Conta quantos nós existem na lista
int tamanhoLista(Node *head) {
    int count = 0;
    while (head != NULL) {
        count++;
        head = head->next;
    }
    return count;
}

// Retorna o ponteiro para o nó na posição 'index' da lista
Node* getNodeAt(Node *head, int index) {
    int i = 0;
    while (head != NULL && i < index) {
        head = head->next;
        i++;
    }
    return head;
}
// Algoritmo Shell Sort aplicado diretamente à lista encadeada
void shellSortLista(Node *head) {
    int n = tamanhoLista(head); // Obtém o tamanho da lista
    
    // Gera a sequência de gaps de Knuth: 1, 4, 13, ...
    int h = 1;
    while (h < n / 3) h = 3 * h + 1;

    // Loop principal para reduzir o gap
    while (h >= 1) {
        for (int i = h; i < n; i++) {
            Node *iNode = getNodeAt(head, i);// Nó atual
            int temp = iNode->data;// Guarda o valor
            int j = i;// Move os elementos maiores para frente
            while (j >= h) {
                Node *j_h_Node = getNodeAt(head, j - h);
                comparacoes++;
                if (temp < j_h_Node->data) {
                    Node *jNode = getNodeAt(head, j);
                    jNode->data = j_h_Node->data;
                    trocas++;
                    j -= h;
                } else break;
            }
             // Insere o valor guardado na posição correta
            Node *jNode = getNodeAt(head, j);
            if (jNode->data != temp) {
                jNode->data = temp;
                trocas++;
            }
        }
        //diminui o Gap
        h /= 3;
    }
}

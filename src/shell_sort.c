#include "shell_sort.h"
#include <stdlib.h>  

int trocas = 0;
int comparacoes = 0;

int tamanhoLista(Node *head) {
    int count = 0;
    while (head != NULL) {
        count++;
        head = head->next;
    }
    return count;
}

Node* getNodeAt(Node *head, int index) {
    int i = 0;
    while (head != NULL && i < index) {
        head = head->next;
        i++;
    }
    return head;
}

void shellSortLista(Node *head) {
    int n = tamanhoLista(head);
    int h = 1;
    while (h < n / 3) h = 3 * h + 1;

    while (h >= 1) {
        for (int i = h; i < n; i++) {
            Node *iNode = getNodeAt(head, i);
            int temp = iNode->data;
            int j = i;
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
            Node *jNode = getNodeAt(head, j);
            if (jNode->data != temp) {
                jNode->data = temp;
                trocas++;
            }
        }
        h /= 3;
    }
}

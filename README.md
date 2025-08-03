# Questão 15 (Java)
Nessa questão foi implementada uma lista duplamente encadeada em Java, com operações básicas de inserção/remoção e algoritmos de busca sequencial e binária. A lista armazena valores inteiros e permite buscas utilizando cada um desses algoritmos.


# Algoritmos de Busca
## Busca Sequencial:
Algoritmo simples que percorre a lista elemento por elemento até encontrar o valor.

Complexidade: O(n).

## Busca Sequencial com Sentinela
Otimização da busca sequencial anterior que evita verificações de fim de lista adicionando o próprio valor buscado temporariamente no final.

Complexidade: O(n) (mas mais rápido na prática).

## Busca Binária 
Divide a lista repetidamente ao meio para encontrar o valor (assume lista ordenada), por isso, os valores foram inseridos em ordem crescente previamente, porém no caso onde o usuário pode inserir dados com liberdade total e em qualquer ordem, é preciso implementar algum método de ordenação.

Complexidade: O(log n).

## Busca Binária Rápida
Versão otimizada da busca binária com menos comparações.

Complexidade: O(log n).

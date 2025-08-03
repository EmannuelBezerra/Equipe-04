# Questão 13 (Java)

Nessa questão foram exploradas diferentes formas de se ordenar um conjunto de dados, mais precisamente, um grupo de 8 alunos.


# Execução:

A classe aluno é composta pelo nome, nota1 e nota2. Um vetor com 8 objetos do tipo Aluno foi criado com dados inseridos pelo usuário.
## Ordenação crescente por média (Selection Sort):
Uma cópia do vetor é enviada para a função que coleta as médias de cada aluno utilizando o método responsável do objeto Aluno, que calcula a média ponderada, ao obter as médias, a função organiza a cópia do vetor com base nelas.

## Ordenação crescente por n1 (Bubble Sort):
Uma cópia do vetor é enviada para a função responsável, que ao coletar as notas 1 dos alunos, comparando e trocando elementos adjacentes.


## Ordenação alfábetica dos reprovados (Insertion Sort):
Um vetor filtrado (média < 7.0) é ordenado pelo nome, inserindo cada aluno na posição correta.




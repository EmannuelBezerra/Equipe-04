class No:
    def __init__(self, valor, esquerda=None, direita=None):
        self.valor = valor
        self.esquerda = esquerda
        self.direita = direita

def contar_nos_iterativo(raiz):
    if raiz is None:
        return 0
    stack = [raiz]
    count = 0
    while stack:
        no = stack.pop()
        count += 1
        if no.direita:  # empilha direita primeiro pra processar esquerda dps
            stack.append(no.direita)
        if no.esquerda:
            stack.append(no.esquerda)
    return count

def somar_nos_iterativo(raiz):
    if raiz is None:
        return 0
    stack = [raiz]
    total = 0
    while stack:
        no = stack.pop()
        total += no.valor
        if no.direita:
            stack.append(no.direita)
        if no.esquerda:
            stack.append(no.esquerda)
    return total

def profundidade_iterativa(raiz):
    if raiz is None:
        return 0
    stack = [(raiz, 1)]  # cada elemento da pilha é uma tupla
    profundidade_max = 0
    while stack:
        no, profundidade = stack.pop()
        if profundidade > profundidade_max:
            profundidade_max = profundidade
        if no.direita:
            stack.append((no.direita, profundidade + 1))
        if no.esquerda:
            stack.append((no.esquerda, profundidade + 1))
    return profundidade_max

raiz = No(1, No(2, No(4), No(5)), No(3))

print("Número de nós (iterativo):", contar_nos_iterativo(raiz))
print("Soma dos nós (iterativo):", somar_nos_iterativo(raiz))
print("Profundidade (iterativo):", profundidade_iterativa(raiz))  
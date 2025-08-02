class No:
    def __init__(self, valor, esquerda=None, direita=None):
        self.valor = valor
        self.esquerda = esquerda
        self.direita = direita

def contar_nos_recursivo(raiz):
    if raiz is None:
        return 0
    return 1 + contar_nos_recursivo(raiz.esquerda) + contar_nos_recursivo(raiz.direita)

def somar_nos_recursivo(raiz):
    if raiz is None:
        return 0
    return raiz.valor + somar_nos_recursivo(raiz.esquerda) + somar_nos_recursivo(raiz.direita)

def profundidade_recursiva(raiz):
    if raiz is None:
        return 0
    profundidade_esquerda =  profundidade_recursiva(raiz.esquerda)
    profundidade_direita =  profundidade_recursiva(raiz.direita)
    return max(profundidade_esquerda, profundidade_direita) + 1

raiz = No(1, No(2, No(4), No(5)), No(3))

print("Número de nós (recursiva):", contar_nos_recursivo(raiz))
print("Soma dos nós (recursiva):", somar_nos_recursivo(raiz))
print("Profundidade (recursiva):", profundidade_recursiva(raiz))
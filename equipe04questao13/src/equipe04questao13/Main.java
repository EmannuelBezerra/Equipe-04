package equipe04questao13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno[] alunos = new Aluno[8];

        
        System.out.println("=== Cadastro de 8 Alunos ===");
        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("\nAluno %d:\n", i + 1);

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Nota 1: ");
            double nota1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Nota 2: ");
            double nota2 = Double.parseDouble(scanner.nextLine());

            alunos[i] = new Aluno(nome, nota1, nota2);
        }

        //  Ordenar por média ponderada
        System.out.println("\n--- Ordem crescente por média ponderada ---");
        Aluno[] porMedia = alunos.clone();
        ordenarPorMediaPonderada(porMedia);
        imprimirArray(porMedia);

        //  Ordenar por nota1
        System.out.println("\n--- Ordem crescente por nota 1 ---");
        Aluno[] porNota1 = alunos.clone();
        ordenarPorNota1(porNota1);
        imprimirArray(porNota1);

        //  Reprovados em ordem alfabética
        System.out.println("\n--- Alunos reprovados (média < 7) em ordem alfabética ---");
        Aluno[] reprovados = filtrarReprovados(alunos);
        ordenarPorNome(reprovados);
        imprimirArray(reprovados);

        scanner.close();
    }

    public static void ordenarPorMediaPonderada(Aluno[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].getMediaPonderada() < arr[menor].getMediaPonderada()) {
                    menor = j;
                }
            }
            Aluno temp = arr[i];
            arr[i] = arr[menor];
            arr[menor] = temp;
        }
    }

    public static void ordenarPorNota1(Aluno[] arr) {
        int n = arr.length;
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i].getNota1() > arr[i + 1].getNota1()) {
                    Aluno temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    trocou = true;
                }
            }
        } while (trocou);
    }

    public static void ordenarPorNome(Aluno[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Aluno atual = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getNome().compareToIgnoreCase(atual.getNome()) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = atual;
        }
    }

    public static Aluno[] filtrarReprovados(Aluno[] arr) {
        int count = 0;
        for (Aluno a : arr) {
            if (a.getMediaPonderada() < 7.0) count++;
        }
        Aluno[] reprovados = new Aluno[count];
        int idx = 0;
        for (Aluno a : arr) {
            if (a.getMediaPonderada() < 7.0) {
                reprovados[idx++] = a;
            }
        }
        return reprovados;
    }

    public static void imprimirArray(Aluno[] arr) {
        for (Aluno a : arr) {
            a.imprimir();
        }
    }
}


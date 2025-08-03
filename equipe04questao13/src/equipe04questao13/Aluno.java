package equipe04questao13;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMediaPonderada() {
        return (nota1 * 2 + nota2 * 3) / 5.0;
    }

    public void imprimir() {
        System.out.printf("Nome: %s | Nota1: %.1f | Nota2: %.1f | Média: %.2f\n", nome, nota1, nota2, getMediaPonderada());
    }
}

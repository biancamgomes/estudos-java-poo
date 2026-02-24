package aluno;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Julia", 10, 8.7);
        Aluno aluno2 = new Aluno("Marcos", 4, 9.5);

        System.out.println("Média aluno " + aluno1.nome + " '"+ aluno1.calcularMedia() + "'");
        aluno1.verificarAprovacao();

        System.out.println("-------------------------");

        System.out.println("Média aluno " + aluno2.nome + " '"+ aluno2.calcularMedia() + "'");
        aluno2.verificarAprovacao();

    }
}

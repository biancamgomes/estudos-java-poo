package aluno;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double media;

    Aluno (String nomeInit, double nota1Init, double nota2Init) {
        nome = nomeInit;
        nota1 = nota1Init;
        nota2 = nota2Init;
    }

    double calcularMedia(){
        media = (nota1 + nota2) / 2;
        return media;
    }

    void verificarAprovacao(){
        calcularMedia();
        if(media >= 7){
            System.out.println("O aluno foi aprovado");
        } else {
            System.out.println("O aluno foi reprovado");
        }
    }


}

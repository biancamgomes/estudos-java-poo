package pessoa;

public class Pessoa {
    String nome;
    int idade;

    Pessoa(String nomeInit, int idadeInit) {
        nome = nomeInit;
        idade = idadeInit;
    }

    public void apresentar(){
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos");

    }

}


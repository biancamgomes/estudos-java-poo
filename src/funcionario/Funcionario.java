package funcionario;

public class Funcionario {
    protected String nome;
    protected double salario;

    Funcionario(String nomeInit, double salarioInit){
        nome = nomeInit;
        salario = salarioInit;
    }

    public double calcularBonus(){
        return 0;
    }
}

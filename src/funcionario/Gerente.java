package funcionario;

public class Gerente extends Funcionario {

    Gerente(String nomeInit, double salarioInit) {
        super(nomeInit, salarioInit);
    }

    @Override
    public double calcularBonus() {
        return salario*0.20;
    }
}

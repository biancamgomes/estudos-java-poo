package funcionario;

public class Estagiario extends Funcionario{

    Estagiario(String nomeInit, double salarioInit){
        super(nomeInit, salarioInit);
    }

    @Override
    public double calcularBonus(){
        return salario*0.05;
    }

    }

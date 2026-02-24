package funcionario;

public class Teste {

    public static void imprimirDados(Funcionario f){
        double total = f.salario + f.calcularBonus();
        System.out.println("Funcionário: "+f.nome+" | Total: R$"+total);

    }
    public static void main(String[] args) {


        Funcionario f1 = new Gerente("Jordana", 4760);
        Funcionario f2 = new Gerente("Rafa", 4580);

        Funcionario f3 = new Estagiario("Lucas", 1000);
        Funcionario f4 = new Estagiario("Rafael", 1000);

        imprimirDados(f1);
        imprimirDados(f2);
        imprimirDados(f3);
        imprimirDados(f4);



    }
}

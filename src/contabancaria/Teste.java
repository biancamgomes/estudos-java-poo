package contabancaria;

public class Teste {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1547, "José Maurício", 20);
        conta1.depositar(100);
        System.out.println("Saldo atual: R$" + conta1.getSaldo());
        conta1.sacar(100);
    }

}

package contabancaria;

public class Conta {
    int numero;
    String titular;
    private double saldo = 0;

    Conta (int numeroInit, String titularInit, double saldoInit) {
        numero = numeroInit;
        titular = titularInit;
        saldo = saldoInit;
    }

    void depositar(double valor){
        if(valor <= 0){
            System.out.println("Depósito inválido!");
        }
        else {
            saldo += valor;
            System.out.println("Depósito feito com sucesso!");
        }

    }
    void sacar(double valor){
        if (saldo < valor){
            System.out.println("Saldo insuficiente");
        }
        else {
            saldo -= valor;
            System.out.println("Saque feito com sucesso!");
        }
    }
    public double getSaldo(){
        return saldo;
    }
}

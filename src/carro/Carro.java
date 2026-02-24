package carro;

public class Carro {
    String marca;
    String modelo;
    int ano;

    Carro(String marcaInit, String modeloInit, int anoInit) {
        marca = marcaInit;
        modelo = modeloInit;
        ano = anoInit;
    }

    void exibirInformacoes(){
        System.out.println("A marca é '" + marca+ "', modelo '"+modelo+"' e do ano de '"+ano+"'");
    }
}

package produto;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    Produto (String nomeInit, double precoInit, int quantidadeInit) {
        nome = nomeInit;
        preco = precoInit;
        quantidade = quantidadeInit;
    }

    public double calcularValorTotal(){
        return preco*quantidade;
    }

    public double aplicarDesconto(double porcentagem){
        double novoPreco = preco-(preco*(porcentagem/100));
        preco = novoPreco;
        return preco;
    }

}

package estoque;

public class Teste {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Banana", 1.57);
        Produto produto2 = new Produto("Arroz", 7.97);
        Produto produto3 = new Produto("Óreo", 8.68);
        Produto produto4 = new Produto("Gorgonzola", 57.20);

        Estoque estoque = new Estoque();

        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        estoque.adicionarProduto(produto3);
        estoque.adicionarProduto(produto4);

        estoque.listarProdutos();



    }
}

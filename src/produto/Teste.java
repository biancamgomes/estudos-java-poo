package produto;

public class Teste {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Banana", 10.50, 2);
        produto1.aplicarDesconto(10);
        System.out.println("Valor: " + produto1.calcularValorTotal());
    }
}

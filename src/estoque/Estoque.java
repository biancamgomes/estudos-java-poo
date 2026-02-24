package estoque;

import java.util.List;
import java.util.ArrayList;

public class Estoque {
    List<Produto> listaProdutos = new ArrayList<>();

    void adicionarProduto(Produto produto){
        listaProdutos.add(produto);
    }

    void listarProdutos(){
        for(Produto p : listaProdutos){
            System.out.println("Nome: "+p.nome+" - Preco: "+p.preco);
        }
    }

}

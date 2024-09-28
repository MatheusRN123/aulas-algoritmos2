package questao_14;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
	private Map<String, Produto> produtos;

    public Estoque() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.put(produto.getNome(), produto);
    }

    public Produto buscarProduto(String nome) {
        return produtos.get(nome);
    }

    public void imprimirEstoque() {
        System.out.println("Estoque:");
        for (Produto produto : produtos.values()) {
            System.out.println(produto);
        }
    }
}

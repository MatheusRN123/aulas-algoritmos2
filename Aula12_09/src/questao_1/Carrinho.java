package questao_1;

import java.util.HashMap;
import java.util.Map;

public class Carrinho {
	private Map<Produto, Integer> produtos;

    public Carrinho() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade deve ser maior que zero.");
            return;
        }
        produtos.put(produto, produtos.getOrDefault(produto, 0) + quantidade);
        System.out.println(quantidade + " " + produto.getNome() + "(s) adicionado(s) ao carrinho.");
    }

    public void removerProduto(Produto produto) {
        if (produtos.containsKey(produto)) {
            produtos.remove(produto);
            System.out.println(produto.getNome() + " removido do carrinho.");
        } else {
            System.out.println(produto.getNome() + " não está no carrinho.");
        }
    }

    public void atualizarQuantidade(Produto produto, int quantidade) {
        if (quantidade <= 0) {
            removerProduto(produto);
        } else if (produtos.containsKey(produto)) {
            produtos.put(produto, quantidade);
            System.out.println("Quantidade de " + produto.getNome() + " atualizada para " + quantidade + ".");
        } else {
            System.out.println(produto.getNome() + " não está no carrinho.");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Map.Entry<Produto, Integer> entry : produtos.entrySet()) {
            total += entry.getKey().getPreco() * entry.getValue();
        }
        return total;
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Carrinho está vazio.");
        } else {
            System.out.println("Produtos no carrinho:");
            for (Map.Entry<Produto, Integer> entry : produtos.entrySet()) {
                System.out.println("- " + entry.getKey().getNome() + ": " + entry.getValue() + " unidade(s) - R$ " + entry.getKey().getPreco());
            }
        }
    }
}

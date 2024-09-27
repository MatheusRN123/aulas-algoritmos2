package questao_1;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
	private List<ItemCarrinho> itens;

    public CarrinhoCompra() {
        this.itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        for (ItemCarrinho item : itens) {
            if (item.getProduto().equals(produto)) {
                item.setQuantidade(item.getQuantidade() + quantidade);
                System.out.println("Atualizada a quantidade do produto: " + produto.getNome());
                return;
            }
        }
        itens.add(new ItemCarrinho(produto, quantidade));
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    public void removerProduto(Produto produto) {
        itens.removeIf(item -> item.getProduto().equals(produto));
        System.out.println("Produto removido: " + produto.getNome());
    }

    public void atualizarQuantidade(Produto produto, int quantidade) {
        for (ItemCarrinho item : itens) {
            if (item.getProduto().equals(produto)) {
                item.setQuantidade(quantidade);
                System.out.println("Quantidade atualizada para o produto: " + produto.getNome());
                return;
            }
        }
        System.out.println("Produto não encontrado no carrinho.");
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Itens no carrinho:");
            for (ItemCarrinho item : itens) {
                System.out.println(item);
            }
            System.out.println("Total: R$ " + String.format("%.2f", calcularTotal()));
        }
    }
}

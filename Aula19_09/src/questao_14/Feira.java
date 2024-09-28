package questao_14;

import java.util.ArrayList;
import java.util.List;

public class Feira {
	private Estoque estoque;
    private List<Venda> vendas;

    public Feira() {
        this.estoque = new Estoque();
        this.vendas = new ArrayList<>();
    }

    public void adicionarProdutoAoEstoque(Produto produto) {
        estoque.adicionarProduto(produto);
    }

    public void registrarVenda(String nomeProduto, int quantidade) {
        Produto produto = estoque.buscarProduto(nomeProduto);
        if (produto != null && produto.vender(quantidade)) {
            Venda venda = new Venda(produto, quantidade);
            vendas.add(venda);
            System.out.println(venda);
        } else {
            System.out.println("Produto não disponível ou quantidade insuficiente.");
        }
    }

    public double calcularFaturamentoDiario() {
        double total = 0.0;
        for (Venda venda : vendas) {
            total += venda.calcularTotal();
        }
        return total;
    }

    public void imprimirEstoque() {
        estoque.imprimirEstoque();
    }
}

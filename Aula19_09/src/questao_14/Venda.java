package questao_14;

public class Venda {
	private Produto produto;
    private int quantidade;

    public Venda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularTotal() {
        return produto.getPreco() * quantidade;
    }

    public String toString() {
        return "Venda: " + produto.getNome() + " - Quantidade: " + quantidade + " - Total: R$ " + String.format("%.2f", calcularTotal());
    }
}

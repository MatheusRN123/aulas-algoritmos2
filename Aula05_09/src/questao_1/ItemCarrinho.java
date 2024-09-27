package questao_1;

public class ItemCarrinho {
	private Produto produto;
    private int quantidade;

    public ItemCarrinho(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return produto.getPreco() * quantidade;
    }
    
    public String toString() {
        return produto.getNome() + " - Quantidade: " + quantidade + " - Subtotal: R$ " + String.format("%.2f", getSubtotal());
    }
}

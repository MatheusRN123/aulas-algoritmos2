package questao_15;

public class Pedido {
	private Cliente cliente;
    private Produto produto;
    private int quantidade;

    public Pedido(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularTotal() {
        return produto.getPreco() * quantidade;
    }

    public String toString() {
        return "Pedido: " + produto.getNome() + " | Quantidade: " + quantidade +
                " | Total: R$ " + String.format("%.2f", calcularTotal()) + "\n" + cliente;
    }
}

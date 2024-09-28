package questao_9;

public class TestePedido {
	public static void main(String[] args) {
        Cliente cliente = new Cliente("João Silva", "123.456.789-00");
        Pedido pedido = new Pedido(1, cliente);
        pedido.adicionarProduto(new Produto("Camiseta", 29.90));
        pedido.adicionarProduto(new Produto("Calça", 89.90));
        pedido.adicionarProduto(new Produto("Tênis", 199.90));

        System.out.println(pedido);
    }
}

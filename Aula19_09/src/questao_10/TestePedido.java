package questao_10;

public class TestePedido {
	public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente("João Silva", "12345678900");
            Pedido pedido = new Pedido(1, cliente);
            pedido.adicionarProduto(new Produto("Camiseta", 29.90));
            pedido.adicionarProduto(new Produto("Calça", 89.90));
            pedido.adicionarProduto(new Produto("Tênis", 199.90));

            System.out.println(pedido);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        try {
            Cliente clienteInvalido = new Cliente("Maria Souza", "123");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}

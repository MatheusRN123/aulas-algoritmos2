package questao_15;

public class TesteEntrega {
	public static void main(String[] args) {
        Entregador entregador1 = new Entregador("Carlos");

        Cliente cliente1 = new Cliente("Alice", "Rua A, 123", "1234-5678");
        Cliente cliente2 = new Cliente("Bruno", "Rua B, 456", "8765-4321");
        
        Produto produto1 = new Produto("Pizza", 30.00);
        Produto produto2 = new Produto("Refrigerante", 5.00);

        Pedido pedido1 = new Pedido(cliente1, produto1, 1);
        Pedido pedido2 = new Pedido(cliente2, produto2, 2);

        entregador1.adicionarPedido(pedido1);
        entregador1.adicionarPedido(pedido2);

        entregador1.listarPedidos();

        System.out.printf("Faturamento total: R$ %.2f\n", entregador1.calcularFaturamento());
    }
}

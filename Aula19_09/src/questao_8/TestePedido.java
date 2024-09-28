package questao_8;

public class TestePedido {
	public class Main {
	    public static void main(String[] args) {
	        Pedido pedido = new Pedido(1);
	        pedido.adicionarProduto(new Produto("Camiseta", 29.90));
	        pedido.adicionarProduto(new Produto("Calça", 89.90));
	        pedido.adicionarProduto(new Produto("Tênis", 199.90));

	        System.out.println(pedido);
	    }
	}
}

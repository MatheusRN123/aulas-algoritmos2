package questao_1;

public class TesteCarrinho {
	public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 49.90);
        Produto produto2 = new Produto("Calça", 89.90);
        
        Cliente mateus = new Cliente("Mateus");
        
        mateus.adicionarProduto(produto1, 2);
        mateus.adicionarProduto(produto2, 1);
        
        mateus.listarCarrinho();
        mateus.verTotal();
        
        mateus.atualizarQuantidade(produto1, 1);
        mateus.listarCarrinho();
        mateus.verTotal();
        
        mateus.removerProduto(produto2);
        mateus.listarCarrinho();
        mateus.verTotal();
    }
}

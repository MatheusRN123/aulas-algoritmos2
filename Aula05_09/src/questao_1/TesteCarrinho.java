package questao_1;

public class TesteCarrinho {
	public static void main(String[] args) {
        CarrinhoCompra carrinho = new CarrinhoCompra();
        
        Produto produto1 = new Produto("Camiseta", 49.90);
        Produto produto2 = new Produto("Calça", 99.90);
        Produto produto3 = new Produto("Tênis", 199.90);

        carrinho.adicionarProduto(produto1, 2);
        carrinho.adicionarProduto(produto2, 1);
        carrinho.listarItens();

        carrinho.removerProduto(produto1);
        carrinho.listarItens();
        
        carrinho.adicionarProduto(produto3, 1);

        carrinho.atualizarQuantidade(produto2, 3);
        carrinho.listarItens();
    }
}

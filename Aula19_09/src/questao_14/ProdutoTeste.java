package questao_14;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setNome("Boneca de pano");
		produto.setPreco(38.43);
		produto.setQuantidadeEmEstoque(10);
		
		Produto outroProduto = new Produto();
		produto.setNome("Carrinho de controle remoto");
		produto.setPreco(79.99);
		produto.setQuantidadeEmEstoque(3);
		
		Produto maisUmProduto = new Produto();
		produto.setNome("Arma de água");
		produto.setPreco(25.50);
		produto.setQuantidadeEmEstoque(100);
		
		produto.vender(1);
		outroProduto.vender(1);
		maisUmProduto.vender(1);
		
		produto.verFaturamento();
		outroProduto.verFaturamento();
		maisUmProduto.verFaturamento();
		
	}
}

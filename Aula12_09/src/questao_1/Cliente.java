package questao_1;

public class Cliente {
	private String nome;
    private Carrinho carrinho;

    public Cliente(String nome) {
        this.nome = nome;
        this.carrinho = new Carrinho();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        carrinho.adicionarProduto(produto, quantidade);
    }

    public void removerProduto(Produto produto) {
        carrinho.removerProduto(produto);
    }

    public void atualizarQuantidade(Produto produto, int quantidade) {
        carrinho.atualizarQuantidade(produto, quantidade);
    }

    public void verTotal() {
        System.out.println("Total a pagar: R$ " + carrinho.calcularTotal());
    }

    public void listarCarrinho() {
        carrinho.listarProdutos();
    }
}

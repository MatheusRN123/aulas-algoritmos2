package questao_14;

public class Produto {
	private String nome;
	private Integer precoEmCentavos;
	private Integer quantidadeEmEstoque = 0;
	private Integer faturamento = 0;

	void setNome(String nome) {
		this.nome = nome;
	}
	
	void setPreco(Double preco) {
		if(preco > 0.0) {
			preco = preco * 100;
			this.precoEmCentavos = preco.intValue();
		}
	}
	
	void setQuantidadeEmEstoque(Integer quantidade) {
		if(quantidade > 0) {
			this.quantidadeEmEstoque = quantidade;
		}else {
			System.out.println("N�o há mais desse produto no estoque.");
		}
	}
	
	void vender(Integer quantidade) {
		if(quantidade <= quantidadeEmEstoque) {
			this.quantidadeEmEstoque = this.quantidadeEmEstoque - quantidade;
			this.faturamento = this.faturamento + (quantidade * this.precoEmCentavos);
		}else {
			System.out.println("Quantidade em estoque insuficiente");
		}
	}
	
	void verFaturamento() {
		double faturamentoEmReais = this.faturamento.doubleValue() / 100;
		System.out.println("Faturamento: "+ faturamentoEmReais);
	}
}

package questao_9;

public class Produto {
	private String nome;
    private double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    double getPreco() {
        return preco;
    }
   
    public String toString() {
        return nome + " - R$ " + String.format("%.2f", preco);
    }
}

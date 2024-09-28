package questao_10;

public class Produto {
	private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String toString() {
        return nome + " - R$ " + String.format("%.2f", preco);
    }
}

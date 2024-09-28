package questao_14;

public class TesteVenda {
	public static void main(String[] args) {
        Feira feira = new Feira();

        feira.adicionarProdutoAoEstoque(new Produto("Tomate", 3.00, 100));
        feira.adicionarProdutoAoEstoque(new Produto("Cenoura", 2.50, 50));
        feira.adicionarProdutoAoEstoque(new Produto("Batata", 1.50, 200));

        feira.imprimirEstoque();

        feira.registrarVenda("Tomate", 10);
        feira.registrarVenda("Cenoura", 5);
        feira.registrarVenda("Batata", 20);
        feira.registrarVenda("Cenoura", 60);

        System.out.printf("Faturamento Diário: R$ %.2f\n", feira.calcularFaturamentoDiario());

        feira.imprimirEstoque();
    }
}

package questao_5;

public class TesteLivro {
	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setTitulo("Lore, Una o seu destino ao meu.");
		livro.setAutor("Alexandra Bracken");
		livro.setAnoPublicacao(2022);
		
		livro.exibirDetalhes();
	}
}

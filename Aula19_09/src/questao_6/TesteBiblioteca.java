package questao_6;

public class TesteBiblioteca {
	public class Main {
	    public static void main(String[] args) {
	        Biblioteca biblioteca = new Biblioteca();

	        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "123456789");
	        Livro livro2 = new Livro("1984", "George Orwell", "987654321");

	        biblioteca.adicionarLivro(livro1);
	        biblioteca.adicionarLivro(livro2);
	        
	        biblioteca.listarLivros();
	        
	        biblioteca.removerLivro(livro1);
	        
	        biblioteca.listarLivros();
	    }
	}
}

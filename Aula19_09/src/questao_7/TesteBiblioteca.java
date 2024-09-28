package questao_7;

public class TesteBiblioteca{
	public class Main {
		public static void main(String[] args) {
			Biblioteca biblioteca = new Biblioteca();

			Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "123456789");
			Livro livro2 = new Livro("1984", "George Orwell", "987654321");
			Livro livro3 = new Livro("Lore, Una seu destino ao meu","Alexandra Bracken","6555206276");
			
			biblioteca.adicionarLivro(livro1);
			biblioteca.adicionarLivro(livro2);
			biblioteca.adicionarLivro(livro3);
        
			biblioteca.listarLivros();
			
			biblioteca.removerLivro(livro2);
       
			Livro livroBuscado = biblioteca.buscarLivroPorTitulo("Lore, una seu destino ao meu");
			if (livroBuscado != null) {
				System.out.println("Livro encontrado: " + livroBuscado);
			}

			biblioteca.buscarLivroPorTitulo("1984");
		}
	}
}
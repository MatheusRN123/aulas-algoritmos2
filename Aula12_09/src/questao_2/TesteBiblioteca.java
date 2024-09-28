package questao_2;

import java.time.LocalDate;

public class TesteBiblioteca {
	public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Lore, Una o seu Destino ao meu", "Alexandra Bracken", 2022);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        Livro livro3 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.emprestarLivro("1984", "Maria", LocalDate.of(2024, 12, 30));
        biblioteca.emprestarLivro("Lore, Una o seu Destino ao meu", "José", LocalDate.of(2024, 10, 06));

        biblioteca.listarLivrosEmprestados();
    }
}

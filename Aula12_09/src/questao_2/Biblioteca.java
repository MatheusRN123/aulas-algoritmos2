package questao_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public boolean emprestarLivro(String titulo, String nomeEmprestado, LocalDate dataDevolucao) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && !livro.isEmprestado()) {
                livro.emprestar(nomeEmprestado, dataDevolucao);
                System.out.println("Livro emprestado: " + titulo);
                return true;
            }
        }
        System.out.println("Livro não disponível: " + titulo);
        return false;
    }

    public void listarLivrosEmprestados() {
        System.out.println("Livros emprestados:");
        for (Livro livro : livros) {
            if (livro.isEmprestado()) {
                System.out.println(livro);
            }
        }
    }
}

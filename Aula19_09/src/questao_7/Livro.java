package questao_7;

import java.util.Objects;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;

    Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    String getTitulo() {
        return titulo;
    }

    String getAutor() {
        return autor;
    }

    String getIsbn() {
        return isbn;
    }

    public String toString() {
        return 	"Livro{ titulo: '" + titulo +
                "' autor: '" + autor +
                "' isbn: " + isbn + "}\n";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;
        Livro livro = (Livro) o;
        return Objects.equals(isbn, livro.isbn);
    }

    
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
package questao_5;

public class Livro {
	String titulo, autor;
	int anoPublicacao;
	
	void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	void setAutor(String autor) {
		this.autor = autor;
	}
	
	void setAnoPublicacao(Integer anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	String getTitulo() {
		return titulo;
	}
	
	String getAutor() {
		return autor;
	}
	
	int getAnoPublicacao() {
		return anoPublicacao;
	}
	
	
	void exibirDetalhes() {
		System.out.println("Título: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("Ano de Publicação: "+anoPublicacao);
	}
}

package questao_2;

import java.time.LocalDate;

public class Livro {
	private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean emprestado;
    private String nomeEmprestado;
    private LocalDate dataDevolucao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar(String nomeEmprestado, LocalDate dataDevolucao) {
        this.emprestado = true;
        this.nomeEmprestado = nomeEmprestado;
        this.dataDevolucao = dataDevolucao;
    }

    public void devolver() {
        this.emprestado = false;
        this.nomeEmprestado = null;
        this.dataDevolucao = null;
    }

    public String toString() {
        String status = emprestado ? "Emprestado a " + nomeEmprestado + " (devolver até " + dataDevolucao + ")" : "Disponível";
        return "Título: " + titulo + ", Autor: " + autor + ", Ano: " + anoPublicacao + " - " + status;
    }
}

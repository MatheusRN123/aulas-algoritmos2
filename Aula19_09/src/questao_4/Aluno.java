package questao_4;

public class Aluno {
	String nome;
	double nota1 = 0, nota2 = 0;
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	String getNome() {
		return nome;
	}
	
	double getNota1() {
		return nota1;
	}
	
	double getNota2() {
		return nota2;
	}
	
	double calcularMedia() {
		return (nota1+nota2)/2;
	}
	
	boolean aprovado() {
		return calcularMedia() >= 7;
	}
	
}

package questao_2;

public class Pessoa {
	String nome;
	Integer idade = 0;
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	String getNome() {
		return nome;
	}
	
	Integer getIdade() {
		return idade;
	}
	
	void cumprimentar() {
		System.out.println("Olá, "+nome+" como você está?");
	}
}
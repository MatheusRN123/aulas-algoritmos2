package questao_1;

public class TestePessoa {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Matheus");
		pessoa.setIdade(18);
		
		System.out.println("Nome: "+pessoa.nome+"\nIdade: "+pessoa.idade);
	}
}

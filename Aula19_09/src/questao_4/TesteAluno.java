package questao_4;

public class TesteAluno {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Matheus");
		aluno.setNota1(9);
		aluno.setNota2(6);
		
		System.out.println("Nome: "+ aluno.getNome());
		System.out.println("Primeira nota: "+aluno.getNota1());
		System.out.println("Segunda nota: "+aluno.getNota2());
		
		double media = aluno.calcularMedia();
		System.out.println("Média: "+media);
		
		System.out.println("Aprovado: "+ (aluno.aprovado() ? "Sim":"Não"));
	}
}



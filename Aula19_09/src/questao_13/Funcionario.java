package questao_13;

public class Funcionario {
	private String nome;
    private String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String toString() {
        return "Funcionário: " + nome + " (CPF: " + cpf + ")";
    }
}

package questao_9;

public class Cliente {
	private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    String getNome() {
        return nome;
    }

    String getCpf() {
        return cpf;
    }

    public String toString() {
        return "Cliente: " + nome + " (CPF: " + cpf + ")";
    }
}

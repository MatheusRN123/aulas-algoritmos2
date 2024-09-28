package questao_10;

public class Cliente {
	private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        setCpf(cpf); // Usar o método de encapsulamento
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        if (validarCpf(cpf)) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido. Deve conter 11 dígitos.");
        }
    }

    private boolean validarCpf(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }

    public String toString() {
        return "Cliente: " + nome + " (CPF: " + cpf + ")";
    }
}

package questao_12;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nome;
    private String cnpj;
    private List<Funcionario> funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<>();
    }

    public void contratarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println(funcionario.getNome() + " foi contratado.");
    }

    public void demitirFuncionario(String cpf) {
        Funcionario funcionarioARemover = null;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                funcionarioARemover = funcionario;
                break;
            }
        }

        if (funcionarioARemover != null) {
            funcionarios.remove(funcionarioARemover);
            System.out.println(funcionarioARemover.getNome() + " foi demitido.");
        } else {
            System.out.println("Funcionário com CPF " + cpf + " não encontrado.");
        }
    }

    public double calcularTotalSalarios() {
        double total = 0.0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.getSalario();
        }
        return total;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa: ").append(nome).append(" (CNPJ: ").append(cnpj).append(")\n");
        sb.append("Funcionários:\n");
        for (Funcionario funcionario : funcionarios) {
            sb.append(funcionario).append("\n");
        }
        return sb.toString();
    }
}

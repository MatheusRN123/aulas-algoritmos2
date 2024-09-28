package questao_13;

import java.util.HashMap;
import java.util.Map;

public class Loja {
	private String nome;
    private Map<String, Horario> registros;

    public Loja(String nome) {
        this.nome = nome;
        this.registros = new HashMap<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        registros.put(funcionario.getCpf(), new Horario(funcionario));
    }

    public void registrarEntrada(String cpf) {
        Horario registro = registros.get(cpf);
        if (registro != null) {
            registro.registrarEntrada();
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public void registrarSaida(String cpf) {
        Horario registro = registros.get(cpf);
        if (registro != null) {
            registro.registrarSaida();
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public void imprimirRegistros(String cpf) {
        Horario registro = registros.get(cpf);
        if (registro != null) {
            registro.imprimirRegistro();
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}

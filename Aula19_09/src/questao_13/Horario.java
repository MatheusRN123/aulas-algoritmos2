package questao_13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Horario {
	private Funcionario funcionario;
    private List<LocalDateTime> entradas;
    private List<LocalDateTime> saídas;

    public Horario(Funcionario funcionario) {
        this.funcionario = funcionario;
        this.entradas = new ArrayList<>();
        this.saídas = new ArrayList<>();
    }

    public void registrarEntrada() {
        entradas.add(LocalDateTime.now());
        System.out.println(funcionario.getNome() + " registrou entrada: " + getHoraAtual());
    }

    public void registrarSaida() {
        saídas.add(LocalDateTime.now());
        System.out.println(funcionario.getNome() + " registrou saída: " + getHoraAtual());
    }

    public void imprimirRegistro() {
        System.out.println("Registro de " + funcionario.getNome() + ":");
        for (int i = 0; i < entradas.size(); i++) {
            String entrada = entradas.size() > i ? entradas.get(i).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) : "Não registrada";
            String saida = saídas.size() > i ? saídas.get(i).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) : "Não registrada";
            System.out.println("Dia " + (i + 1) + ": Entrada: " + entrada + " | Saída: " + saida);
        }
    }

    private String getHoraAtual() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }
}

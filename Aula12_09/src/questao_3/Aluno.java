package questao_3;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
    private String matricula;
    private List<Disciplina> disciplinasMatriculadas;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void matricular(Disciplina disciplina) {
        disciplinasMatriculadas.add(disciplina);
        System.out.println("Aluno " + nome + " matriculado em " + disciplina.getNome());
    }

    public List<Disciplina> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public int calcularCargaHorariaCursada() {
        int totalHoras = 0;
        for (Disciplina disciplina : disciplinasMatriculadas) {
            totalHoras += disciplina.getCargaHoraria();
        }
        return totalHoras;
    }
}

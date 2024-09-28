package questao_3;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private List<Aluno> alunos;
    private List<Disciplina> disciplinas;

    public Curso() {
        this.alunos = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void visualizarDisciplinasAluno(Aluno aluno) {
        System.out.println("Disciplinas de " + aluno.getNome() + ":");
        for (Disciplina disciplina : aluno.getDisciplinasMatriculadas()) {
            System.out.println("- " + disciplina.getNome() + " (Carga Horária: " + disciplina.getCargaHoraria() + " horas)");
        }
        System.out.println("Carga Horária Cursada: " + aluno.calcularCargaHorariaCursada() + " horas");
        
        System.out.println("Disciplinas que ainda precisa completar:");
        for (Disciplina disciplina : disciplinas) {
            if (!aluno.getDisciplinasMatriculadas().contains(disciplina)) {
                System.out.println("- " + disciplina.getNome());
            }
        }
    }
}

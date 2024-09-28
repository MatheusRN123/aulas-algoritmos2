package questao_3;

public class TesteCurso {
	public static void main(String[] args) {
        Professor professor1 = new Professor("Carlos Silva", "Matemática");
        Professor professor2 = new Professor("Ana Pereira", "História");

        Disciplina disciplina1 = new Disciplina("Cálculo I", 60, professor1);
        Disciplina disciplina2 = new Disciplina("História do Brasil", 40, professor2);
        Disciplina disciplina3 = new Disciplina("Algoritmos", 80, professor1);
        
        Aluno aluno1 = new Aluno("Matheus Natividade", "2023001");
        
        Curso curso = new Curso();
        curso.adicionarDisciplina(disciplina1);
        curso.adicionarDisciplina(disciplina2);
        curso.adicionarDisciplina(disciplina3);
        
        curso.adicionarAluno(aluno1);
        
        aluno1.matricular(disciplina1);
        aluno1.matricular(disciplina2);

        curso.visualizarDisciplinasAluno(aluno1);
    }
}

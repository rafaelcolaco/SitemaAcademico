package sistema;

public class Main {
	public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1, "Rafael");
        Curso curso1 = new Curso("BCC", 5);
        Disciplina disciplina1 = new Disciplina(101, "POO");
        Disciplina disciplina2 = new Disciplina(102, "DEV-WEB");
        Professor professor1 = new Professor(1, "Prof.  Curvello");
        Professor professor2 = new Professor(2, "Prof. Marcela");
        Fase fase1 = new Fase(1);

        aluno1.matricular(curso1);
        curso1.adicionarFase(fase1);
        fase1.adicionarDisciplina(disciplina1);
        fase1.adicionarDisciplina(disciplina2);
        disciplina1.adicionarProfessor(professor1);
        disciplina2.adicionarProfessor(professor2);
        professor1.lecionar(disciplina1);
        professor2.lecionar(disciplina2);
        disciplina1.ofertar();
        disciplina2.ofertar();
        disciplina1.matricularAluno(aluno1);

        aluno1.registrarFrequencia(disciplina1, "2023-10-22", true);

        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Curso: " + aluno1.getCursos().get(0).getNome());
        System.out.println("Disciplinas inscritas:");
        for (Disciplina disciplina : aluno1.getCursos().get(0).getFases().get(0).getDisciplinas()) {
            System.out.println("  - " + disciplina.getNome());
        }

        System.out.println("Professores:");
        for (Disciplina disciplina : aluno1.getCursos().get(0).getFases().get(0).getDisciplinas()) {
            System.out.println("Disciplina: " + disciplina.getNome());
            for (Professor professor : disciplina.getProfessores()) {
                System.out.println("  - " + professor.getNome());
            }
        }

        System.out.println("Frequência de " + aluno1.getNome() + " em " + disciplina1.getNome() + ":");
        for (Frequencia frequencia : aluno1.getFrequencias()) {
            if (frequencia.getDisciplina() == disciplina1) {
                System.out.println("Data: " + frequencia.getData() + ", Presente: " + (frequencia.isPresente() ? "Sim" : "Não"));
            }
        }
    }
}

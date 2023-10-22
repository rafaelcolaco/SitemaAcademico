package sistema;

public class Frequencia {

	 private Aluno aluno;
	    private Disciplina disciplina;
	    private String data;
	    private boolean presente;

	    public Frequencia(Aluno aluno, Disciplina disciplina, String data, boolean presente) {
	        this.aluno = aluno;
	        this.disciplina = disciplina;
	        this.data = data;
	        this.presente = presente;
	    }

		public Aluno getAluno() {
			return aluno;
		}

		public void setAluno(Aluno aluno) {
			this.aluno = aluno;
		}

		public Disciplina getDisciplina() {
			return disciplina;
		}

		public void setDisciplina(Disciplina disciplina) {
			this.disciplina = disciplina;
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public boolean isPresente() {
			return presente;
		}

		public void setPresente(boolean presente) {
			this.presente = presente;
		}
	    
}

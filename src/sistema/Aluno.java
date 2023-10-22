package sistema;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private int matricula;
    private String nome;
    private List<Curso> cursos = new ArrayList<>();
    private List<Frequencia> frequencias = new ArrayList<>();

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public void matricular(Curso curso) {
        cursos.add(curso);
    }

    public void registrarFrequencia(Disciplina disciplina, String data, boolean presente) {
        Frequencia frequencia = new Frequencia(this, disciplina, data, presente);
        frequencias.add(frequencia);
    }

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public List<Frequencia> getFrequencias() {
		return frequencias;
	}

	public void setFrequencias(List<Frequencia> frequencias) {
		this.frequencias = frequencias;
	}
    
    
}

package sistema;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

	private int codigo;
    private String nome;
    private List<Professor> professores = new ArrayList<>();
    private boolean ofertada = false;
    private List<Aluno> inscritos = new ArrayList<>();

    public Disciplina(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void ofertar() {
        ofertada = true;
    }

    public void matricularAluno(Aluno aluno) {
        inscritos.add(aluno);
    }

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

	public boolean isOfertada() {
		return ofertada;
	}

	public void setOfertada(boolean ofertada) {
		this.ofertada = ofertada;
	}

	public List<Aluno> getInscritos() {
		return inscritos;
	}

	public void setInscritos(List<Aluno> inscritos) {
		this.inscritos = inscritos;
	}

	public Fase getFase() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
}

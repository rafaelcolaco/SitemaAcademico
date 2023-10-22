package sistema;

import java.util.ArrayList;
import java.util.List;

public class Professor {

	private int id;
    private String nome;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Professor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void lecionar(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
    
    
}

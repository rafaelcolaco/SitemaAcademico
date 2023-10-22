package sistema;

import java.util.ArrayList;
import java.util.List;


public class Curso {
	
	 private String nome;
	    private int duracao;
	    private List<Fase> fases = new ArrayList<>();

	    public Curso(String nome, int duracao) {
	        this.nome = nome;
	        this.duracao = duracao;
	    }

	    public void adicionarFase(Fase fase) {
	        fases.add(fase);
	    }

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getDuracao() {
			return duracao;
		}

		public void setDuracao(int duracao) {
			this.duracao = duracao;
		}

		public List<Fase> getFases() {
			return fases;
		}

		public void setFases(List<Fase> fases) {
			this.fases = fases;
		}
	    
	    
}

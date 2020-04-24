package poo.produtora;

import java.util.LinkedList;

public class Filme {
	private LinkedList <Ator> Atores = new LinkedList<Ator>();
	private LinkedList <Musico> Musicos = new LinkedList<Musico>();
	private Diretor Diretor = new Diretor();
	private String titulo;
	private int anoLancamento;
	
	public Filme(String titulo, int anoLancamento) {
		this.titulo = titulo;
		this.anoLancamento = anoLancamento;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	public LinkedList<Ator> getAtores() {
		return Atores;
	}
	public void setAtores(LinkedList<Ator> atores) {
		Atores = atores;
	}
	public LinkedList<Musico> getMusicos() {
		return Musicos;
	}
	public void setMusicos(LinkedList<Musico> musicos) {
		Musicos = musicos;
	}
	public Diretor getDiretor() {
		return Diretor;
	}
	public void setDiretor(Diretor diretor) {
		Diretor = diretor;
	}
	
	public String toStringAtores() {
		String resultado = "";
		for(int i = 0; i < Atores.size(); i++) {
			resultado += Atores.get(i).toString() + "\n\n";
		}
		return resultado;
	}
	
	public String toStringMusicos() {
		String resultado = "";
		for(int i = 0; i < Musicos.size(); i++) {
			resultado += Musicos.get(i).toString() + "\n\n";
		}
		return resultado;
	}
	
	@Override
	public String toString() {
		String resultado = "== Filme == \nTitulo : " + this.titulo + "\nAno de Lançamento : " + this.anoLancamento + "\n==== Diretor ====\n\n" + Diretor.toString() + "\n\n==== Atores ====\n\n" + toStringAtores() + "==== Musicos ====\n\n" + toStringMusicos();
		return resultado;
	}
}

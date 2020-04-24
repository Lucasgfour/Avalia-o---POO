package poo.produtora;

import java.util.LinkedList;

public class Produtora {
	private LinkedList <Filme> Filmes = new LinkedList<Filme>();
	private String nome;
	
	public Produtora(String nome) {
		this.nome = nome;
	}
	
	public LinkedList<Filme> getFilmes() {
		return Filmes;
	}
	public void setFilmes(LinkedList<Filme> filmes) {
		Filmes = filmes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		String resultado = "\n========== " + this.nome + "==========\n";
		for(int i = 0; i < Filmes.size(); i++) {
			resultado += Filmes.get(i).toString() + "\n\n";
		}
		return resultado;
	} 
}

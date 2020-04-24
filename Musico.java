package poo.produtora;

public class Musico extends Pessoa {
	private String estilo;
	
	public Musico(String nome, String nascimento, String estilo) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.estilo = estilo;
	}
	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	public String toString() {
		String resultado = "Nome : " + this.nome + "\nNascimento : " + this.nascimento.toString() + "\nEstilo : " + this.estilo;
		return resultado;
	}
}

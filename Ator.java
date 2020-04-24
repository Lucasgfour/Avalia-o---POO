package poo.produtora;

public class Ator extends Pessoa {

	private String nacionalidade;
	
	public Ator(String nome, String nascimento, String nacionalidade) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.nacionalidade = nacionalidade;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	@Override
	public String toString() {
		String resultado = "Nome : " + this.nome + "\nNascimento : " + this.nascimento.toString() + "\nNacionalidade : " + this.nacionalidade;
		return resultado;
	}
	
}

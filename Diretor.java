package poo.produtora;

public class Diretor extends Pessoa {
	public Diretor(String nome, String nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}
	
	public Diretor() {	}
	
	public String toString() {
		String resultado = "Nome : " + this.nome + "\nNascimento : " + this.nascimento.toString();
		return resultado;
	}
}

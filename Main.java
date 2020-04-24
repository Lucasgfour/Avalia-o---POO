package poo.produtora;


public class Main {
	public static void main(String[] args) {
		// Fimes
		Filme Filme01 = new Filme("A volta dos que não foram", 2005);
		Filme Filme02 = new Filme("Medo de caixa d'agua", 1999);
		
		// Atores
		Ator Ator01 = new Ator("Lucas Matheus", "20/01/2000", "Brasileiro");
		Ator Ator02 = new Ator("Wesley", "17/07/1998", "Brasileiro");
		Ator Ator03 = new Ator("João Pedro", "12/12/1999", "Brasileiro");
		
		// Musicos
		Musico Musico01 = new Musico("Ricardo Santiago", "05/06/1985", "Rock");
		Musico Musico02 = new Musico("Wellis", "03/04/1994", "Metal");
		Musico Musico03 = new Musico("Regis", "12/02/1997", "Funk");
		
		// Diretor
		Diretor Diretor01 = new Diretor("Gilberto Junior", "14/07/1980");
		
		Filme01.getAtores().add(Ator02);
		Filme01.getAtores().add(Ator03);
		Filme01.getMusicos().add(Musico02);
		Filme01.getMusicos().add(Musico03);
		Filme01.setDiretor(Diretor01);
		
		Filme02.getAtores().add(Ator01);
		Filme02.getAtores().add(Ator02);
		Filme02.getMusicos().add(Musico01);
		Filme02.getMusicos().add(Musico02);
		Filme02.setDiretor(Diretor01);
		
		Produtora Produtora01 = new Produtora("Libertas Studio");
		Produtora01.getFilmes().add(Filme01);
		Produtora01.getFilmes().add(Filme02);
		
		System.out.println(Produtora01);
	}
}

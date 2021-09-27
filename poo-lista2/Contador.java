package br.ufba.poo;

public class Contador {

	
	private static int contagem;
	
	public Contador() {
		contagem ++;
	}

	public static int getContagem() {
		return Contador.contagem;
	}

		
	
}

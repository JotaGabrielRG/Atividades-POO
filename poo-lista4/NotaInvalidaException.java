package br.ufba.poo;

public class NotaInvalidaException extends RuntimeException {
	
		
	
	@Override
	public String getMessage() {
		return "Nota invalida!" ;
	}
}

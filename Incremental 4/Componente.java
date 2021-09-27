package br.ufba.poo;

import com.googlecode.lanterna.TextColor;


public class Componente {

	protected Ponto origem;
	protected TextColor corDeFrente;
	protected TextColor corDeFundo;
	
	
	public Componente(Ponto origem) {
		super();
		this.origem = origem;
		this.corDeFrente = TextColor.ANSI.WHITE;
		this.corDeFundo = TextColor.ANSI.BLACK;
		
	}
	public Componente() {
		
	}
	


}
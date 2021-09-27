package br.ufba.poo;

import com.googlecode.lanterna.TextColor;
import br.ufba.myterminal.MyTerminal;
    
public class Rotulo extends Componente {
 
	private String texto;    
	 
	public Rotulo(String texto, TextColor corDeFrente, TextColor corDeFundo) {
		this.origem = new Ponto(0, 0);
		this.texto = texto;
		this.corDeFrente = corDeFrente;
		this.corDeFundo = corDeFundo;
 
	}
 
	public Rotulo(Ponto origem, String texto, TextColor corDeFrente, TextColor corDeFundo) {
		this.texto = texto;
		this.corDeFrente = corDeFrente;
		this.corDeFundo = corDeFundo;
		this.origem = origem;
	}
   
	public Rotulo(Ponto origem, String texto) {
		this.texto = texto;
		this.corDeFrente = TextColor.ANSI.WHITE;
		this.corDeFundo = TextColor.ANSI.BLACK;
		this.origem = origem;
	}

	public Rotulo(String texto) {
		this.texto = texto;
		this.corDeFrente = TextColor.ANSI.WHITE;
		this.corDeFundo = TextColor.ANSI.BLACK;
		this.origem = new Ponto(0, 0);
	}

	
	public String getTexto() {
		return texto;
	}

	
	public void setTexto(String texto) {
		this.texto = texto;
	}

	public TextColor getCorDeFrente() {
		return corDeFrente;
	}

	public void setCorDeFrente(TextColor corDeFrente) {
		this.corDeFrente = corDeFrente;
	}

	public TextColor getCorDeFundo() {
		return corDeFundo;
	}
 
	public void setCorDeFundo(TextColor corDeFundo) {
		this.corDeFundo = corDeFundo;
	}
  
	public Ponto getOrigem() {
		return origem;
	}
   
	public void setOrigem(Ponto origem) {
		this.origem = origem;
	}
	public void desenha(MyTerminal terminal) {
		TextColor corOriginalFrente = terminal.getForegroundColor();
		TextColor corOriginalFundo = terminal.getBackgroundColor();
		terminal.setForegroundColor(corDeFrente);
		terminal.setBackgroundColor(corDeFundo);
		terminal.setPosition(origem.getX(), origem.getY());
		terminal.print(texto);
		terminal.setForegroundColor(corOriginalFrente);
		terminal.setBackgroundColor(corOriginalFundo);

	}
}
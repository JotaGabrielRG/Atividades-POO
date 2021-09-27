package br.ufba.poo;

import org.apache.commons.lang3.StringUtils;
import com.googlecode.lanterna.TextColor;
import br.ufba.myterminal.MyTerminal;

public class Retangulo{   
	
	private Ponto origem; 
	private Ponto cantoOposto;  
	private char caractere = '#'; 
	private TextColor corDeFrente = TextColor.ANSI.WHITE;
	private TextColor corDeFundo = TextColor.ANSI.BLACK;

	public Retangulo(Ponto origem, Ponto cantoOposto) {
		if (cantoOposto.getX() < origem.getX() || cantoOposto.getY() < origem.getY()) {
			throw new IllegalArgumentException("Dimensoes invalidas");
		}
		this.origem = origem;
		this.cantoOposto = cantoOposto;
 
	}  

	public Retangulo(Ponto origem, int largura, int altura) {
		this(origem, origem.comDeslocamento(largura - 1, altura - 1));
	}

	public void desenha(MyTerminal terminal) {
		String texto = StringUtils.repeat(caractere, getLargura());
		Rotulo rotulo = new Rotulo(origem, texto, corDeFrente, corDeFundo);
		rotulo.setCorDeFrente(corDeFrente);
		rotulo.setCorDeFundo(corDeFundo);
		rotulo.setOrigem(origem);

		for (int i = 0; i < getAltura(); i++) {
			rotulo.desenha(terminal);
			rotulo.setOrigem(rotulo.getOrigem().comDeslocamento(0, 1));
		}

	}

	public void desloca(int dx, int dy) {
		origem = origem.comDeslocamento(dx, dy);
		cantoOposto = cantoOposto.comDeslocamento(dx, dy);

	}

	public void redimensiona(int largura, int altura) {
		if(largura < 1 || altura < 1) {
			throw new IllegalArgumentException("Dimensoes invalidas");
			}
		cantoOposto = origem.comDeslocamento(largura - 1, altura - 1);

	}

	public Ponto getOrigem() {
		return origem;
	}

	public int getLargura() {

		return this.cantoOposto.getX() - origem.getX() + 1;
	}

	public int getAltura() {

		return this.cantoOposto.getY() - origem.getY() + 1;

	}
 
	public void setLargura(int largura) {
		if(largura < 1 ) {
			throw new IllegalArgumentException("Dimensoes invalidas");
		}
		cantoOposto = new Ponto(origem.getX() + largura - 1, cantoOposto.getY());

	}

	public void setAltura(int altura) {
		if(altura < 1 ) {
			throw new IllegalArgumentException("Dimensoes invalidas");
		}
		cantoOposto = new Ponto(cantoOposto.getX(), origem.getY() + altura - 1);
	}

	public char getCaractere() {
		return caractere;
	}

	public void setCaractere(char caractere) {
		this.caractere = caractere;
	}

	public void setOrigem(Ponto origem) {
		if (cantoOposto.getX() < origem.getX() || cantoOposto.getY() < origem.getY()) {
			throw new IllegalArgumentException("Dimensoes invalidas");
		}
		this.origem = origem;
	}

	public Ponto getCantoOposto() {
		return cantoOposto;
	}

	public void setCantoOposto(Ponto cantoOposto) {
		if (cantoOposto.getX() < origem.getX() || cantoOposto.getY() < origem.getY()) {
			throw new IllegalArgumentException("Dimensoes invalidas");
		}
		this.cantoOposto = cantoOposto;
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

}
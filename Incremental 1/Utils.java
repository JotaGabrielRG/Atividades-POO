package br.ufba.poo;

import org.apache.commons.lang3.StringUtils;

import com.googlecode.lanterna.TextColor;

import br.ufba.myterminal.MyTerminal;

public class Utils {
	/**
	 * Desenha um retângulo no terminal usando o caractere "#", com
	 * a cor especificada.
	 * Este método não chama terminal.draw().
	 * A cor configurada no terminal (com setForegroundColor()) antes
	 * de chamar este método é restaurada após a chamada. 
	 * 
	 * @param terminal terminal onde será realizado o desenho
	 * @param x coordenada X do canto superior esquerdo do retângulo
	 * @param y coordenada Y do canto superior esquerdo do retângulo
	 * @param w largura do retângulo (em caracteres)
	 * @param h altura do retângulo (em caracteres)
	 * @param color cor do retângulo
	 */
	public static void desenhaRetangulo(MyTerminal terminal, int x, int y, int w, int h, TextColor color) {
		// TODO: implemente o método
		terminal.setPosition(x, y);
		TextColor corOriginal = terminal.getForegroundColor();
		
		terminal.setForegroundColor(color);
		String desenhoLargura = StringUtils.repeat('#', w);
		for(int i = 0; i < h; i++) {
			terminal.println(desenhoLargura);
		}
		terminal.setForegroundColor(corOriginal);
	}
	
	/**
	 * Imprime a mensagem "Alo mundo" no terminal.
	 * 
	 * @param terminal terminal onde a mensagem será impressa
	 */
	public static void aloMundo(MyTerminal terminal) {
		// TODO: implemente o método
		terminal.println("Alo mundo");
	}
	

	/*
	 * Exemplo de programa usando os métodos acima.
	 */
	public static void main(String[] args) {
		MyTerminal terminal = new MyTerminal();
		terminal.setForegroundColor(TextColor.ANSI.CYAN);
		
		terminal.setPosition(4, 0);
		aloMundo(terminal);
		aloMundo(terminal);
		desenhaRetangulo(terminal, 5, 4, 8, 4, TextColor.ANSI.BLUE);
		desenhaRetangulo(terminal, 4, 3, 8, 4, TextColor.ANSI.WHITE);
		
		terminal.setPosition(0, 2);
		aloMundo(terminal);
		
		terminal.draw();
	}
}

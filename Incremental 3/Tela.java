package br.ufba.poo;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import br.ufba.myterminal.MyTerminal;

public class Tela {  

	private List<Retangulo> Retangulos = new ArrayList<Retangulo>();
	private List<Rotulo> Rotulos = new ArrayList<Rotulo>();
	

	public void addRetangulo(Retangulo retangulo) {
		this.Retangulos.add(retangulo);
	}
 
	public void addRotulo(Rotulo rotulo) {
		this.Rotulos.add(rotulo);
	}
 
	public List<Retangulo> getRetangulos() {
		return Collections.unmodifiableList(Retangulos);
	}
 
	public List<Rotulo> getRotulos() {
		return Collections.unmodifiableList(Rotulos);
	}
 
	public void desenha(MyTerminal terminal) {
		terminal.clear();

		for (int i = 0; i < Retangulos.size(); i++) {

			Retangulos.get(i).desenha(terminal);
		}
		for (int i = 0; i < Rotulos.size(); i++) {

			Rotulos.get(i).desenha(terminal);
		}
				
	}
	

}

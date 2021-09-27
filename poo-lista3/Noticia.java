package br.ufba.poo.conteudo;

public class Noticia extends Conteudo {

	private String autor;
	private int data;

	public Noticia(String titulo, String corpo, String autor, int data) {
		super(titulo, corpo);
		this.autor = autor;
		this.data = data;

	}

	public String getAutor() {
		return autor;
	}
   
	public int getData() {
		return data;
	}

	public String setAutor() {
		return autor;
	}

	public int setData() {
		return data;
	}
}

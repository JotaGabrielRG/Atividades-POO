package br.ufba.poo;

public class Aluno {
	private String nome;
	private double nota;
	
	public Aluno(String nome, double nota) {
		if (nota < 0 || nota > 10) {
			throw new NotaInvalidaException();
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}


}

package br.ufba.poo;

public class Ponto {

	private int x;
	private int y;

	public Ponto(int somaX, int somaY) {
		this.x = somaX;
		this.y = somaY;
	}

	public Ponto comDeslocamento(int dx, int dy) {
		int somaX = this.x + dx;
		int somaY = this.y + dy;
		Ponto ponto = new Ponto(somaX, somaY);

		return ponto;
	}
 
	public int getX() {
		return x;
	}
  
	public int getY() {
		return y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ponto other = (Ponto) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;

	}
}
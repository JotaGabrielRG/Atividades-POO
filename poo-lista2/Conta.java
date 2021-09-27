package br.ufba.poo;

public class Conta {

	private double saldo;
	private String codigo;
	
	public Conta(String codigo) {
		this.codigo = codigo;
		this.saldo = 0;
	}

	public Conta(String codigo, double saldo) {
		this.codigo = codigo;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public boolean retira(double quantia) {
		if(this.saldo < quantia)
			return false;
		
		this.saldo -= quantia;
		return true;
	}

	public void deposita(double quantia) {
		this.saldo += quantia; 

	}
	public boolean transfere(double quantia, Conta beneficiario) {
		if(this.saldo < quantia || beneficiario == null)
			return false;
		
		this.saldo -= quantia;
		beneficiario.saldo += quantia; 
		
		return true;
	}
}

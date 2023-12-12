package Banco;

public class Conta {
	
	protected double saldo; 
	protected int numero; 
	protected String titular;
	
	private double getSaldo() {
		return saldo;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	private int getNumero() {
		return numero;
	}
	private void setNumero(int numero) {
		this.numero = numero;
	}
	private String getTitular() {
		return titular;
	}
	private void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void sacar(double dinheiro) {
		if(getSaldo() > 0) {
			double saque = getSaldo() - dinheiro;
			setSaldo(saque);
		} else {
			System.out.println("Saldo insuficiente para realizar a operação solicitada!");
		}
	}
	
	public void depositar(double dinheiro) {
		double deposito = getSaldo() + dinheiro;
		setSaldo(deposito);
	}

}

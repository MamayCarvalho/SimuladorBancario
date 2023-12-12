package Banco;

public class Conta {
	
	private double saldo; 
	private int numero; 
	private String titular;
	private String tipoConta;
	
	
	public Conta(String titular, String tipoConta) {
		this.saldo = 0;
		this.numero = 0;
		this.titular = titular;
		this.tipoConta = tipoConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void saque(double dinheiro) {
		double retirarSaldo = getSaldo() - dinheiro;
		if(retirarSaldo > 0) {
			setSaldo(retirarSaldo);
		} else {
			System.out.println("Saldo insuficiente para realizar a operação solicitada!");
		}
	}
	
		
	public void depositar(double dinheiro) {
		double addDeposito = getSaldo() + dinheiro;
		setSaldo(addDeposito);
	}

}

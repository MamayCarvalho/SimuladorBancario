package Banco;

public class ContaPF extends Conta{
	
	private final double limiteEmprestimo = 1100.50;
	private final double taxaSaque = 1.75;
	private double emprestimo;
	
	  public ContaPF(String titular, double limiteEmprestimo, double taxaSaque) {
	        super(titular, "PF");
	    }
	
	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}
	public double getTaxaSaque() {
		return taxaSaque;
	}
	
	public double getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(double emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	public void sacar(double dinheiro) {
		double retirarSaldo = getSaldo() - (getTaxaSaque()) - dinheiro;
		if(retirarSaldo > 0) {
			setSaldo(retirarSaldo);
		} else {
			System.out.println("Saldo insuficiente para realizar a operação solicitada!");
		}
	}
	
	public void deposito(double dinheiro) {
		depositar(dinheiro);
	} 
	
	public void emprestimo(double dinheiro) {
		if(dinheiro > getLimiteEmprestimo()) {
			System.out.println("Seu limite de Emprestimo é de R$" + getLimiteEmprestimo());
		}else {
			dinheiro =- getLimiteEmprestimo() - getTaxaSaque();
		}
	}

}

package Banco;

public class ContaPF extends Conta{
	
	private final double limiteEmprestimo = 1100.50;
	private final double taxaSaque = 1.75;
	private double emprestimo;
	
	  public ContaPF(String titular) {
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
	
	public void emprestimo(double dinheiro) {
		if(dinheiro > getLimiteEmprestimo()) {
			System.out.println("Seu limite de Emprestimo é de R$" + getLimiteEmprestimo() + "! Solicite um valor igual ou abaixo do mesmo.");
		}else {
			dinheiro = getSaldo() - getTaxaSaque();
			setEmprestimo(dinheiro);
			System.out.println("O valor de R$" + getEmprestimo() + " foi depositado em sua conta. Seu saldo atual é de " + getSaldo());
		}
	}

}

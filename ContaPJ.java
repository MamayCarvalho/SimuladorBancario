package Banco;

public class ContaPJ extends Conta {
	
	private double emprestimo;
	private final double limiteEmprestimo = 2500.00;
	
	public ContaPJ(String titular, double limiteEmprestimo) {
		super(titular, "PJ");
	}
	
	public double getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(double emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	private double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}
	
	public void emprestimo(double dinheiro) {
		if(dinheiro > getLimiteEmprestimo()) {
			System.out.println("Seu limite de emprestimo é de R$" + getLimiteEmprestimo());
		} else {
			saque(dinheiro);
		}
	}
}

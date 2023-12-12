package Banco;

public class ContaPoupanca extends Conta {
	
	private final double taxaRendimento = 1.5;
	
	  public ContaPoupanca(String titular, double taxaRendimento) {
	        super(titular, "Poupança");

	    }
	
	public double getTaxaRendimento() {
		return taxaRendimento;
	}
	
	public void atualizarSaldo() {
		double atualizarSaldo = getSaldo() + (getSaldo() * getTaxaRendimento());
				setSaldo(atualizarSaldo);
	}
	
	public void sacar(double dinheiro) {
		saque(dinheiro);
	}
	
	public void deposito(double dinheiro) {
			depositar(dinheiro);
			atualizarSaldo();
	} 
}

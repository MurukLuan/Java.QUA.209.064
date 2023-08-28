package entities;

public class ContaCorrente extends Conta {

	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(String titularConta, int agencia, int numeroConta) {
		super(titularConta, agencia, numeroConta);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sacar(double quantiaEmReais) {	
		saldo -= quantiaEmReais + 2;	
	}
	
	@Override
	public void depositar(double quantiaEmReais) {
		saldo += quantiaEmReais + bonusPorDeposito();
	}
	
	public double bonusPorDeposito() {
		return 0.50;
	}

}

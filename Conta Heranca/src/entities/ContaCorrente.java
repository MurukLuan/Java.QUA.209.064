package entities;

public class ContaCorrente extends Conta {

	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(String titular, int numeroConta, int agencia) {
		super(titular, numeroConta, agencia);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sacar(double valor){
	
		if(saldo - (valor + 2) < -150.00) {
			System.out.println("Saldo indisponivel. saldo: " + saldo);
		}
		else {
			saldo -= valor + 2;
		}
	}

}

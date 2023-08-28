package entities;

public class Conta {
	
	private String titular;
	private int numeroConta;
	private int agencia;
	protected double saldo;
	
	public Conta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Conta(String titular, int numeroConta, int agencia) {
		super();
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
	}
	
	public Conta(String titular, int numeroConta) {
		super();
		this.titular = titular;
		this.numeroConta = numeroConta;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "numero da conta: " + numeroConta
				+"\nAgencia: " + agencia
				+"\nTitular: "+ titular
				+"\nSaldo: " + saldo;
	}

}

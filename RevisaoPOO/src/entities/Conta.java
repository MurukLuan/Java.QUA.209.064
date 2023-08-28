package entities;

public class Conta {

	/*
	 * ordem de visualiza��o ou declara��o: 1� atributos 2� contrutores da classe 3�
	 * metodos gete e set 4� metodos (fun��es) necessarios;
	 */

	private String titularConta;
	private int agencia;
	private int numeroConta;
	protected double saldo;

	public Conta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Conta(String titularConta, int agencia, int numeroConta) {
		super();
		this.titularConta = titularConta;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double quantiaEmReais) {
		saldo = saldo + quantiaEmReais;
	}

	public void sacar(double quantiaEmReais) {
		saldo = saldo - quantiaEmReais;
	}

	public void mostraDadosDaConta() {
		System.out.println("nome do titular: " + getTitularConta());
		System.out.println("Agencia: " + getAgencia());
		System.out.println("Conta n�: " + getNumeroConta());
		System.out.println("Saldo: " + getSaldo());
	}

	/*
	 * public double bonus() { return 200.55; }
	 */

}

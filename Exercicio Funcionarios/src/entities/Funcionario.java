package entities;

public class Funcionario {
	
	protected double salario;
	private String nome;
	
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Funcionario(double salario, String nome) {
		super();
		this.salario = salario;
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	

}

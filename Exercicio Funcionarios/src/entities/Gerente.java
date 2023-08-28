package entities;

public class Gerente extends Funcionario{
	
	private int estacaoTrabalho;

	public Gerente(double salario, String nome,int estacaoTrabalho) {
		super(salario, nome);
		this.estacaoTrabalho = estacaoTrabalho;
	}

	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void retornaBaia(int estacaoTrabalho) {
		this.estacaoTrabalho = estacaoTrabalho;
	}
	
	public double bonificacao() {
		return this.salario * 0.10;
	}


}

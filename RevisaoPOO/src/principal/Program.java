package principal;

import entities.Conta;
import entities.ContaCorrente;

public class Program {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		//double x = 200.25;
		conta.setTitularConta("Luan Muruk");
		conta.setNumeroConta(1234);
		conta.setAgencia(4321);
		conta.depositar(200.25);
		conta.mostraDadosDaConta();
		conta.sacar(200.00);
		conta.mostraDadosDaConta();
		
		
		/*double bonificacao = conta.bonus();
		
		System.out.println(conta.bonus() + 2);
		System.out.println(bonificacao + 100);
		*/
		
		ContaCorrente cc = new ContaCorrente();
		
		cc.setTitularConta("Luan Muruk");
		cc.setNumeroConta(1234);
		cc.setAgencia(4321);
		cc.depositar(200.25);
		cc.mostraDadosDaConta();
		cc.sacar(200.00);
		cc.mostraDadosDaConta();
	
		
	}

}

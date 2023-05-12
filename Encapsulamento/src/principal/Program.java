package principal;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		
		System.out.println("Entre com o numero da conta: ");
		conta.setNumeroDaConta(sc.nextInt());
		
		System.out.println("Entre com a agencia: ");
		conta.setAgencia(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Entre com o titular da conta: ");
		conta.setTitular(sc.nextLine());
		
		System.out.println("Entre com o valor do deposito: ");
		conta.depositar( sc.nextDouble());
				
		System.out.print(conta);
		System.out.println("Saldo: " + conta.getSaldo());
		
		System.out.print("Qual o valor do saque: ");
		conta.sacar(sc.nextDouble());
		
		System.out.print(conta);
		System.out.println("Saldo: " + conta.getSaldo());
		
		sc.close();

	}

}

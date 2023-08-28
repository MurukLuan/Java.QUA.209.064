package principal;

import java.util.Scanner;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String nome = "Luan";
		int contaNumero = 1234;
		int agencia = 4321;
		
		Conta conta = new Conta(nome, contaNumero, agencia);
		Conta contaCorrente = new ContaCorrente(nome, contaNumero, agencia);
		Conta contaPoupanca = new ContaPoupanca(nome, contaNumero, agencia);
		
		
		conta.depositar(250.00);
		conta.sacar(50.00);
		System.out.println(conta);
		System.out.println("/***************************/");
		
		contaCorrente.depositar(250.00);
		contaCorrente.sacar(380.00);
		System.out.println(contaCorrente);
		contaCorrente.sacar(16.0);
		System.out.println(contaCorrente);
		
		System.out.println("/************/");
		
		contaPoupanca.depositar(250.00);
		contaPoupanca.sacar(50.00);
		System.out.println(contaPoupanca);
		
		sc.close();
	}

}

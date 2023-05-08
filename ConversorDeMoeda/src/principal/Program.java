package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fa�a um programa que receba um valor 
		 * em real e converta para d�lares na cota��o atual, 
		 * fa�a o inverso tamb�m;
		 */
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Entre com o valor em real para ser convertido: R$ ");
		double valorEmReal = sc.nextDouble();
		
		System.out.print("Entre com o valor em dolar para ser convertido: $ ");
		double valorEmDolar = sc.nextDouble();
		
		System.out.print("Entre com o valor do dolar: $ ");
		double valorDoDolar = sc.nextDouble();
		
		converterEmDolar(valorEmReal, valorDoDolar);
		converterEmReal(valorEmDolar, valorDoDolar);		
		
		sc.close();

	}
	
	static void converterEmDolar(double real, double dolar) {
		System.out.printf("o valor R$ %.2f convertido em Dolar �: $ %.2f", real, (real / dolar) );
	}
	
	static void converterEmReal(double dolar, double real) {
		System.out.printf("\nO valor $ %.2f convertido para o Real �: R$ %.2f", dolar, (dolar * real));
	}
	
	

}

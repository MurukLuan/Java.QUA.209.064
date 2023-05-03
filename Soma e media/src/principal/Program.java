package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("Entre com o primeiro numero: ");
		int numero1 = sc.nextInt();
		System.out.print("Entre com o segundo numero: ");
		int numero2 = sc.nextInt();
		
		int resultado = numero1 + numero2;
		System.out.println("O resultado é: " + resultado);
		System.out.println("O resultado é: " + (numero1+numero2));
		*/
		
		System.out.print("Entre com a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Entre com a primeira nota: ");
		double nota2 = sc.nextDouble();
		
		System.out.print("Entre com a primeira nota: ");
		double nota3 = sc.nextDouble();
		
		System.out.print("Entre com a primeira nota: ");
		double nota4 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A media é: " + media);
		System.out.println("A media é: " 
		+ ((nota1 + nota2 + nota3 + nota4) / 4));
		
		sc.close();

	}

}

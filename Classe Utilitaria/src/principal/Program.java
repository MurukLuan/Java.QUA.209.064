package principal;

import java.util.Scanner;

import utilitie.Calculo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um numero: ");
		int n1 = sc.nextInt();
		System.out.print("Entre com um numero: ");
		int n2 = sc.nextInt();
		
		System.out.print("Entre com a largura do lote: ");
		double largura = sc.nextDouble();
		
		System.out.print("Entre com o comprimento do lote: ");
		double comprimento = sc.nextDouble();
		
		System.out.println(
		Calculo.retornaMetroQuadrado(largura, comprimento)
		);
		
		System.out.println(
		Calculo.somaDoisNumeros(n1, n2)
		);
		/*
		 * x = -b² +/- sqrt(delta) / 2.a
		 * 
		 * */
		sc.close();

	}

}

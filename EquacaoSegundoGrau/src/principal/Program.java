package principal;

import java.util.Scanner;

import entities.Equacao;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Equacao eq = new Equacao();
		
		System.out.print("Entre com o valor de a: ");
		eq.a = sc.nextInt();
		System.out.print("Entre com o valor de b: ");
		eq.b = sc.nextInt();
		System.out.print("Entre com o valor de c: ");
		eq.c = sc.nextInt();
		
		System.out.println(eq.retornaX());
		
		sc.close();

	}

}

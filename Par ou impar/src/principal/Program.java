package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um numero para "
				+ "saber se � par ou impar:");
		int numero = sc.nextInt();
		
		if( numero % 2 == 0) {
			System.out.println("Numero informado � par!");
		}
		else {
			System.out.println("Numero informado � impar!");
		}
		
		sc.close();

	}

}

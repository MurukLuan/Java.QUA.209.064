package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Switch case
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com um numero "
				+ "entre 1 e 7: ");
		
		int numero = sc.nextInt();
		
		switch (numero) {
			case 1:
				System.out.println("Domingo");
			break;
			
			case 2:
				System.out.println("Segunda");
			break;
			
			default:
				System.out.println("O numero informado n�o corresponde "
						+ "a um dia da semana!");
				break;
		}
		
		sc.close();

	}

}

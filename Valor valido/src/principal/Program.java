package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double nota = 0;
		
		System.out.println("Entre com uma nota valida entre 0 e 10");
		nota = leia.nextDouble();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Numero fora do esperado");
			System.out.println("Entre com um valor valido");
			nota = leia.nextDouble();
		}
		
		System.out.println("O numero foi valido. " + nota);
	}

}

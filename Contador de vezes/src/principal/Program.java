package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao = 0;
		int contador = 0;
		
		System.out.println("Entre com o valor 1 para sim");
		System.out.println("Entre com o valor 0 para não");
		opcao = leia.nextInt();
		while(opcao == 1) {			
			System.out.println("Entre com o valor 1 para sim");
			System.out.println("Entre com o valor 0 para não");
			opcao = leia.nextInt();
			
			contador++;
		}
		System.out.println("Quantidade de vezes sim: " + contador);
		
		leia.close();

	}

}

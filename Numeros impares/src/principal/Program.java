package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*for(int contador = 1; contador <= 20; contador++) {
			System.out.println(contador);
		}
		
		for(int contador = 1; contador <= 20; contador++) {
			System.out.print(" " + contador );
		}
		System.out.println();
		int contador = 1;
		while(contador <= 20) {
			
			System.out.println(contador);
			contador++;
		}*/
		Scanner sc = new Scanner(System.in);
		
		/*double altura = 0.0;
		double media = 0.0;
		
		for(int contador = 1; contador <=5; contador++) {
			System.out.print("Entre com a altura: ");
			altura = sc.nextDouble();
			
			media = media + altura;
		}
		
		System.out.println("Media das alturas: " + (media / 5));*/
		
		/*int numero;
		int contador = 0;
		
		System.out.print("Entre com 1 para sim e 0  para sair:");
		numero = sc.nextInt();
		
		while(numero == 1) {
			System.out.print("Entre com 1 para sim e 0  para sair:");
			numero = sc.nextInt();
			contador++;
		}
		
		System.out.println("Contador valendo: " + contador);
		*/
		
		double altura = 0.0;
		double media = 0.0;
		int contador = 0;
		
		while(contador < 5 ) {
			
			System.out.println("Entre com a altura: ");
			altura = sc.nextDouble();
			
			media += altura;
			
			contador++;
			System.out.println(contador);
		}
		
		System.out.println("Media das alturas: " + (media / contador));
		System.out.println("Contador: " + contador);
		
		sc.close();
		

	}

}

package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		double altura = 0.0;
		double soma = 0.0;
		int contador = 1;
		
		while(contador <= 5) {
			System.out.print("Entre com a altura: ");
			altura = leia.nextDouble();
			
			soma = soma + altura;
			System.out.println("contador: " + contador);
			contador++;
			System.out.println("contador: " + contador);
		}
		System.out.println("Contador: " + contador);
		System.out.println("A media das alturas �: " 
		+ (soma / contador));
		
		leia.close();

	}

}

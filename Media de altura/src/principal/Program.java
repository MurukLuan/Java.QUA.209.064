package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double soma = 0.0;
		double altura = 0.0;
		
		for(int contador = 1; contador <= 5; contador++) {
			System.out.print("insira a altura: ");
			altura = leia.nextDouble();
			soma += altura;
		}
		System.out.println("A media das alturas é: " + (soma / 5));
		
		leia.close();

	}

}

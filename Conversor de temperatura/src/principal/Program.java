package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("Entre com a temperatura em Fahrenheit: ");
		double f = sc.nextDouble();
		
		double celsius = 5 * ((f-32)/9);
		
		System.out.printf("A temperatura em celsius é: %.2f", celsius);*/
		
		System.out.print("Entre com a temperatura em celsius: ");
		double c = sc.nextDouble();
		
		double f = (c * 9 / 5) + 32 ;
		
		System.out.printf("A temperatura em celsius é: %.2f", f);
		
		sc.close();

	}

}

package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero:");
		int n1 = sc.nextInt();
		
		System.out.println("Entre com o segundo numero:");
		int n2 = sc.nextInt();
		
		System.out.println("Entre com o terceiro numero:");
		int n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior numero �: " + n1);
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("O maior numero �: " + n2);
		}
		else {
			System.out.println("o maior numero �: " + n3);
		}
		
		
		sc.close();

	}

}

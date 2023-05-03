package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o ano para saber "
				+ "se é bissexto ou não");
		int ano = sc.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("O ano é bissexto!");
		}
		else {
			System.out.println("O ano não é bissexto!");
		}
		
		sc.close();

	}

}

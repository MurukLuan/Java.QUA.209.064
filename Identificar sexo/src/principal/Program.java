package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o sexo (m/f): ");
		char sexo = sc.next().charAt(0);
		
		if(sexo == 'm') {
			System.out.println("O sexo digitado foi masculino");
		}
		else {
			System.out.println("O sexo digitado foi feminino");
		}		
		
		sc.close();
		
	}

}

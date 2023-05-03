package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com a primeira nota: ");
		double n1 = sc.nextDouble();
		
		System.out.print("Entre com a segunda nota: ");
		double n2 = sc.nextDouble();
		
		System.out.print("Entre com a terceira nota: ");
		double n3 = sc.nextDouble();
		
		System.out.print("Entre com a quarta nota: ");
		double n4 = sc.nextDouble();
		
		double media = (n1 + n2 + n3 + n4)/4;
		
		if(media < 6 ) {
			System.out.println("Aluno reprovado! media: " 
					+ media);
		}
		else if(media >= 6 && media < 7) {
			System.out.println("Aluno de recuperação! "
					+ "media: " + media);
		}
		else if(media >= 7 && media <= 9.9) {
			System.out.println("Aluno aprovado! media: "
					+ media);
		}
		else {
			System.out.println("Aluno aprovado com honras"
					+ "! media: " + media);
		}
		
		sc.close();

	}

}

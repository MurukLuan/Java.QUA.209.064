package principal;

import java.util.Random;
import java.util.Scanner;

public class Randon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		//int num = rd.nextInt(10);
		
		//System.out.println("Numero gerado: " + num);
		
		//fazer um programa estilo o sorteio da megasena
		//fazer um programa de sorteio, que receba 10 nomes e 
		// indique um ganhador
		
		String[] nome = new String[5];
		
		for(int i = 0; i < nome.length; i++) {
			System.out.print("Entre com o nome: ");
			nome[i] = sc.nextLine();
		}
		 System.out.println("O ganhador foi: " + (nome[rd.nextInt(6)]));	
		 sc.close();
	}

}

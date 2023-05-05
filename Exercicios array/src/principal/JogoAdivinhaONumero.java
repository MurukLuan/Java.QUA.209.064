package principal;

import java.util.Scanner;

public class JogoAdivinhaONumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] numero = new int[5];
		
		for(int i = 0; i < numero.length; i++) {
			System.out.print("Entre com o numero: ");
			numero[i] = sc.nextInt();
		}		
		
		char opcao = 'n';
		int tentativas = 3;
		boolean acerto = false;
		do {
			System.out.print("Entre com o numero pra saber se tem na lista: ");
			int recebido = sc.nextInt();
			sc.nextLine();
						
			for(int i = 0; i < numero.length; i++) {
				if(recebido == numero[i]) {
					System.out.println("Voc� acertou! tem o n�mero " + recebido);
					acerto = true;
					opcao = 'n';
					tentativas = 0;
				}
			}
			tentativas--;
			if(acerto == false && tentativas > 0) {
				System.out.println("Voce errou!");
				
				System.out.print("Deseja tentar mais uma vez? s / n: ");
				opcao = sc.next().charAt(0);
				
				if(opcao == 's') {					
					System.out.println("Tentativas restantes: " +  tentativas);
				}
				else if(opcao == 'n') {
					System.out.println("Voc� ainda tinha: " +  tentativas + " tentativas");
					System.out.println("Que pena! Voc� n�o acertou o n�mero");
				}	
			}		
		}while(opcao == 's' && tentativas > 0);
		
		System.out.println("Fim de jogo!");
		
		sc.close();
	}

}

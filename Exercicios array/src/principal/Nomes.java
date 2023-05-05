package principal;

import java.util.Scanner;

public class Nomes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de nomes que "
				+ "pretende inserir");
		int qtd = sc.nextInt();
		sc.nextLine();
		
		String[] nomes = new String[qtd];
		//loop para inserir os nomes, enquanto o array for
		//menor que o contador
		for(int contador = 0; contador < nomes.length; contador++) {
			System.out.print("Digite o nome: ");
			nomes[contador] = sc.nextLine();
		}
		//imprima cada nome contido em nomes
		for(String cadaNome : nomes) {
			System.out.println(cadaNome);
		}
		
		sc.close();
	}

}

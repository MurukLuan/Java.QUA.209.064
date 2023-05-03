package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// for usada quando ja sabemos a quantidade de 
				//vezes que deve ser executado
				
				/*for(int contador = 0; contador <= 3; contador+= 2) {
					System.out.println("digite o nome:  ");
					String nome = sc.nextLine();
					
					System.out.println("nome: " + nome);
				}
		
		int soma = 0;
		for(int contador = 0; contador >= -20; contador-= 2) {
			System.out.println("valor do contador:  " + contador);
			
			soma += contador;
		}
		
		System.out.println("A soma foi: " + soma);
		
		//usamos a estrutura while quando n�o sabemos
		//a quantidade de vezes que ser� repetida
		
		System.out.println("Deseja cadastrar um usuario? (s/n)");
		String opcao = sc.nextLine();
		int contador = 1;
		while(opcao.equals("s")) {
			System.out.println("posi��o do cadastro: " + contador);
			contador++;
			System.out.println("Deseja cadastrar um usuario? (s/n)");
			opcao = sc.nextLine();
		}		
		System.out.println("Quantidade de cadastros: " + contador);
		*/
		
		//estrutura do while garante que o bloco ser� 
		//executado ao menos uma vez
		char opcao;
		int contador = 0;
		
		do {
		System.out.println("Deseja cadastrar um usuario");
		opcao = sc.next().charAt(0);
		contador++;
		}while(opcao == 's');
		
		System.out.println("Contador: " + contador);
	}

}

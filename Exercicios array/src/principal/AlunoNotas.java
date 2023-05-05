package principal;

import java.util.Scanner;

public class AlunoNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double[] notas = new double[4];
		String nome;
		
		System.out.print("Entre com o nome do Aluno: ");
		nome = sc.nextLine();
		//recebe as notas enquanto o array for menor que o contador
		for(int contador = 0; contador < notas.length; contador ++) {
			System.out.print("Entre com a nota: ");
			notas[contador] = sc.nextDouble();
		}
		
		//imprime o nome do aluno
		System.out.println("Nome do aluno: " + nome);
		
		//imprime todas as notas contidas em notas
		for(double todas : notas) {
			System.out.println(todas);
		}
		
		sc.close();
	}

}

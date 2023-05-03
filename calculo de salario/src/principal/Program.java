package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quanto voce ganha por hora? ");
		double valorHora = sc.nextDouble();
		
		System.out.print("Quantas horas trabalhou no mes: ");
		double quantidadeHoras = sc.nextDouble();
		
		double salarioBruto = valorHora * quantidadeHoras;
		
		System.out.println("Salario bruto: R$ " + salarioBruto);
		System.out.println("Salario Bruto: R$ " 
		+ (valorHora * quantidadeHoras));
		
		sc.close();

	}

}

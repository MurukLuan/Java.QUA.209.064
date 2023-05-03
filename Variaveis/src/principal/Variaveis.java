package principal;

import java.nio.Buffer;
import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int idade = 18;
		double altura = 1.83;
		String nome = "Luan Muruk";
		char sexo = 'm';
		
		System.out.print("Aqui vai um texto");
		System.out.println("Meu nome é: " + nome + 
				"\nminha altura é: " + altura +
				"\nminha idade é: " + idade +
				"\nmeu sexo é: " + sexo);
		
		/*System.out.println(nome + idade + altura + sexo);
		System.out.println(idade);
		System.out.println(altura);
		System.out.println(sexo);
		
		
		
		System.out.println("minha idade é: " + idade);
		System.out.print("Meu nome é " + nome);
		
		int numero1 = 10;
		int numero2 = 10;
		int resultado = numero1 + numero2;
		System.out.println(resultado);
		
		numero1 = 20;
		numero2 = 30;
		System.out.println(numero1);
		System.out.println(numero2);
		
		System.out.println("resultado: " +(numero1 * numero2));
		System.out.println(10+90);
		
		boolean verdadeiro = true;
		boolean falso = false;
		System.out.println(verdadeiro);
		System.out.println(falso);
		
		String nome = "Luan";
		String sobrenome = "Muruk";
		System.out.println("nome completo: " +nome 
				+ " " + sobrenome);
				
		String nome = "Luan";
		int idade = 18;
		double saldo = 1.00;
		
		System.out.printf("Meu nome é %s "
				+"minha idade é: %d"
				+ "e tenho no banco um saldo %.2f" , 
				nome, idade, saldo
				);
				*/
		int idade = 18;
		String nome = "Luan Muruk";
		double saldo = 18.50;
		
		System.out.println(nome + ", tem a idade de " 
		+ idade +", e possui a incrivel quantia de R$ "+ saldo);
		
		System.out.printf(nome + ", tem a idade de %d, e possui a incrivel "
				+ "quantia de R$ %.2f",idade, saldo);
		
		double gasolina = 5.6841435;
		
		System.out.printf("\no valor da gasolina hoje é: R$ %.4f", gasolina);
		/* para numeros inteiros = %d
		 * para Strings = %s
		 * para caractere (char) = %c
		 * para numeros com ponto flutuante = %.(quantidade de casas)f
		 */

	}

}

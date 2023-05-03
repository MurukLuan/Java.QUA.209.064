package principal;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaração de constante
		/*final double PI = 3.14151617;
		
		//PI = 5.1478952;
		
		//potencia de numeros, primeiro dado é o número que 
		//se deseja potencia, segundo número a potência
		System.out.println( Math.pow(3, 3) );
		//dentre 2 parametros mostra o maior número
		System.out.println(Math.max(5 ,  10));
		//dentre 2 parametros mostra o menor número
		System.out.println(Math.min(1,  5));
		//realiza a raiz quadrada do numero informado
		System.out.println(Math.sqrt(16));
		//arredonda o número, para mais ou para menos
		System.out.println(Math.round(25.9569));
		//pode-se fazer calculos usando o Math como parametro 
		System.out.println(2 * Math.PI);
		
		//para usar ponto no lugar de virgula
		//quando for entrar com o dado
		//precisa importar a classe (ctrl+shift+o)
		Locale ponto = new Locale("en", "us");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o salario: ");
		double salario = sc.useLocale(ponto).nextDouble();
		
		System.out.println(salario);
		sc.close();*/
		
		//operadores de comparação
		// > maior que
		// < menor que
		// >= maior ou igual a
		// <= menor ou igual a
		// != diferente
		// == igual a
		
		//operadores logicos
		// && = e
		// || = ou
		// ! = negação
		
		//operadores de incremento e decremento
		// x += 2 é o mesmo que x = x + 2
		// faz-se o mesmo com subtração
		// divisão
		// multiplicação
		// ++ = somando mais 1
		// -- = diminui 1 ou menos 1
		
		/*int idade = 17;
		char sexo = 'f';
		//if = se
		//else = senão
		//else if =  senao se
		if( idade >= 18 && idade < 20 && sexo == 'm') {
			System.out.println("Pode se alistar!");
		}else if(idade >= 18 || sexo == 'f') {
			System.out.println("Mulher tbm pode se alistar");
		}		
		else {
			System.out.println("Menor de idade, "
					+ "não pode se alistar");
		}
		
		/*
		 * estrutura condicional começa 
		 * com a palavra if
		 * posso ter um ou mais if
		 * para toda estrutura condicional
		 * escrevo o seguinte codigo
		 * if ( condição){ bloco de codigo}
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro numero:");
		int n1 = sc.nextInt();
		System.out.print("Entre com o segundo numero: ");
		int n2 = sc.nextInt();
		
		if(n1 > n2) {
			System.out.println("O maior numero foi: " + n1);
		}
		else {
			System.out.println("O maior numero foi: " + n2);
		 }
		
		sc.close();
		
	}

}

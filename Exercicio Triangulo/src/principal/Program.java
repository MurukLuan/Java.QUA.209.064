package principal;

import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Triangulo triangulo = new Triangulo();
		System.out.println("Entre com os 3 lados do triangulo para saber seu tipo!");
		System.out.print("Lado a: ");
		triangulo.ladoA = sc.nextDouble();
		
		System.out.print("Lado B: ");
		triangulo.ladoB = sc.nextDouble();
		
		System.out.print("Base: ");
		triangulo.base = sc.nextDouble();
		
		System.out.println(triangulo.retornaTriangulo());
		
		sc.close();

	}

}

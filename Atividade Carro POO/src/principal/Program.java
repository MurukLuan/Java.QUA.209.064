package principal;

import java.util.Scanner;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Carro carro = new Carro();
		Carro carro2 = new Carro();
		
		System.out.print("Entre com o modelo: ");
		carro.modelo = sc.nextLine();
		
		System.out.print("Entre com o cambio: ");
		carro.cambio = sc.nextLine();
		
		System.out.print("Entre com a placa ");
		carro.placa = sc.nextLine();
		
		System.out.print("Entre com a cor: ");
		carro.cor = sc.nextLine();
		
		System.out.print("Entre com o ano: ");
		carro.ano = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Entre com o modelo: ");
		carro2.modelo = sc.nextLine();
		
		System.out.print("Entre com o cambio: ");
		carro2.cambio = sc.nextLine();
		
		System.out.print("Entre com a placa ");
		carro2.placa = sc.nextLine();
		
		System.out.print("Entre com a cor: ");
		carro2.cor = sc.nextLine();
		
		System.out.print("Entre com o ano: ");
		carro2.ano = sc.nextInt();
		
		System.out.println(carro);
		System.out.println("/****************/");
		System.out.println(carro2);
		
		sc.close();

	}

}

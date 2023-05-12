package principal;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.print("Entre com o nome do produto: ");
		produto.setNome(sc.nextLine());
		
		System.out.print("Entre com a categoria: ");
		produto.setCategoria(sc.nextLine());
		
		System.out.print("Entre com o preço: ");
		produto.setPreco(sc.nextDouble());
		
		System.out.print("Entre com a quantidade: ");
		produto.adicionaProduto(sc.nextInt());
		
		System.out.println(produto);
		
		System.out.println("Entre com a quantidade a ser removida: ");
		produto.removeProduto(sc.nextInt());
		
		System.out.println(produto);

		sc.close();

	}

}

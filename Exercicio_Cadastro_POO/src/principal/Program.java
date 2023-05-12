package principal;

import java.util.Scanner;

import entities.Cliente;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		System.out.print("Entre com o nome: ");
		cliente.nome = sc.nextLine();
		System.out.print("Entre com o endereço: ");
		cliente.endereco = sc.nextLine();
		System.out.print("Entre com a data de nascimento: ");
		cliente.dataNascimento = sc.nextLine();
		System.out.print("Entre com o telefone: ");
		cliente.telefone = sc.nextLine();
		System.out.print("Entre com o cpf: ");
		cliente.cpf = sc.nextLine();
		
		System.out.println(cliente);
		
		sc.close();

	}

}

package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o salario: ");
		double salario = sc.nextDouble();
		
		System.out.print("Qual o valor de venda do vendedor no mes: ");
		double vendasNoMes = sc.nextDouble();
		
		salarioLiquido(salario, retornaComissaoVendas(vendasNoMes));
		
		sc.close();
	}
	
	static double retornaComissaoVendas(double venda) {
		if(venda > 10000 && venda < 15000) {
			return venda * 0.01; 
		}
		else if(venda >= 15000 && venda < 20000) {
			return venda * 0.03;
		}
		else if(venda > 20000) {
			return venda * 0.05;
		}
		return venda;	
		
			
	}
	
	static void salarioLiquido(double salario, double venda) {
		double inss = salario * 0.05;
		double irpf = salario * 0.11;
		double salarioLiquido = salario - inss - irpf;
		System.out.println("Salario bruto: " + salario);
		System.out.println("Desconto inss: - " + inss);
		System.out.println("Desconto irpf: - " + irpf);
		if(venda < 10000) {
			System.out.println("Salario liquido: " + salarioLiquido);
			System.out.println("salario liquido R$ " + salarioLiquido + " + comissão: "+ venda +" = R$" + (salarioLiquido + venda));
		}else {
			System.out.println("Salario liquido: " + salarioLiquido);
			System.out.println("Infelizmente o desempenho foi baixo, não teve comissão. Continue tentando!");
		}
	}
}

package kauan;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		  
	     
	    System.out.println("o seu salario é de R$1300,00. quantas vendas você fez no mês ? ");
	    double v = sc.nextInt();
	    
	   
	    double s = 1092;
	    
	    calculo(s,v);

	}
	
	static void calculo(double s, double v) {
	   	 System.out.println(" o valor do salario no mês é de: " + s);
	   	 
	   	 if(v < 10000) {
	   		 System.out.println(" você não recebeu nada");
	   	 }
	   	 else if (v > 10000 && v <= 15000) {
	   		 System.out.printf(" voce recebeu uma bonificaçao de 1%% %.2f " , s+(v*0.01));
	   	 }
	   	 else if (v > 15000 && v <= 20000) {System.out.printf(" voce recebeu uma bonificação de 3%% %.2f " , s+(v * 0.03));
	   	 }
	   	 else if (v > 20000) {System.out.printf("voce recebeu uma bonificação de 5%% %.2f " , (s + (v*0.05)));
	   	 }
	}

}

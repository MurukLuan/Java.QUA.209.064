package principal;

public class Program {

	public static void main(String[] args) {
		
		int resultado = 0;
		
		for(int contador = 1; contador <= 50; contador++) {
			if(contador %2 != 0) {
				resultado += contador;
			}
		}
		System.out.println("A soma dos numeros impares é: " + resultado);
	}

}

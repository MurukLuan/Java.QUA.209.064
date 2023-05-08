package principal;

public class Funcoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mensagem();
		String ms2 = mensagem2();
		
		System.out.println(ms2);
		System.out.println(mensagem2());
		String nome = "Luan Muruk";
		System.out.println(mensagem3(nome));
		int numero1 = 2;
		int numero2 = 3;
		calculo(numero1 , numero2);

	}
	
	static void mensagem() {
	System.out.println("Minha primeira função");
	}
	
	static String mensagem2() {
		return "minha segunda função";
	}
	
	static String mensagem3(String msg) {
		return "Meu nome passado por parametro é: " + msg;
	}
	static void calculo(int n, int m) {
		System.out.println("O resultado é: " + (n+m));
		//int resultado = n + m;
	}
}

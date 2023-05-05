package principal;

public class DesafioMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] mult = new int[3][3];
		int contador = 50;
		for(int i = 0; i < mult.length; i++) {
			for(int j = 0; j < mult.length; j++ ) {
				mult[i][j] = contador;
				System.out.print(mult[i][j] + "\t");
				contador++;
			}
			System.out.println();
		}
		
		System.out.println("Numeros da diagonal de cima para baixo");
		System.out.println("Esquerda para direita");
		
		for( int i = 0; i < mult.length; i++) {
			for(int j = 0; j < mult.length; j++) {
				if(mult[i] == mult[j]) {
					System.out.print(mult[i][j] + "\t");
				}
			}
		}

	}

}

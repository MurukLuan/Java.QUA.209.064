package entities;

public class Triangulo {

	public double ladoA;
	public double ladoB;
	public double base;
	
	public String retornaTriangulo() {
		if(ladoA == ladoB && ladoB == base) {
			return "Triangulo equilatero";
		}
		if(ladoA == ladoB || ladoA == base || ladoB == base) {
			return "Triangulo isosceles";
		}
		return "Triangulo escaleno";
		
	}
	
}

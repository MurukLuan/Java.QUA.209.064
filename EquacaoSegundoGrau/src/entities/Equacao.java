package entities;

public class Equacao {

	public int a;
	public int b;
	public int c;

	public double delta() {
		return Math.pow(b, 2) - (4 * a * c);
	}

	public String retornaX() {
		if (delta() < 0) {
			return "delta não possui raiz";
		}
		double xI = (-b + Math.sqrt(delta())) / (2 * a);
		double xII = (-b - Math.sqrt(delta())) / (2 * a);
		return "xI: " + xI + ", xII: " + xII;
	}
}

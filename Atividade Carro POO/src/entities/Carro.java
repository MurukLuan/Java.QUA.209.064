package entities;

public class Carro {
	
	public String placa;
	public String cor;
	public String modelo;
	public String cambio;
	public int ano;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return modelo + "\n" +
				cor + "\n" +
				placa + "\n" +
				ano + "\n" +
				cambio + "\n";
	}

}

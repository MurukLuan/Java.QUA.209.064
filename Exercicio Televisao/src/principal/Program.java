package principal;

import entities.Televisao;

public class Program {

	public static void main(String[] args) {
		
		Televisao tv = new Televisao();
		
		tv.status();
		
		tv.ligarTelevisao();
		tv.aumentarVolume();
		tv.aumentarCanal();
		tv.aumentarCanal();
		tv.aumentarCanal();
		tv.aumentarCanal();
		tv.aumentarCanal();
		tv.aumentarCanal();
		
		
		tv.status();
		
		tv.desligarTelevisao();
		tv.status();

	}

}

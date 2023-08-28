package entities;

public class Televisao {
	
		public int canal = 1;
		public int volume;
		public boolean ligado;
		
		public void ligarTelevisao() {
			ligado = true;
		}
		
		public void desligarTelevisao() {
			ligado = false;
		}
		
		public void aumentarVolume() {
			//ligado == true ? volume += 1 : false
			if(ligado == true && volume < 17) volume += 1;
		}
		public void diminuirVolume() {
			//ligado == true ? volume += 1 : false
			if(ligado == true && volume >= 0) volume -= 1;
		}
		
		public void diminuirCanal() {
			//ligado == true ? volume += 1 : false
			if(ligado == true && canal >= 0) canal -= 1;
		}
		
		public void aumentarCanal() {
			//ligado == true ? volume += 1 : false
			if(ligado == true && canal < 17) canal += 1;
		}
		
		public void status() {
			if(ligado == true) {
				System.out.println("A tv está ligada");
				System.out.println("Canal: " + canal);
				System.out.println("Volume: " + volume);
			}else {
				System.out.println("Tv desligada.");
			}
		}

}

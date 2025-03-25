package ejercicio3Parte3;

import java.util.Random;

public class Gato extends AnimalDomestico {
	Random rand=new Random();
	public Gato(String nombre, String color, int peso, String raza) {
		
		super(nombre, color, peso, raza);
		
	}

	@Override
	public boolean comer() {
		boolean hambre;
		hambre=rand.nextBoolean();
		return hambre;
	}

	@Override
	public boolean dormir() {
		boolean sueño;
		sueño=rand.nextBoolean();
		return sueño;
	}

	@Override
	public String hacerRuido() {
		boolean ruido;
		String sonido;
		ruido=rand.nextBoolean();
		if(ruido) {
			sonido="Miau";
		}
		else {
			sonido="....";
		}
		return sonido;
	}

	public boolean hacerCaso() {
		boolean caso;
		int aleatorio;
		aleatorio=rand.nextInt(1,101);
		if(aleatorio<95) {
			caso=false;
		}
		else {
			caso=true;
		}
		return caso;
	}
	
	public boolean toserBolaPelo() {
		boolean toser;
		toser=rand.nextBoolean();
		return toser;
	}
	

}

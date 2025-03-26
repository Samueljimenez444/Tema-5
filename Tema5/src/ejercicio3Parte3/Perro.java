package ejercicio3Parte3;

import java.util.Random;

public class Perro extends AnimalDomestico {
	Random rand=new Random();
	public Perro(String nombre, String color, int peso, String raza) {
		
		super(nombre, color, peso, raza);

	}

	@Override
	public boolean comer() {
		boolean comer;
		comer=rand.nextBoolean();
		return comer;
	}

	@Override
	public boolean dormir() {
		boolean dormir;
		dormir=rand.nextBoolean();
		return dormir;
	}

	@Override
	public String hacerRuido() {
		String ruido;
		
		ruido="Guau Guau";

		return ruido;
	}
	
	public boolean sacarPaseo() {
		boolean salirPaseo;
		salirPaseo=rand.nextBoolean();
		return salirPaseo;
	}
	
	public String toString() {
		String cadena;
		
		cadena=("Nombre: " + getNombre() + " Color: " + getColor() + " Peso: " + getPeso() + " Raza: " + getRaza());
		
		return cadena;
	}

	@Override
	public boolean hacerCaso() {
		boolean caso;
		caso=rand.nextBoolean();
		return caso;
	}

}

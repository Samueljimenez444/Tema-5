package ejercicio3Parte3;

public abstract class AnimalDomestico implements Animal{

	private String nombre;
	private String color;
	private int peso;
	private String raza;

	public AnimalDomestico(String nombre, String color, int peso, String raza) {
		
		this.nombre = nombre;
		
		this.color = color;
		
		this.peso = peso;
		
		this.raza = raza;

	}

	public boolean vacunar() {
		
		return false;
	}

	public boolean hacerCaso() {
		
		return false;
	}
	

}

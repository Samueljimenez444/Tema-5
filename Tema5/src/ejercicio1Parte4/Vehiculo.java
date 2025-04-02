package ejercicio1Parte4;

public class Vehiculo {
	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	private boolean estado;
	private int marchaActual;
	private int velocidad;

	public Vehiculo(String marca, String modelo, String color, String matricula) {
		this.marca = marca;

		this.modelo = modelo;

		this.color = color;
		if(matricula.length()==6)
		this.matricula = matricula;
	}

	public boolean parar() {
		estado = false;
		marchaActual = 0;
		return true;
	}

	public boolean arrancar() {
		estado = true;
		marchaActual = 1;
		return true;
	}

	public void subirMarcha() {
		marchaActual += 1;
	}

	public void bajarMarcha() {
		marchaActual -= 1;
	}
	
	public int getMarcha() {
		return marchaActual;
	}
	
	public String toString() {
		String cadena;
		
		cadena=("Marcha actual: " + marchaActual + " Motor Encendido: " + estado + " Velocidad actual: " + velocidad);
		
		return cadena;
	}
	
	

}
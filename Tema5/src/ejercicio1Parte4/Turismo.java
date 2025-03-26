package ejercicio1Parte4;

public class Turismo extends Vehiculo {

	public Turismo(String marca, String modelo, String color, String matricula) {
		super(marca, modelo, color, matricula);
		
	}

	private int numeroPlazas;
	
	private TipodeUso uso;
	
	enum TipodeUso{
		PROFESIONAL,PARTICULAR
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
	
	
}

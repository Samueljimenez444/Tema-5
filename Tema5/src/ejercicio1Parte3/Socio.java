package ejercicio1Parte3;

public class Socio implements Comparable<Socio> {
	private int id;
	private String nombre;
	private int edad;

	public Socio(int id, int edad, String nombre) {
		if (id >= 1) {
			this.id = id;
		}
		if (edad >= 18) {
			this.edad = edad;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

	}

	public String toString() {

		String cadena;

		cadena = ("Nombre: " + nombre + " Edad: " + edad + " ID: " + id);

		return cadena;

	}

	public int compareTo(Socio S) {
		int iguales;
		
		if(this.id<S.edad) {
			iguales=1;
		}
		else if(this.id>S.edad) {
			iguales=-1;
		}
		else {
			iguales=0;
		}
		
		return iguales;
	}

}

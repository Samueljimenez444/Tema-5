
package ejercicio3Parte4;

public class Titular {
	private String dni;
	private String nombre;
	private String apellido;
	private int telefono;

	public Titular(String dni, String nombre, String apellido, int telefono) {

		this.dni = dni;

		this.apellido = apellido;

		this.nombre = nombre;

		this.telefono = telefono;
	}
	public String toString() {
		String cadena;
		cadena=(" DNI: " + dni + " Nombre: " + nombre + " Apellido: " + apellido + "Telefono: " + telefono);
		return cadena;
	}
}

package ejercicio2Parte3;

import java.util.Objects;

public class Furbolista implements Comparable<Furbolista> {
	private int numeroCamiseta;
	private String nombre;
	private int edad;
	private int goles;

	public Furbolista(int numeroCamiseta, String nombre, int edad, int goles) {

		this.numeroCamiseta = numeroCamiseta;

		this.nombre = nombre;

		this.edad = edad;

		this.goles = goles;

	}

	public String toString() {
		String cadena;

		cadena = ("Nombre: " + nombre + " Numero Camiseta: " + numeroCamiseta + " Goles: " + goles + " Edad: " + edad);

		return cadena;

	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, numeroCamiseta);
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales;
		Furbolista otrofutbolista = (Furbolista) obj;
		if(nombre.equals(otrofutbolista.nombre) && numeroCamiseta==otrofutbolista.numeroCamiseta) {
			iguales=true;
		}
		else {
			iguales=false;
		}
		return iguales;
	}
	
	public int compareTo(Furbolista furbo) {
		int comparador = 0;
		comparador = this.numeroCamiseta - furbo.numeroCamiseta;
		
		if(comparador == 0) {
			comparador = this.nombre.compareTo(furbo.nombre);
		}

		return comparador;	
	}
	
}

package ejercicio5.Parte1;

public abstract class Poligono {

	protected int numeroLados;

	public Poligono(int numeroLados) {

		if (numeroLados > 0) {
			this.numeroLados = numeroLados;
		}

	}

	public int getNumeroLados() {
		return numeroLados;
	}

	public String toString() {
		String cadena;
		cadena = ("Numero de lados: " + numeroLados);
		return cadena;
	}

	public abstract void area();
}

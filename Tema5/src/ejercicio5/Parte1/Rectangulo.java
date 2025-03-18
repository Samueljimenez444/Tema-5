package ejercicio5.Parte1;

public class Rectangulo extends Poligono {

	private double area;

	private double lado1 = 1;

	private double lado2 = 1;

	public Rectangulo(double lado1, double lado2) {
		super(4);
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		if (lado2 > 0) {
			this.lado2 = lado2;
		}

		area();

	}

	@Override
	public void area() {

		area = lado1 * lado2;

	}

	public String toString() {
		String cadena;
		cadena = ("Area: " + area + " Numero de lados: " + 4);
		return cadena;
	}

}

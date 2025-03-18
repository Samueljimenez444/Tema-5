package ejercicio5.Parte1;

public class Triangulo extends Poligono {

	private double area;

	private double lado;

	private double altura;

	public Triangulo(double lado, double altura) {
		super(3);

		this.lado = lado;

		this.altura = altura;

		area();
	}

	@Override
	public void area() {

		area = (lado * altura) / 2;

	}

	public String toString() {
		String cadena;
		cadena = ("Area: " + area + " Numero de lados: " + 3);
		return cadena;
	}

}

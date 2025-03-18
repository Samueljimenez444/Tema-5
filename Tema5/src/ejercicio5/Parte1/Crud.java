package ejercicio5.Parte1;

import java.util.HashSet;

public class Crud {
	private static HashSet<Poligono> listaPoligonos = new HashSet<>();

	public static void crearTriangulo(Triangulo p) {
		listaPoligonos.add(p);
	}

	public static void crearRectangulo(Rectangulo p) {
		listaPoligonos.add(p);
	}

	public static void mostrarPoligonos() {
		for (Poligono p : listaPoligonos) {
			System.out.println(p);
		}
	}

}

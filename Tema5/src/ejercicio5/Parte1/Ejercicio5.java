package ejercicio5.Parte1;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		Scanner lectura = new Scanner(System.in);

		int lado1;

		int lado2;

		int eleccion;

		Triangulo t = null;

		Rectangulo r = null;

		do {

			System.out.println("1 Introducir Triangulo");
			System.out.println("2 Introducir Rectangulo");
			System.out.println("3 Mostrar Poligonos");

			eleccion = lectura.nextInt();

			switch (eleccion) {
			case 1:
				System.out.println("Introduce los lados del triangulo");

				lado1 = lectura.nextInt();

				lado2 = lectura.nextInt();

				t = new Triangulo(lado1, lado2);

				Crud.crearTriangulo(t);

				break;

			case 2:
				System.out.println("Introduce los lados del rectangulo");

				lado1 = lectura.nextInt();

				lado2 = lectura.nextInt();

				r = new Rectangulo(lado1, lado2);

				Crud.crearRectangulo(r);

				break;

			case 3:

				Crud.mostrarPoligonos();

				break;

			}

		} while (eleccion != 0);
		lectura.close();

	}
}

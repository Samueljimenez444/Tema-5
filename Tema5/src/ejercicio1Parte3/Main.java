package ejercicio1Parte3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Socio socio1 = new Socio(1, 20, "Juan");
		Socio socio2 = new Socio(2, 32, "Juanan");
		Socio socio3 = new Socio(3, 54, "Juanotonio");
		Socio socio4 = new Socio(4, 18, "Juanfran");

		Socio[] arraySocios = { socio1, socio2, socio3, socio4 };

		Arrays.sort(arraySocios);
		
		System.out.println(Arrays.toString(arraySocios));

	}

}

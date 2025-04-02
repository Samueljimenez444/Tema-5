package ejercicio2Parte4;

public class Main {

	public static void main(String[] args) {
		Libro libro1=new Libro("Guia de cocina","Barco Vapor","German Palomares");
		
		Revista revista1=new Revista("Revista Pocha",100,2025);
		
		Dvd dvd1=new Dvd("Trilogia LOTR","Peter Jackson",2012,"Pelicula");
		
		Dvd dvd2=new Dvd("LOTR 1","Peter Jackson",2012,"Pelicula");

		Dvd dvd3=new Dvd("LOTR 2","Peter Jackson",2012,"Pelicula");

		
		System.out.println(libro1);
		
		System.out.println(revista1);
		
		System.out.println(dvd1);
		
		System.out.println(dvd2);
		
		System.out.println(dvd3);
		
		System.out.println(libro1.prestar());
		
		System.out.println(revista1.prestar());
		
		System.out.println(dvd1.prestar());
		
		
	}

}

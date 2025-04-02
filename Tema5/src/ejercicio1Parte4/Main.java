package ejercicio1Parte4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int eleccion;
		
		Scanner lectura=new Scanner(System.in);
		
		Turismo turismo1=new Turismo("Toyota","Corola","Negro","NFT123","Particular",4);
		
		Camion camion1=new Camion("Citroen","Nisu","Blanco","RJT241",true,1000);	
		
		Moto moto1=new Moto("Kawasaki","Nisu","Rojo","LFW134",125);
		
		System.out.println(turismo1);
		
		System.out.println(moto1);
		
		System.out.println(camion1);
		do {
		System.out.println("Introduce una opcion");
		eleccion=lectura.nextInt();
		switch(eleccion) {
		case 1:
			System.out.println(turismo1);
			break;
			
		case 2:
			turismo1.arrancar();
			break;
			
		case 3:
			turismo1.subirMarcha();
			break;
			
		case 4:
			turismo1.bajarMarcha();
			break;
			
		case 5:
			turismo1.arrancar();
			break;
		}
		}while(eleccion!=0);
		
		lectura.close();
		
	}

}
package ejercicio1.Parte1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner lectura=new Scanner(System.in);
		
		
		
		int horas=0;
		
		int minutos=0;
		
		int eleccion;
		
		Hora hora=new Hora(horas,minutos);
		
		do {
			System.out.println("-- Menu --");
			System.out.println("1 Introducir Hora");
			System.out.println("2 Aumentar en 1 minuto la hora");
			System.out.println("3 Mostrar Hora");
			System.out.println("4 Cambiar Hora");
			eleccion=lectura.nextInt();
			
			switch(eleccion) {
			case 1:
				
				System.out.println("Introduce la hora");
				horas=lectura.nextInt();
				
				System.out.println("Introduce los minutos");
				minutos=lectura.nextInt();
				
				hora=new Hora(horas,minutos);
				
				break;
				
			case 2:
				
				hora.inc();
				break;
				
			case 3:
			System.out.println(hora);
			break;
			
			case 4:
				
				System.out.println("Introduce la hora");
				horas=lectura.nextInt();
				
				System.out.println("Introduce los minutos");
				minutos=lectura.nextInt();
				if(hora.setHoras(horas)) {
					System.out.println("La hora ha sido cambiada correctamente");
				}
				
				if(hora.setMinutos(minutos)) {
					System.out.println("Los minutos han sido cambiados correctamente");
				}
				
				break;
		
			}
		}while(eleccion!=0);
		
		lectura.close();

	}

}

package ejercicio3Parte3;

public class Main {

	public static void main(String[] args) {
		Gato gato1=new Gato("Giovanni","Negro",4,"Angora");
		Perro perro1=new Perro("Nube","Blanco",7,"Pomeranian");
		
		System.out.println(gato1);
		System.out.println(perro1);
		
		System.out.println(gato1.hacerRuido());
		
		if(gato1.comer()) {
			System.out.println(gato1.getNombre() + " Tiene hambre");
		}
		else {
			System.out.println(gato1.getNombre() + " No tiene hambre");
		}
		
		
		if(gato1.dormir()) {
			System.out.println(gato1.getNombre() + " Esta dormido");
		}
		else {
			System.out.println(gato1.getNombre() + " esta despierto");
		}
		
		
		if(gato1.hacerCaso()) {
			System.out.println(gato1.getNombre() + " se esta acercando");
		}
		else {
			System.out.println("...");
		}
		
		if(gato1.toserBolaPelo()) {
			System.out.println("Giovanni ha tosido una bola de pelo");
		}
		
		if(gato1.vacunar()){
			System.out.println("");
		}
		
		
		
	}

}

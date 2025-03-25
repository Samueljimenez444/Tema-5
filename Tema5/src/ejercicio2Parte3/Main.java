package ejercicio2Parte3;

import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		Furbolista furbolista1 = new Furbolista(10,"Samuel",18,10);
		Furbolista furbolista2 = new Furbolista(11,"Juanfranciscomanuel",24,247);
		Furbolista furbolista3= new Furbolista(7,"BocataLomoYa",30,379);
		Furbolista furbolista4= new Furbolista(19,"AyomoLatacoB",19,3);
		Furbolista furbolista5= new Furbolista(20,"Juananotonio",23,39);

		Furbolista[] listaFurbolistas= {furbolista1,furbolista2,furbolista3,furbolista4,furbolista5};
		
		Arrays.sort(listaFurbolistas);
		
		System.out.println(Arrays.toString(listaFurbolistas));
		
	}

}

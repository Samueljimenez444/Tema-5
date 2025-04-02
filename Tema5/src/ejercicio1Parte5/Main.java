package ejercicio1Parte5;

import java.util.Arrays;
import java.util.Random;

public class Main {
public static void main(String[] args) {

	Random rand=new Random();
	
	int[] listaNumeros=new int[20];
	
	for(int i=0;i<20;i++) {
		listaNumeros[i]=rand.nextInt(1,101);
	}
	
	
	
	System.out.println(Arrays.toString(listaNumeros));
}
}

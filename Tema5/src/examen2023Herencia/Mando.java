package examen2023Herencia;

import java.util.Scanner;

public abstract class Mando {
	
	private String modelo;
	
	private int anchura;
	
	private int precio;
	
	private boolean encendido;
	
	public Mando() {
		
	}
	
	public boolean cambiarEstado() {
		if(encendido==true) {
			encendido=false;
		}
		else {
			encendido=true;
		}
		return encendido;
	}
	
	
	
	
}

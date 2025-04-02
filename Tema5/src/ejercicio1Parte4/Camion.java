package ejercicio1Parte4;

public class Camion extends Vehiculo{
	private int pesoMaximo;
	
	private boolean mercanciaPeligrosa;
	
	public Camion(String marca, String modelo, String color, String matricula,boolean mercanciaPeligrosa,int pesoMaximo) {
		super(marca, modelo, color, matricula);
		this.mercanciaPeligrosa=mercanciaPeligrosa;
		this.pesoMaximo=pesoMaximo;
	}
	
	

}
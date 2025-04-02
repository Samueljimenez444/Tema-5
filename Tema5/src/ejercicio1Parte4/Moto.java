package ejercicio1Parte4;

public class Moto extends Vehiculo{
	private int cilindrada;
	
	public Moto(String marca, String modelo, String color, String matricula,int cilindrada) {
		super(marca, modelo, color, matricula);
		this.cilindrada=cilindrada;
	}
	
	public boolean carnet() {
		return (this.cilindrada>=125);
	}

}
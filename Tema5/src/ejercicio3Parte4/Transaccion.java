package ejercicio3Parte4;

public class Transaccion {
	private String fecha;
	private double importe;
	private String concepto;
	private static double comision=1;
	public Transaccion(String fecha,int importe,String concepto) {
		
		this.fecha=fecha;
		
		this.importe=importe;
		calculoComision();
		
		this.concepto=concepto;
	}
	
	public void calculoComision() {
		importe=importe*comision;
	}
	public double getImporte() {
		return importe;
	}
	
	public String toString() {
		String cadena;
		
		return cadena=(" Importe: " + importe + " Concepto " + concepto + " Comision: " + comision );
	}
	



}

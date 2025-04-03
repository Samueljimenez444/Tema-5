package ejercicio3Parte4;

public class Transaccion {
	private String fecha;
	private double importe;
	private String concepto;
	private static int comision;
	public Transaccion(String fecha,int importe,String concepto) {
		
		this.fecha=fecha;
		
		this.importe=calculoComision();
		
		this.concepto=concepto;
	}
	
	public double calculoComision() {
		importe=importe*(comision/100);
		return importe;
	}
	public double getImporte() {
		return importe;
	}
	



}

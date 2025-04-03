package ejercicio3Parte4;

import java.util.ArrayList;

public class CuentaCorriente extends CuentaBancaria {
	private int numTransacciones;
	private String fechaTransaccion;
	private ArrayList<Transaccion> listaTransacciones = new ArrayList<>();

	public CuentaCorriente(int saldo, Titular titular) {
		super(saldo, titular);

	}

	public void añadirTransaccion(Transaccion T) {  	
		listaTransacciones.add(T);
		setSaldo(T.getImporte());
	}
	
	public void recibirT(Transaccion T) {
		listaTransacciones.add(T);
		setSaldo(getSaldo()+T.getImporte());
	}
	
	public void enviarT(Transaccion T) {
		listaTransacciones.add(T);
		setSaldo(getSaldo()-T.getImporte());
	}
	
	public String toString() {
		String cadena = ("Titulares: " + " Saldo: " + getSaldo());

		return cadena;
	}
}

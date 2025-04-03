package ejercicio3Parte4;

import java.util.ArrayList;

public class CuentaBancaria {

	private static int numeroCuenta = 0;
	private double saldo;
	private ArrayList<Titular> listaTitulares = new ArrayList<>();

	public CuentaBancaria(double saldo, Titular titular) {
		numeroCuenta++;

		this.saldo = saldo;

		crearTitular(titular);
	}

	public void crearTitular(Titular titular) {
		if (listaTitulares.size() <= 3) {
			listaTitulares.add(titular);
		}
	}

	public void eliminarTitular(Titular titular) {
		listaTitulares.remove(titular);
	}

	public void ingresarSaldo(int saldo) {
		this.saldo += saldo;
	}

	public void retirarSaldo(int saldo) {
		this.saldo -= saldo;
	}

	public void setSaldo(double d) {
		this.saldo = d;
	}

	public double getSaldo() {
		return saldo;
	}

	public String toString() {
		String cadena = ("Titulares: " + " Saldo: " + saldo);
		for(Titular T:listaTitulares) {
		cadena+=T + " ";
		}
		return cadena;
	}

}

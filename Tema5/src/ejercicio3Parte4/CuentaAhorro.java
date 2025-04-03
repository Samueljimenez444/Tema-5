package ejercicio3Parte4;

import java.util.ArrayList;

public class CuentaAhorro extends CuentaBancaria {
	private static double mantenimiento = 0.15;
	private static double interes = 0.1;
	public CuentaAhorro(int saldo, Titular titular) {
		super(saldo, titular);

	}

	public void saldoInteres() {
		double total = getSaldo();
		total=total-total*interes;
		setSaldo(total);
	}

	public void saldoMantenimiento() {
		double total = getSaldo();
		total=total-total*mantenimiento;
		setSaldo(total);
	}

}

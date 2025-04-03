package ejercicio3Parte4;

public class Main {
	public static void main(String[] args) {
		Titular titular1=new Titular("77873441H","Samuel","Jimenez",611463589);
		Titular titular2=new Titular("77873442F","Marcos","Lopez",611463590);
		CuentaAhorro cuenta1=new CuentaAhorro(1000,titular1);
		CuentaCorriente cuenta2=new CuentaCorriente(2000,titular1);
		CuentaCorriente cuenta3=new CuentaCorriente(2500,titular2);
		System.out.println(cuenta1);

		cuenta1.saldoInteres();
		System.out.println(cuenta1);
		cuenta1.saldoMantenimiento();
		System.out.println(cuenta1);
	}
}

package ejercicio3Parte4;

public class Main {
	public static void main(String[] args) {
		Titular titular1=new Titular("77873441H","Samuel","Jimenez",611463589);
		Titular titular2=new Titular("77873442F","Marcos","Lopez",611463590);
		Transaccion transaccion1=new Transaccion("Hola", 10, "XD!");
		CuentaAhorro cuenta1=new CuentaAhorro(1000,titular1);
		CuentaCorriente cuenta2=new CuentaCorriente(2000,titular1);
		CuentaCorriente cuenta3=new CuentaCorriente(2500,titular2);
		System.out.println(cuenta1);
		System.out.println("Cambio de los saldos tras el calculo del interes y del mantenimiento");
		cuenta1.saldoInteres();
		System.out.println(cuenta1);
		cuenta1.saldoMantenimiento();
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);
		cuenta2.recibirT(transaccion1);
		cuenta3.enviarT(transaccion1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);
	}
}

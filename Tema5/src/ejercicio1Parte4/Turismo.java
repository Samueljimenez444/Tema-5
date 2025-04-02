package ejercicio1Parte4;

public class Turismo extends Vehiculo {
	private int numeroPlazas;

	private TipodeUso uso;

	public Turismo(String marca, String modelo, String color, String matricula, String uso, int numeroPlazas) {
		super(marca, modelo, color, matricula);
		uso = uso.toUpperCase();
		switch (uso) {
		case "PROFESIONAL", "PARTICULAR":
			this.uso = TipodeUso.valueOf(uso);
			break;
		}
		this.numeroPlazas = numeroPlazas;
	}

	enum TipodeUso {
		PROFESIONAL, PARTICULAR
	}
	
	

}
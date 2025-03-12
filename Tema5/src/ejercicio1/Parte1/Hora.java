package ejercicio1.Parte1;

public class Hora {
	private int horas = 0;
	private int minutos = 0;

	public Hora(int horas, int minutos) {
		if (horas >= 0 && horas < 24) {
			this.horas = horas;
		}
		if (minutos >= 0 && horas < 60) {
			this.minutos = minutos;
		}
	}

	public String toString() {
		String cadena;
		cadena = (horas + ":" + minutos);
		return cadena;
	}

	void inc() {
		minutos++;
		if (minutos == 60) {
			minutos = 0;
			horas++;
		}
		if (horas == 24) {
			horas = 0;
		}

	}

	public boolean setMinutos(int minutos) {
		boolean set = false;
		if (minutos >= 0 && minutos < 60) {
			this.minutos = minutos;
			set = true;
		}
		return set;
	}
	
	public boolean setHoras(int horas) {
		boolean set=false;
		if (horas >= 0 && horas <24) {
			this.horas = horas;
			set = true;
		}
		return set;
				
	}
}

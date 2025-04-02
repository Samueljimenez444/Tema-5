package ejercicio2Parte4;

public class Revista extends Ficha {

	private int año;
	
	private int numero;
	
	public Revista(String titulo,int año,int numero) {
		super(titulo);
		
		this.año=año;
		
		this.numero=numero;
		
	}
	
	public String toString() {
		String cadena=("Titulo: " + getTitulo() + " ID: " + getId() + " Año: " + año + " Numero: " + numero );
		
		return cadena;
	}

	@Override
	public String prestar() {
	
		return "La revista con ID:" + getId()+ " sera prestada 10 dias";
	}

}

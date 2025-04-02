package ejercicio2Parte4;

public class Dvd extends Ficha{
	
	private String director;
	private int año;
	private Tipo tipo;
	
	enum Tipo{
		PELICULA,DOCUMENTAL,SERIE
	}
	
	public Dvd(String titulo,String director,int año,String tipo) {
		super(titulo);
		
		this.director=director;
		
		this.año=año;
		
		tipo=tipo.toUpperCase();
		
		switch(tipo) {
		
		case "PELICULA","DOCUMENTAL","SERIE":
			this.tipo=Tipo.valueOf(tipo);
			break;
		
		}
		
	}
	
	public String toString() {
		String cadena=("Titulo: " + getTitulo() + " ID: " + getId() + " Director: " + director + " Año: " + año + " Tipo: " + tipo);
		
		return cadena;
	}

	@Override
	public String prestar() {
		
		return "El DVD con ID:"+ getId() + " sera prestado 5 dias";
	}

}

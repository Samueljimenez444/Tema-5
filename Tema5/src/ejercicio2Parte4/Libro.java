package ejercicio2Parte4;

public class Libro extends Ficha{


	public String autor;
	
	public String editorial; 
	

	public Libro(String titulo,String autor,String editorial) {
		super(titulo);
		if(autor!=null && !autor.isBlank()) {
			this.autor=autor;
		}
	
		if(editorial!=null && !editorial.isBlank()) {
			this.editorial=editorial;
		}
		
	}

	public String getAutor() {
		return autor;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public String toString() {
		String cadena=("Titulo: " + getTitulo() + " ID: " + getId() + " Autor: " + autor + " Editorial: " + editorial );
		
		return cadena;
	}
	
	@Override
	public String prestar() {
		
		return "El libro con ID:" + getId() +  " sera prestado 15 dias";
	}
	
}
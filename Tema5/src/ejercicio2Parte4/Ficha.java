package ejercicio2Parte4;

public abstract class Ficha {
	private static int identity=1;
	private int id;
	private String titulo;
	
	public Ficha(String titulo) {
		this.id=identity++;
		
		if(titulo!=null && !titulo.isBlank()) {
			this.titulo=titulo;
		}
	}
	
	public int getId() {
		return id;
	}
		
	public String getTitulo() {
		return titulo;
	}
	
	public abstract String prestar();
	

	
	
}
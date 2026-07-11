package ejemplos.colecciones.comparar;

//Nuestro modelo de negocio se mantiene puro y simple. No implementa Comparable.
public class Libro {
	private String titulo;
	private double precio;
	private int anoPublicacion;

	public Libro(String titulo, double precio, int anoPublicacion) {
		this.titulo = titulo;
		this.precio = precio;
		this.anoPublicacion = anoPublicacion;
	}

	public String getTitulo() { 
		return titulo; 
	}

	public double getPrecio() {
		return precio; 
	}

	public int getAnoPublicacion() { 
		return anoPublicacion; 
	}

	@Override
	public String toString() {
		return titulo + " (" + anoPublicacion + ") - " + precio + "€";
	}
}


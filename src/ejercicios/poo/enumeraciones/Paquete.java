package ejercicios.poo.enumeraciones;

public class Paquete {
	private EstadoPaquete estado;
	private String nombre;
	private String id;
	
	
	public Paquete(String id, String nombre, EstadoPaquete estado) {
		this.estado = estado;
		this.nombre = nombre;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Paquete [estado=" + estado + ", nombre=" + nombre + ", id=" + id + "]";
	}
	
	
	
	
}

package ejercicios.poo.examenIA;

public abstract class Bebida {
	private String nombre;
	private double precioBase;

	public Bebida(String nombre, double precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	
	protected String getNombre() {
		return nombre;
	}
	
	protected double getPrecioBase() {
		return precioBase;
	}

	@Override
	public String toString() {
		return "Bebida [nombre=" + nombre + ", precioBase=" + precioBase + "]";
	}
	
	protected abstract double calcularPrecio();
	
	

	
	
	
}

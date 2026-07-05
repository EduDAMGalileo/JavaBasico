package ejercicios.poo.examenIA;

public class Cafe extends Bebida{
	private static final double PRECIO_SUPLEMENTO=0.5;
	private int numSuplementos;
	
	public Cafe(String nombre, double precioBase, int numSuplementos) {
		super(nombre, precioBase);
		this.numSuplementos = numSuplementos;
	}

	@Override
	protected double calcularPrecio() {
		return this.getPrecioBase()+ PRECIO_SUPLEMENTO*numSuplementos;
	}

	@Override
	public String toString() {
		String mensaje;
		if (numSuplementos>0) {
			mensaje = "Cafe [nombre: + " + this.getNombre() + " con " + numSuplementos + " suplementos]";	
		} else {
			mensaje = "Cafe [nombre: + " + this.getNombre() + "]";
		}
		return mensaje + " con un precio de " + calcularPrecio();
		
	}
	
	

}

package ejercicios.poo.examenIA;

public class Refresco extends Bebida {
	//Los tamaños son 'G', 'P' o 'M'
	private char tamanio;

	public Refresco(String nombre, double precioBase, char tamanio) {
		super(nombre, precioBase);
		this.tamanio=tamanio;
	}

	@Override
	protected double calcularPrecio() {
		
		if (tamanio=='G') {
			//Si es grande un 80% más del precio base
			return this.getPrecioBase()*1.8;
		} else if(tamanio=='M') {
			return this.getPrecioBase()*1.4;
		} else {
			return this.getPrecioBase();
		}
	}

	@Override
	public String toString() {
		return "Refresco [nombre: " + this.getNombre()  + "tamaño:=" + tamanio + 
				" y precio de "+ calcularPrecio() +" ]";
	}
	
	
	
	
}

package ejercicios.poo.herencia;

public final class  Television extends Producto{
	private int pulgadas;

	public Television(String nombre, double precio, int pulgadas) {
		super(nombre, precio);
		this.pulgadas=pulgadas;
	}

	@Override
	public String toString() {
		return "Television [pulgadas=" + pulgadas + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
}

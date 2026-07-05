package ejercicios.poo.abstraccion;

public class PlanFamiliar extends Suscripcion{
	//El recargo del 40%
	private static final double PLUS=0.4;
	
	private int maxPerfiles=5;
	
	public PlanFamiliar(String nombreUsuario, double precioBase) {
		super(nombreUsuario, precioBase);
	}
	
	public PlanFamiliar(String nombreUsuario, double precioBase, int maxPerfiles) {
		super(nombreUsuario, precioBase);
		this.maxPerfiles=maxPerfiles;
	}
	
	@Override
	protected double calcularPrecio() {
		return getPrecioBase() * (1+PLUS);
	}

	@Override
	//Posible refactorizacion, subir método al padre, el atributo también e inicializar en el constructor
	protected int getMaxPerfiles() {
		return maxPerfiles;
	}



}

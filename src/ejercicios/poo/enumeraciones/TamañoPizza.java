package ejercicios.poo.enumeraciones;

public enum TamañoPizza {
	PEQUEÑA (10, 9.95),
	MEDIANA (15, 12.95),
	FAMILIAR (20, 15.95),
	EXTRA_GRANDE (25, 18.95);
	
	private final double diametro;
	private final double precioBase;
	
	
	private TamañoPizza(double diametro, double precioBase) {
		this.diametro = diametro;
		this.precioBase = precioBase;
	}

	public double getPrecioBase() {
		return precioBase;
	}
	
	public double calcularArea() {
		double radio = this.diametro/2;
		return Math.PI * radio * radio;
	}
	
	
}

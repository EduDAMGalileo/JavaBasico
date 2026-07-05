package ejemplos.poo.herencia;

public sealed class MetodoPago permits Tarjeta, Transferencia, Criptomoneda {

	protected double importeBase;
	// Comportamiento por defecto
	public void procesarTransaccion() {
		System.out.println("Procesando pago genérico.");
	}
}


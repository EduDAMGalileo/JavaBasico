package ejemplos.poo.herencia;

//Nadie puede heredar de Tarjeta. El diseño termina aquí.
public final class Tarjeta extends MetodoPago {
	@Override
	public void procesarTransaccion() {
		System.out.println("Procesando pago en pasarela VISA/Mastercard.");
	}
}
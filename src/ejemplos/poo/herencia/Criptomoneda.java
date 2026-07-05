package ejemplos.poo.herencia;

//Se autoriza la criptomoneda, y se permite que cualquier programador añada nuevos tipos.
public non-sealed class Criptomoneda extends MetodoPago {
	@Override
	public void procesarTransaccion() {
		System.out.println("Verificando transacción en la Blockchain.");
	}
}
package ejemplos.poo.herencia;

//Transferencia es hija autorizada, pero impone su propia lista de hijos permitidos.
public sealed class Transferencia extends MetodoPago permits TransferenciaSEPA, TransferenciaSWIFT {
	@Override
	public void procesarTransaccion() {
		System.out.println("Iniciando validación bancaria para transferencia...");
	}
}


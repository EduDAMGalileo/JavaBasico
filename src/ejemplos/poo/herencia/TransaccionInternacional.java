package ejemplos.poo.herencia;

public class TransaccionInternacional extends Transaccion {

	// OK: El hijo personaliza CÓMO se conecta
	@Override
	protected void conectarBanco() {
		System.out.println("Conectando con red SWIFT...");
	}

	// ERROR DE COMPILACIÓN: El hijo intenta saltarse el orden del algoritmo

	/*
	 @Override
	 public final void ejecutarTransaccion() { 
		 System.out.println("Intento hacer algo");
	 }
	 */
}
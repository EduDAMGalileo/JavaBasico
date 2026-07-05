package ejercicios.excepciones;

public class AppCuentaBancariaRobusta {
	public static void main (String[] args) {
		CuentaBancariaRobusta cb1 = new CuentaBancariaRobusta(1000);
		
		try {
			cb1.retirar(800);
			System.out.println("Me quedan: " + cb1.getSaldo());
			cb1.retirar(11100);
			System.out.println("Me quedan: " + cb1.getSaldo());
			cb1.retirar(-4800);
		} catch (IllegalArgumentException e) {
			System.out.println("ERROR: " + e.getMessage());
		} catch (CantidadInsufienteException e) {
			System.out.println("ERROR: " + e.getMessage());
		}

		System.out.println("Me quedan: " + cb1.getSaldo());
	}

}

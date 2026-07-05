package ejercicios.excepciones;

public class CuentaBancariaRobusta {
	private double saldo;

	public CuentaBancariaRobusta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void retirar (double cantidad) throws CantidadInsufienteException {
		if (cantidad < 0) {
			throw new IllegalArgumentException("La cantidad tiene que ser positiva");
		} 
		
		if (cantidad > saldo) {
			throw new CantidadInsufienteException("No tienes tanto dinero, como mucho puedes sacar: " + saldo);
		}
			
		this.saldo -= cantidad; //this.saldo = this.saldo - cantidad;	
	
		
	}
	

}

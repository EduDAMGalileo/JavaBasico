package ejercicios.poo.herencia;

public class Coche extends Vehiculo{
	private int numPuertas;
	
	public Coche (String marca, String modelo, int numPuertas) {
		super(marca, modelo);
		this.numPuertas=numPuertas;
	}

	@Override
	public String toString() {
		return "Coche [marca "+ marca + " modelo " + modelo + " numPuertas=" + numPuertas + "]";
	}
	

}

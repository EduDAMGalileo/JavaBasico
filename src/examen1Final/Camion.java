package examen1Final;

public class Camion extends Vehiculo{
	private double capacidadCarga;

	public Camion(String matricula, double capacidadCarga) {
		super(matricula);
		this.capacidadCarga = capacidadCarga;
	}


	@Override
	public double costeFinal(double costeBase) {
		return costeBase + 50;
	}
	
}

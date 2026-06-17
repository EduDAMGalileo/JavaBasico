package examen1Final;

public class Dispositivo implements Reparable{
	private String numeroSerie;

	public Dispositivo(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	@Override
	public String getIdentificador() {
		return numeroSerie;
	}

	@Override
	public double costeFinal(double costeBase) {
		// TODO Auto-generated method stub
		return costeBase + 10;
	}


}

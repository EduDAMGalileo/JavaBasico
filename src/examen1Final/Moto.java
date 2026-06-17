package examen1Final;

public class Moto extends Vehiculo{
	private int cc;

	public Moto(String matricula, int cc) {
		super(matricula);
		this.cc = cc;
	}


	@Override
	public double costeFinal(double costeBase) {
		// TODO Auto-generated method stub
		return costeBase*0.9;
	}
	
	
}

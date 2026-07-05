package examenes.examen1Final;

public abstract class Vehiculo implements Reparable{
	private String matricula;

	public Vehiculo(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}
	
	public String getIdentificador() {
		return this.getMatricula();
	}
	
		

}

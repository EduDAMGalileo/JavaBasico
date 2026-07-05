package ejercicios.poo.herencia;

public class Comercial extends Empleado{
	private double comision;
	
	public Comercial (String nombre, double comision) {
		super(nombre);
		this.comision=comision;
	}
	
	@Override
	public double getSalario() {
		return super.getSalario()+comision;
	}
	

}

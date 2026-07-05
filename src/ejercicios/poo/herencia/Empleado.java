package ejercicios.poo.herencia;

public class Empleado {
	protected String nombre;
	
	private static double salarioBase = 1000;
	
	public Empleado (String nombre) {
		this.nombre=nombre;
	}
	
	public double getSalario() {
		return salarioBase;
	}
	
	
	
}

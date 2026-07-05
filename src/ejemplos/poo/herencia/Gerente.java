package ejemplos.poo.herencia;


public class Gerente extends Empleado {
	private double bonoResponsabilidad;

	@Override
	public double calcularNomina() {
		// 1. Reutilizamos el cálculo de nómina base del padre
		double nominaBase = super.calcularNomina(); 

		// 2. Añadimos la lógica específica del Gerente
		return nominaBase + bonoResponsabilidad;
	}
}
package ejemplos.poo.herencia;

//Superclase: Define la base común (aquí no se hace nada nuevo)
public class Vehiculo {
	protected String matricula;

	public void arrancar() {
		System.out.println("Vehículo " + matricula + " arrancando motor...");
	}
}


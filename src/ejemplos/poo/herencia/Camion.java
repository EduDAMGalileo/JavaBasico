package ejemplos.poo.herencia;

//Subclase: Extiende la funcionalidad de Vehiculo
public class Camion extends Vehiculo {
	private double capacidadCarga; 

	public void descargar() {
		// Puede usar 'matricula' porque la ha heredado de Vehiculo
		System.out.println("Camión " + matricula + " descargando mercancía.");
		System.out.println("Puedo cargar hasta " + capacidadCarga + " kilos");
	}
}
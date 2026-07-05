package ejemplos.poo.polimorfismo;

public class Ave {
	protected String nombre;

	public Ave(String nombre) {
		this.nombre = nombre;
	}
	
	public void volar() {
		System.out.println("Soy " + nombre + " y estoy volando, soy un ave");
	}
	

}

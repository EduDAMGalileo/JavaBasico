package ejercicios.poo.encapsulamiento;

public class Superheroe {
	private String nombre;
	private String superpoder;
	private boolean llevaCapa;
	
	public Superheroe(String nombre, String superpoder) {
		this.nombre=nombre;
		this.superpoder=superpoder;
		this.llevaCapa=true;
	}
	
	public void descripcion() {
		System.out.print ("Soy " + this.nombre + " mi superpoder es " + this.superpoder);
		if (llevaCapa) {
			System.out.println(" y llevo capa");
		} else {
			System.out.println(" y no llevo capa");
		}
	}
}

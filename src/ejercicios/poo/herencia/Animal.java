package ejercicios.poo.herencia;

public class Animal {
	protected String nombre;

	public Animal(String nombre) {
		this.nombre=nombre;
	}
	
	public void hacerSonido() {
		System.out.print("El animal "+ nombre + " emite un sonido");	
	}
	
}

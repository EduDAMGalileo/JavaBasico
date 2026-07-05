package ejemplos.poo.interfaces;

public class Perro extends Animales{

	public Perro(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public void hacerSonido() {
		System.out.println(getNombre() + " Guau!!");
		
	}
	
	
	

}

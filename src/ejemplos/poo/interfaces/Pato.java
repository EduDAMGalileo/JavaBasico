package ejemplos.poo.interfaces;

public class Pato extends Animales implements Volador, Nadador{

	
	public Pato(String nombre, int edad) {
		super(nombre, edad);

	}

	@Override
	public void hacerSonido() {
		System.out.println(getNombre() + " Cuac cuac!!");	
		
	}

	@Override
	public void zambullirse() {
		System.out.println("Se zambulle");
		
	}

	@Override
	public void nadar(int metros) {
		System.out.println("nada " + metros + " metros");
		
	}

	@Override
	public void salirDelAgua() {
		System.out.println("Sale del agua");
		
	}

	@Override
	public void despega() {
		System.out.println("Despega");
		
	}

	@Override
	public void volar(int altitud) {
		System.out.println("vuela a" + altitud + " metros");
		
	}

	@Override
	public void aterrizar() {
		System.out.println("Aterriza");
		
	}
	

}

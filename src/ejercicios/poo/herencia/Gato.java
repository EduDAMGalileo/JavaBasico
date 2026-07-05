package ejercicios.poo.herencia;

public class Gato extends Animal{
	
	public Gato(String nombre){
		super(nombre);
	}
	
	@Override
	public void hacerSonido() {
		super.hacerSonido();
		System.out.println(", concretamente hace miaaauu");	

	}
}

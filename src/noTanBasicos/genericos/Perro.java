package noTanBasicos.genericos;

class Perro extends Animal {
	public Perro(String nombre) { 
		super(nombre); 
	}

	@Override
	public void emitirSonido() { 
		System.out.println(getNombre() + " dice: ¡Guau!"); 
	}
}

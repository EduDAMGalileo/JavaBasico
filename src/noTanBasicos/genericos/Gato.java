package noTanBasicos.genericos;

class Gato extends Animal {
	public Gato(String nombre) { 
		super(nombre); 
	}

	@Override
	public void emitirSonido() { 
		System.out.println(getNombre() + " dice: ¡Miau!"); 
	}

	public void amasar() { 
		System.out.println(getNombre() + " está amasando la manta..."); 
	}
}

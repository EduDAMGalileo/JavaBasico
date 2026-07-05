package ejemplos.poo.enumeraciones;

//ESTÁNDAR DE LA INDUSTRIA: 
//Un Enum "rico" que encapsula su propio estado inmutable.

public enum TamanoCafeV2 {

	// Invocación implícita al constructor
	PEQUENO(250),
	MEDIANO(350),
	GRANDE(500);

	// Estado interno (ESTRICTAMENTE inmutable)
	private final int volumenMl;

	// Constructor (SIEMPRE privado, explícita o implícitamente)
	private TamanoCafeV2(int volumenMl) {
		this.volumenMl = volumenMl;
	}

	// Exposición controlada del estado
	public int getVolumenMl() {
		return this.volumenMl;
	}
}

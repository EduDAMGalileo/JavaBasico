package examenes.examen2;

public abstract class PAS extends Persona{
	private String zona;

	public PAS(String dni, String nombre, String zona) {
		super(dni, nombre);
		this.zona = zona;
	}

	public String getZona() {
		return zona;
	}

}

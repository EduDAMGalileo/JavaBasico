package laboratorios.enumeracion;

public class TareaEnum {

	private String titulo;
	private Estado estado;

	public TareaEnum(String titulo) {
		this.titulo = titulo;
		this.estado = Estado.CREADA;
	}

	/**
	 * Intenta cambiar al estado indicado.
	 * Lanza IllegalArgumentException si la transición no está permitida.
	 */
	public void cambiarEstado(Estado nuevoEstado) {
		if (!estado.puedeIrA(nuevoEstado)) {
			throw new IllegalArgumentException(
					"Transicion no permitida: " + estado + " -> " + nuevoEstado);
		}
		this.estado = nuevoEstado;
	}

	public Estado getEstado() { 
		return estado; 
	}

	public String getTitulo()  { 
		return titulo; 
	}

	@Override
	public String toString() {
		return "[" + estado + "] " + titulo;
	}
}


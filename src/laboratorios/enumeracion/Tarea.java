package laboratorios.enumeracion;


public class Tarea {

	// Estados válidos como constantes String
	public static final String CREADA      = "CREADA";
	public static final String ASIGNADA    = "ASIGNADA";
	public static final String EN_PROGRESO = "EN_PROGRESO";
	public static final String RESUELTA    = "RESUELTA";
	public static final String CANCELADA   = "CANCELADA";

	private String titulo;
	private String estado;

	public Tarea(String titulo) {
		this.titulo = titulo;
		this.estado = CREADA;   // toda tarea empieza como CREADA
	}

	/**
	 * Intenta cambiar al estado indicado.
	 * Lanza IllegalArgumentException si la transición no está permitida.
	 */
	public void cambiarEstado(String nuevoEstado) {
		if (!transicionValida(nuevoEstado)) {
			throw new IllegalArgumentException(
					"Transicion no permitida: " + estado + " -> " + nuevoEstado);
		}
		this.estado = nuevoEstado;
	}

	/**
	 * Comprueba si la transición desde el estado actual al nuevo es válida.
	 * Cada bloque controla las transiciones posibles desde un estado origen.
	 */
	private boolean transicionValida(String nuevoEstado) {
		switch (estado) {
		case CREADA:
			return nuevoEstado.equals(ASIGNADA)
					|| nuevoEstado.equals(CANCELADA);
		case ASIGNADA:
			return nuevoEstado.equals(EN_PROGRESO)
					|| nuevoEstado.equals(CANCELADA);
		case EN_PROGRESO:
			return nuevoEstado.equals(RESUELTA)
					|| nuevoEstado.equals(CANCELADA);
		default:
			// RESUELTA y CANCELADA son estados terminales
			return false;
		}
	}

	public String getEstado() { 
		return estado; 
	}

	public String getTitulo() { 
		return titulo; 
	}

	@Override
	public String toString() {
		return "[" + estado + "] " + titulo;
	}

}


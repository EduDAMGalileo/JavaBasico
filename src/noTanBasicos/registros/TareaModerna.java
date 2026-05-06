package noTanBasicos.registros;

//ESTÁNDAR DE LA INDUSTRIA (Java Moderno):
//Uso de Constructor Compacto para validación y normalización.

public record TareaModerna(String id, String titulo) {

	/**
	 * Constructor Compacto: No tiene paréntesis () ni lista de parámetros.
	 * Los parámetros están presentes de forma implícita con los mismos nombres.
	 */
	public TareaModerna {
		// Validación temprana (Principio Fail-Fast)
		if (id == null || id.isBlank()) {
			throw new IllegalArgumentException("El ID de la tarea es obligatorio y no puede ser vacío.");
		}

		if (titulo == null || titulo.trim().isEmpty()) {
			throw new IllegalArgumentException("El título no puede ser nulo o estar en blanco.");
		}

		// Normalización defensiva
		// Podemos transformar el valor antes de que se asigne definitivamente.
		// Aquí eliminamos espacios accidentales al inicio o final.
		titulo = titulo.trim();

		// NOTA: Al terminar este bloque, Java realiza 
		// automáticamente las asignaciones: this.id = id; this.titulo = titulo; etc.
	}
}


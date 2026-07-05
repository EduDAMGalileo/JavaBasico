package ejemplos.poo.registros;


//MALA PRÁCTICA (Código antiguo): 
//Verboso y propenso a olvidar asignaciones.

public class TareaLegacy {
	private final String id;
	private final String titulo;

	public TareaLegacy(String id, String titulo) {
		if (id == null || titulo == null) throw new IllegalArgumentException();
		this.id = id; // Asignación manual
		this.titulo = titulo; // Si tenemos 10 campos, son 10 líneas de ruido
	}
}


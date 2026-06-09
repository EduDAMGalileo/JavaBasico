package laboratorios.enumeracion;

public class PruebaEnumV1 {

	static int pasadas = 0;
	static int falladas = 0;

	public static void main(String[] args) {
		System.out.println("=== PRUEBAS VERSION ENUM ===");
		System.out.println();

		pruebaFlujoCompleto();
		pruebaFlujoHastaCancelada();
		pruebaTransicionInvalidaDirecta();
		pruebaEstadoTerminalResuelta();
		pruebaEstadoTerminalCancelada();

		System.out.println();
		System.out.println("Resultado: " + pasadas + " pasadas, " + falladas + " falladas.");
	}

	static void pruebaFlujoCompleto() {
		try {
			TareaEnum t = new TareaEnum("Implementar login");
			t.cambiarEstado(Estado.ASIGNADA);
			t.cambiarEstado(Estado.EN_PROGRESO);
			t.cambiarEstado(Estado.RESUELTA);
			afirmar("Flujo completo", t.getEstado() == Estado.RESUELTA);
		} catch (Exception e) {
			fallo("Flujo completo", e.getMessage());
		}
	}

	static void pruebaFlujoHastaCancelada() {
		try {
			TareaEnum t = new TareaEnum("Tarea descartada");
			t.cambiarEstado(Estado.CANCELADA);
			afirmar("Cancelacion desde CREADA", t.getEstado() == Estado.CANCELADA);
		} catch (Exception e) {
			fallo("Cancelacion desde CREADA", e.getMessage());
		}
	}

	static void pruebaTransicionInvalidaDirecta() {
		try {
			TareaEnum t = new TareaEnum("Saltar estados");
			t.cambiarEstado(Estado.EN_PROGRESO);
			fallo("CREADA->EN_PROGRESO debe fallar", "No lanzo excepcion");
		} catch (IllegalArgumentException e) {
			afirmar("CREADA->EN_PROGRESO rechazada", true);
		}
	}

	static void pruebaEstadoTerminalResuelta() {
		try {
			TareaEnum t = new TareaEnum("Tarea terminada");
			t.cambiarEstado(Estado.ASIGNADA);
			t.cambiarEstado(Estado.EN_PROGRESO);
			t.cambiarEstado(Estado.RESUELTA);
			t.cambiarEstado(Estado.CANCELADA);
			fallo("RESUELTA es terminal", "No lanzo excepcion");
		} catch (IllegalArgumentException e) {
			afirmar("RESUELTA es terminal", true);
		}
	}

	static void pruebaEstadoTerminalCancelada() {
		try {
			TareaEnum t = new TareaEnum("Tarea cancelada");
			t.cambiarEstado(Estado.CANCELADA);
			t.cambiarEstado(Estado.CREADA);
			fallo("CANCELADA es terminal", "No lanzo excepcion");
		} catch (IllegalArgumentException e) {
			afirmar("CANCELADA es terminal", true);
		}
	}

	static void afirmar(String nombre, boolean condicion) {
		if (condicion) { 
			System.out.println("  [OK] " + nombre); 
			pasadas++; 
		}
		else           { 
			System.out.println("  [FALLO] " + nombre); 
			falladas++; 
		}
	}
	static void fallo(String nombre, String motivo) {
		System.out.println("  [FALLO] " + nombre + " -> " + motivo);
		falladas++;
	}
}


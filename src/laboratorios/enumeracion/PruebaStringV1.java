package laboratorios.enumeracion;

public class PruebaStringV1 {
	 
    // Contador global de pruebas pasadas / falladas
    static int pasadas = 0;
    static int falladas = 0;
 
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS VERSION STRING ===");
        System.out.println();
 
        pruebaFlujoCompleto();
        pruebaFlujoHastaCancelada();
        pruebaTransicionInvalidaDirecta();
        pruebaEstadoTerminalResuelta();
        pruebaEstadoTerminalCancelada();
 
        System.out.println();
        System.out.println("Resultado: " + pasadas + " pasadas, " + falladas + " falladas.");
    }
 
    // ── Pruebas de transiciones válidas ───────────────────────────────
 
    static void pruebaFlujoCompleto() {
        // CREADA -> ASIGNADA -> EN_PROGRESO -> RESUELTA
        try {
            Tarea t = new Tarea("Implementar login");
            t.cambiarEstado(Tarea.ASIGNADA);
            t.cambiarEstado(Tarea.EN_PROGRESO);
            t.cambiarEstado(Tarea.RESUELTA);
            afirmar("Flujo completo", t.getEstado().equals(Tarea.RESUELTA));
        } catch (Exception e) {
            fallo("Flujo completo", e.getMessage());
        }
    }
 
    static void pruebaFlujoHastaCancelada() {
        // CREADA -> CANCELADA (cancelación temprana)
        try {
            Tarea t = new Tarea("Tarea descartada");
            t.cambiarEstado(Tarea.CANCELADA);
            afirmar("Cancelacion desde CREADA", t.getEstado().equals(Tarea.CANCELADA));
        } catch (Exception e) {
            fallo("Cancelacion desde CREADA", e.getMessage());
        }
    }
 
    // ── Pruebas de transiciones inválidas ────────────────────────────
 
    static void pruebaTransicionInvalidaDirecta() {
        // CREADA -> EN_PROGRESO debe lanzar excepcion
        try {
            Tarea t = new Tarea("Saltar estados");
            t.cambiarEstado(Tarea.EN_PROGRESO);
            fallo("CREADA->EN_PROGRESO debe fallar", "No lanzo excepcion");
        } catch (IllegalArgumentException e) {
            afirmar("CREADA->EN_PROGRESO rechazada", true);
        }
    }
 
    static void pruebaEstadoTerminalResuelta() {
        // Desde RESUELTA no se puede cambiar a nada
        try {
            Tarea t = new Tarea("Tarea terminada");
            t.cambiarEstado(Tarea.ASIGNADA);
            t.cambiarEstado(Tarea.EN_PROGRESO);
            t.cambiarEstado(Tarea.RESUELTA);
            t.cambiarEstado(Tarea.CANCELADA);  // debe fallar
            fallo("RESUELTA es terminal", "No lanzo excepcion");
        } catch (IllegalArgumentException e) {
            afirmar("RESUELTA es terminal", true);
        }
    }
 
    static void pruebaEstadoTerminalCancelada() {
        // Desde CANCELADA no se puede cambiar a nada
        try {
            Tarea t = new Tarea("Tarea cancelada");
            t.cambiarEstado(Tarea.CANCELADA);
            t.cambiarEstado(Tarea.CREADA);  // debe fallar
            fallo("CANCELADA es terminal", "No lanzo excepcion");
        } catch (IllegalArgumentException e) {
            afirmar("CANCELADA es terminal", true);
        }
    }
 
    // ── Utilidades ───────────────────────────────────────────────────
 
    static void afirmar(String nombre, boolean condicion) {
        if (condicion) {
            System.out.println("  [OK] " + nombre);
            pasadas++;
        } else {
            System.out.println("  [FALLO] " + nombre);
            falladas++;
        }
    }
 
    static void fallo(String nombre, String motivo) {
        System.out.println("  [FALLO] " + nombre + " -> " + motivo);
        falladas++;
    }
}

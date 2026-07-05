package ejemplos.genericos;

public class GeneradorDeLogs {

    // MALA PRÁCTICA: "Explosión de métodos". 
    // Obliga al equipo a mantener múltiples versiones del mismo código.
    public static void registrarV1(String mensaje) {
        System.out.println("[AUDITORIA] " + mensaje);
    }
    
    public static void registrarV1(Integer codigo) {
        System.out.println("[AUDITORIA] " + codigo);
    }

    // ESTÁNDAR DE LA INDUSTRIA: Método Genérico.
    // El <T> antes de 'void' independiza al método del resto de la clase.
    public static <T> void registrar(T elemento) {
        // Aprovechamos que todos los objetos en Java tienen toString()
        System.out.println("[AUDITORIA-MODERNA] Valor procesado: " + elemento);
    }
}

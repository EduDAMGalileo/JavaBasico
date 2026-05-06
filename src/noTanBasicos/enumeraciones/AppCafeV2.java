package noTanBasicos.enumeraciones;

public class AppCafeV2 {
    public static void main(String[] args) {
        
        // Acceso directo y recuperación de estado encapsulado
        // No hay 'new', accedemos a la instancia única 'GRANDE'
    	
        TamanoCafeV2 miVaso = TamanoCafeV2.GRANDE;
        
        System.out.println("He seleccionado el tamaño: " + miVaso);
        System.out.println("Capacidad a servir: " + miVaso.getVolumenMl() + "ml");

        // Iteración: El Enum sabe qué valores contiene
        // El método .values() es generado automáticamente por el compilador
        
        System.out.println("\n--- Menú de tamaños disponibles ---");
        for (TamanoCafeV2 t : TamanoCafeV2.values()) {
            System.out.println("- " + t + " (ID: " + t.ordinal() + "): " + t.getVolumenMl() + "ml");
        }

        // Transformación de datos (Input de usuario a objeto real)
        // Imagina que recibimos un String de una base de datos o API
        
        String entradaUsuario = "MEDIANO";
        TamanoCafeV2 tamanoRecuperado = TamanoCafeV2.valueOf(entradaUsuario);
        
        if (tamanoRecuperado == TamanoCafeV2.MEDIANO) {
            System.out.println("\nEl sistema confirma que has elegido el tamaño MEDIANO.");
        }
    }
}
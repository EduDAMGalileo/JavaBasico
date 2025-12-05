package basicos;

public class AmbitoEnFor {

    public static void main(String[] args) {

        System.out.println("--- Inicio del Programa ---");

        // El bucle se ejecutará 3 veces (para i=0, i=1, i=2)
        for (int i = 0; i < 3; i++) {
            
            // --- Variable con Ámbito de Bloque (solo existe aquí dentro) ---
            // Esta variable se crea y se destruye en CADA iteración del bucle.
            int variableInterna = i * 10;
            
            System.out.println("Iteración número " + i);
            System.out.println("  -> La variable 'i' es visible aquí. Valor: " + i);
            System.out.println("  -> La 'variableInterna' es visible aquí. Valor: " + variableInterna);
            
        } // 'i' y 'variableInterna' se destruyen al final de cada vuelta y en la salida del bucle.

        System.out.println("--- Fin del Bucle ---");

        // --- Intentando acceder a las variables fuera de su ámbito ---

        // La siguiente línea provocaría un ERROR DE COMPILACIÓN porque la variable 'i' ya no existe. Su ámbito terminó con la llave de cierre del 'for'.
        //System.out.println("Intentando acceder a 'i' fuera del bucle: " + i);

        // La siguiente línea también provocaría un ERROR DE COMPILACIÓN porqu 'variableInterna' solo existía dentro del cuerpo del bucle.
        //System.out.println("Intentando acceder a 'variableInterna' fuera del bucle: " + variableInterna);
        
        System.out.println("El programa ha finalizado correctamente.");
    }
}
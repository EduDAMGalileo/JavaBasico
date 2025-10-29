package basicos;

public class BreakYContinue {

	public static void main(String[] args) {
	    System.out.println("--- Ejemplo con 'break' ---");
        System.out.println("El bucle se detendrá cuando encuentre el número 7.");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Comprobando el número: " + i);

            // Condición de salida de emergencia
            if (i == 7) {
                System.out.println("¡He encontrado el 7! Saliendo del bucle...");
                break; // Termina la ejecución del bucle for inmediatamente.
            }
        }
        // La ejecución continúa aquí después del break.
        System.out.println("El bucle ha terminado.");

        System.out.println("\n----------------------------------\n");

        System.out.println("--- Ejemplo con 'continue' ---");
        System.out.println("El bucle se saltará los múltiplos de 3.");

        for (int i = 1; i <= 10; i++) {

            // Condición para saltar la iteración
            if (i % 3 == 0) {
                System.out.println("Saltando el número " + i + " porque es múltiplo de 3.");
                continue; // Termina la iteración ACTUAL y salta a la siguiente (i++).
            }

            // Esta línea solo se ejecutará si el 'continue' no se ha activado.
            System.out.println("Imprimiendo el número: " + i);
        }
        System.out.println("El bucle ha terminado.");

	}

}

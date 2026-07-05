package ejemplos.excepciones;

public class Excepciones {

	public static void main(String[] args) {
		
		// Declaración fuera para mantener visibilidad en los catch
		int resultado = 0;

		try {
		    // --- INICIO DE LA ZONA DE RIESGO ---
		    
		    System.out.println("Paso 1: Iniciando operación...");
		    
		    // Supongamos que esta línea falla (lanza excepción)
		    resultado = 100 / 0; 
		    
		    // --- ZONA INALCANZABLE (Dead Code en caso de error) ---
		    // Si la línea anterior falla, el programa JAMÁS pasará por aquí.
		    System.out.println("Paso 2: Operación exitosa."); 
		    
		    // --- FIN DE LA ZONA DE RIESGO ---
		} catch (ArithmeticException e) {
            // Gestión del error:
            // En lugar de colapsar, informamos y asignamos un valor lógico.
            System.out.println("Error: No se puede calcular la división entre 0.");
		}
		
		
		try {
            // Provocamos un error de índice de array
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Acceso inválido
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("--- Diagnóstico del Error ---");
            
            System.out.println("1. Mensaje corto (e.getMessage()):");
            System.out.println("   " + e.getMessage());
            
            System.out.println("\n2. Descripción técnica (e.toString()):");
            System.out.println("   " + e.toString());
            
            System.out.println("\n3. Traza completa (e.printStackTrace()):");
            // Este método imprime directamente en la consola, no devuelve un String
            e.printStackTrace(); 
        }
	}

}

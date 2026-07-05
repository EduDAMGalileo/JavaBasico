package ejemplos.excepciones;

public class DiagnosticoPro {
    public static void main(String[] args) {
        System.out.println("Iniciando aplicación...");
        metodoA();
        System.out.println("Fin de la aplicación.");
    }

    public static void metodoA() {
    	//Simplemente para aumentar la pila
        metodoB();
    }

    public static void metodoB() {
        // Provocamos un error intencionado al final de la cadena
        try {
            String texto = null;
            int longitud = texto.length(); // Esto lanzará NullPointerException
            
        } catch (NullPointerException e) {
            System.out.println("--- DIAGNÓSTICO DEL ERROR ---");
            
            // 1. Mensaje breve
            System.out.println("Mensaje breve: " + e.getMessage());
            
            // 2. Descripción completa
            System.out.println("Tipo de error: " + e.toString());
            
            // 3. La traza completa (La autopsia)
            System.out.println("\nTraza completa de la pila (Stack Trace):");
            e.printStackTrace();
        }
    }
}
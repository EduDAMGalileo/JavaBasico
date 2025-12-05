package basicos;

public class Sombreado {

    // --- Atributo de la Clase (Ámbito de Clase) ---
    // Esta variable 'x' pertenece a la clase y es visible en todos sus métodos.
    // La hacemos 'static' para poder acceder a ella desde métodos 'static'. Ya lo veremos mejor
    static int x = 100; 

    public static void main(String[] args) {
        
        System.out.println("1. En main, antes de llamar al método, x vale: " + x);

        miMetodo();

        System.out.println("3. En main, después de llamar al método, x sigue valiendo: " + x);
        // El cambio dentro del método no le afectó porque era a una variable local.
    }

    public static void miMetodo() {
        // --- Variable Local (Ámbito de Método) ---
        // Esta declaración crea una NUEVA variable 'x' que solo existe aquí dentro.
        // A partir de este punto, esta 'x' local "hace sombra" a la 'x' de la clase.
        int x = 50; 
        
        System.out.println("2. Dentro del método, la variable local 'x' vale: " + x);
        
        // Si quisiéramos acceder a la variable 'x' de la clase, tendríamos que ser explícitos.
        // Esto es un concepto más avanzado, pero se haría así:
        System.out.println("   (Para curiosos: la 'x' de la clase sigue valiendo " + Sombreado.x + ")");
        
    } // La variable local 'x' (la que valía 50) se destruye aquí.
}
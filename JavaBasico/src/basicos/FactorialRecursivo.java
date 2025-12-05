package basicos;

public class FactorialRecursivo {

    public static void main(String[] args) {
        int numero = 5;
        long resultado = factorial(numero); // Primera llamada
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }

    /**
     * Calcula el factorial de un número de forma recursiva.
     * @param n El número del que se calculará el factorial.
     * @return El resultado del factorial.
     */
    public static long factorial(int n) {
        // --- 1. Caso Base ---
        // Si n es 1 (o 0), la respuesta es 1. Aquí se detiene la recursión.
        if (n <= 1) {
            return 1;
        } 	
        // --- 2. Caso Recursivo ---
        // Si no es el caso base, descomponemos el problema.
        else {
            // Devolvemos n multiplicado por el resultado de llamar a esta misma función
            // con un problema más pequeño (n - 1).
            return n * factorial(n - 1);
        }
    }
}
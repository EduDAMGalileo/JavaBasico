package laboratorios;

public class LaboratorioDebug {

    public static void main(String[] args) {
        System.out.println("--- Calculadora de Factorial ---");
        int numero = 10;
        int resultado;

        System.out.println("Calculando el factorial de " + numero);

        // Llamamos al método que tiene el error
        resultado = calcularFactorial(numero);

        System.out.println("El resultado (incorrecto) es: " + resultado);
    }

    /**
     * Intenta calcular el factorial de un número n (n!).
     * Contiene un error lógico.
     */
    public static int calcularFactorial(int n) {
        int factorial = 0; // Pista: ¿Es correcto empezar en 0 para una multiplicación?

        // El bucle multiplica 1 * 2 * 3 * ... * n
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }
}
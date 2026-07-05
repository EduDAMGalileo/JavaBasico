package ejemplos.poo;

public class Conversor {
    // Atributo de instancia (requiere objeto)
    private double tasaManual = 1.10;

    // MÉTODO ESTÁTICO: Una utilidad pura
    public static double celsiusAFahrenheit(double celsius) {
        // No necesita atributos de la clase, solo sus parámetros
        return (celsius * 9 / 5) + 32;
    }

    // MÉTODO ESTÁTICO: Intento de error
    public static void mostrarTasa() {
        // System.out.println(this.tasaManual); <-- ERROR DE COMPILACIÓN
        // No puede acceder a tasaManual porque es de instancia.
    }
}
package noTanBasicos.excepciones;

public class AppCalculadora {
    public static void main(String[] args) {
        try {
            // El 'main' asume la responsabilidad de llamar al método peligroso.
            int resultado = Calculadora.dividir(10, 0);
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            // El 'main' decide cómo informar al usuario del error que ocurrió en la otra clase.
            System.out.println("Error: No se puede dividir entre cero en la calculadora.");
        }
    }
}
package noTanBasicos.excepciones;

public class Calculadora {
    /**
     Este método realiza una división entera. Mediante 'throws', avisa de que no capturará errores de división por cero.
     */
	
    public static int dividir(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
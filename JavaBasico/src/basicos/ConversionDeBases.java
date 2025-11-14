package basicos;

public class ConversionDeBases {

    public static void main(String[] args) {

        // Nuestro número de partida en base 10 (decimal)
        int numeroDecimal = 255;
        String cadena = new String("Hola");
        String cadena2= "Hola";
        
        
        System.out.println("--- Conversión del número " + numeroDecimal + " a otras bases ---");
        System.out.println("-----------------------------------------------------");

        // --- Conversión a Binario (Base 2) ---
        // Se usan los dígitos 0 y 1.
        String representacionBinaria = Integer.toBinaryString(numeroDecimal);
        System.out.println("En Binario (base 2) es: " + representacionBinaria); // Salida: 11111111
        System.out.println();


        // --- Conversión a Octal (Base 8) ---
        // Se usan los dígitos del 0 al 7.
        String representacionOctal = Integer.toOctalString(numeroDecimal);
        System.out.println("En Octal (base 8) es: " + representacionOctal); // Salida: 377
        // Comprobación manual: (3 * 8^2) + (7 * 8^1) + (7 * 8^0) = 192 + 56 + 7 = 255
        System.out.println();


        // --- Conversión a Hexadecimal (Base 16) ---
        // Se usan los dígitos del 0 al 9 y las letras de la 'a' a la 'f'.
        String representacionHexadecimal = Integer.toHexString(numeroDecimal);
        System.out.println("En Hexadecimal (base 16) es: " + representacionHexadecimal); // Salida: ff
        // Comprobación manual: (15 * 16^1) + (15 * 16^0) = 240 + 15 = 255
        System.out.println();
        
        // --- Ejemplo con un color (muy común para hexadecimal) ---
        int colorRojo = 255;
        int colorVerde = 165;
        int colorAzul = 0;

        String codigoHexRojo = Integer.toHexString(colorRojo);
        String codigoHexVerde = Integer.toHexString(colorVerde);
        String codigoHexAzul = Integer.toHexString(colorAzul);
        
        // Asegurarnos de que cada componente tenga dos dígitos (ej: 0 se convierte en 00)
        if (codigoHexAzul.length() == 1) {
            codigoHexAzul = "0" + codigoHexAzul;
        }

        System.out.println("--- Ejemplo de Color RGB a Hexadecimal ---");
        System.out.println("El color Naranja (R=255, G=165, B=0) en hexadecimal es: #" 
                           + codigoHexRojo + codigoHexVerde + codigoHexAzul); // Salida: #ffa500
    }
}
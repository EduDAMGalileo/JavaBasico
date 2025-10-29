package basicos;

public class LiteralesNumericos {

    public static void main(String[] args) {

        System.out.println("--- Literales de Números Enteros ---");
        System.out.println("------------------------------------");

        /* --- El sufijo 'L' para los long ---
         Java asume que cualquier número entero es un 'int'.
         Si el número es demasiado grande para un 'int', debemos añadir una 'L'
         (mayúscula o minúscula, pero se prefiere la mayúscula para no confundirla con un 1).
        */
        long numeroLargo = 238941203478120347L;
        System.out.println("Literal long con sufijo 'L': " + numeroLargo);

        /* --- Separadores para legibilidad (desde Java 7) ---
         Podemos usar guiones bajos '_' para separar grupos de dígitos y hacer
         que los números largos sean mucho más fáciles de leer.
          El compilador simplemente ignora los guiones bajos.
        */
        
        long numeroLargoLegible = 123_456_789_123_456L;
        int numeroIntLegible = 1_000_000;
        System.out.println("Literal con separadores '_': " + numeroLargoLegible);
        System.out.println("Otro ejemplo con separadores: " + numeroIntLegible);
        System.out.println();


        System.out.println("--- Sistemas de Numeración (Bases) ---");
        System.out.println("----------------------------------------");

        // --- Base 10 (Decimal): La forma normal ---
        int decimal = 100;
        System.out.println("Base 10 (Decimal): " + decimal);

        // --- Base 2 (Binario): Con el prefijo '0b' ---
        // Útil para trabajar con operaciones a nivel de bits.
        int binario = 0b1100100; // Esto es 64 + 32 + 4 = 100
        System.out.println("Base 2 (Binario) '0b1100100' es: " + binario);

        // --- Base 8 (Octal): Se prefija con '0' ---
        // Menos común hoy en día, pero se usaba para permisos en sistemas Unix.
        int octal = 0144; // Esto es (1 * 8^2) + (4 * 8^1) + (4 * 8^0) = 64 + 32 + 4 = 100
        System.out.println("Base 8 (Octal) '0144' es: " + octal);

        // --- Base 16 (Hexadecimal): Se prefija con '0x' ---
        // Muy usado para definir colores (ej: #FFFFFF) y en programación de bajo nivel.
        // Usa los dígitos 0-9 y las letras A-F.
        int hexadecimal = 0x64; // Esto es (6 * 16^1) + (4 * 16^0) = 96 + 4 = 100
        System.out.println("Base 16 (Hexadecimal) '0x64' es: " + hexadecimal);
        System.out.println();


        System.out.println("--- Literales de Números Decimales (Punto Flotante) ---");
        System.out.println("---------------------------------------------------------");

        /* --- El sufijo 'f' para los float ---
         Java asume que cualquier número con decimales es un 'double'.
         Para asignarlo a un 'float', debemos añadir una 'f' al final.
         */
        float decimalPequeno = 123.456f;
        System.out.println("Literal float con sufijo 'f': " + decimalPequeno);

        // --- El tipo 'double' (por defecto) ---
        // No necesita ningún sufijo, aunque se le puede poner una 'd' opcionalmente.
        double decimalGrande = 123490861236481.1234134;
        System.out.println("Literal double (por defecto): " + decimalGrande);

        // --- Notación Científica (o Exponencial) ---
        // Se usa la letra 'E' o 'e' para indicar "elevado a la potencia de 10".
        // Es muy útil para representar números muy grandes o muy pequeños.
        double numeroMuyPequeno = 1.1234132E-10; // 1.1234132 * 10^(-10)
        double numeroMuyGrande = 2.99792458E8;  // Velocidad de la luz (2.99792458 * 10^8)
        System.out.println("Notación científica (E-10): " + numeroMuyPequeno);
        System.out.println("Notación científica (E8): " + numeroMuyGrande);

        // También se pueden usar separadores en los decimales.
        double decimalLegible = 12_345.67_89;
        System.out.println("Literal double con separadores: " + decimalLegible);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicos;

/**
 *
 * @author Eduardo
 */
public class TiposDeDatosPrimitivos {

    public static void main(String[] args) {

        System.out.println("--- Tipos de Datos Numéricos Enteros ---");
        System.out.println("----------------------------------------");

        // byte: El más pequeño. Ocupa 8 bits.
        // Ideal para ahorrar memoria cuando los números son muy pequeños.
        byte miByte = 100;
        System.out.println("Tipo: byte");
        System.out.println("Ejemplo: " + miByte);
        System.out.println("Valor Mínimo: " + Byte.MIN_VALUE);   // -128
        System.out.println("Valor Máximo: " + Byte.MAX_VALUE);   // 127
        System.out.println(); // Línea en blanco

        // short: Ocupa 16 bits.
        short miShort = 30000;
        System.out.println("Tipo: short");
        System.out.println("Ejemplo: " + miShort);
        System.out.println("Valor Mínimo: " + Short.MIN_VALUE);  // -32,768
        System.out.println("Valor Máximo: " + Short.MAX_VALUE);  // 32,767
        System.out.println();

        // int: El más común para enteros. Ocupa 32 bits.
        // Es el tipo por defecto para números enteros en Java.
        int miInt = 2000000000;
        System.out.println("Tipo: int (el más usado)");
        System.out.println("Ejemplo: " + miInt);
        System.out.println("Valor Mínimo: " + Integer.MIN_VALUE); // -2,147,483,648
        System.out.println("Valor Máximo: " + Integer.MAX_VALUE); // 2,147,483,647
        System.out.println();

        // long: Para enteros muy grandes. Ocupa 64 bits.
        // Se debe añadir una 'L' al final del número para indicar que es un long.
        long miLong = 9000000000000000000L;
        System.out.println("Tipo: long");
        System.out.println("Ejemplo: " + miLong);
        System.out.println("Valor Mínimo: " + Long.MIN_VALUE);   // Un número muy grande
        System.out.println("Valor Máximo: " + Long.MAX_VALUE);   // Un número muy grande
        System.out.println();

        System.out.println("--- Tipos de Datos Numéricos con Decimales (Punto Flotante) ---");
        System.out.println("---------------------------------------------------------------");

        // float: Precisión simple. Ocupa 32 bits.
        // Se debe añadir una 'f' al final del número para indicar que es un float.
        float miFloat = 3.14159f;
        System.out.println("Tipo: float");
        System.out.println("Ejemplo: " + miFloat);
        System.out.println("Valor Mínimo: " + Float.MIN_VALUE);   // Un número positivo muy pequeño cercano a 0
        System.out.println("Valor Máximo: " + Float.MAX_VALUE);   // Un número muy grande
        System.out.println();
        
        // double: Precisión doble. Ocupa 64 bits.
        // Es el tipo por defecto para números con decimales en Java. El más usado.
        double miDouble = 99.9987654321;
        System.out.println("Tipo: double (el más usado)");
        System.out.println("Ejemplo: " + miDouble);
        System.out.println("Valor Mínimo: " + Double.MIN_VALUE);  // Un número positivo muy pequeño cercano a 0
        System.out.println("Valor Máximo: " + Double.MAX_VALUE);  // Un número muy grande
        System.out.println();

        System.out.println("--- Otros Tipos de Datos Primitivos ---");
        System.out.println("---------------------------------------");

        // boolean: Solo puede ser 'true' o 'false'.
        boolean miBoolean = true;
        System.out.println("Tipo: boolean");
        System.out.println("Ejemplo: " + miBoolean);
        System.out.println("Solo puede tener dos valores: true o false.");
        System.out.println();

        // char: Un único carácter. Ocupa 16 bits (Unicode).
        // Se escribe entre comillas simples ''.
        char miChar = 'A';
        System.out.println("Tipo: char");
        System.out.println("Ejemplo: " + miChar);
        System.out.println("Valor Mínimo (código Unicode): " + (int) Character.MIN_VALUE); // 0
        System.out.println("Valor Máximo (código Unicode): " + (int) Character.MAX_VALUE); // 65535
        System.out.println();
    }
}

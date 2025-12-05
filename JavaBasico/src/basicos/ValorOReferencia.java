package basicos;

import java.util.Arrays;


public class ValorOReferencia {

    public static void main(String[] args) {
        
        // --- 1. TIPO PRIMITIVO (int) ---
        int numeroPrimitivo = 10;
        System.out.println("--- 1. TIPO PRIMITIVO (int) ---");
        System.out.println("Valor original ANTES: " + numeroPrimitivo);
        intentarModificarPrimitivo(numeroPrimitivo);
        System.out.println("Valor final DESPUÉS: " + numeroPrimitivo);
        System.out.println("-> Conclusión: El valor original NO ha cambiado (Paso por Valor).");
        System.out.println("--------------------------------------------------\n");

        // --- 2. ARRAY (Objeto Mutable) ---
        int[] miArray = {10, 20, 30};
        System.out.println("--- 2. ARRAY (Objeto Mutable) ---");
        System.out.println("Contenido original ANTES: " + Arrays.toString(miArray));
        modificarArray(miArray);
        System.out.println("Contenido final DESPUÉS: " + Arrays.toString(miArray));
        System.out.println("-> Conclusión: El contenido del array SÍ ha cambiado.");
        System.out.println("--------------------------------------------------\n");

        // --- 3. STRING (Objeto Inmutable) ---
        String miString = "Hola";
        System.out.println("--- 3. STRING (Objeto Inmutable) ---");
        System.out.println("Valor original ANTES: " + miString);
        intentarModificarString(miString);
        System.out.println("Valor final DESPUÉS: " + miString);
        System.out.println("-> Conclusión: El String original NO ha cambiado (por la inmutabilidad).");
        System.out.println("--------------------------------------------------\n");
        
        // --- 4. STRINGBUILDER (Objeto Mutable) ---
        StringBuilder miBuilder = new StringBuilder("Hola");
        System.out.println("--- 4. STRINGBUILDER (Objeto Mutable) ---");
        System.out.println("Contenido original ANTES: " + miBuilder);
        modificarStringBuilder(miBuilder);
        System.out.println("Contenido final DESPUÉS: " + miBuilder);
        System.out.println("-> Conclusión: El contenido del StringBuilder SÍ ha cambiado.");
        System.out.println("--------------------------------------------------");
    }

    // =================================================================
    // MÉTODOS AUXILIARES
    // =================================================================

    /**
     * Recibe una COPIA del valor de un tipo primitivo.
     */
    public static void intentarModificarPrimitivo(int numero) {
        numero = 99; // Modificamos la copia local.
    }

    /**
     * Recibe una copia de la REFERENCIA al array. Modifica el objeto original.
     */
    public static void modificarArray(int[] array) {
        array[0] = 999; // Modificamos el contenido del objeto original.
    }

    /**
     * Recibe una copia de la REFERENCIA al String.
     * El método .toUpperCase() crea un NUEVO objeto String.
     * La variable local 'texto' pasa a apuntar a este nuevo objeto, pero el original no cambia.
     */
    public static void intentarModificarString(String texto) {
        texto = texto.toUpperCase();
    }
    
    /**
     * Recibe una copia de la REFERENCIA al StringBuilder.
     * El método .append() MODIFICA el objeto original.
     */
    public static void modificarStringBuilder(StringBuilder builder) {
        builder.append(" Mundo");
    }
}
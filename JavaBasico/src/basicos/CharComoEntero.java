package basicos;

public class CharComoEntero {

    public static void main(String[] args) {

        // --- 1. Comportamiento Normal ---
        // Java lo trata como un carácter al imprimirlo.
        char letraA = 'A';
        System.out.println("1. Comportamiento normal de un char: " + letraA);

        // --- 2. Revelando su Valor Numérico (Casting) ---
        // Forzamos a Java a tratar el char como un int. Esto se llama "casting explícito".
        int valorUnicodeDeA = (int) letraA;
        System.out.println("2. El valor numérico (Unicode) de '" + letraA + "' es: " + valorUnicodeDeA);

        // --- 3. Creando un Char a partir de un Número ---
        // También podemos hacer el proceso inverso.
        int numero = 66;
        char caracterDesdeNumero = (char) numero;
        System.out.println("3. El número " + numero + " representa el carácter: '" + caracterDesdeNumero + "'");
        System.out.println("--------------------------------------------------");

        // --- 4. Operaciones Aritméticas ---
        // ¡Podemos hacer matemáticas con los caracteres!
        // Java convierte los char a int para poder operar (promoción aritmética).
        char siguienteLetra = (char) (letraA + 1); // 65 + 1 = 66, que es 'B'
        System.out.println("4. 'A' + 1 es el carácter: '" + siguienteLetra + "'");

        // Esto es muy útil para recorrer el alfabeto en un bucle.
        System.out.print("   Recorriendo el alfabeto: ");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println("\n--------------------------------------------------");


        // --- 5. La Trampa: Concatenación vs. Suma Aritmética ---
        // Esta es la fuente de mayor confusión. El operador '+' se comporta diferente.
        
        System.out.println("5. ¡CUIDADO CON EL OPERADOR '+'!");

        // CASO A: String + char -> CONCATENACIÓN de texto
        // Si la operación empieza con un String, todo lo demás se convierte a String.
        String resultadoA = "El carácter es " + 'A';
        System.out.println("   A) String + char -> " + resultadoA);

        // CASO B: char + int -> SUMA aritmética
        // Java convierte el char 'A' a su valor int (65) y luego suma.
        int resultadoB = 'A' + 1;
        System.out.println("   B) char + int ('A' + 1) -> " + resultadoB); // Salida: 66

        // CASO C: char + char -> SUMA aritmética
        // Java convierte AMBOS char a sus valores int y los suma.
        int resultadoC = 'A' + 'B'; // 65 + 66
        System.out.println("   C) char + char ('A' + 'B') -> " + resultadoC); // Salida: 131

        // ¿Cómo forzar la concatenación en el caso C? Empezando con un String vacío.
        String resultadoForzado = "" + 'A' + 'B';
        System.out.println("   D) Forzando concatenación: \"\" + 'A' + 'B' -> " + resultadoForzado);
    }
}
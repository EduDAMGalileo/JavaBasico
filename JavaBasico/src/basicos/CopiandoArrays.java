package basicos;

import java.util.Arrays;

public class CopiandoArrays {

	public static void main(String[] args) {
        // Creamos nuestro array original
        int[] arrayOriginal = {10, 20, 30};

        // --- La "copia" incorrecta ---
        // 'arrayCopia' ahora apunta a la MISMA dirección de memoria que 'arrayOriginal'.
        int[] arrayCopia = arrayOriginal; 

        System.out.println("--- Estado Inicial ---");
        System.out.println("Array Original: " + Arrays.toString(arrayOriginal));
        System.out.println("Array 'Copia':  " + Arrays.toString(arrayCopia));
        
        // Ahora, modificamos un elemento usando la "copia"
        System.out.println("\n...Modificando el primer elemento de 'arrayCopia' a 999...");
        arrayCopia[0] = 999;
        
        // Comprobamos el estado de AMBOS arrays
        System.out.println("\n--- Estado Final ---");
        System.out.println("Array Original: " + Arrays.toString(arrayOriginal));
        System.out.println("Array 'Copia':  " + Arrays.toString(arrayCopia));
        
        System.out.println("\n¡El array original ha sido modificado! No era una copia real.");

	}

}

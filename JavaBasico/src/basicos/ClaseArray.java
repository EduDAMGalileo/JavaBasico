package basicos;

import java.util.Arrays;

public class ClaseArray {

	public static void main(String[] args) {

        //------------------------------------------------------------------------------------------------------
		int[] numeros = {10, 20, 30};
		System.out.println(numeros);

		String[] nombres = {"Ana", "Luis", "Marta"};
		int[] edades = {25, 30, 28};

		System.out.println("Contenido del array de nombres: " + Arrays.toString(nombres));
		System.out.println("Contenido del array de edades: " + Arrays.toString(edades));
		
		
		
        //------------------------------------------------------------------------------------------------------
		int[] numeros2 = {40, 10, 80, 25, 5};
        String[] paises = {"España", "México", "Argentina", "Colombia"};

        System.out.println("Array de números original: " + Arrays.toString(numeros2));
        System.out.println("Array de países original: " + Arrays.toString(paises));

        // Ordenamos los arrays
        Arrays.sort(numeros2);
        Arrays.sort(paises); // Ordena alfabéticamente

        System.out.println("\nArray de números ordenado: " + Arrays.toString(numeros2));
        System.out.println("Array de países ordenado: " + Arrays.toString(paises));
        
        //------------------------------------------------------------------------------------------------------
        int[] numerosOrdenados = {10, 20, 30, 40, 50};

        // Buscamos un elemento que sí existe
        int indiceDe30 = Arrays.binarySearch(numerosOrdenados, 30);
        System.out.println("El elemento 30 se encuentra en el índice: " + indiceDe30);

        // Buscamos un elemento que no existe
        int indiceDe35 = Arrays.binarySearch(numerosOrdenados, 35);
        System.out.println("Resultado de buscar el elemento 35: " + indiceDe35);
        
        
        //------------------------------------------------------------------------------------------------------
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {3, 2, 1}; // Mismos elementos, orden diferente

        System.out.println("¿a == b? " + (a == b)); 
        System.out.println("¿Arrays.equals(a, b)? " + Arrays.equals(a, b)); 
        System.out.println("¿Arrays.equals(a, c)? " + Arrays.equals(a, c));
        
      //------------------------------------------------------------------------------------------------------
        int[] miArray = new int[5];
        System.out.println("Array inicial: " + Arrays.toString(miArray)); 

        // Rellenamos todo el array con el valor -1
        Arrays.fill(miArray, -1);
        System.out.println("Array rellenado: " + Arrays.toString(miArray)); 
        
      //------------------------------------------------------------------------------------------------------
        String[] original = {"A", "B", "C"};
        
        // Creamos una copia exacta
        String[] copia = Arrays.copyOf(original, original.length);

        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copia:    " + Arrays.toString(copia));

        // Modificamos la copia para demostrar que son independientes
        copia[0] = "Z";

        System.out.println("\n--- Después de modificar la copia ---");
        System.out.println("Original: " + Arrays.toString(original)); 
        System.out.println("Copia:    " + Arrays.toString(copia));    
        
       

}

}

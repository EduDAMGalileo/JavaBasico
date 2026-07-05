package ejemplos.estructurada.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] coloresArray = {"Rojo", "Verde", "Azul"};

        // PASO 1: Conversión (El Constructor Mágico)
        // Usamos el constructor de ArrayList que acepta otra colección dentro. Ya veremos con detalle qué es esto de los constructores
        // Arrays.asList() convierte el array en una "vista" de lista compatible.
        
        ArrayList<String> listaColores = new ArrayList<>(Arrays.asList(coloresArray));

        // PASO 2: Demostración
        // Ahora podemos añadir cosas (algo que no podíamos hacer con el array)
        listaColores.add("Amarillo");
        
        //Curiosamente podemos mostrar un ArrayList "a lo bruto", sin pasar por el toString de los Arrays
        System.out.println("Lista final: " + listaColores); 
        
        
        //Al revés
        // Tenemos nuestra lista
        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Ana");
        listaNombres.add("Pedro");

        // CONVERSIÓN
        // Le pasamos un array vacío del tipo que queremos 'new String[0]'.
        // Esto le dice a Java: "Quiero que me devuelvas un String[]".
        
        String[] arrayNombres = listaNombres.toArray(new String[0]);

        // DEMOSTRACIÓN
        System.out.println("Array creado: " + Arrays.toString(arrayNombres));
        System.out.println("Tamaño del array: " + arrayNombres.length);
   

    }
}

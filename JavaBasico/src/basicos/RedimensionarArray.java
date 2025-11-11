package basicos; 

import java.util.Arrays;

public class RedimensionarArray {

    public static void main(String[] args) {
        String[] listaCompra = {"Leche", "Pan", "Huevos"};
        System.out.println("Lista original (tamaño " + listaCompra.length + "): " + Arrays.toString(listaCompra));
        
        // --- Escenario 1: Agrandar el array ---
        // Queremos añadir "Mantequilla". Necesitamos un array de tamaño 4.
        String[] listaAgrandada = Arrays.copyOf(listaCompra, 4);
        
        System.out.println("\nLista agrandada (tamaño " + listaAgrandada.length + "): " + Arrays.toString(listaAgrandada));
        
        // Ahora podemos añadir el nuevo elemento en el espacio disponible.
        listaAgrandada[3] = "Mantequilla";
        System.out.println("Lista final: " + Arrays.toString(listaAgrandada));
        
       
        // --- Escenario 2: Acortar el array ---
        // Nos hemos dado cuenta de que no necesitamos el último producto.
        String[] listaAcortada = Arrays.copyOf(listaCompra, 2);
        
        System.out.println("\nLista acortada (tamaño " + listaAcortada.length + "): " + Arrays.toString(listaAcortada));
        
    }
}
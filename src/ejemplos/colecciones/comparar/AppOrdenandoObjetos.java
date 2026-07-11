package ejemplos.colecciones.comparar;

import java.util.Set;
import java.util.TreeSet;

public class AppOrdenandoObjetos {

    public static void main(String[] args) {
        System.out.println("--- El TreeSet funcionando con Orden Natural ---");
        
        // Al instanciar el árbol, este confía en que los objetos que guardemos
        // sepan ordenarse. Como nuestro Cliente ya es Comparable, todo fluirá.
        Set<ClienteComparable> arbolSeguro = new TreeSet<>();

        System.out.println("Insertando a Ana...");
        arbolSeguro.add(new ClienteComparable("Ana")); // Entra en la Raíz
        
        System.out.println("Insertando a Luis...");
        arbolSeguro.add(new ClienteComparable("Luis")); // Compara con Ana -> Luis es mayor -> Derecha
        
        System.out.println("Insertando a Bea...");
        arbolSeguro.add(new ClienteComparable("Bea")); // Compara con Ana y Luis -> Se acomoda en medio

        System.out.println("\n¡Sin excepciones! Recorriendo el árbol:");
        
        // El for-each nos devuelve los objetos en estricto orden alfabético
        for (ClienteComparable c : arbolSeguro) {
            System.out.println("- " + c.getNombre());
        }
    }
}


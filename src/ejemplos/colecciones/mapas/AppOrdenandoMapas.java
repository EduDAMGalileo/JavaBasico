package ejemplos.colecciones.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AppOrdenandoMapas {

    public static void demostrarCaosHash() {
        System.out.println("--- HashMap (Velocidad pura, Cero Orden) ---");
        // Usamos String (que ya tiene programado su orden natural alfabético) como Clave
        Map<String, String> agendaHash = new HashMap<>();
        
        agendaHash.put("Zack", "555-0001");
        agendaHash.put("Ana", "555-0002");
        agendaHash.put("Luis", "555-0003");
        agendaHash.put("Bea", "555-0004");
        agendaHash.put("Paco", "555-0005");
        agendaHash.put("Angela", "555-0006");

        // Al recorrerlo con el eficiente entrySet, el orden es impredecible.
        // Depende exclusivamente del cálculo del hashCode() de cada nombre.
        for (Map.Entry<String, String> contacto : agendaHash.entrySet()) {
            System.out.println(contacto.getKey() + " -> " + contacto.getValue());
        }
    }

    public static void demostrarOrdenTree() {
        System.out.println("\n--- TreeMap (Orden garantizado por la Clave) ---");
        // Delegamos todo el esfuerzo de ordenación a la estructura del árbol.
        // Coste: La inserción y búsqueda pasan de ser O(1) a ser O(log N).
        Map<String, String> agendaTree = new TreeMap<>();
        
        agendaTree.put("Zack", "555-0001"); // Se coloca en la raíz
        agendaTree.put("Ana", "555-0002");  // Baja por la rama izquierda (A < Z)
        agendaTree.put("Luis", "555-0003"); // Se acomoda entre medias
        agendaTree.put("Bea", "555-0004");
        agendaTree.put("Paco", "555-0005");
        agendaTree.put("Angela", "555-0006");

        // El recorrido del árbol nos devuelve un diccionario estrictamente alfabetizado sin usar algoritmos extra. 
        for (Map.Entry<String, String> contacto : agendaTree.entrySet()) {
            System.out.println(contacto.getKey() + " -> " + contacto.getValue());
        }
    }

    public static void main(String[] args) {
        demostrarCaosHash();
        demostrarOrdenTree();
    }
}

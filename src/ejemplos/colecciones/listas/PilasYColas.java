package ejemplos.colecciones.listas;

import java.util.Deque;
import java.util.LinkedList;

public class PilasYColas {

    public void demostrarColaSupermercado() {
        System.out.println("--- Comportamiento de COLA (FIFO) ---");
        
        // Polimorfismo: Usamos la interfaz Deque, pero el motor es una LinkedList.
        Deque<String> colaSupermercado = new LinkedList<>();

        // En una Cola, encolamos (offer) por el final.
        colaSupermercado.offer("Cliente 1 (Ana)");
        colaSupermercado.offer("Cliente 2 (Luis)");
        colaSupermercado.offer("Cliente 3 (Bea)");

        // Atendemos (poll) por el principio. poll() extrae y borra el elemento.
        // Como es FIFO, Ana saldrá la primera.
        while (!colaSupermercado.isEmpty()) {
            String atendido = colaSupermercado.poll();
            System.out.println("Atendiendo a: " + atendido);
        }
    }

    public void demostrarPilaDeshacer() {
        System.out.println("\n--- Comportamiento de PILA (LIFO) ---");
        
        // MALA PRÁCTICA: Usar la clase antigua 'Stack'
        // java.util.Stack<String> pilaVieja = new java.util.Stack<>(); // NO USAR
        
        // ESTÁNDAR ACTUAL: Usar Deque para pilas
        Deque<String> historialAcciones = new LinkedList<>();

        // En una Pila, apilamos (push) en la cima (el principio).
        historialAcciones.push("Escribir párrafo 1");
        historialAcciones.push("Poner en negrita");
        historialAcciones.push("Borrar última palabra");

        // Desapilamos (pop) de la cima. pop() extrae y borra el elemento.
        // Como es LIFO, lo primero que sacaremos será "Borrar última palabra".
        System.out.println("Pulsando Ctrl+Z...");
        while (!historialAcciones.isEmpty()) {
            String accionDeshecha = historialAcciones.pop();
            System.out.println("Deshaciendo: " + accionDeshecha);
        }
    }
}

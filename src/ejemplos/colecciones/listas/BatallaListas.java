package ejemplos.colecciones.listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BatallaListas {


    public void demostrarDesastreDesplazamiento(int cantidad) {
        System.out.println("--- Prueba ArrayList (Inserción en Posición 0) ---");
        List<String> listaDesastre = new ArrayList<>();
        
        long inicio = System.currentTimeMillis();
        
        // MALA ELECCIÓN ESTRUCTURAL:
        // Cada vez que insertamos en el índice 0, el ArrayList tiene que mover 
        // TODOS los elementos anteriores una posición a la derecha.
        // La primera inserción mueve 0. La inserción número 99.000 mueve 99.000 datos.
        for (int i = 0; i < cantidad; i++) {
            listaDesastre.add(0, "Log de seguridad " + i);
        }
        
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo con ArrayList: " + (fin - inicio) + " milisegundos.");
    }

    public void demostrarEficienciaNodos(int cantidad) {
        System.out.println("\n--- Prueba LinkedList (Inserción en Posición 0) ---");
        List<String> listaAgil = new LinkedList<>();
        
        long inicio = System.currentTimeMillis();
        
        // ESTÁNDAR:
        // Para colas, pilas o inserciones masivas en los extremos, LinkedList es el rey.
        // Al insertar en el índice 0, solo crea un Nodo y ajusta dos punteros.
        // No hay desplazamientos de memoria.
        for (int i = 0; i < cantidad; i++) {
            listaAgil.add(0, "Log de seguridad " + i);
        }
        
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo con LinkedList: " + (fin - inicio) + " milisegundos.");
    }
}


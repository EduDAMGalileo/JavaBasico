package ejemplos.colecciones.listas;

import java.util.ArrayList;
import java.util.List;

public class RendimientoArrayListV2 {

    public static void main(String[] args) {
        // Ejecutamos ambas demostraciones, pero forzamos a la JVM
        // a limpiar la memoria entre una y otra para que la medición sea justa.
        demostrarMalaPractica();
        
        System.gc(); // Sugerimos al Garbage Collector que limpie la basura
        try { 
        	Thread.sleep(500); 
        	} catch (Exception e){} // Pausa para estabilizar
        
        demostrarEstandar();
    }

    public static void demostrarMalaPractica() {
        System.out.println("--- Ejecutando carga inexperta ---");
        long inicio = System.currentTimeMillis();

        // MALA PRÁCTICA:
        // No le decimos al ArrayList cuántos datos vamos a meter.
        // Empieza con capacidad 10 y sufrirá múltiples redimensionamientos 
        // internos, dejando decenas de arrays viejos como "basura" en la memoria.
        List<Object> listaNovato = new ArrayList<>();
        Object dummy = new Object(); // Usamos un objeto ligero, que no tiene nada
        
        for (int i = 0; i < 100000000; i++) {
            listaNovato.add(dummy);
        }

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo del novato: " + (fin - inicio) + " milisegundos.");
    }

    public static void demostrarEstandar() {
        System.out.println("\n--- Ejecutando carga profesional ---");
        long inicio = System.currentTimeMillis();

        // ESTÁNDAR:
        // Si podemos estimar el volumen de datos (ej: 100 millones), 
        // inicializamos la "capacidad" en el constructor.
        // ¡Cero redimensionamientos internos!
        int capacidadEstimada = 100000000;
        List<Object> listaProfesional = new ArrayList<>(capacidadEstimada);
        Object dummy = new Object();
        
        for (int i = 0; i < 100000000; i++) {
            listaProfesional.add(dummy);
        }

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo del profesional: " + (fin - inicio) + " milisegundos.");
    }
}

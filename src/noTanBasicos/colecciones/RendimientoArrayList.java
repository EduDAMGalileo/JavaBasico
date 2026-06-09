package noTanBasicos.colecciones;

import java.util.ArrayList;
import java.util.List;

public class RendimientoArrayList {

    public static void main(String[] args) {
        // Ejecutamos ambas demostraciones      
        demostrarMalaPractica();
        demostrarEstandar();

    }

    public static void demostrarMalaPractica() {
        System.out.println("--- Ejecutando carga inexperta ---");
        long inicio = System.currentTimeMillis();

        // MALA PRÁCTICA:
        // No le decimos al ArrayList cuántos datos vamos a meter.
        // Empieza con capacidad 10 y sufrirá múltiples redimensionamientos 
        // internos (15, 22, 33, 50...) copiando datos sin parar.
        List<Integer> listaNovato = new ArrayList<>();
        
        for (int i = 0; i < 50000000; i++) {
            listaNovato.add(i);
        }

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo del novato: " + (fin - inicio) + " milisegundos.");
    }

    public static void demostrarEstandar() {
        System.out.println("\n--- Ejecutando carga profesional ---");
        long inicio = System.currentTimeMillis();

        // ESTÁNDAR DE LA INDUSTRIA:
        // Si sabemos de antemano (o podemos estimar) que vamos a recibir 
        // unos 50 millones de registros de la base de datos, inicializamos 
        // la "capacidad" inicial en el constructor.
        // OJO: La lista sigue estando vacía (size = 0), pero el array 
        // interno ya tiene 5 millones de huecos preparados. ¡Cero redimensionamientos!
        int capacidadEstimada = 50000000;
        List<Integer> listaProfesional = new ArrayList<>(capacidadEstimada);
        
        for (int i = 0; i < 50000000; i++) {
            listaProfesional.add(i);
        }

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo del profesional: " + (fin - inicio) + " milisegundos.");
    }
}


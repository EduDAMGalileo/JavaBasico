package ejemplos.genericos;

import java.util.List;

public class ClinicaVeterinaria {

    /**
     * Ejemplo de PRODUCER (Extends): Queremos leer animales para que emitan sonido.
     * Acepta List<Animal>, List<Gato>, List<Perro>, etc.
     */
    public static void hacerRuidoGeneral(List<? extends Animal> lista) {
        for (Animal a : lista) {
            // Podemos leer como Animal porque 'extends Animal' lo garantiza
            a.emitirSonido(); 
        }
        // lista.add(new Gato("Luna")); // ¡ERROR! No podemos escribir en un Producer.
    }

    /**
     * Ejemplo de CONSUMER (Super): Queremos añadir gatos a una lista.
     * Acepta List<Gato>, List<Animal> o List<Object>.
     */
    public static void rescatarGato(List<? super Gato> listaDestino) {
        // Podemos añadir un Gato con seguridad total
        listaDestino.add(new Gato("Callejero"));
        
        // Animal a = listaDestino.get(0); // ¡ERROR! No podemos leer de forma segura.
        // El compilador no sabe si dentro hay Gatos u Objects.
    }
}
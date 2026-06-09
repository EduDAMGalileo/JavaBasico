package noTanBasicos.colecciones;

import java.util.ArrayList;
import java.util.List;

public class EjemploSemanticaList {

    public static void main(String[] args) {
        // Observa que declaramos el tipo como la Interfaz (List) 
        // pero instanciamos la implementación (ArrayList). 
        List<String> listaDeTareas = new ArrayList<>();

        // Respeto al orden de inserción
        listaDeTareas.add("Configurar el servidor");
        listaDeTareas.add("Diseñar la base de datos");
        listaDeTareas.add("Programar la API");

        System.out.println("Orden original: " + listaDeTareas);

        // Tolerancia a duplicados
        // Añadimos una tarea que ya existe. La lista la acepta sin quejarse.
        listaDeTareas.add("Configurar el servidor"); 
        System.out.println("Con duplicados: " + listaDeTareas);

        // Acceso posicional (Exclusivo de List)
        // Podemos recuperar o modificar elementos en puntos exactos
        String primeraTarea = listaDeTareas.get(0);
        System.out.println("La primera tarea es: " + primeraTarea);

        // Podemos insertar un elemento en medio de la lista desplazando el resto
        listaDeTareas.add(1, "REVISIÓN DE SEGURIDAD (Urgente)");
        System.out.println("Tras inserción urgente: " + listaDeTareas);

        // 4. Búsqueda de índices
        int posicion = listaDeTareas.indexOf("Programar la API");
        System.out.println("La API está en la posición: " + posicion);
    }
}


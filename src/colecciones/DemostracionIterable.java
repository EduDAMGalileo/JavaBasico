package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemostracionIterable {

    public void recorridoDelNovato(ArrayList<Cliente> clientes) {
        // MALA PRÁCTICA (Recorrido acoplado a la estructura):
        // Este bucle clásico 'for' asume que la colección tiene un índice numérico (get(i)).
        // Si mañana cambiamos el ArrayList por un HashSet (que no tiene índices),
        // este código se romperá por completo y no compilará.
        System.out.println("--- Recorrido Manual ---");
        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            System.out.println(c.getNombre());
        }
    }

    public void recorridoProfesional(Collection<Cliente> clientes) {
        // ESTÁNDAR DE LA INDUSTRIA (Basado en Iterable):
        // Este bucle for-each funciona "mágicamente" porque la colección 
        // implementa Iterable. Por debajo, Java está usando el Iterator.
        System.out.println("--- Recorrido For-Each ---");
        for (Cliente c : clientes) {
            System.out.println(c.getNombre());
        }
    }

    public void loQueOcultaElCompilador(Collection<Cliente> clientes) {
        // CURIOSIDAD: Lo que realmente hace Java por debajo del for-each.
        // Aquí vemos al "guía turístico" (Iterator) en acción directa.
        System.out.println("--- Recorrido Real con Iterator ---");
        
        // Pedimos el guía en la entrada del museo
        Iterator<Cliente> guia = clientes.iterator();
        
        // Mientras el guía nos diga que quedan elementos por ver...
        while (guia.hasNext()) {
            //Le pedimos que nos lleve al siguiente elemento
            Cliente c = guia.next();
            System.out.println(c.getNombre());
        }
    }
}
package ejemplos.colecciones.comparar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AppIntegracionComparacion {

    public static void demostrarEvolucionListas() {
        List<Libro> catalogo = new ArrayList<>();
        catalogo.add(new Libro("Java para Arquitectos", 45.0, 2023));
        catalogo.add(new Libro("Patrones de Diseño", 38.5, 1994));
        catalogo.add(new Libro("Clean Code", 40.0, 2008));

        System.out.println("--- Ordenación de Listas ---");
        
        // ENFOQUE CLÁSICO (Pre-Java 8):
        // Llamamos a la clase de utilidades Collections. Funciona, pero es más verboso.
        Collections.sort(catalogo, Comparator.comparing(Libro::getTitulo));
        System.out.println("Clásico (Por título): " + catalogo);

        // ESTÁNDAR MODERNO (Java 8+):
        // Le pedimos a la propia lista que se ordene. Es un código más orientado a objetos 
        // y más eficiente, ya que la lista usa su propio algoritmo interno optimizado.
        catalogo.sort(Comparator.comparingDouble(Libro::getPrecio));
        System.out.println("Moderno (Por precio): " + catalogo);
    }

    public static void demostrarInyeccionEnArboles() {
        System.out.println("\n--- Inyección de Árbitros en TreeSet ---");
        
        // Si hiciéramos 'new TreeSet<>()' sin parámetros, Java intentaría buscar  
        // el Comparable dentro de Libro. Como no lo tiene, estallaría (ClassCastException).
        
        // SOLUCIÓN ARQUITECTÓNICA: 
        // Pasamos un Comparator al constructor. Le decimos al Árbol: 
        // "Ignora el ADN del libro, constrúyete usando la Fecha de Publicación".
        Set<Libro> arbolPorFecha = new TreeSet<>(Comparator.comparingInt(Libro::getAnoPublicacion));
        
        arbolPorFecha.add(new Libro("Java para Arquitectos", 45.0, 2023));
        arbolPorFecha.add(new Libro("Patrones de Diseño", 38.5, 1994));
        arbolPorFecha.add(new Libro("Clean Code", 40.0, 2008));

        // El Árbol ordena automáticamente al insertar, manteniéndolo cronológico.
        for (Libro l : arbolPorFecha) {
            System.out.println("Publicado en " + l.getAnoPublicacion() + ": " + l.getTitulo());
        }
    }

    public static void main(String[] args) {
        demostrarEvolucionListas();
        demostrarInyeccionEnArboles();
    }
}


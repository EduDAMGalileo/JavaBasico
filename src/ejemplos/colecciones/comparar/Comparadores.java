package ejemplos.colecciones.comparar;

import java.util.Comparator;

public class Comparadores {

 public static class OrdenPorPrecioAscendente implements Comparator<Libro> {
     @Override
     public int compare(Libro l1, Libro l2) {
         // Como el precio es un tipo primitivo (double), usamos la envoltura 
         // Double para aprovechar su método de comparación estandarizado.
         return Double.compare(l1.getPrecio(), l2.getPrecio());
     }
 }

 public static class OrdenPorAnoDescendente implements Comparator<Libro> {
     @Override
     public int compare(Libro l1, Libro l2) {
         // Para invertir el orden (descendente), simplemente cambiamos 
         // el orden de los objetos en la comparación. Enfrentamos l2 contra l1.
         return Integer.compare(l2.getAnoPublicacion(), l1.getAnoPublicacion());
     }
 }
}

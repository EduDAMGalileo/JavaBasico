package ejemplos.colecciones.comparar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppTiendaLibros {

	public static void main(String[] args) {
		List<Libro> catalogo = new ArrayList<>();
		catalogo.add(new Libro("El señor de los anillos", 25.50, 1954));
		catalogo.add(new Libro("Dune", 18.90, 1965));
		catalogo.add(new Libro("Fahrenheit 451", 12.00, 1953));

		System.out.println("--- Catálogo Original (Orden de inserción) ---");
		for (Libro l : catalogo) System.out.println(l);

		// CASO DE USO 1: El usuario hace clic en "Más baratos primero"
		System.out.println("\n--- Ordenando por Precio ---");
		// Invocamos al motor de ordenación y le pasamos nuestro Árbitro de precios
		Collections.sort(catalogo, new Comparadores.OrdenPorPrecioAscendente());
		for (Libro l : catalogo) System.out.println(l);

		// CASO DE USO 2: El usuario hace clic en "Más recientes primero"
		System.out.println("\n--- Ordenando por Novedades ---");
		// Invocamos al motor de ordenación pasándole nuestro Árbitro de años
		Collections.sort(catalogo, new Comparadores.OrdenPorAnoDescendente());
		for (Libro l : catalogo) System.out.println(l);
	}
}


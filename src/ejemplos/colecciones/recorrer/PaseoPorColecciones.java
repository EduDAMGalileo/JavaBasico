package ejemplos.colecciones.recorrer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PaseoPorColecciones {

	public static void recorridoClasicoYLimitado(List<Cliente> lista) {
		System.out.println("--- Recorrido Clásico (Sólo válido para Listas) ---");
		// MALA PRÁCTICA: 
		// Genera "ruido visual". Tenemos que declarar una 'i', vigilar el size(), 
		// sumar la 'i' y extraer manualmente el objeto en cada vuelta.
		for (int i = 0; i < lista.size(); i++) {
			Cliente c = lista.get(i);
			System.out.println("Revisando a: " + c.getNombre());
		}
	}

	public static void recorridoUniversalElegante(Iterable<Cliente> coleccion) {
		System.out.println("\n--- Recorrido Universal For-Each ---");
		// ESTÁNDAR:
		// Código limpio, directo y autoexplicativo. "Por cada Cliente 'c' en la coleccion..."
		// Funciona igual de bien para una List, un Set o cualquier estructura futura.
		for (Cliente c : coleccion) {
			System.out.println("Revisando a: " + c.getNombre());

			// NOTA: Podemos alterar el estado interno del objeto sin problemas
			if (c.isMoroso()) {
				System.out.println("   -> Perdonando deuda a " + c.getNombre());
				c.perdonarDeuda();
			}
		}
	}

	public static void main(String[] args) {
		List<Cliente> listaClientes = new ArrayList<>();
		listaClientes.add(new Cliente("Ana", false));
		listaClientes.add(new Cliente("Luis", true));

		//Creamos un cona partir de una lista
		Set<Cliente> setClientes = new HashSet<>(listaClientes);

		recorridoClasicoYLimitado(listaClientes);
		//recorridoClasicoYLimitado(setClientes); // ERROR: Un Set no tiene índices

		// El for-each acepta cualquier cosa sin quejarse
		recorridoUniversalElegante(listaClientes);
		recorridoUniversalElegante(setClientes);
	}
}


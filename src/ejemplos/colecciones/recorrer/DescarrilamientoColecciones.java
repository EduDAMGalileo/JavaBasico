package ejemplos.colecciones.recorrer;
import java.util.ArrayList;
import java.util.List;

public class DescarrilamientoColecciones {

	public static void demostrarExplosion() {
		System.out.println("--- Demostrando el descarrilamiento del for-each ---");
		List<Cliente> carteraClientes = new ArrayList<>();

		carteraClientes.add(new Cliente("Ana", false));
		carteraClientes.add(new Cliente("Luis", true)); // ¡Moroso!
		carteraClientes.add(new Cliente("Bea", false));
		carteraClientes.add(new Cliente("Zack", true)); 

		//Si es el penúltimo es aun peor, no falla, pero salta el último

		System.out.println("Tamaño inicial: " + carteraClientes.size());

		try {
			for (Cliente c : carteraClientes) {
				System.out.println("Revisando a: " + c.getNombre());

				if (c.isMoroso()) {
					System.out.println("   -> ¡Moroso detectado! Borrando de la lista...");
					carteraClientes.remove(c); 
					System.out.println("   -> Luis ha sido borrado.");
				}
			} 

		} catch (java.util.ConcurrentModificationException e) {
			System.out.println("\n[ERROR CRÍTICO] ConcurrentModificationException arrojada.");
			System.out.println("Análisis:");
			System.out.println("El Iterador interno intentó avanzar al 3º elemento (Bea),");
			System.out.println("pero se dio cuenta de que la estructura había sido saboteada.");
			System.out.println("La JVM ha matado el proceso por seguridad.");
		}
	}

	public static void main(String[] args) {
		demostrarExplosion();
	}
}
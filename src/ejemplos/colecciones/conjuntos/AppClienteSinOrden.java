package ejemplos.colecciones.conjuntos;

import java.util.Set;
import java.util.TreeSet;

public class AppClienteSinOrden {

	public static void main(String[] args) {
		System.out.println("--- Demostrando el colapso INMEDIATO de un TreeSet ---");

		Set<ClienteSinOrden> arbol = new TreeSet<>();

		System.out.println("Intentando añadir a Ana (El primer elemento)...");

		try {
			/* AQUÍ EXPLOTA EL SISTEMA INMEDIATAMENTE.
			 En Java, el árbol es implacable. Antes de dejar que Ana 
			 ocupe la Raíz, el sistema verifica sus "credenciales".
			 Al ver que la clase ClienteSinOrden no sabe cómo ordenarse,
			 aborta la operación al instante, aplicando la filosofía "Fail-Fast".
			 */
			
			arbol.add(new ClienteSinOrden("Ana")); 

			System.out.println("   -> Ana añadida con éxito."); // Esta línea nunca se ejecutará

		} catch (ClassCastException e) {
			System.out.println("\n¡COLAPSO DEL SISTEMA DETECTADO EN LA PUERTA DE ENTRADA!");
			System.out.println("Excepción arrojada: " + e.getClass().getName());
			System.out.println("\nAnálisis del Arquitecto:");
			System.out.println("Como vemos, Java no espera al segundo elemento para quejarse.");
			System.out.println("Al intentar insertar el primero, la JVM intenta forzar (castear)");
			System.out.println("nuestra clase a la interfaz 'java.lang.Comparable'.");
			System.out.println("Al descubrir que no hemos firmado ese contrato, nos deniega el acceso.");
		}
	}
}
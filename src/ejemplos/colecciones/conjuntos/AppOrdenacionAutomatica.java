package ejemplos.colecciones.conjuntos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AppOrdenacionAutomatica {
	public static void demostrarEsfuerzoManual() {
		System.out.println("--- Enfoque Manual (HashSet + List + Sort) ---");
		// El desarrollador inexperto usa HashSet para evitar duplicados
		Set<String> participantes = new HashSet<>();
		participantes.add("Zack");
		participantes.add("Ana");
		participantes.add("Luis");
		participantes.add("Pedro");
		participantes.add("Laura");
		participantes.add("Ana"); // Ignorado por ser duplicado
		participantes.add("Eduardo");

		// Como el HashSet no garantiza el orden, al imprimirlo saldrá desordenado.
		System.out.println("HashSet caótico: " + participantes);

		// Para ordenarlo, se ve obligado a crear una estructura extra en la RAM,
		// volcar los datos y llamar a un pesado algoritmo de ordenación.
		List<String> listaOrdenable = new ArrayList<>(participantes);
		Collections.sort(listaOrdenable);

		System.out.println("Lista finalmente ordenada: " + listaOrdenable);
	}

	public static void demostrarEleganciaEstructural() {
		System.out.println("\n--- Estándar de la Industria (TreeSet) ---");
		// El arquitecto delega ambas reglas de negocio (Unicidad + Orden) a la estructura
		Set<String> participantesOrdenados = new TreeSet<>();

		participantesOrdenados.add("Zack"); // Va a la raíz
		participantesOrdenados.add("Ana");  // Rama izquierda (menor)
		participantesOrdenados.add("Luis"); // Rama derecha desde Ana, izquierda desde Zack
		participantesOrdenados.add("Pedro"); 
		participantesOrdenados.add("Laura"); 
		participantesOrdenados.add("Ana");  // Descartado silenciosamente
		participantesOrdenados.add("Eduardo");

		// ¡Magia! Al recorrerlo, el árbol nos devuelve los datos en estricto orden natural.
		// No hay listas intermedias, no hay métodos de ordenación externos.
		System.out.println("TreeSet siempre ordenado: " + participantesOrdenados);
	}

	public static void main(String[] args) {
		demostrarEsfuerzoManual();
		demostrarEleganciaEstructural();
	}

}

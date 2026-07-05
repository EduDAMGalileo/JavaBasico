package ejemplos.colecciones.conjuntos;

import java.util.List;
import java.util.Set;

public class SistemaVotacion {

	public void registrarVotanteNovato(List<String> dniVotantes, String nuevoDni) {
		// MALA PRÁCTICA: Usar una List cuando la regla de negocio es la unicidad.
		System.out.println("Intentando registrar (List): " + nuevoDni);

		// El desarrollador asume la carga de evitar duplicados.
		// contains() es O(N). Cuantos más votantes haya, más lento será este 'if'.
		if (!dniVotantes.contains(nuevoDni)) {
			dniVotantes.add(nuevoDni);
			System.out.println("Voto registrado con éxito.");
		} else {
			System.out.println("ERROR: Este DNI ya ha votado.");
		}
	}

	public void registrarVotanteProfesional(Set<String> dniVotantes, String nuevoDni) {
		// ESTÁNDAR: Usar un Set. 
		// La estructura misma garantiza la regla de negocio.
		System.out.println("Intentando registrar (Set): " + nuevoDni);

		// El método add() de un Set devuelve un booleano:
		// 'true' si el elemento era nuevo y se añadió.
		// 'false' si ya existía y fue rechazado.
		// Con HashSet, esta operación es O(1) (casi instantánea) independientemente del tamaño.
		boolean esNuevo = dniVotantes.add(nuevoDni);

		if (esNuevo) {
			System.out.println("Voto registrado con éxito.");
		} else {
			System.out.println("FRAUDE DETECTADO: Este DNI ya ha votado.");
		}
	}

}

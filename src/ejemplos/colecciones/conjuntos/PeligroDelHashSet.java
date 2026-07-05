package ejemplos.colecciones.conjuntos;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


// NOTA IMPORTANTE: En un proyecto real, estas clases vivirían en 
// sus propios archivos ClienteNovato.java y ClienteProfesional.java. 
// Las anidamos aquí únicamente para facilitar la ejecución del ejemplo y no tener 3 clases.

public class PeligroDelHashSet {

	// MALA PRÁCTICA: Una clase de negocio sin sobrescribir hashCode ni equals
	static class ClienteNovato {
		String dni;
		public ClienteNovato(String dni) { 
			this.dni = dni; 
		}
	}

	// ESTÁNDAR DE LA INDUSTRIA: Sobrescribimos ambos métodos para darles semántica
	static class ClienteProfesional {
		String dni;
		public ClienteProfesional(String dni) { this.dni = dni; }

		// Definimos qué hace a un cliente igual a otro (su DNI)
		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true; // Si es la misma memoria, son iguales
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			ClienteProfesional cliente = (ClienteProfesional) o;
			return Objects.equals(dni, cliente.dni);
		}

		// Generamos el número de casillero basándonos EXCLUSIVAMENTE en el DNI
		@Override
		public int hashCode() {
			return Objects.hash(dni);
		}
	}

	public static void main(String[] args) {
		System.out.println("--- Demostración del desarrollador inexperto ---");
		Set<ClienteNovato> setNovato = new HashSet<>();

		// Creamos dos objetos distintos en memoria, pero que lógicamente son la misma persona
		ClienteNovato c1 = new ClienteNovato("111A");
		ClienteNovato c2 = new ClienteNovato("111A");

		setNovato.add(c1);
		setNovato.add(c2); 

		// ¡DESASTRE! Imprime "Tamaño: 2". Hemos duplicado a la misma persona en un Set.
		// Como hicimos 'new' dos veces, tienen distintas direcciones de memoria, 
		// distinto hashCode() por defecto, y cayeron en casilleros diferentes.
		System.out.println("Tamaño del Set novato: " + setNovato.size()); 

		System.out.println("\n--- Demostración del estándar industrial ---");
		Set<ClienteProfesional> setProfesional = new HashSet<>();

		ClienteProfesional cp1 = new ClienteProfesional("111A");
		ClienteProfesional cp2 = new ClienteProfesional("111A");

		setProfesional.add(cp1); // El DNI "111A" genera el casillero, por ejemplo, 45.
		setProfesional.add(cp2); // El DNI "111A" genera EL MISMO casillero 45. 
		// equals() entra en acción, ve que el DNI es igual y lo rechaza.

		// ¡ÉXITO! Imprime "Tamaño: 1". El Set funciona perfectamente.
		System.out.println("Tamaño del Set profesional: " + setProfesional.size());
	}
}

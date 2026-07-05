package ejemplos.poo.herencia;

import java.util.Objects;

public class Jugador {
	private String nombre;
	private char simbolo;

	public Jugador(String nombre, char simbolo) {
		this.nombre = nombre;
		this.simbolo = simbolo;
	}

	//Sustituimos la dirección de memoria por datos útiles
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", simbolo=" + simbolo + "]";
	}

	public boolean equals(Object obj) {
		// 1. Comprobación de identidad: ¿Son el mismo objeto físico?
		if (this == obj) {
			return true;
		}

		// 2. Comprobación de integridad: ¿El otro objeto es nulo o de otra clase?
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}

		// 3. Casting: Convertimos el Object genérico a un Jugador para comparar sus "tripas"
		Jugador other = (Jugador) obj;

		// 4. Comparación de atributos: Son iguales si el símbolo y el nombre coinciden
		// Nota: Para String usamos .equals(), para char (primitivo) usamos ==
		return this.simbolo == other.simbolo && 
				Objects.equals(this.nombre, other.nombre);
	}

	@Override
	public int hashCode() {
		// Generamos un código numérico basado en los mismos atributos que equals
		return Objects.hash(nombre, simbolo);
	}


}
package noTanBasicosEjercicios.proyectoPokemon;

public record Ataque(String nombre, int potencia) {
	public Ataque {
		if (nombre == null || nombre.isBlank()) {
			throw new IllegalArgumentException("El ataque debe tener un nombre");

		}
		
		if (potencia < 0) {
			potencia=0;
		}
	}

}

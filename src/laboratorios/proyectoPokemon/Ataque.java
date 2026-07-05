package laboratorios.proyectoPokemon;

public record Ataque(String nombre, int potencia, Tipo tipoAtaque) {
	public Ataque {
		if (nombre == null || nombre.isBlank()) {
			throw new IllegalArgumentException("El ataque debe tener un nombre");

		}
		
		if (potencia < 0) {
			potencia=0;
		}
	}

}

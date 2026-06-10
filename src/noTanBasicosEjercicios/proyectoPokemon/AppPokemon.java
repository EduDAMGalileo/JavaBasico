package noTanBasicosEjercicios.proyectoPokemon;

public class AppPokemon {

	public static void main(String[] args) {
		// Poder crear Pokemons
		Pokemon pok = new Pokemon(Especie.BULBASAUR);
		pok.verCaracteristicas();
		
		Pokemon pok2 = new Pokemon(Especie.CHARMANDER);
		pok2.verCaracteristicas();
		
		Pokemon pok3 = new Pokemon(Especie.SQUIRTLE);
		pok3.verCaracteristicas();
		
		Pokemon pok4 = new Pokemon(Especie.BULBASAUR, 35);		

		pok.subirNivel();
		pok.subirNivel();
		pok.subirNivel();
		pok.subirNivel();
		pok.subirNivel();
		pok.subirNivel();
		
		pok.verCaracteristicas();
		pok.exportarCaracteristicas("bulbasaur.txt");
		
		pok4.verCaracteristicas();
	}

}

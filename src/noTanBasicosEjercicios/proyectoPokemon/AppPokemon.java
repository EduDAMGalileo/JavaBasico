package noTanBasicosEjercicios.proyectoPokemon;

public class AppPokemon {

	public static void main(String[] args) {
		// Poder crear Pokemons
		Pokemon pok = new Pokemon(Especie.BULBASAUR);
		System.out.println (pok.toString());
		
		Pokemon pok2 = new Pokemon(Especie.CHARMANDER);
		System.out.println (pok2.toString());
		
		Pokemon pok3 = new Pokemon(Especie.SQUIRTLE);
		System.out.println (pok3.toString());
		
		Ataque ata = new Ataque ("Ascuas", 40);
		System.out.println(ata.toString());
		
		pok.subirNivel();
		pok.subirNivel();
		pok.subirNivel();
		pok.subirNivel();
		pok.subirNivel();
		pok.subirNivel();
	}

}

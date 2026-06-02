package noTanBasicosEjercicios.proyectoPokemon;

import java.util.List;

public enum Especie {
	CHARMANDER(35, 40, 25, List.of(
			new AprenderAtaque(1, new Ataque("Arañazo", 20)),
			new AprenderAtaque(1, new Ataque("Gruñido", 0)),
			new AprenderAtaque(8, new Ataque("Ascuas", 30)))),
	BULBASAUR(40, 30, 35, List.of(
			new AprenderAtaque(1, new Ataque("Placaje", 20)),
			new AprenderAtaque(1, new Ataque("Gruñido", 0)),
			new AprenderAtaque(7, new Ataque("Látigo Cepa", 40)))),
	
	SQUIRTLE (30, 25, 35, List.of(
			new AprenderAtaque(1, new Ataque("Arañazo", 20)),
			new AprenderAtaque(1, new Ataque("Gruñido", 0)),
			new AprenderAtaque(9, new Ataque("Pistola Agua", 35))));
	
	private final int vidaBase;
	private final int ataqueBase;
	private final int defensaBase;
	private final List<AprenderAtaque> aprendizajes;
	
	private Especie(int vidaBase, int ataqueBase, int defensaBase, List<AprenderAtaque> aprendizajes) {
		this.vidaBase = vidaBase;
		this.ataqueBase = ataqueBase;
		this.defensaBase = defensaBase;
		this.aprendizajes = aprendizajes;
	}

	public int getVidaBase() {
		return vidaBase;
	}

	public int getAtaqueBase() {
		return ataqueBase;
	}

	public int getDefensaBase() {
		return defensaBase;
	}

	public List<AprenderAtaque> getAprendizajes() {
		return aprendizajes;
	}
	
	
	
	
	

}

package noTanBasicosEjercicios.proyectoPokemon;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
	
	private static final int NIVEL_INICIAL=5;
	private final Especie especie;

	//Estos van a cambiar
	private int nivel;
	private int defensa;
	private int ataque;
	private int vida;
	private List<Ataque> ataquesAprendidos;
	
	//ToDo Faltan los ataques
	public Pokemon(Especie especie) {
		this.especie = especie;
		this.nivel = NIVEL_INICIAL;
		this.defensa = especie.getDefensaBase();
		this.ataque = especie.getAtaqueBase();
		this.vida = especie.getVidaBase();
		this.ataquesAprendidos = new ArrayList<>();
		//Ahora que tenemos un array para guardar ataques le añadimos los primeros
		cargarAtaquesHastaNivel(this.nivel);
	}

	private void cargarAtaquesHastaNivel(int nivel) {
		for (AprenderAtaque apren : especie.getAprendizajes()) {
			if (apren.nivel() <= nivel) {
				ataquesAprendidos.add(apren.ataque());
			}
		}
	}
	
	public void subirNivel() {
		nivel++;
		System.out.println("Enhorabuena, has subido de nivel!!");
		//Tenemos que actualizar el ataque la defensa y la vida
		
		//Tenemos que ver si aprendió o no aprendió un nuevo ataque
	
		for (AprenderAtaque apren : especie.getAprendizajes()) {
			if (apren.nivel() == nivel) {
				ataquesAprendidos.add(apren.ataque());
				System.out.println(" aprendió " + apren.ataque());
			}
		}
	}

	@Override
	public String toString() {
		return "Pokemon [especie=" + especie + ", nivel=" + nivel + ", defensa=" + defensa + ", ataque=" + ataque
				+ ", vida=" + vida + ", ataquesAprendidos=" + ataquesAprendidos + "]";
	}


	
	
	
	
	
}

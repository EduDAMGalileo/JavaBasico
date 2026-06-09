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
		this(especie, NIVEL_INICIAL);
	}
	
	public Pokemon(Especie especie, int nivel) {
		this.especie = especie;
		this.nivel = nivel;
		this.defensa = especie.getDefensaBase();
		this.ataque = especie.getAtaqueBase();
		this.vida = especie.getVidaBase();
		//Incrementamos las estadisticas como si subiera de nivel n veces
		for (int i=1; i<=nivel - NIVEL_INICIAL; i++) {
			incrementarEstadisticas();	
		}
		this.ataquesAprendidos = new ArrayList<>();
		//Ahora que tenemos un array para guardar ataques le añadimos los primeros
		cargarAtaquesHastaNivel(this.nivel);
	}

	public void verCaracteristicas() {
		System.out.println("\n-----------------");
		System.out.println("Especie:" + especie);
		System.out.println("Nivel:" + nivel);
		System.out.println("Ataque:" + ataque);
		System.out.println("Defensa:" + defensa);
		System.out.println("Vida:" + vida);
		System.out.println("Ataques aprendidos: ");
		for (Ataque at : ataquesAprendidos) {
			System.out.println(" - " + at.nombre() + "(potencia: " + at.potencia() + ")");
		}
		System.out.println("-----------------");
		
	}

	private void cargarAtaquesHastaNivel(int nivel) {
		for (AprenderAtaque apren : especie.getAprendizajes()) {
			if (apren.nivel() <= nivel) {
				ataquesAprendidos.add(apren.ataque());
			}
		}
	}
	
	private void incrementarEstadisticas() {
		vida+=Numero.aleatorio(5);
		ataque+=Numero.aleatorio(4);
		defensa+=Numero.aleatorio(3);
	}
	
	public void subirNivel() {
		nivel++;
		System.out.println("Enhorabuena, has subido de nivel!!");
		//Tenemos que actualizar el ataque la defensa y la vida
		//La vida le sube entre 1 y 5, l ataque entre 1 y 4 y la defensa entre 1 y 3 
		incrementarEstadisticas();
		System.out.println("Nuevas estadisticas:");
		System.out.println("Vida: " + vida);
		System.out.println("Ataque: " + ataque);
		System.out.println("Defensa: " + defensa);
		//Tenemos que ver si aprendió o no aprendió un nuevo ataque
	
		for (AprenderAtaque apren : especie.getAprendizajes()) {
			if (apren.nivel() == nivel) {
				ataquesAprendidos.add(apren.ataque());
				System.out.println("Además, aprendió " + apren.ataque());
			}
		}
	}

	@Override
	public String toString() {
		return "Pokemon [especie=" + especie + ", nivel=" + nivel + ", defensa=" + defensa + ", ataque=" + ataque
				+ ", vida=" + vida + ", ataquesAprendidos=" + ataquesAprendidos + "]";
	}


	
	
	
	
	
}

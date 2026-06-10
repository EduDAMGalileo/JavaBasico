package noTanBasicosEjercicios.proyectoPokemon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
	
	private String montarCaracteristicas() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n-----------------");
		sb.append("\nEspecie:" + especie);
		sb.append("\nNivel:" + nivel);
		sb.append("\nAtaque:" + ataque);
		sb.append("\nDefensa:" + defensa);
		sb.append("\nVida:" + vida);
		sb.append("\nAtaques aprendidos: ");
		for (Ataque at : ataquesAprendidos) {
			sb.append("\n - " + at.nombre() + "(potencia: " + at.potencia() 
			+ " tipo: " + at.tipoAtaque() + ")");
		}
		sb.append("\n-----------------");
		return sb.toString();
	}

	public void verCaracteristicas() {
		System.out.println(montarCaracteristicas());
	}
	
	public void exportarCaracteristicas(String nombreFichero) {
		File archivo = new File(nombreFichero);
		PrintWriter escritor = null;
		try {
			escritor = new PrintWriter(archivo);
			escritor.println(montarCaracteristicas());
		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero");
		} finally {
			//cerrar si existe el escritor
			if (escritor != null) {
				escritor.close();
			}
		}
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

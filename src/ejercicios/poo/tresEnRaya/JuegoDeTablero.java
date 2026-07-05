package ejercicios.poo.tresEnRaya;

import java.util.Scanner;

public abstract class JuegoDeTablero {
	protected Tablero tablero;
	protected Jugador j1, j2;
	protected Jugador jugadorActivo;
	protected Scanner sc = new Scanner(System.in);
	
	public JuegoDeTablero(String nombre1, char ficha1, String nombre2, char ficha2) {
		this.tablero = new Tablero();
		this.j1 = new Jugador (nombre1, ficha1);
		this.j2 = new Jugador (nombre2, ficha2);
		this.jugadorActivo = j1;
	}
	
	protected void mostrarTurno() {
		tablero.mostrar();
		System.out.println("\nTurno de " + jugadorActivo.getNombre() + " (" + jugadorActivo.getFicha()+")");
	}
	
	protected void realizarJugada() {
		boolean fichaColocada=false;
		while (!fichaColocada) {
			System.out.println("Elige una fila");
			int f = sc.nextInt()-1;
			System.out.println("Elige una columna");
			int c = sc.nextInt()-1;
			fichaColocada = tablero.colocarFicha(f, c, jugadorActivo.getFicha());
		}
	}
	
	protected void cambiarTurno() {
		this.jugadorActivo = (jugadorActivo == j1) ? j2 : j1;
	}
}

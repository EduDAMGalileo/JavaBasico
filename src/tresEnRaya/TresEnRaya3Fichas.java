package tresEnRaya;

public class TresEnRaya3Fichas extends JuegoDeTablero{

	private static final int NUM_FICHAS=6;
	public TresEnRaya3Fichas(String nombre1, char ficha1, String nombre2, char ficha2) {
		super(nombre1, ficha1, nombre2, ficha2);
	}
	
	public void inicio() {
		
		//Fase 1 colocación de las 3 fichas (6 turnos, 3 fichas por jugador)
		System.out.println("Fase de colocación");
		for (int i=0; i < NUM_FICHAS; i++) {
			mostrarTurno();
			realizarJugada();
			
			//En los turnos 5 y 6, puede que termine la partida
			if (tablero.hayGanador()) {
				tablero.mostrar();
				System.out.println("Enhorabuena " + jugadorActivo.getNombre() + "has ganado!");
				return;
			}
			cambiarTurno();
		}
		
		System.out.println("Fase de movimiento");
		
		
		//fase 2 movimiento de fichas
		boolean finPartida=false;
		//Mientras no acabe la partida, jugamos
		while(!finPartida) {
			mostrarTurno();
			moverFicha();
			if (tablero.hayGanador()) {
				finPartida=true;
			}
		}
		
	}
	
	public void moverFicha() {
		
	}

}

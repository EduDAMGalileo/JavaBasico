package ejercicios.poo.tresEnRaya;

public class TresEnRayaMisery extends JuegoDeTablero{

	public TresEnRayaMisery(String nombre1, char ficha1, String nombre2, char ficha2) {
		super(nombre1, ficha1, nombre2, ficha2);
	}

	public void inicio() {
		
		boolean finPartida=false;
		
		while (!finPartida) {
			mostrarTurno();
			realizarJugada();	
			
			//Comprobar si hemos terminado (ganando o empatando)
			if (tablero.hayGanador()) {
				tablero.mostrar();
				cambiarTurno();
				System.out.println("Enhorabuena " + jugadorActivo.getNombre() + " has ganado");
				finPartida=true;
			} else if(tablero.hayEmpate()){
				tablero.mostrar();
				System.out.println("Empate!! No quedan movimientos");
				finPartida=true;
			}else {
				//Cambio de jugador
				cambiarTurno();	
			}
		}

	}
	
}

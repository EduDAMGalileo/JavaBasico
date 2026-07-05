package ejercicios.estructurada.juegos;

import java.util.Arrays;
import java.util.Scanner;

public class TresEnRaya {
	
	static char[][] tablero = new char[3][3];
	
	public static void mostrarTablero () {
		System.out.println("\n Tablero actual \n-----------------");
		for (int i=0; i < tablero.length; i++) {
			for(int j=0; j< tablero[i].length;j++) {
				System.out.print(tablero[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	
	public static boolean colocarFicha (int fila, int columna, char ficha) {
		if (tablero[fila][columna] == '-') {
			tablero[fila][columna]=ficha;
			//Si devuelve true es que la ficha está colocada
			return true;
		}else {
			//Si no hay guión es que hay una ficha
			System.out.println("Ya hay una ficha colocada");
			//En caso de no colocar la ficha, devolvemos false
			return false;
		}
	}
	
	public static boolean hayGanador() {
		//hay 3 en raya en la horizontal
		for (int i=0; i < tablero.length;i++) {
			if ((tablero[i][0]==tablero[i][1] && tablero[i][1]==tablero[i][2])  && tablero[i][0]!='-') {
				return true;
			}
		}
		
		//Comprobamos las columnas
		for (int j=0; j< tablero[0].length;j++) {
			if ((tablero[0][j]==tablero[1][j] && tablero[1][j]==tablero[2][j]) && tablero[0][j]!='-') {
				return true;
			}
		}
		
		//Ahora con las diagonales
		if ((tablero[0][0]==tablero[1][1] && tablero[1][1]==tablero[2][2] && tablero[0][0]!='-')
				||
		    (tablero[0][2]==tablero[1][1] && tablero[1][1]==tablero[2][0])  && tablero[0][2]!='-') {
			return true;
		}
		
		//Si llegamos aquí es que nadie ganó aun
		return false;
	}
	
	public static boolean hayEmpate() {
		//Hay que tener cuidado por si alguien gana en la última jugada
		for (int i=0; i < tablero.length; i++){
			for (int j=0; j < tablero.length; j++) {
				if (tablero[i][j]=='-') {
					//Si encontramos un guión significa que hay un espacio libre y por tanto no acaba la partida
					return false;
				}
			}
		}
		//Si llagamos aquí no hya guiones y por tanto no hay espacios es un empate
		return true;
	}

	public static void crearTablero() {
		for (int i=0; i< tablero.length;i++) {
			Arrays.fill(tablero[i], '-');
		
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fila, columna;
		int jugadorActivo;
		boolean fichaColocada;

		//El jugador elige su ficha
		System.out.println("Elige el caracter para el jugador1");
		char fichaJugador = sc.nextLine().charAt(0);
		System.out.println("Elige el caracter para el jugador2");
		char fichaRival = sc.nextLine().charAt(0);
		
		crearTablero();
		//Empieza el jugador 1, vamos a llevar el turno con un boolean
		boolean turnoJugador1=true;
		do {
			do {
				jugadorActivo = (turnoJugador1) ? 1 : 2;
				System.out.println("Turno del jugador: " + jugadorActivo);
				System.out.println("Elige una fila (1-3): " );
				fila=sc.nextInt()-1;
				System.out.println("Elige una columna (1-3): " );
				columna=sc.nextInt()-1;
			/*	if (turnoJugador) {
					fichaColocada=colocarFicha(fila, columna, fichaJugador);
				}else {
					fichaColocada=colocarFicha(fila, columna, fichaRival);
				}*/
			fichaColocada = (turnoJugador1) ? colocarFicha(fila, columna, fichaJugador) : colocarFicha(fila, columna, fichaRival);
			} while(!fichaColocada);
			mostrarTablero();
			turnoJugador1=!turnoJugador1;
		} while(!hayGanador() && !hayEmpate());
		
		if (hayEmpate()) {
			System.out.println("Empate!!");
		}else {
			System.out.println("Ha ganado el jugador " + jugadorActivo);
		}
		sc.close();
	}
	

}

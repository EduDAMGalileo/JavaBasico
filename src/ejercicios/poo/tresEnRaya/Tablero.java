package ejercicios.poo.tresEnRaya;

import java.util.Arrays;

public class Tablero {
	private char [][] casillas;
	private int dimension;
	
	public Tablero() {
		this.dimension=3;
		this.casillas = new char[dimension][dimension];
		inicializar();
	}
	
	private void inicializar() {
		for (int i=0; i< dimension;i++) {
			Arrays.fill(casillas[i], '-');
		
		}
	}
	
	public void mostrar() {
		System.out.println("\n Tablero actual \n-----------------");
		for (int i=0; i < dimension; i++) {
			for(int j=0; j< dimension;j++) {
				System.out.print(casillas[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public boolean hayGanador(){
		//divide y vencerás
		return comprobarColumnas() || comprobarFilas() || comprobarDiagonalPrincipal() || comprobarDiagonalInversa();
	}
	
	private boolean comprobarColumnas() {
		for (int j = 0; j < dimension; j++ ) {
			char primero = casillas[0][j];
			if (primero != '-' && comprobarUnaColumna(j, primero)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean comprobarUnaColumna(int c, char simbolo) {
		//Fijada la columna me fijo en la fila
		for (int i = 1; i< dimension; i++) {
			if (casillas[i][c]!= simbolo) {
				return false;
			}
		}
		//si llegamos aquí todos los simbolos son iguales
		return true;
	}
	
	private boolean comprobarFilas() {
		for (int i = 0; i < dimension; i++ ) {
			char primero = casillas[i][0];
			if (primero != '-' && comprobarUnaFila(i, primero)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean comprobarUnaFila(int f, char simbolo) {
		//Fijada la columna me fijo en la fila
		for (int j = 1; j< dimension; j++) {
			if (casillas[f][j]!= simbolo) {
				return false;
			}
		}
		//si llegamos aquí todos los simbolos son iguales
		return true;
	}
	
	private boolean comprobarDiagonalPrincipal() {
		if (casillas[0][0]=='-') {
			return false;
		}
		char primero = casillas[0][0];
		for (int i = 1; i < dimension; i++) {
			if (casillas[i][i] != primero) {
				return false;
			}
		}
		return true;
	
	}
	
	private boolean comprobarDiagonalInversa() {
		if (casillas[0][dimension -1]=='-') {
			return false;
		}
		char primero = casillas[0][dimension -1];
		for (int i = 1; i < dimension; i++) {
			if (casillas[i][dimension - 1 - i] != primero) {
				return false;
			}
		}
		return true;
	
	}
	
	public boolean hayEmpate() {
		//Hay que tener cuidado por si alguien gana en la última jugada
		for (int i=0; i < dimension; i++){
			for (int j=0; j < dimension; j++) {
				if (casillas[i][j]=='-') {
					//Si encontramos un guión significa que hay un espacio libre y por tanto no acaba la partida
					return false;
				}
			}
		}
		//Si llegamos aquí no hya guiones y por tanto no hay espacios es un empate
		return true;
	}

	public boolean colocarFicha(int f, int c, char ficha) {
		//Vamos a controlar si nos salimos del tablero
		if (f < 0 || f >= dimension || c < 0 || c >= dimension) {
			System.out.println("Fuera del tablero");
			return false;
		}
		
		//Compruebo si la celda ya esta ocupada
		if (casillas[f][c]!='-') {
			System.out.println("Casilla ocupada");
			return false;
		}
		
		casillas[f][c]=ficha;
		return true;
	}
	
}

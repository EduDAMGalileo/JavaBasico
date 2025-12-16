package ejercicios;

import java.util.Scanner;

public class SumarPorFilasOColumnas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Número de filas: ");
		int fila = sc.nextInt();
		System.out.println("Número de columnas: ");
		int columna = sc.nextInt();
		int[][] matriz = new int[fila][columna];
		
		Recursos.rellenarMatrizAleatoria(matriz, 5);
		Recursos.mostrarMatriz(matriz);

		//Recorremos por filas
		for(int i=0; i<matriz.length;i++) {
			int acum=0;
			for (int j=0; j<matriz[0].length;j++) {
				acum=acum+matriz[i][j];
			}
			System.out.println("\n La fila nº"+ (i+1) + " suma: " + acum);
		}
		
		//Recorremos por columnas
		/*
		for(int j=0;j<matriz[0].length;j++) {
			int acumColumnas=0;
			for (int i=0; i<matriz.length; i++) {
				acumColumnas=acumColumnas+matriz[i][j];
			}
			System.out.println("\n La columna nº"+ (j+1) + " suma: " +  acumColumnas);
		}
		 */
		for(int j=0;j<matriz[0].length;j++) {
			int acumular=0;
			for (int i=0; i<matriz.length;i++) {
				acumular=acumular+matriz[i][j];
			}
			System.out.println("\n La columna nº1  suma: " + acumular);
		}

			
	}

}

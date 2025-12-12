package ejercicios;
import java.util.Scanner;
public class MaximoMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Número de filas: ");
		int fila = sc.nextInt();
		System.out.println("Número de columnas: ");
		int columna = sc.nextInt();
		
		//Pedimos la fila y columna por teclado
		int[][] matriz = new int[fila][columna];
		
		Recursos.rellenarMatrizAleatoria(matriz, 100);
		Recursos.mostrarMatriz(matriz);
		
		int maximo = matriz[0][0];
		
		for (int i=0; i<matriz.length;i++) {
			for (int j=0; j<matriz[0].length;j++) {
				if (maximo < matriz[i][j]) {
					maximo = matriz[i][j];
				}
			}
		}
		
		System.out.print("\n El valor máximo es: " + maximo);
		
		
		
	}

}

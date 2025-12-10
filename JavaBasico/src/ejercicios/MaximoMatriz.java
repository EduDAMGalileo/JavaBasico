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
		int[][] matriz2= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		String[][] vector = {{"adfg","bf","cs"},{"er","er","asas"}};
		
		//Rellenamos la matriz con números aleatorios
		for (int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz[0].length;j++) {
				matriz[i][j] = Aleatorio.numAleatorio(100);
			}
			System.out.println("");
		}
		
		
		
		for (int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz[0].length;j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
		
		
	}

}

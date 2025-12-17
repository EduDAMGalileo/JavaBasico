package ejercicios;

public class Recursos {
	public static int numAleatorio(int hasta) {
		return((int)((Math.random()*hasta)+1));
	}
	
	public static void rellenarArrayAleatorio (int[] arr, int max) {
		for (int i=0; i<arr.length;i++) {
			arr[i]=numAleatorio(max);
		}
	}
	
	public static void mostrarArray(int[] arr) {
		for (int i=0; i< arr.length;i++) {
			System.out.print(arr[i] + " ");	
		}
		System.out.println("");
		
	}
	
	public static void mostrarArray(String[] arr) {
		for (int i=0; i< arr.length;i++) {
			System.out.print(arr[i] + " ");	
		}
		
	}
	
	
	public static void mostrarMatriz (int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0;j<matriz[0].length;j++) {
				System.out.print(matriz[i][j]  + "\t ");
			}
			System.out.println();
		}
	}
	
	//Rellena una matriz, con números aleatorios entre 1 y max
	public static void rellenarMatrizAleatoria(int[][] matriz, int max) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0;j<matriz[0].length;j++) {
				matriz[i][j]=numAleatorio(max);
			}
		}
	}
}

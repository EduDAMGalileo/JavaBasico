package ejercicios;

public class CuadradosCubos {

	public static void main(String[] args) {
		//Rellenar una matriz con los números del 1 al 5, sus cuadrados y sus cubos
		int[][] numeros = new int[10][3];
		for (int i=0;i<numeros.length;i++) {
			for (int j=0;j<numeros[0].length;j++) {
				numeros[i][j]= (int) Math.pow(i+1, j+1);
				System.out.print(numeros[i][j] + " | ");
			}
			System.out.println("");
		}

	}

}

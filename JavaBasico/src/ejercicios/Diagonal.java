package ejercicios;

public class Diagonal {

	public static void main(String[] args) {
		final int DIM=5;
		boolean[][] matriz = new boolean[DIM][DIM];
		
		//Primero la poblamos de datos
		for (int i=0; i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				if (i==j) {
					matriz[i][j]=true;
				}else {
					matriz[i][j]=false;
				}
			}
		}
		
		//Ahora la mostramos por pantalla
		for (int i=0; i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				if(matriz[i][j]==true) {
					System.out.print(1 + " ");	
				}else {
					System.out.print(0 + " ");	
				}
				
			}
			System.out.println("");
		}
		
	}

}

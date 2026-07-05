package ejercicios.estructurada.arrays;

public class SumarArray {
	public static void main (String[] args) {
		//int[] arr = new int[5];
		int[] arr = {1,2,3,4,5};
		int suma = 0;
		
		for (int i = 0; i < arr.length; i++) {
			//La variable del bucle me indica una posición del array, tengo que acceder al contenido
			suma = suma + arr[i];
		}
		System.out.println("La suma da: " + suma);		
	}

}

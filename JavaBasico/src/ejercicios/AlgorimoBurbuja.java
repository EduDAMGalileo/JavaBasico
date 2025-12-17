package ejercicios;

import java.util.Scanner;

public class AlgorimoBurbuja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la longitud del array: ");
		int dimension = sc.nextInt();
		int [] arrayNumeros = new int[dimension];
		
		Recursos.rellenarArrayAleatorio(arrayNumeros, 100);
		System.out.println("El array inicial es: ");
		System.out.println("---------------------");
		Recursos.mostrarArray(arrayNumeros);
		System.out.println("\nComenzamos a ordenarlo");
		for(int i=0; i<arrayNumeros.length-1;i++) {
			for (int j=0; j<arrayNumeros.length-1-i;j++) {
				if (arrayNumeros[j] > arrayNumeros[j+1]) {
					int aux;
					aux=arrayNumeros[j];
					arrayNumeros[j]=arrayNumeros[j+1];
					arrayNumeros[j+1]=aux;
				}
			}
			//Voy viendo como va quedando en cada ejecución
			Recursos.mostrarArray(arrayNumeros);
		}
		System.out.println("Finalmenque queda así");	
		Recursos.mostrarArray(arrayNumeros);
	}

}

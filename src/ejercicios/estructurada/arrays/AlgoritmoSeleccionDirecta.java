package ejercicios.estructurada.arrays;

import java.util.Arrays;
import java.util.Scanner;

import utilidades.Recursos;

public class AlgoritmoSeleccionDirecta {

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
		
		
		for (int i=0; i<arrayNumeros.length-1;i++) {
			int menor=arrayNumeros[i];
			int posicion=i;
			//Miro desde el primero de los que no están colocados
			for (int j=1+i; j<arrayNumeros.length;j++) {
				if(menor > arrayNumeros[j]) {
					menor=arrayNumeros[j];
					posicion=j;
				}
			}
			//System.out.println("Tengo el más pequeño, es: " + menor + " está en la posición " + posicion);
			arrayNumeros[posicion]=arrayNumeros[i];
			arrayNumeros[i]=menor;
			
		}
		//Recursos.mostrarArray(arrayNumeros);
		System.out.print("Acabé");
		System.out.println("Ahora con sort");
		Recursos.rellenarArrayAleatorio(arrayNumeros, 100);
		Arrays.sort(arrayNumeros);
		System.out.print("Y yo también");
		

	}

}

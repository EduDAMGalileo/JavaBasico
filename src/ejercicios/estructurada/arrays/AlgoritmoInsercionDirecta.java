package ejercicios.estructurada.arrays;

import java.util.Scanner;

import utilidades.Recursos;

public class AlgoritmoInsercionDirecta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la longitud del array: ");
		int dimension = sc.nextInt();
		int [] arrayNumeros = new int[dimension];
		
		Recursos.rellenarArrayAleatorio(arrayNumeros, 100);
		Recursos.mostrarArray(arrayNumeros);
		
		for (int i = 1; i < arrayNumeros.length; i++ ) {
			//System.out.println("Vamos a por el elemento: " + arrayNumeros[i]);
			int j=i;
			do
			{
				//System.out.println("Voy a comparar " + arrayNumeros[j] + " a ver si es más pequeño que " + arrayNumeros[j-1]);
				if(arrayNumeros[j]< arrayNumeros[j-1]) {
					//Los intercambio (sería más eficiente si escribiesemos el número solo una vez)
					//pero hace que el algoritmo se entienda peor
					int aux = arrayNumeros[j];
					arrayNumeros[j]=arrayNumeros[j-1];
					arrayNumeros[j-1]=aux;
					j--;
				}
				else {
					//Acabo, ya está ordenado
					break;
				}
			}
			while(j>=1);
		}
		

		
		sc.close();

	}

}

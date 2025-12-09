package ejercicios;

import java.util.Scanner;

public class SumarArrays {

	final static int ELEMENTOS=5;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] arr1 = new int[ELEMENTOS];
		int[] arr2 = new int[ELEMENTOS];
		int[] arrSuma = new int[ELEMENTOS];
		
		
		//Pedimos valores para los arrays 1 y 2
		System.out.println("Vamos a dar valores al array 1");
		rellenarArray(arr1);
		System.out.println("Vamos a mostrar el array 1");
		mostrarArray(arr1);
		System.out.println("Vamos a dar valores al array 2");
		rellenarArray(arr2);
		System.out.println("Vamos a mostrar el array 2");
		mostrarArray(arr2);
		
		//Sumamos los arrays solo si tienen la misma dimensión
		//esto se podría controlar dentro del método, mediante control de excepciones
		if (arr1.length==arr2.length) {
			arrSuma=sumarDosArrays(arr1, arr2);
			mostrarArray(arrSuma);
		} else {
			System.out.println ("Los arrays tienen que tener el mismo tamaño");
		}
			
		sc.close();
	}

	
	public static void mostrarArray(int[] array) {
		System.out.println("\nMostrando array:");
		System.out.println("----------------");
		for (int i=0; i<array.length;i++) {
			System.out.println("elemento[" + i +"] = " + array[i]);
		}
	}
	
	public static int[] sumarDosArrays(int[] array1, int[] array2) {
		int[] suma = new int[array1.length];
		
		for (int i=0; i < array1.length;i++) {
			suma[i]=array1[i]+array2[i];
		}
		return suma;
	}
	
	public static void rellenarArray(int arr[]) {
		for (int i =0; i < arr.length; i++) {
			System.out.print("\nIntroduce el elemento " + (i+1) + ": ");
			arr[i]=sc.nextInt();
		}
	}
}

package ejercicios;

import java.util.Scanner;

public class ArrayAleatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cuál es el tamaño de array? ");
		int dimension = sc.nextInt();
		
		int[] numeros = new int[dimension]; 
		
		
		System.out.println("Tengo un array de longitud: " + numeros.length);
		
		for (int i=0; i< numeros.length;i++) {
			numeros[i] = (int)(Math.random()*10+1);
			//System.out.println("El número es " + numeros[i] + " su cuadrado " + (int) Math.pow(numeros[i], 2) + " y su cubo " + (int) Math.pow(numeros[i], 3));
		}
		
		//Se podría hacer en el bucle anterior, pero así vemos un "foreach"
		for (int num : numeros) {
			System.out.println("El número es " + num + " su cuadrado " + (int) Math.pow(num, 2) + " y su cubo " + (int) Math.pow(num, 3));
		}
		

	}

}

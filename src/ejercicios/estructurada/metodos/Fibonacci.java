package ejercicios.estructurada.metodos;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuántos términos de la sucesión de Fibonnaci quieres ver?");
		int terminos = sc.nextInt();
		long antepenultimo = 0;
		long penultimo = 1;
		long actual;
		System.out.println("El término número 1 es 0 \nEl término número 2 es 1");
		
		for (int i = 3; i<=terminos; i++) {
			actual = penultimo + antepenultimo;
			System.out.println("El término número " + i + " es " + actual);
			//Actualizamos los términos para la siguiente ejecución
			antepenultimo = penultimo;
			penultimo = actual;
		}
		sc.close();
	
	}

}

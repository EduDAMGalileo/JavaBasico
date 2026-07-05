package ejercicios.excepciones;

import java.util.Scanner;

public class ValidadorArrays {
	public static void main (String [] args) {
		int[] miArray = {5,4,3,2,1};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Indica un índice (0-4): ");
		int indice = sc.nextInt();
		
		try {
			System.out.println("En posición " + indice + " tenemos el valor " + miArray[indice]);			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ojo, que te has salido del límite, recuerda, entre (0 y 4)");
			System.out.println (e.getMessage() + " ");
			e.printStackTrace();
		}
		
		if (indice < 0 || indice > miArray.length-1) {
			System.out.println("Ojo, que te has salido del límite, recuerda, entre (0 y 4)");
		}else {
			System.out.println("En posición " + indice + " tenemos el valor " + miArray[indice]);
		}

		System.out.println("Hasta la próxima");
		sc.close();
	}

	

}

package ejercicios.excepciones;

import java.util.Scanner;

public class NumberFormat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un número: ");
		String linea = sc.nextLine();
		
		try {
			int numero = Integer.parseInt(linea);
			System.out.println("El número introducido es: " + numero);
		}catch( NumberFormatException e) {
			System.out.println("Eso no es un número!!!");
		}
		
		

	}

}

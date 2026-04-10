package ejercicios.excepciones;


import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	static Scanner sc = new Scanner(System.in);

	public static int leerEntero() {
		int enteroLeido;
		while (true) {
			System.out.println("Introduce un número entero");
			try {
				enteroLeido=sc.nextInt();
				return enteroLeido;
			}catch (InputMismatchException e) {
				System.out.println("Eso no es un número entero");
				sc.nextLine();
			}
		}
	}

	public static void main(String[] args) {

		int entero = leerEntero();
		System.out.println("El número introducido es: " + entero);
		
		sc.close();
	}

}

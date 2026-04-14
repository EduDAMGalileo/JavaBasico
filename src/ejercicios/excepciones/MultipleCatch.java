package ejercicios.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Elige el primer número: ");
			int num1 = sc.nextInt();
			System.out.println("Elige el segundo número: ");
			int num2 = sc.nextInt(); 
			System.out.println("La división es: " + num1/num2);
		} catch (ArithmeticException e) {
			System.out.println("Oye!!! que no se puede dividir entre cero!!");
		} catch (InputMismatchException e) {
			System.out.println("Oye!!! que eso no es un número!");
		} 
	}

}

package ejercicios.excepciones;

import java.util.Scanner;

public class Aritmethic {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Elige el primer número: ");
		 int num1 = sc.nextInt();
		 System.out.println("Elige el segundo número: ");
		 int num2 = sc.nextInt();
		 
		 try {
			 System.out.println("La división es: " + num1/num2);
		 } catch (ArithmeticException e) {
			 System.out.println("Oye!!! que no se puede dividir entre cero!!");
		 }finally {
			 System.out.println("Esto se ejecuta, falle o no falle");
		 }
		 	
		//Cómo se hace esto realmente¿?
		 
		 if (num2!=0) {
			 System.out.println("La división es: " + num1/num2);
		 } else {
			 System.out.println("Oye!!! que no se puede dividir entre cero!!");
		 }
	}

}

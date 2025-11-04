package ejercicios;

import java.util.Scanner;

public class Ordenar3Numeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Escribe un número: ");
		num1 = scan.nextInt();
		
		System.out.print("Escribe otro número: ");
		num2 = scan.nextInt();
		
		System.out.print("Escribe el último número: ");
		num3 = scan.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			//Si estamos aquí num1 es el más grande
			if (num2 >= num3) {
				System.out.print("De mayor a menor: " + num1 + " " + num2 + " " + num3);
			} else {
				System.out.print("De mayor a menor: " + num1 + " " + num3 + " " + num2);
			}
		} else if (num2 >= num1 && num2 > num3) {
			//Si estamos aquí num2 es el más grande
			if (num1 >= num3) {
				System.out.print("De mayor a menor: " + num2 + " " + num1 + " " + num3);
			}else {
				System.out.print("De mayor a menor: " + num2 + " " + num3 + " " + num1);
			}
		} else {
			//Si num1 no es el más grande ni num2, el más grande es num3
			if (num1 >= num2) {
				System.out.print("De mayor a menor: " + num3 + " " + num1 + " " + num2);
			} else {
				System.out.print("De mayor a menor: " + num3 + " " + num2 + " " + num1);
			}
		}
		
		
		scan.close();

	}

}

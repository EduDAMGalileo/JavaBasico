package ejercicios.estructurada.estructurasControl;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		boolean esPrimo;
		
		System.out.println("Dime un número (positivo) y te digo si es o no primo");
		int num = scan.nextInt();
		
		esPrimo=true;
		
		if (num > 2) {
			if (num % 2==0) {
				esPrimo=false;
			} else {
				//i+=2; --> i=i+2;
				for (int i=3; i<=(num/2); i+=2) {
					if (num%i==0) {
						esPrimo=false;
						break;
					}
				} //for
			} //else
		}// if

		if (esPrimo) {
			
			System.out.print("El número: " + num + " es primo");
		} else {
			System.out.print("El número: " + num + " NO es primo");
		}
		
		scan.close();

	}

}

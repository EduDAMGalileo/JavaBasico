package ejercicios;

import java.util.Scanner;

public class PalabraVertical {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		char caracter;
		System.out.print("Dime una palabra o frase: ");
		String cadena=leer.nextLine();
		
		
		//Con el método chatAt
		for (int i=0; i<cadena.length();i++) {
			caracter=cadena.charAt(i);
			System.out.println(caracter);
		}
		
		System.out.println();
		var arr = new int[]{1, 2, 3, 4, 5};
		for(var e : arr) {
		    System.out.println(arr);
		}
		
		//Con el método substring
		String caracter2;
		for (int i=0; i<cadena.length();i++) {
			caracter2=cadena.substring(i, i+1);
			System.out.println(caracter2);
		}
		
		leer.close();
		

	}

}

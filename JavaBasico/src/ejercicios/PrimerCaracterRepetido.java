package ejercicios;

import java.util.Scanner;

public class PrimerCaracterRepetido {

	public static char caracterRepe(String palabra) {
		char repe=' ';

		for(int i =0 ; i< palabra.length();i++) {
			for(int j=i+1; j < palabra.length(); j++) {
				if ( palabra.charAt(i) == palabra.charAt(j)) {
					repe=palabra.charAt(j);
				}
			}
		}
		return repe;
		
	}
 	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe una palabra");
		String palabra = sc.nextLine();
		char repetido;
		repetido=caracterRepe(palabra);
		
		if ( repetido == ' ') {
			System.out.println("No repite ningún caracter");
			
		} else {
			System.out.println("Se repite el caracter: " + repetido);
		}
		
	sc.close();
	}

}

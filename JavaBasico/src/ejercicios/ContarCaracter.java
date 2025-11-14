package ejercicios;

import java.util.Scanner;

public class ContarCaracter {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String frase, aux;
		char caracter;
		
		System.out.println("Escribe una frase: ");
		frase=leer.nextLine();
		int contador=0;
		
		System.out.println("Escribe una letra y te digo cuantas veces aparece en la frase: ");
		//Opción más limpia caracter=leer.nextLine().charAt(0);
		aux=leer.nextLine();
		caracter=aux.charAt(0);
		
		System.out.println("Voy a contar cuantas veces aparece '" + caracter + "' en la frase '" + frase + "'");
		
		for (int i=0; i< frase.length();i++){
			if (frase.charAt(i) == caracter) {
				contador++;
			}
		}
		
		System.out.println("Aparece " + contador + " veces");

	}

}

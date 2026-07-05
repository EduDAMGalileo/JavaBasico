package ejercicios.estructurada.strings;

import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		final String VOCALES ="aeiouáéíóúAEIOUÁÉÍÓÚ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una frase y cuento las vocales ");
		String frase= sc.nextLine();
		char caracter;
		int numVocales=0;
		
		for (int i = 0; i<= frase.length()-1; i++) {
			caracter=frase.charAt(i);
			if(VOCALES.indexOf(caracter)>=0) {
				numVocales++;
				System.out.print(caracter);
			}
		}
		System.out.println("\nEn total hay " + numVocales + " vocales");
		sc.close();

	}

}

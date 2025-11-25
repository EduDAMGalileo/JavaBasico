package ejercicios;

import java.util.Scanner;

public class CambiarLetras {
	
	//Método un poco cutre, que solo hace una cosa, los métodos tienen que ser lo más genéricos posible
	public static String cambiaA (String f) {
		//Código con StrngBuilder
		StringBuilder aux = new StringBuilder();
	
		for (int i = 0; i<f.length();i++) {
			if (f.charAt(i)=='a' || f.charAt(i)=='A') {
				aux.append('4');
			}else {
				aux.append(f.charAt(i));
			}
		}
		return aux.toString();
		
	}
	
	public static String replaceMejorado (String f, char viejo, char nuevo) {
		//Código con StrngBuilder
		StringBuilder aux = new StringBuilder();
	
		for (int i = 0; i < f.length();i++) {
			System.out.println("Iteración número " + i + " caracter " + f.charAt(i));
			if (f.charAt(i)==Character.toLowerCase(viejo)  || f.charAt(i)==Character.toUpperCase(viejo)) {
				aux.append(nuevo);
			}else {
				aux.append(f.charAt(i));
			}
			Character.toString(nuevo);
			
		}

		//Convierto el StringBuilder en String, que es lo que devuelve el método
		return aux.toString();
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Escribe una frase");
		
		String frase=sc.nextLine();
		String fraseSinA=frase.replace('a', '4');
		System.out.println("La frase: " +  frase + " modificada es: " + fraseSinA);
		

		String fraseSinAEnmetodo=cambiaA(frase);
		System.out.println("La frase: " +  frase + " modificada es: " + fraseSinAEnmetodo);
		
		//Ahora cambiamos las e por 3
		String fraseSinE=frase.replace('e', '3');
		System.out.println("La frase: " +  frase + " modificada es: " + fraseSinE);
		
		System.out.println("La frase: " +  frase + " modificada es: " + replaceMejorado(frase, 'e', '3'));
		
		
		sc.close();
	}

}

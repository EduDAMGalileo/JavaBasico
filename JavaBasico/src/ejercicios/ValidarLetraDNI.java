package ejercicios;

import java.util.Scanner;

public class ValidarLetraDNI {

	final static String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKED";
	
	public static boolean dniValido(String dni) {
		//Asumimos que los 8 primeros son números y el último una letra
		String dniSinLetra;
		
		//Me quedo con la parte numérica del String, pero sigue siendo un String
		dniSinLetra=dni.substring(0,8);
		//Lo paso a entero
		int dniNumerico = Integer.valueOf(dniSinLetra);
		
		char letra=dni.charAt(dni.length()-1);
		
		
		//Calculamos la letra buena
		char letraBuena;
		int resto = dniNumerico % 23;
		letraBuena=LETRAS.charAt(resto);
		
		if(letra == letraBuena) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe el DNI: ");
		String dni = sc.nextLine(); 
		if (dniValido(dni)) {
			System.out.println("La letra es correcta");
		}else {
			System.out.println("La letra es NO correcta");
		}
	}

}

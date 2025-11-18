package ejercicios;

import java.util.Scanner;

public class MostrarIniciales {
	
	public static void main(String[] args) {
		String nombre;
		int posicionApellido;
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime tu nombre y tu primer apellido");
		nombre = leer.nextLine().toUpperCase();
		
		posicionApellido=nombre.indexOf(" ") + 1;
		System.out.println("La posición del espacio es: " + posicionApellido);
		
		System.out.println(nombre.charAt(0) + "." + nombre.charAt(posicionApellido));
;
 
		leer.close();
	}

}

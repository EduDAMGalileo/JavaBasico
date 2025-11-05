package ejercicios;

import java.util.Scanner;

public class MenuPersistente {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opcion;
		

		do {
			System.out.println("Elige una de las opciones: ");
			System.out.println("1-Saludar: ");
			System.out.println("2-Decir la hora: ");
			System.out.println("3-Agradecer: ");
			System.out.println("4-Salir: ");
			
			opcion=leer.nextInt();
			
			
			switch (opcion) {
				case 1:
					System.out.println("Hola!");
					break;
				case 2:
					System.out.println("Son las 10:34");
					break;
				case 3:
					System.out.println("Muchas gracias!");
					break;
				case 4:
					System.out.println("Adiós!");
					break;
				default:
					System.out.println("Opción no válida!");
						
			}
		} while(opcion != 4);
		
		
		leer.close();

	}

}

package ejercicios.poo.encapsulamiento;

import java.util.Scanner;

public class AppTamagotchi {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int menu;
		System.out.print("¿Cómo quieres que se llame tu mascota?");
		
		String nombre = sc.nextLine();
		
		Tamagotchi mascota = new Tamagotchi(nombre);
		
		mascota.saludar();

		//Hacer menú
		do {
			System.out.println("\n\nMenú de opciones (elige una)");
			System.out.println("------------");
			System.out.println("1.Jugar");
			System.out.println("2.Comer");
			System.out.println("3.Dormir");
			System.out.println("0.Salir");

			menu = sc.nextInt();
			
			mascota.comer();
			
			//Ahora ejecutamos la acción
			switch(menu) {
				case 0:
					break;
				case 1:
					mascota.jugar();
					break;
				case 2:
					mascota.comer();
					break;
				case 3:
					mascota.dormir();
					break;
				default: 
					System.out.println("La opción elegida no es válida");

			}
			if (menu!=0) {
				mascota.estado();	
			} else {
				System.out.println("Hasta la próxima");
			}
			

		}while(menu!=0);

		sc.close();


		
	}

}

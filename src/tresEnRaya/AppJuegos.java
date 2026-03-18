package tresEnRaya;

import java.util.Scanner;

public class AppJuegos {

	public static void main(String[] args) {
		//Vamos a jugar al 3 en raya
		Scanner sc = new Scanner(System.in);
		int eleccion;

		do {
			System.out.println("¿A qué quieres jugar?");
			System.out.println("1-Tres en raya");
			System.out.println("2-Tres en raya miseria");
			System.out.println("3-Tres en raya desplazamiento");
			System.out.println("0-Salir");
			eleccion=sc.nextInt();


			switch(eleccion) {
			case 1:
				System.out.println("Jugando al tres en raya");
				TresEnRaya partida = new TresEnRaya("Edu", 'X', "Ana", 'O');
				partida.inicio();
				break;
			case 2:
				System.out.println("Jugando a la variante miseria");
				TresEnRayaMisery partida2 = new TresEnRayaMisery("Edu", 'X', "Ana", 'O');
				partida2.inicio();
	
				break;
			case 3:
				System.out.println("Jugando a la variante de desplazamiento");
				TresEnRaya3Fichas partida3 = new TresEnRaya3Fichas("Edu", 'X', "Ana", 'O');
				partida3.inicio();
				break;
				
			case 0:
				System.out.println("Vuelve pronto!");
			}

		}while(eleccion!=0);


	}

}


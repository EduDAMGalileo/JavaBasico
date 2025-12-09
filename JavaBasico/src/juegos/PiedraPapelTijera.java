package juegos;

import java.util.Scanner;

public class PiedraPapelTijera {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Pedimos al usuario su opción
		String[] arrayOpciones = {"Piedra","Papel","Tijera"};
		
		String opcionPlayer = arrayOpciones[pedirOpcion()-1];
		
		//Elige el PC
		String opcionPC = arrayOpciones[eleccionPC()-1];
		
		System.out.println("Has elegido: " + opcionPlayer + " y el PC " + opcionPC);
		
		if(opcionPlayer.equals(opcionPC)) {
			System.out.println("Empate!!");
		} else if ((opcionPlayer.equals("Papel") && opcionPC.equals("Piedra")) ||
				(opcionPlayer.equals("Tijera") && opcionPC.equals("Papel")) ||
				(opcionPlayer.equals("Piedra") && opcionPC.equals("Tijera")) 
				) {
			System.out.print ("Ganaste!!");
		}else {
			System.out.print ("Perdiste!!");
		}
		
		sc.close();
	}
	
	public static int eleccionPC(){
		int eleccion = (int) (Math.random()*3)+1;
		return eleccion;
	}
	
	public static int pedirOpcion() {
		int eleccion;
		System.out.println("Por favor, elija una de las siguientes opciones");
		System.out.println("1-Piedra");
		System.out.println("2-Papel");
		System.out.println("3-Tijera");
		
		do {
			eleccion = sc.nextInt();
			if(eleccion < 1 || eleccion > 3) {
				System.out.println("Revisa tu respuesta");
			}
		}while(eleccion < 1 || eleccion > 3);
		
		return eleccion;
	}

}

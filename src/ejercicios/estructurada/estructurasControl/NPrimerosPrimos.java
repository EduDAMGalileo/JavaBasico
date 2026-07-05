package ejercicios.estructurada.estructurasControl;

import java.util.Scanner;

public class NPrimerosPrimos {

	public static void main(String[] args) {
		//Suponemos que el usuaro pide al menos 3 primos
		//Suponemos también que el 1 y el 2 son primos
		//Vamos a hacer alguna que otra chapuza a propósito
		
		Scanner scan= new Scanner(System.in);
		//chapuza
		int contadorPrimos=2;
		int contadorNumeros=3;
		int num = scan.nextInt();

		
		
		//Escribo por pantalla los dos primeros primos (chapuza)
		System.out.print("1, 2, ");
		
		do {
			boolean esPrimo= true;
			
			for (int i=3; i<=(contadorNumeros/2); i+=2) {
				if (contadorNumeros%i==0) {
					esPrimo=false;
					break;
				}
			} //for
			
			if (esPrimo) {
				contadorPrimos++; //contadorPrimos=contadorPrimos+1;
				System.out.print(contadorNumeros + ", ");
			}
			contadorNumeros=contadorNumeros+2;
		} while(contadorPrimos < num);
		
		//El acordeón de arriba está pidiendo a gritos un método
		scan.close();
		

	}

}

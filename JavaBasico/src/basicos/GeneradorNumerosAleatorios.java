package basicos;

import java.util.Scanner;

public class GeneradorNumerosAleatorios {
	

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Te genero un número aleatorio desde 1 hasta donde me digas: ");
		int rango = sc.nextInt();
		int rand= generarAleatorio(rango);
		System.out.print(rand);
		
		sc.close();
	}
	
	public static int generarAleatorio(int rango) {
		return (int) (Math.random()*rango+1);
	}
}

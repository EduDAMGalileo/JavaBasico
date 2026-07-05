package ejercicios.estructurada.metodos;

import java.util.Scanner;

public class TablaMultiplicarMetodo {
	
	public static void mostrarTabla (int num) {
		System.out.println("Tabla del número: " + num);
		for (int i=1; i<=10;i++) {
			System.out.println(num + "x" + i + "=" + num*i);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un número y muestro su tabla de multiplicar");
		int numero = sc.nextInt();
		
		//La tabla de un solo número
		mostrarTabla(numero);

		//Y ahora la tabla de los N primeros números
		for (int i=1; i<=numero;i++) {
			mostrarTabla(i);
			System.out.println("---------------");
		}
		
		sc.close();

	}

}

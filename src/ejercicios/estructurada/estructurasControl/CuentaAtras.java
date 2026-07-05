package ejercicios.estructurada.estructurasControl;

import java.util.Scanner;

public class CuentaAtras {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int contadorWhile, contadorDoWhile;
		System.out.print("Desde donde quieres contar hacia atrás: ");
		int num=leer.nextInt();
		leer.close();
		
		System.out.println("\n Con un bucle while");
		contadorWhile=num;
		while (contadorWhile > 0) {
			System.out.print(contadorWhile + ", ");
			contadorWhile--; //contadorWhile = contadorWhile - 1;
		}
		//Para que el 0 lo muestre con un punto.
		System.out.println("0.");
		
		
		System.out.println("\n Con un bucle do while");
		contadorDoWhile=num;
		do {
			System.out.print(contadorDoWhile + ", ");
			contadorDoWhile--;
		} while(contadorDoWhile > 0);
		System.out.println("0.");
		
		System.out.println("\n Con un bucle for");
		for (int i=num; i>0 ; i--) {
			System.out.print(i + ", ");
		}
		System.out.println("0.");
	}

}

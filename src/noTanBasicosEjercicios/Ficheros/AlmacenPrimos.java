package noTanBasicosEjercicios.Ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AlmacenPrimos {

	public static void main(String[] args) {
		
		FileWriter fichero = null;
		PrintWriter escritor = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			fichero = new FileWriter("primos.txt");
			escritor = new PrintWriter(fichero);
			
			while (true) {
				System.out.println("Dame un número entero positivo y vemos si es primo, o uno negativo y salimos");
				int num = sc.nextInt();
				if (num > 0) {
					//Comprobamos si es primo
					if (esPrimo(num)) {
						escritor.println(num);
					}
				}else {
					System.out.println("Hasta la próxima");
					break;
				}
			}
			
			
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error");
			System.err.println (e.getStackTrace());
		} finally {
			if (escritor != null) {
				escritor.close();	
			}
			sc.close();
		}
	}
	
	public static boolean esPrimo(int n) {
		if (n==2) {
			return true;
		}
		if (n==0 || n==1 || n%2==0) {
			return false;
		}

		for (int i=3 ; i<=n/2; i+=2) {
			if(n%i==0) {
				//si esto ocurre, tenemos un divisor (que no es ni 1 ni el propio numero)
				return false;
			}
		}
		return true;
	}

}

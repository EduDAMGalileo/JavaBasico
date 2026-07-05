package ejercicios.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NotarioDigital {


	public static void main(String[] args) {
		File miFichero = new File("registro.txt");
		PrintWriter escritor = null;
		Scanner sc = new Scanner(System.in);

		try {
			escritor = new PrintWriter(miFichero);
			String frase ="";
			while(!frase.equals("FIN")) {
				System.out.println("Escribe una frase o escribe FIN");
				frase = sc.nextLine();
				if (!frase.equals("FIN")) {
					escritor.println(frase);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: El fichero no existe");
		} finally {
			if (escritor!=null) {
				escritor.close();
			}
			sc.close();
			System.out.println("Programa finalizado");
		}




	}

}

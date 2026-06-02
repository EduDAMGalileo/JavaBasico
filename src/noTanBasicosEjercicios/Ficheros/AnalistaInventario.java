package noTanBasicosEjercicios.Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AnalistaInventario {
	public static void main (String[] args) {
		File archivo = new File ("almacen.txt");
		Scanner lector = null;
		
		int stockTotal=0;
		
		try {
			lector = new Scanner(archivo);
			
			while (lector.hasNextLine()) {
				String linea = lector.nextLine();
				//System.out.println("\n\nHe leido: " + linea);
				String[] palabras = linea.split(" ");
				
				/*for (String palabra : palabras) {
					System.out.println(palabra);
				}
				*/
				System.out.println("Tenemos " + palabras[4] + " " + palabras[1]);
				int stock = Integer.parseInt(palabras[4]);
				stockTotal=stockTotal+stock;
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero");
		} finally {
			if (lector !=null) {
				lector.close();
			}
		}
		
		System.out.println("En total hay " + stockTotal + " productos");
		
	}

}

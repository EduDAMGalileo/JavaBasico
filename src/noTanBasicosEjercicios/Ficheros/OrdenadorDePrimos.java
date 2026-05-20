package noTanBasicosEjercicios.Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class OrdenadorDePrimos {
	public static void main(String[] args) {
		
		File fichPrimos = new File("primos.txt");
		FileWriter fichOrdenar = null;
		PrintWriter escritor = null;
		Scanner lector = null;
		ArrayList<Integer> primos = new ArrayList<>();
		
		try {
			lector = new Scanner(fichPrimos);
			
			while (lector.hasNextLine()) {
				int primo = lector.nextInt();
				primos.add(primo);
				lector.nextLine();
			}
			System.out.println("Antes de ordenar " + primos.toString());
			Collections.sort(primos);
			System.out.println("\n\nDespués de ordenar: " + primos.toString());
			
			fichOrdenar = new FileWriter("primos_ordenados.txt");
			escritor = new PrintWriter(fichOrdenar);
			
			for (int i : primos) {
				escritor.println(i);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println ("\nFichero no encontrado");
		}catch (IOException e) {
			System.out.println("Ha ocurrido un error con alguno de los ficheros");
		}
		finally {
			if (lector!=null) {
				lector.close();
			}
			if (escritor != null) {
				escritor.close();
			}
		}
		

	}

}

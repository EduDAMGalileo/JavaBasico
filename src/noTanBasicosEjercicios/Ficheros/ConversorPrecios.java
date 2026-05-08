package noTanBasicosEjercicios.Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorPrecios {

	public static final double IVA=1.21; 

	public static void main(String[] args) {
		File fichLectura = new File("precios.txt");
		File fichEscritura = new File("factura.txt");
		Scanner lector = null;
		PrintWriter escritor = null;

		try {
			lector = new Scanner(fichLectura);
			escritor = new PrintWriter(fichEscritura);
			while (lector.hasNextLine()) {
				double precio=0;
				try {
					precio = lector.nextDouble();
					double precioConIVA= precio * IVA;
					escritor.println(precioConIVA);
				}catch(InputMismatchException e) {
					System.out.println("Encontrado un dato erróneo");
					escritor.println("Error - Revisar");
					lector.nextLine();
				}

			}

		}catch (FileNotFoundException e) {
			System.out.println("El fichero " + fichLectura.getName() +" no existe");
			//e.printStackTrace();
		}
		finally {
			lector.close();
			escritor.close();
		}

		System.out.println("Hemos terminado!");
	}

}

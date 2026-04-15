package noTanBasicosEjercicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiarioCronlogico {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		PrintWriter escritor =null;
		try {
			FileWriter miDiario = new FileWriter("diario.txt", true);
			escritor = new PrintWriter(miDiario);
			System.out.println("Escribe una nueva estrada del diario");
			String linea = sc.nextLine();
			// Obtener fecha y hora actual 
			LocalDateTime ahora = LocalDateTime.now(); 
			// Definir el formato deseado 
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); 
			// Convertir a texto legible 
			String fechaFormateada = ahora.format(formato); 
			escritor.println("[" + fechaFormateada+ "] - " + linea);
			

		} catch (IOException e) {
			System.out.println("Error!!");
			e.printStackTrace();
		}finally {
			if (escritor!=null) {
				escritor.close();
			}
			sc.close();
		}

	}

}

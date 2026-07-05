package ejercicios.estructurada.strings;

import java.util.Scanner;

public class SiONo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String opcion;
		
		do{
			System.out.print("¿Quieres continuar? (s/n) ");
			opcion=scan.nextLine().toLowerCase();	
			
		} while(!opcion.equals("s") && !opcion.equals("n"));
		
		//while (!(opcion.equals("s") || opcion.equals("n")));

		System.out.println("Hasta luego, un placer");
		scan.close();
	}
}



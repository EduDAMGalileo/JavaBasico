package ejercicios.poo.encapsulamiento;

import java.util.ArrayList;
import java.util.Scanner;

public class EstaONoEstaArrayList {

	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Eduardo");
		nombres.add("Pepe");
		nombres.add("Paco");
		nombres.add("Ana");
		nombres.add("Li");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un nombre: ");
		String nombre = sc.nextLine();
		
		boolean encontrado=false;
		
		//Recorriendo el ArrayList
		for (String n : nombres) {
			if (n.equals(nombre)) {
				encontrado=true;
				break;
			} 
		}
		if (encontrado) {
			System.out.println("El nombre está incluido en el ArrayList");
		} else {
			System.out.println("El nombre NO está incluido en el ArrayList");	
		}
		
		//Ahora con métodos de la clase ArrayList
		if(nombres.contains(nombre)) {
			System.out.println("El nombre está incluido en el ArrayList");			
		}else {
			System.out.println("El nombre NO está incluido en el ArrayList");
		}
		
		sc.close();
	}

}

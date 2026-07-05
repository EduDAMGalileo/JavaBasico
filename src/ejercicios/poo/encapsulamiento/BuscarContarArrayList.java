package ejercicios.poo.encapsulamiento;

import java.util.ArrayList;
import java.util.Collections;

public class BuscarContarArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();

		numeros.add(6);
		numeros.add(7);
		numeros.add(20);
		numeros.add(3);
		numeros.add(80);
		
		//Encontrar el mayor y el menor
		int mayor=numeros.get(0);
		int menor=numeros.get(0);
		int suma=0;
		int mayoresDe10=0;
		
		for (int n : numeros) {
			suma+=n;
			if (n > 10) {
				mayoresDe10++;
			}
			if (n < menor) {
				menor = n;
				continue;
			}
			if (n > mayor) {
				mayor=n;
			}
		}
		
		System.out.println("\nEl mayor es: " + mayor + " y el menor es " + menor);
		
		//Encontrar el mayor y el menor con la clase Collecions
		System.out.println ("Según Collections, el máximo es "+ Collections.max(numeros) + 
				" y el mímino " + Collections.min(numeros));
		
		//Sumarlos
		System.out.println("Y la suma de todos ellos es: " + suma);
		
		//Mostrar los que son mayores que 10
		System.out.println("Había " + mayoresDe10 + " números mayores que 10");
	}

}

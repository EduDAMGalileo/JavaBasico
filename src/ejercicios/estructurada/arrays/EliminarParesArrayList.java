package ejercicios.estructurada.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class EliminarParesArrayList {

	public static void main(String[] args) {
		// Para incializar directamente un ArrayList
		ArrayList<Integer> listaNumeros = new ArrayList<>(Arrays.asList(1,2,4,3,5,6));
		System.out.println(listaNumeros);

		
		//Dos soluciones, aquí volvemos a mirar la misma posición si eliminamos el par
		for (int i=0; i<listaNumeros.size();i++) {
			if (listaNumeros.get(i)%2==0) {
				listaNumeros.remove(i);
				//Volvemos a mirar, ya que eliminamos ese registro y el Array se comprime
				i--;
			}
		}
		
		System.out.println(listaNumeros);
		
		//recorremos la lista al revés, para que no me la lie la reducción de elementos
		ArrayList<Integer> listaNumeros2 = new ArrayList<>(Arrays.asList(1,2,4,3,5,6));
		System.out.println(listaNumeros2);		
		for (int i=listaNumeros2.size()-1; i>=0; i--) {
			if (listaNumeros2.get(i)%2==0) {
				listaNumeros2.remove(i);
			}
		}
		System.out.println(listaNumeros2);
		
		//Tercera solución, la que ya viene implementada
		ArrayList<Integer> listaNumeros3 = new ArrayList<>(Arrays.asList(1,2,4,3,5,6));
		System.out.println(listaNumeros3);
		//Operador flecha, que no hemos visto
		listaNumeros3.removeIf(par -> par %2==0);
		System.out.println(listaNumeros3);
	}
	
	
	

}

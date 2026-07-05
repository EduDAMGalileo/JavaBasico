package ejemplos.estructurada.arrays;

import java.util.Arrays;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayListEjemplos {

	public static void main(String[] args) {
		// Creamos un array para 3 invitados
		String[] invitados = new String[3];
		invitados[0] = "Ana";
		invitados[1] = "Luis";
		invitados[2] = "Marta";

		// ¡Problema! Llega Javier.
		//invitados[3] = "Javier"; // ERROR: ArrayIndexOutOfBoundsException
		
		//SOLUCION mala, con arrays normales
		// 1. Crear un array nuevo más grande
		String[] nuevosInvitados = new String[4];

		// 2. Copiar los datos antiguos uno a uno
		for(int i=0; i<invitados.length; i++) {
		    nuevosInvitados[i] = invitados[i];
		}	

		// 3. Añadir al nuevo
		nuevosInvitados[3] = "Javier";

		// 4. Descartar el viejo
		invitados = nuevosInvitados;
		
		//O Con copyOf()
		// 1. Redimensionar y copiar en una sola línea (más limpio)
		invitados = Arrays.copyOf(invitados, 4);

		// 2. Añadir al nuevo hueco
		invitados[3] = "Javier";
		
		//ERROR
		//ArrayList<int> listaNumeros; // ¡ERROR! 'int' no es un objeto.
		//CORRECTO
		ArrayList<Integer> listaNumeros; // ¡CORRECTO! 'Integer' es una clase.
		
		//Definiendo ArrayLists
		// Lista de textos
		ArrayList<String> listaNombres = new ArrayList<>();

		// Lista de números enteros (Usando la clase envoltorio)
		ArrayList<Integer> listaEdades = new ArrayList<>();

		// Lista de números decimales
		ArrayList<Double> listaPrecios = new ArrayList<>();
		
		
		//Algunos métodos
		//añadir
		ArrayList<String> frutas = new ArrayList<>();
		frutas.add("Manzana"); 
		frutas.add("Pera");    
		frutas.add(0, "Uva");  
		
		System.out.println("Hay " + frutas.size() + " frutas.");
		
		//Modificar y recuperar
		String fruta1 = frutas.get(1); 
		System.out.println("\nHe cogido un/a: " + fruta1 + " del ArrayList");

		frutas.set(1, "Melocotón");
		
		fruta1 = frutas.get(1); 
		System.out.println("He cogido un/a: " + fruta1 + " del ArrayList");
		
		//Buscar
		boolean tienePera = frutas.contains("Pera"); 
		int posUva = frutas.indexOf("Uva");          
		System.out.println("\n¿Hay Peras? " + tienePera + ". La uva está en la posición: " + posUva);
		
		//Eliminar
		frutas.remove(0);        // Borra "Uva". Queda: [Melocotón, Pera]
		frutas.remove("Pera");   // Borra "Pera". Queda: [Melocotón]
		frutas.clear();          // La vacía: []
		
		
		//Borrando números, no posiciones
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(5);
		numeros.add(9);
		numeros.add(1);

		// Queremos borrar el NÚMERO 1, no la posición 1.

		// MAL:
		// numeros.remove(1); // Borraría el índice 1 (el 9). 

		// BIEN:
		numeros.remove(Integer.valueOf(1)); // "Borra el OBJETO con valor 1"
		// Resultado: [5, 9]
		
		
		//Recorriendo Arrays
		ArrayList<String> series = new ArrayList<>();
		series.add("Utopía");
		series.add("South Park");
		series.add("Black Mirror");

		System.out.println("\n\n--- Mis Series Favoritas (con índice) ---");

		for (int i = 0; i < series.size(); i++) {
		    String titulo = series.get(i);
		    System.out.println((i + 1) + ". " + titulo);
		}
		
		System.out.println("\n--- Mis Series Favoritas (simple) ---");

		// Se lee: "Para cada 'serie' (String) en la lista 'series'..."
		for (String serie : series) {
		    System.out.println("- " + serie);
		}
		
		
		//Collections
		ArrayList<Integer> numeros2 = new ArrayList<>();
		numeros2.add(50);
		numeros2.add(10);
		numeros2.add(30);
		numeros2.add(20);
		numeros2.add(15);
		numeros2.add(25);

		System.out.println("\n\nInicialmente: " + numeros2);
		
		Collections.reverse(numeros2);
		System.out.println("Invertida: " + numeros2);
		
		Collections.sort(numeros2);
		System.out.println("Ordenada: " + numeros2); 
		
		
		Collections.shuffle(numeros2);
		System.out.println("Barajada: " + numeros2); 
		

	}

}

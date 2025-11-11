package basicos;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		//Problema cuando queremos guardar muchas variables del mismo tipo
		double nota1 = 7.5;
		double nota2 = 8.0;
		double nota3 = 6.5;
		
        //Declarar un array de 5 enteros
        int[] notas = new int[5];
        
        System.out.println("Ahora mismo las notas tienen valor: " + notas[1]);
        
        // O en dos líneas separadas
        String[] listaNombres;   
        //System.out.println ("Esto ahora mismo falla: "+ listaNombres[14]);
        listaNombres = new String[50]; // Crea un array para 50 Strings.
  
        System.out.println ("El valor por defecto del String es : "+ listaNombres[14]);
        
       
        //Si sabemos los valores de antemanos se pueden inicializar en el momento de la creación 
        //Creeamos un array de 7 Strings. Java sabe que el tamaño es 7.
        String[] diasDeLaSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        System.out.println("diasDeLaSemana tiene: " + diasDeLaSemana.length + " elementos");
        
        //Una mezcla de los dos
        int[] numerosPares = new int[]{2, 4, 6, 8, 10};

        //Inicializar cada elemento (uno a uno)
        notas[0] = 7;
        notas[1] = 5;
        notas[2] = 9;
        notas[3] = 4;
        notas[4] = 8;
        //Esta línea provocaría un error
        //notas[5] = 7;

        
        //Acceder a elementos individuales
        System.out.println("La primera nota es: " + notas[0]);
        System.out.println("La tercera nota es: " + notas[2]);

        // Modificar un elemento concreto
        notas[3] = 6;
        System.out.println("La nota corregida del alumno 4 es: " + notas[3]);
        
        //Inicialziamos con un bucle todo el array
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
            notas[i] = escaner.nextInt();
        }

        // Recorrer el array entero
        System.out.println("\n--- Todas las notas ---");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + notas[i]);
        }
        
        //Recorrer el array con for-each
        System.out.println("\n--- Todas las notas (con for-each) ---");
        for (int notaActual : notas) {
            System.out.println("Nota: " + notaActual);
        }

        escaner.close();
	}

}

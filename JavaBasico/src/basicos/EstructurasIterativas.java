package basicos;

import java.util.Scanner;

public class EstructurasIterativas {

	public static void main(String[] args) {
		//while
		
		// 1. Inicialización
        int contador = 5;

        // 2. Condición
        while (contador > 0) {
            System.out.println("El contador vale: " + contador);
            // 3. Actualización
            contador = contador - 1; // o contador--;
        }

        System.out.println("¡Despegue!");
        
        //do while
        
        Scanner scanner = new Scanner(System.in);
        String claveSecreta = "1234";
        String claveIngresada;

        do {
            System.out.print("Introduce la contraseña: ");
            claveIngresada = scanner.nextLine();
        } while (claveIngresada == claveSecreta); // Repetir mientras la clave NO sea la correcta

        System.out.println("¡Acceso concedido!");
        scanner.close();
        
        //for
        int numeroTabla = 7;
        System.out.println("--- Tabla de multiplicar del " + numeroTabla + " ---");

        // i se inicializa a 1; el bucle se repite mientras i <= 10; i se incrementa en 1 en cada vuelta.
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabla + " x " + i + " = " + (numeroTabla * i));
        }
    
    }

	

}

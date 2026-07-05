package ejemplos.excepciones;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraAvanzada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        try {
            System.out.print("Introduce el total de caramelos: ");
            // Riesgo 1: InputMismatchException
            int caramelos = teclado.nextInt(); 
            
            System.out.print("Introduce el número de niños: ");
            int ninos = teclado.nextInt(); 
            
            // Riesgo 2: ArithmeticException
            int reparto = caramelos / ninos; 
            System.out.println("Cada niño recibe: " + reparto + " caramelos.");

        } catch (InputMismatchException e) {
            // Protocolo de recuperación A: El usuario introdujo texto en lugar de números
            System.out.println("ERROR DE FORMATO: Debes introducir un número entero (ej: 10).");
            
        } catch (ArithmeticException e) {
            // Protocolo de recuperación B: El usuario introdujo un 0 en el divisor
            System.out.println("ERROR MATEMÁTICO: No se pueden repartir caramelos entre 0 niños.");
        }
        
        System.out.println("El programa continúa su ejecución normalmente...");
    }
}
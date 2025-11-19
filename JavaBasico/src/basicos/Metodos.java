package basicos;

import java.util.Scanner;

public class Metodos {


	//Métodos que no devuelven valores
	
	//Sin parámetros
    public static void imprimirBienvenida() {
        System.out.println("*********************************");
        System.out.println("*   Bienvenido a la Aplicación  *");
        System.out.println("*********************************");
    }
    
    public static void imprimirDespedida() {
        System.out.println("Gracias por usar la aplicación. ¡Adiós!");
    }
    
    //Con parámetros
    public static void saludarUsuario(String nombre) {
        System.out.println("Hola, " + nombre + ". ¡Qué tengas un buen día!");
    }
    
    public static void mostrarPuntuacion(int puntos) {
        System.out.println("--- Puntuación Final ---");
        System.out.println("Puntos: " + puntos);
        System.out.println("------------------------");
    }
    
    //Métodos que devuelven valores
	
    public static int sumar(int numeroA, int numeroB) {
	    int resultado = numeroA + numeroB;
	    return resultado;
	}
	
    public static int multiplicar(int a, int b) {
    	int resultado = a * b;
        return resultado; // Se puede devolver el resultado de una expresión directamente.
    }
	
    public static String crearSaludo(String nombre) {
        return "Bienvenido, " + nombre + "!";
    }
    
    
    //Método main
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String name = sc.nextLine();
		System.out.println("Introduce tu nombre segunda persona: ");
		String name2 = sc.nextLine();
		System.out.println("Introduce tu nombre tercera persona: ");
		String name3 = sc.nextLine();
		imprimirBienvenida();
		
		saludarUsuario(name);
		saludarUsuario(name2);
		saludarUsuario(name3);
		//No tiene por qué ser una varaible, tiene que ser un String
		saludarUsuario("Ana");
		
		int sum = sumar(4,7);


		imprimirDespedida();
		sc.close();
	}

}

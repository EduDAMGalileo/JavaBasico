package basicos;

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
        return a * b; // Se puede devolver el resultado de una expresión directamente.
    }
	
    public static String crearSaludo(String nombre) {
        return "Bienvenido, " + nombre + "!";
    }
    
    
    //Método main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

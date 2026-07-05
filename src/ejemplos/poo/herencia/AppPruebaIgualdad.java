package ejemplos.poo.herencia;

public class AppPruebaIgualdad {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Ana", 'X');
        Jugador j2 = new Jugador("Ana", 'X');

        // Prueba 1: Identidad física (Memoria)
        System.out.println("¿Mismo lugar en memoria? " + (j1 == j2)); 
        // Resultado: false

        // Prueba 2: Igualdad lógica (Contenido)
        System.out.println("¿Son el mismo jugador lógicamente? " + j1.equals(j2));
        // Resultado: true
    }
}
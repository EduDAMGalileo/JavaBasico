package ejemplos.poo;

public class AppHeroe {
    public static void main(String[] args) {
        Heroe miHeroe = new Heroe("Arturo", 50);

        System.out.println("Héroe: " + miHeroe.getNombre() + " | Salud: " + miHeroe.getSalud());

        // INTENTO 1: Curación excesiva (El Setter filtrará el dato)
        System.out.println("\nIntentando subir salud a 500...");
        miHeroe.setSalud(500); 
        System.out.println("Salud actual: " + miHeroe.getSalud()); // Mostrará 100

        // INTENTO 2: Daño mortal (El Setter filtrará el dato)
        System.out.println("\nRecibiendo ataque de -200 de daño...");
        miHeroe.setSalud(-200);
        System.out.println("Salud actual: " + miHeroe.getSalud()); // Mostrará 0

        // INTENTO 3: Cambio de nombre inválido
        System.out.println("\nIntentando borrar el nombre...");
        miHeroe.setNombre("");
        System.out.println("Nombre tras error: " + miHeroe.getNombre());
    }
}
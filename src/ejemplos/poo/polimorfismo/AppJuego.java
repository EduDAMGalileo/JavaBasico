package ejemplos.poo.polimorfismo;

import java.util.ArrayList;

public class AppJuego {
    public static void main(String[] args) {
        // UPCASTING: Creamos una lista de "Juego" (el tipo general)
        // pero dentro guardamos objetos de tipos específicos.
        ArrayList<Juego> misJuegos = new ArrayList<>();
        
        SuperMario sm = new SuperMario();
        misJuegos.add(sm); 
        misJuegos.add(new Sonic());     

        System.out.println("--- INICIANDO BIBLIOTECA DE JUEGOS ---");

        // PROCESAMIENTO UNIFICADO:
        for (Juego j : misJuegos) {
            // LIGADURA DINÁMICA: 
            // Aunque la variable 'j' es de tipo Juego, la JVM mira el objeto real.
            j.iniciar(); 
            System.out.println("------------------------------------");
        }
    }
}
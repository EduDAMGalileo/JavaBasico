package noTanBasicos.genericos;

import java.util.ArrayList;
import java.util.List;

public class AppPruebaInvarianza {

    public static void main(String[] args) {
        System.out.println("=== ESCENARIO 1: EL PELIGRO DE LOS ARRAYS (COVARIANZA) ===");
        probarArrays();

        System.out.println("\n=== ESCENARIO 2: LA SEGURIDAD DE LOS GENÉRICOS (INVARIANZA) ===");
        probarGenericos();
    }

    /**
     * Demuestra cómo los arrays permiten "engañar" al sistema, 
     * provocando un error crítico cuando la aplicación ya está funcionando.
     */
    public static void probarArrays() {
        Gato[] misGatos = { new Gato("Luna"), new Gato("Simba") };

        // El compilador PERMITE esto (Covarianza). 
        // Dice: "Si un Gato es un Animal, un array de Gatos es un array de Animales".
        Animal[] misAnimales = misGatos; 

        try {
            System.out.println("Intentando meter un Perro en un array que 'cree' ser de Animales...");
            
            // ¡DESASTRE! misAnimales[0] apunta realmente a un hueco que solo admite Gatos.
            // El compilador no nos avisa, pero la JVM detecta el sabotaje en ejecución y peta, lo capturamos con una excepción.
            misAnimales[0] = new Perro("Toby"); 

        } catch (ArrayStoreException e) {
            System.err.println("ERROR DETECTADO EN EJECUCIÓN: No puedes meter un Perro en un array de Gatos.");
            System.err.println("Tipo de error: " + e.getClass().getSimpleName());
        }
    }

    /**
     * Demuestra cómo los genéricos impiden el error antes de que ocurra.
     */
    public static void probarGenericos() {
        List<Gato> listaGatos = new ArrayList<>();
        listaGatos.add(new Gato("Luna"));

        // ESTÁNDAR DE SEGURIDAD (Invarianza):
        // La siguiente línea dará ERROR DE COMPILACIÓN si la descomentas.
        // List<Animal> listaAnimales = listaGatos; 

        /* 
           POR QUÉ NO COMPILA:
           Si Java permitiera que 'listaAnimales' apuntara a 'listaGatos', 
           podríamos hacer: listaAnimales.add(new Perro("Toby"));
           Eso contaminaría la lista original de gatos con un perro, y cuando 
           el dueño de la lista intentara hacer listaGatos.get(0).amasar(), 
           el sistema explotaría porque los perros no amasan.
        */

        System.out.println("Resultado: El compilador de Java ha impedido la asignación.");
        System.out.println("Una List<Gato> NO es una List<Animal>. Es INVARIANTE.");
    }
}
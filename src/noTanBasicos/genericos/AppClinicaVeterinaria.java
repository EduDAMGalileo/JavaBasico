package noTanBasicos.genericos;

import java.util.ArrayList;
import java.util.List;

public class AppClinicaVeterinaria {
	public static void main(String[] args) {

		// Creamos tres listas con diferentes niveles de "anchura"
		List<Gato> soloGatos = new ArrayList<>();
		soloGatos.add(new Gato("Luna"));
		soloGatos.add(new Gato("Simba"));

		List<Animal> listaAnimales = new ArrayList<>();
		listaAnimales.add(new Perro("Toby"));

		List<Object> listaObjetos = new ArrayList<>();

		System.out.println("=== TEST 1: hacerRuidoGeneral (Producer Extends) ===");
		// Este método acepta List<Animal> y List<Gato> porque ambas EXTIENDEN de Animal.
		// El método va a LEER, por tanto es un PRODUCTOR de animales.

		System.out.println("Llamando con lista de Gatos:");
		ClinicaVeterinaria.hacerRuidoGeneral(soloGatos); // Funciona por el ? extends

		System.out.println("\nLlamando con lista de Animales:");
		ClinicaVeterinaria.hacerRuidoGeneral(listaAnimales); // Funciona por el ? extends


		System.out.println("\n=== TEST 2: rescatarGato (Consumer Super) ===");
		// Este método acepta List<Gato>, List<Animal> y List<Object> porque 
		// todas son SUPERtipos de Gato. El método va a ESCRIBIR (consumir un gato).

		System.out.println("Añadiendo gato a lista de Gatos...");
		ClinicaVeterinaria.rescatarGato(soloGatos); // OK

		System.out.println("Añadiendo gato a lista de Animales...");
		ClinicaVeterinaria.rescatarGato(listaAnimales); // OK

		System.out.println("Añadiendo gato a lista de Objects...");
		ClinicaVeterinaria.rescatarGato(listaObjetos); // OK


		// --- ANÁLISIS FINAL ---
		System.out.println("\nResumen de la lista general de animales:");
		for (Animal a : listaAnimales) {
			System.out.println("- " + a.getNombre() + " (" + a.getClass().getSimpleName() + ")");
		}
		
		// ============================================================
        // CASOS PROHIBIDOS: EL COMPILADOR COMO GUARDIÁN
        // (Descomenta estas líneas para ver cómo Java protege tu código)
        // ============================================================

        System.out.println("\n=== ANALIZANDO RESTRICCIONES DE SEGURIDAD ===");

        // CASO 1: Incompatibilidad de jerarquía hacia arriba (Extends)
        //ClinicaVeterinaria.hacerRuidoGeneral(listaObjetos); 
        // POR QUÉ FALLA: Un 'Object' no garantiza tener el método 'emitirSonido()'.
        // El comodín '? extends Animal' exige que, como mínimo, sean Animales.


        // CASO 2: Incompatibilidad de jerarquía lateral (Super)
        //List<Perro> soloPerros = new ArrayList<>();
        // ClinicaVeterinaria.rescatarGato(soloPerros); 
        // POR QUÉ FALLA: No puedes meter un Gato en una lista de Perros. 
        // El comodín '? super Gato' solo acepta listas de Gatos, Animales u Objects.


        // CASO 3: Violación de la Invarianza pura
        // List<Animal> listaFalsa = soloGatos; 
        // POR QUÉ FALLA: Si Java lo permitiera, podrías hacer 'listaFalsa.add(new Perro())'
        // y habrías metido un perro en una lista de gatos. El compilador lo impide.


        System.out.println("Laboratorio finalizado: El compilador ha validado todas las reglas PECS.");

	}
}

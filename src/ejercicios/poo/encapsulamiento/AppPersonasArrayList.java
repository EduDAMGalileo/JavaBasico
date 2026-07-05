package ejercicios.poo.encapsulamiento;

import java.util.Scanner;
import java.util.ArrayList;

public class AppPersonasArrayList {
	public static void main (String[] args) {
		ArrayList<Persona> personas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for (int i=1; i<=3;i++) {
			String nombre;
			int edad;
			
			System.out.println("¿Cómo te llamas individuo número " + i + " ?");
			nombre=sc.nextLine();
			System.out.println("Y cuántos años tienes");
			edad=sc.nextInt();
			//Limpliamos ese intro que queda en el escaner
			sc.nextLine();
			
			Persona pers = new Persona(nombre, edad);
			personas.add(pers);			
		}

		System.out.println(personas.toString());
		
		//Otra forma de mostrarlos
		for (Persona persona : personas) {
			System.out.println("Soy " +  persona.getNombre() + " y tengo " + persona.getEdad() + " años");
			
			System.out.println(persona.toString());
		}
		
		//Ahora solo los mayores de edad
		for (int i=0; i<personas.size();i++) {
			if (personas.get(i).getEdad()>=18) {
				System.out.println(personas.get(i).toString());
			}
		}
		
		//Lo mismo que el anterior, pero con foreach
		for (Persona persona : personas) {
			if(persona.getEdad()>=18) {
				System.out.println(persona.toString());
			}
		}
		

	}

}

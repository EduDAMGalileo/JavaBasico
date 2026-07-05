package ejercicios.poo.encapsulamiento;

import java.util.Objects;

public class Persona {
	private String nombre;
	private int edad;

	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String toString() {
		return "Soy " + nombre + " y tengo " + edad + " años";
	}
	
}

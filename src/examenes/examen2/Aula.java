package examenes.examen2;

import java.util.ArrayList;

public class Aula {
	private String nombre;
	private int capacidad;
	private ArrayList<Alumno> alumnos;
	
	
	public Aula(String nombre, int capacidad) {
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.alumnos = new ArrayList<>();
	}
	
	public Aula(String nombre, int capacidad, ArrayList<Alumno> alumnos) {
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.alumnos = alumnos;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	
	public void añadirAlumno(Alumno alum) {
		if (alumnos.size()< capacidad) {
				alumnos.add(alum);
				System.out.println(alum.getNombre() + " se ha matriculado correctamente en el aula " + nombre);
			}
		else {
			System.out.println(alum.getNombre()  + " no se puede matricular, capacidad máxima excedida");
		}
	}

}

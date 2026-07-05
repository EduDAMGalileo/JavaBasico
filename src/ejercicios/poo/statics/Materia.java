package ejercicios.poo.statics;

import java.util.ArrayList;

public class Materia {
	private String nombre;
	private int codigoMateria;
	private ArrayList<Estudiante> estudiantes;
	
	private static String facultad="UVA";
	private static int numeroMatriculas=0;
	private static int genCodMateria=301;
	

	public Materia(String nombre) {
		this.nombre = nombre;
		this.codigoMateria=genCodMateria;
		this.estudiantes = new ArrayList<>();
		genCodMateria++;
	}
	
	public void matricularEstudiante(Estudiante estu) {
		estudiantes.add(estu);
		//Independiente
		numeroMatriculas++;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getCodigoMateria() {
		return codigoMateria;
	}
	
	public String getEstudiantes() {
		//Esto aún no funciona, necesitamos ver algo de herencia antes
		return estudiantes.toString();
	}
	
	public int numeroEstudiantes() {
		return estudiantes.size();
	}
	
	public static int getNumeroMatriculas() {
		return numeroMatriculas;
	}
	
	public static String getFacultad() {
		return Materia.facultad;
	}

	public static void setFacultad(String facultad) {
		Materia.facultad = facultad;
	}

	
	
}

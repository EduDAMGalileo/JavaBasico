package examen2;

import java.util.ArrayList;

public class Instituto {
	private String nombre;
	private ArrayList<Aula> aulas;
	private ArrayList<Persona> personal;
	
	public Instituto(String nombre) {
		this.nombre = nombre;
		this.aulas = new ArrayList<>();
		this.personal = new ArrayList<>();
	}
	
	public Instituto(String nombre, ArrayList<Aula> aulas, ArrayList<Persona> personal) {
		this.nombre = nombre;
		this.aulas = aulas;
		this.personal = personal;
	}

	//Resumen de personal
	public void estadisticaPersonal() {
		int numProfesores=0;
		int numAdministrativos=0;
		int numPersonalLimpieza=0;
		
		System.out.println("Recuento de personal, en total tenemos contratados " + personal.size());
		System.out.println("------------------------------------");
		
		for (Persona p : personal) {
			if (p instanceof Profesor) {
				numProfesores++;
			} else if (p instanceof Administrativo) {
				numAdministrativos++;
			} else if (p instanceof Limpieza) {
				numPersonalLimpieza++;
			}
		}
		
		System.out.println("De los cuales:");
		System.out.println("-Profesores: " + numProfesores);
		System.out.println("-Administrativos: " + numAdministrativos);
		System.out.println("-Limpieza: " + numPersonalLimpieza);

	}
	
	public void matricularAlumno(Alumno al, Aula a) {
		int numAula= aulas.indexOf(a);
		aulas.get(numAula).añadirAlumno(al);
	}
	
	//Búsqueda de notas
	public void filtroNotas(double corte) {
		for (Aula a: aulas) {
			System.out.println("\n Alumnos del aula " + a.getNombre() + " con nota mayor a " + corte);
			for (Alumno al : a.getAlumnos()) {
				if (al.getNotaMedia()> corte){
					System.out.println("Alumno " + al.getNombre() + " con un " + al.getNotaMedia());
				}
			}
		}
	}
	
	
	//Mejor alumno
	public void mejorAlumno() {
		double notaAlta=0;
		Alumno mejorAlumno = null;
		Aula aulaAlumno = null;
		
		for (Aula a: aulas) {
			//Iteramos sobre las aulas
			for (Alumno al: a.getAlumnos()) {
				//Iteramos sobre los alumnos de cada aula
				if ( mejorAlumno == null || al.getNotaMedia() > mejorAlumno.getNotaMedia());{
					mejorAlumno= al;
					aulaAlumno=a;
				}
			}
		}
		
		if (mejorAlumno != null) {
			System.out.println("El alumno con mejores notas está en " + aulaAlumno.getNombre() 
			+ " y se llama " + mejorAlumno.getNombre());	
		}
		
	}

	
	
	
	

}

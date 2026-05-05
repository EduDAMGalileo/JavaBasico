package examen2;

import java.util.ArrayList;

public class AppInstituto {

	public static void main(String[] args) {
		//Pruebas para ver si los objetos se crean bien
		Alumno al1 = new Alumno("1111111A", "Juan", 7.4 );
		al1.presentarse();
		
		Profesor prof1 = new Profesor("123455T", "Edu" , "Programación");
		prof1.presentarse();
		
		Administrativo admin1 = new Administrativo("12321s", "Pepe", "Secretaría", "Becario");
		admin1.presentarse();
		//Lo hacemos mejor con el personal al final...
		
		
		//Pruebas para controlar el aforo del aula

		Alumno al2 = new Alumno("2222222B", "Ana", 8.9);
		Alumno al3 = new Alumno("2222222B", "Roberto", 4.2);
		
		Aula aula1 = new Aula("INF2", 2);
		aula1.añadirAlumno(al1);
		aula1.añadirAlumno(al2);
		aula1.añadirAlumno(al3);
		
		//Creando Personal del instituto
		ArrayList<Persona> personal = new ArrayList<>();

		personal.add(prof1);
		personal.add(admin1);
		personal.add(new Profesor("123455T", "Carlos" , "Innovación"));
		personal.add(new Profesor("123455T", "David" , "Sistemas"));
		personal.add(new Profesor("123455T", "Celia" , "Inglés"));
		personal.add(new Limpieza("1sd3455T", "Pedro" , "Patio", "Tarde"));
		personal.add(new Administrativo("1sd3455T", "Alejandra" , "Secretaria", "Jefa"));
		//personal.add(new Alumno("1sd3455T", "Alejandra" , 9));
		
		//Comprobamos que se pueden presentar
		for (Persona p: personal) {
			p.presentarse();
		}
		
		//Aulas para el instituto
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(new Aula("INF3", 20));
		
		//Creo el instituto
		Instituto iesGalileo = new Instituto("IES Galileo", aulas, personal);
		iesGalileo.estadisticaPersonal();
		iesGalileo.matricularAlumno(al3, aulas.get(1));
		//aulas.get(1).añadirAlumno(al3);
		iesGalileo.filtroNotas(1);
		
		iesGalileo.mejorAlumno();
		
		Instituto iesRibera = new Instituto("IES Ribera");
		iesRibera.mejorAlumno();

	}

}

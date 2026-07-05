package ejemplos.poo;

public class Alumno {
	// Atributo de INSTANCIA (cada alumno tiene su nombre)
    private String nombre; 
    
    // Atributo ESTÁTICO (compartido por todos los alumnos)
    public static int contadorAlumnos = 0;

    public Alumno(String nombre) {
        this.nombre = nombre;
        // Cada vez que se crea un alumno, incrementamos el contador común
        contadorAlumnos++;
    }
}
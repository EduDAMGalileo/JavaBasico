package ejemplos.poo;

public class AppAlumnos {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Ana");
        System.out.println("Alumnos creados: " + Alumno.contadorAlumnos); 

        Alumno a2 = new Alumno("Luis");
        System.out.println("Alumnos creados: " + Alumno.contadorAlumnos); 
        
        //Esto está mal visto:
        System.out.println("no debería hacerlo desde aquí, pero... hay " + a1.contadorAlumnos + " alumnos");
        
        
        

    }
}

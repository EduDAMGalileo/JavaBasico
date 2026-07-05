package ejemplos.excepciones;

public class Persona {
    private int edad;

    public void setEdad(int nuevaEdad) {
        if (nuevaEdad < 0 || nuevaEdad > 120) {
            throw new IllegalArgumentException("La edad " + nuevaEdad + " no es válida.");
        }
        
        this.edad = nuevaEdad;
        System.out.println("Edad actualizada correctamente.");
    }
}
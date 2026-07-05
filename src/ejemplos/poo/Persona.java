package ejemplos.poo;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método que recibe OTRA instancia de la misma clase
    public void compararEdad(Persona otraPersona) {
        // ACCESO DIRECTO A ATRIBUTO PRIVADO:
        // 'this.edad' es accesible (es el objeto actual).
        // 'otraPersona.edad' TAMBIÉN es accesible aquí, aunque sea privado,
        // porque estamos escribiendo código DENTRO de la clase Persona.
        
        if (this.edad > otraPersona.edad) {
            System.out.println(this.nombre + " es mayor que " + otraPersona.nombre);
            System.out.print(this.nombre + " tiene " + this.edad + " años");
        } else if (this.edad < otraPersona.edad) {
            System.out.println(this.nombre + " es menor que " + otraPersona.nombre);
        } else {
            System.out.println("Ambos tienen la misma edad.");
        }
    }
}
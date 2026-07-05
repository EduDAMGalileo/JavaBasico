package ejemplos.poo;

public class Heroe {
    private String nombre;
    private int salud; 

    // CONSTRUCTOR
    public Heroe(String nombre, int saludInicial) {
    	// Usamos los setters incluso en el constructor, aunque es una práctica pelogrosa, pero nos aseguramos de que los datos son válidos
        setNombre(nombre);       
        setSalud(saludInicial);
    }

    // --- GETTER Y SETTER PARA EL NOMBRE ---
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
            this.nombre = nuevoNombre;
        } else {
        	 // Valor por defecto si hay error
            this.nombre = "Héroe Desconocido";
        }
    }

    // --- GETTER Y SETTER PARA LA SALUD---
    public int getSalud() {
        return salud;
    }

    public void setSalud(int nuevaSalud) {
        if (nuevaSalud > 100) {
        	// Capamos el máximo (no vida infinita)
            this.salud = 100; 
            System.out.println("Aviso: La salud no puede superar 100. Ajustado a 100.");
        } else if (nuevaSalud < 0) {
        	// Capamos el mínimo (no vida negativa)
            this.salud = 0;   
            System.out.println("Aviso: El héroe ha muerto. Salud ajustada a 0.");
        } else {
        	// Valor válido
            this.salud = nuevaSalud; 
        }
    }
}
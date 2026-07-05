package ejemplos.poo;

public class Usuario {
    private String nombre;
    private String email;
    private int nivel;

    // 1. CONSTRUCTOR COMPLETO
    // Se usa cuando tenemos toda la información.
    public Usuario(String nombre, String email, int nivel) {
        this.nombre = nombre;
        this.email = email;
        this.nivel = nivel;
    }

    // 2. CONSTRUCTOR PARCIAL
    // Se usa cuando un usuario nuevo se registra (empieza en nivel 1 por defecto).
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.nivel = 1;
    }

    // 3. CONSTRUCTOR "ANÓNIMO"
    // Se usa para invitados o usuarios que no quieren dar su nombre aún.
    public Usuario(String email) {
        this.nombre = "Invitado";
        this.email = email;
        this.nivel = 1;
    }

    // Getters para mostrar los resultados
    public String getInfo() {
        return "Usuario: " + nombre + " | Email: " + email + " | Nivel: " + nivel;
    }
}
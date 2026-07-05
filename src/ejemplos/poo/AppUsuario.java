package ejemplos.poo;

public class AppUsuario {
    public static void main(String[] args) {
        // Caso A: Tenemos todos los datos (Admin)
        Usuario user1 = new Usuario("Admin", "admin@web.com", 99);

        // Caso B: Usuario estándar que se registra hoy
        Usuario user2 = new Usuario("Lucía", "lucia@mail.com");

        // Caso C: Solo tenemos el email (Rápido)
        Usuario user3 = new Usuario("anonimo@mail.com");

        System.out.println(user1.getInfo());
        System.out.println(user2.getInfo());
        System.out.println(user3.getInfo());
    }
}

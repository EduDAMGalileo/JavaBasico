package ejemplos.poo.polimorfismo;

public class SuperMario extends Juego {
    public SuperMario() {
        super("Super Mario");
    }

    @Override
    public void iniciar() {
        super.iniciar(); // Usamos la lógica del padre
        System.out.println("Dibujando tuberías y escondiendo las setas");
    }
}


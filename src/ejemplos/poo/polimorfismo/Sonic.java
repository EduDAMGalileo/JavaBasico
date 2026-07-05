package ejemplos.poo.polimorfismo;

public class Sonic extends Juego {
    public Sonic() {
        super("Sonic the Hedgehog");
    }

    @Override
    public void iniciar() {
        super.iniciar();
        System.out.println("Calentando piernas y colocando anillos");
    }
}

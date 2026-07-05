package ejemplos.poo.herencia;

public class Coche2 extends Vehiculo2 {
    private int cilindrada;

    public Coche2(String marca, int cilindrada) {
        // Delegamos la inicialización de 'marca' al padre
        super(marca); 
        
        // Inicializamos lo específico de la hija
        this.cilindrada = cilindrada; 
    }
}
package ejemplos.poo.herencia;

public class MensajeDeEmail extends Mensaje {
    
    public MensajeDeEmail(String texto) {
        super(texto);
    }

    // ANULACIÓN: Proporcionamos una lógica específica para Email
    @Override
    public void enviar() {
        System.out.println("Enviando vía Servidor SMTP: " + this.texto);
    }
}

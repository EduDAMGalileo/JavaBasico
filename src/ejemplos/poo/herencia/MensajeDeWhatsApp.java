package ejemplos.poo.herencia;

public class MensajeDeWhatsApp extends Mensaje {
	
    public MensajeDeWhatsApp(String texto) {
        // Invocamos al constructor del padre para inicializar el texto
        super(texto);
    }
    
	// Reimplementamos el método para adaptarlo a la plataforma
	public void enviar() {
		System.out.println("Enviando vía WhatsApp (cifrado extremo a extremo): " + this.texto);
	}
}
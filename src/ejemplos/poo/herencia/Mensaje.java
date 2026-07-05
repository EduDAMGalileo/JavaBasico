package ejemplos.poo.herencia;


public class Mensaje {
	protected String texto;
	
    public Mensaje(String texto) {
        this.texto = texto;
    }


	public void enviar() {
		System.out.println("Enviando mensaje genérico: " + texto);
	}
}



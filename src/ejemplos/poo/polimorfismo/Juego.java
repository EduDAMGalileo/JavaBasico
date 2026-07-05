package ejemplos.poo.polimorfismo;

public class Juego {
    private String titulo;

    public Juego(String titulo) {
        this.titulo = titulo;
    }

    public void iniciar() {
        System.out.println("Cargando el juego: " + titulo + "...");
    } 
    
    public String getTitulo() {
    	return titulo; 
    	}
}
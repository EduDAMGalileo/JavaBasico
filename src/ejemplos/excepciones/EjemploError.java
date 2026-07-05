package ejemplos.excepciones;

public class EjemploError {
    public static void main(String[] args) {
        // Se inicia la llamada al método recursivo
        metodoInfinito();
    }

    public static void metodoInfinito() {
        // El método se llama a sí mismo sin fin, agotando la pila de llamadas
        metodoInfinito(); 
    }
}

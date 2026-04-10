package laboratorios.excepciones;

public class StockInsuficienteException extends RuntimeException { 
	private static final long serialVersionUID = 1L;
	
    public StockInsuficienteException(String producto, int pedido, int disponible) { 
        super("Stock insuficiente para '" + producto + "': " 
              + "pedido=" + pedido + ", disponible=" + disponible); 
    } 

} 
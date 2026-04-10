package laboratorios.excepciones;

public class PrecioInvalidoException extends RuntimeException { 
	
	private static final long serialVersionUID = 1L;
	
    public PrecioInvalidoException(double precio) { 
        super("Precio inválido: " + precio + ". Debe ser mayor que 0."); 
    } 

} 
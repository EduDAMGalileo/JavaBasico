package noTanBasicosEjercicios.excepciones;

public class CantidadInsufienteException extends Exception{

	private static final long serialVersionUID = 1L;

	public CantidadInsufienteException() {
		super();
	}

	public CantidadInsufienteException(String message) {
		super(message);
	}
	
}

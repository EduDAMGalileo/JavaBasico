package laboratorios.javadoc;

public class Documentacion {

	
	//Hola soy un comentario de una línea
	
	/*
	  Hola hola 
	  Yo soy multilínea
	 */
	
	
	/**
	 * Calcula el área de un círculo.
	 * @param radio El radio del círculo en metros. Debe ser positivo.
	 * @return El área calculada en metros cuadrados.
	 */
	public double calcularArea(double radio) {
	    // Usamos la fórmula A = pi * r^2.
	    // Math.PI proporciona mayor precisión que usar 3.1416 manualmente.
	    return Math.PI * Math.pow(radio, 2);
	}

	
	/**
	 * Calcula el precio final con descuento.
	 * 
	 * @param precioBase El precio original del producto. No puede ser negativo.
	 * @param porcentajeDescuento El descuento a aplicar (0-100).
	 */
	public double calcularPrecio(double precioBase, int porcentajeDescuento) {
		return porcentajeDescuento;
	    // ... lógica del método ...
	}
	
	
	/**
	 * Busca un cliente por su número de identificación.
	 * 
	 * @param id El identificador único del cliente.
	 * @return El objeto Cliente si se encuentra; null si no existe ningún cliente con ese ID.
	 */
	public int buscarCliente(String id) {
		return 0;
	    // ...
	}
	
	
	/**
	 * Divide dos números enteros.
	 * 
	 * @param dividendo El número a dividir.
	 * @param divisor El número por el cual se divide.
	 * @return El cociente de la división.
	 * @throws ArithmeticException Si el divisor es 0.
	 */
	public int dividir(int dividendo, int divisor) {
	    if (divisor == 0) {
	        throw new ArithmeticException("No se puede dividir por cero");
	    }
	    return dividendo / divisor;
	}
	
	
	/**
	 * Gestor de conexiones a la base de datos.
	 * Implementa el patrón Singleton para garantizar una única instancia.
	 * 
	 * @author Eduardo Niévares <enievares@galileo.com>
	 * @version 1.2 (2025-12-21)
	 */
	public class GestorConexiones {
	    // ...
	}
	
	
	/**
	 * Guarda los datos del usuario en un fichero local.
	 * 
	 * @param datos La información a guardar.
	 * @see #guardarEnNube(String)
	 * @deprecated Este método es inseguro y lento. 
	 *             Utilizar en su lugar {@link #guardarEnNube(String)}.
	 */
	@Deprecated
	public void guardarEnDisco(String datos) {
	    // ... implementación obsoleta ...
	}

	/**
	 * Guarda los datos del usuario de forma segura en el servidor remoto.
	 * 
	 * @param datos La información a guardar.
	 */
	public void guardarEnNube(String datos) {
	    // ... nueva implementación ...
	}
}

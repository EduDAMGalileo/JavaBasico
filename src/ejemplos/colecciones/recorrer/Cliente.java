package ejemplos.colecciones.recorrer;

public class Cliente {
	private String nombre;
	private boolean esMoroso;

	public Cliente(String nombre, boolean esMoroso) {
		this.nombre = nombre;
		this.esMoroso = esMoroso;
	}

	public String getNombre() { 
		return nombre; 
	}

	public boolean isMoroso() { 
		return esMoroso; 
	}

	public void perdonarDeuda() { 
		this.esMoroso = false; 
	}
	
	@Override
    public String toString() { 
		return nombre; 
	} // Para facilitar la impresión
	
}
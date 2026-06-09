package noTanBasicosEjercicios.genericos;

public class Cajon<T> {
	private T contenido;
	
	public boolean estaVacio() {
		/*if (contenido == null) {
			return true;
		}
		return false;
		*/
		return contenido == null;
	}
	
	public void guardar(T contenido) {
		this.contenido=contenido;
	}
	
	public T extraer () {
		if (contenido!=null) {
			T cosa = contenido;
			contenido = null;
			return cosa;	
		}
		throw new IllegalStateException("El cajón está vacío");
		
	}
}

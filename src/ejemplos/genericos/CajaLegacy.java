package ejemplos.genericos;

//MALA PRÁCTICA: 
//Uso de Object para lograr flexibilidad.
public class CajaLegacy {
	private Object contenido;

	public void guardar(Object contenido) { 
		this.contenido = contenido; 
	}

	public Object obtener() { 
		return contenido; 
	}
}




package noTanBasicos.genericos;

//ESTÁNDAR DE LA INDUSTRIA: 
//Diseño de una clase genérica parametrizada. 
//Una única clase sirve para todos los tipos actuales y futuros.

public class Caja<T> {

	// 'T' actúa como el tipo de dato para el atributo, los parámetros y el retorno.
	private T contenido;

	public void guardar(T nuevoContenido) {
		this.contenido = nuevoContenido;
	}

	public T obtener() {
		return this.contenido;
	}
}

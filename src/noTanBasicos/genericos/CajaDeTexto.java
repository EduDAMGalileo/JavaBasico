package noTanBasicos.genericos;

//MALA PRÁCTICA (Diseño redundante): 
//Crear una clase específica para cada tipo de dato. 
//Si mañana necesitamos una para 'Tarea', tendremos que volver a duplicar código.

public class CajaDeTexto {
	private String contenido;
	
	public void guardar(String c) { 
		this.contenido = c; 
	}
	
	public String obtener() { 
		return contenido; 
	}
}


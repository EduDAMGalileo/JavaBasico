package noTanBasicos.genericos;

//Aquí ocurre lo mismo que con CajaDeTexto
public class CajaDeEnteros {
	private Integer contenido;
	
	public void guardar(Integer c) {
		this.contenido = c; 
	}
	
	public Integer obtener() { 
		return contenido; 
	}
}

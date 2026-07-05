package ejercicios.poo.abstraccion;

public class Perfil{
	private String nombre;
	private int edad;


	public Perfil(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
}
package ejercicios.poo.statics;

public class Estudiante {
	private String nombre;
	private int numMatricula;
	
	private static int siguienteMatricula=1001;

	public Estudiante(String nombre) {
		this.nombre = nombre;
		this.numMatricula=siguienteMatricula;
		siguienteMatricula++;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public static int getSiguienteMatricula() {
		return siguienteMatricula;
	}
	

}

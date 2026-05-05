package examen2;

public class Profesor extends Persona{
	private String materia;

	public Profesor(String dni, String nombre, String materia) {
		super(dni, nombre);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public void presentarse() {
		System.out.println("Hola, soy un profesor, me llamo " + this.getNombre() + 
				" y doy: " + materia);
		
	}
	
	
	
	
	
	

}

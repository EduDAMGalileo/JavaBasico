package examenes.examen2;

public class Alumno extends Persona{
	
	private double notaMedia;
	
	public Alumno(String dni, String nombre) {
		super(dni, nombre);
		this.notaMedia=0;
	}
	
	public Alumno(String dni, String nombre, double notaMedia) {
		super(dni, nombre);
		this.notaMedia = notaMedia;
	}
	
	public double getNotaMedia() {
		return notaMedia;
	}
	
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public void presentarse() {
		System.out.println("Hola, soy un alumno, me llamo " + this.getNombre() + 
				" y mi nota media es: " + notaMedia);
		
	}
	
	

}

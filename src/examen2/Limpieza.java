package examen2;

public class Limpieza extends PAS{
	private String horario;
	
	public Limpieza(String dni, String nombre, String zona, String horario) {
		super(dni, nombre, zona);
		this.horario = horario;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public void presentarse() {
		System.out.println("Hola, soy encargado de la limpieza, me llamo " + this.getNombre() + 
				" mi horario es de : " + horario + " y estoy en la zona " + this.getZona());
		
	}
	
	

}

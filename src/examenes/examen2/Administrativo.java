package examenes.examen2;

public class Administrativo extends PAS{
	private String puesto;

	public Administrativo(String dni, String nombre, String zona, String puesto) {
		super(dni, nombre, zona);
		this.puesto = puesto;
	}

	public String getPuesto() {
		return puesto;
	}

	@Override
	public void presentarse() {
		System.out.println("Hola, soy un administrativo, me llamo " + this.getNombre() + 
				" mi puesto es de : " + puesto + " y estoy en la zona " + this.getZona());
		
	}
	

}

package examen1Final;

public class Reparacion {
	private Reparable elemento;
	private String descripcion;
	private double horas;
	private double costeMateriales;
	private double costeReparacion;
	private double costePorHora;
	
	public Reparacion(Reparable elemento, String descripcion, double horas, double costeMateriales, double precioPorHora) {
		this.elemento = elemento;
		this.descripcion = descripcion;
		this.horas = horas;
		this.costeMateriales = costeMateriales;
		//Enviamos el coste por hora del taller, ya que puede cambiar en el tiempo.
		this.costePorHora = precioPorHora;
		//Realizo el calculo cuando creo la reparación
		this.costeReparacion = calcularCoste();
	}
	
	public Reparable getElemento() {
		return elemento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getCosteReparacion() {
		return costeReparacion;
	}


	@Override
	public String toString() {
		return "Reparacion [elemento=" + elemento + ", descripcion=" + descripcion + ", horas=" + horas
				+ ", costeMateriales=" + costeMateriales + ", costeReparacion=" + costeReparacion + "]";
	}
	
	private double calcularCoste() {
		//Fase 1
		double costeBase= (horas * costePorHora) + costeMateriales;
		
		//Fase 2, se calcula en el elemento reparable, pero se almacena en la reparación
		//A este método se le llama desde el constructor
		return elemento.costeFinal(costeBase);
		
	}
	
	
	
	

}

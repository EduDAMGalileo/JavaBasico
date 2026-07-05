package examenes.examen;

public class Habitacion {
	private String uso;
	private double metrosCuadrados;
	private double numVentanas;
	
	public Habitacion(String uso, double metrosCuadrados, double numVentanas) {
		this.uso = uso;
		this.metrosCuadrados = metrosCuadrados;
		this.numVentanas = numVentanas;
	}

	public String getUso() {
		return uso;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public double getNumVentanas() {
		return numVentanas;
	}

	@Override
	public String toString() {
		return "Habitacion [uso=" + uso + ", metrosCuadrados=" + metrosCuadrados + ", numVentanas=" + numVentanas + "]";
	}
	
	
	
	
	
	
	

}

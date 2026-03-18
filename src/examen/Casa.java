package examen;

import java.util.ArrayList;

public final class Casa extends Inmueble{
	private int numHabitaciones;
	private int numPisos;
	private int numBaños;
	private ArrayList<Habitacion> habitaciones = new ArrayList<>();
	
	public Casa(String id, String direccion, double precioVenta, double metrosCuadrados, int numHabitaciones,
			int numPisos, int numBaños) {
		super(id, direccion, precioVenta, metrosCuadrados);
		this.numHabitaciones = numHabitaciones;
		this.numPisos = numPisos;
		this.numBaños = numBaños;
	}
	
	public void anadirHabitacion (Habitacion h) {
		if (habitaciones.size()>=numHabitaciones) {
			System.out.println ("Hemos llegado al máximo de habitaciones");
		} else {
			habitaciones.add(h);
		}
	}
	
	public void infoVentanasHabitacion(int i) {
		System.out.println(habitaciones.get(0).getNumVentanas());
	}

	@Override
	public String toString() {
		return "Casa [numHabitaciones=" + numHabitaciones + ", numPisos=" + numPisos + ", numBaños=" + numBaños
				+ ", habitaciones=" + habitaciones + "]";
	}

}

package examenes.examen;

import java.util.Objects;

public abstract sealed class Inmueble permits Casa, LocalComercial {
	private String id;
	private String direccion;
	private double precioVenta;
	private double metrosCuadrados;
	
	
	public Inmueble(String id, String direccion, double precioVenta, double metrosCuadrados) {
		this.id = id;
		this.direccion = direccion;
		this.precioVenta = precioVenta;
		this.metrosCuadrados = metrosCuadrados;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inmueble other = (Inmueble) obj;
		return Objects.equals(id, other.id);
	}


	public String getId() {
		return id;
	}


	public String getDireccion() {
		return direccion;
	}


	public double getPrecioVenta() {
		return precioVenta;
	}


	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}


	@Override
	public String toString() {
		return "[id=" + id + ", direccion=" + direccion + ", precioVenta=" + precioVenta + ", metrosCuadrados="
				+ metrosCuadrados;
	}
	
	
	
	

}

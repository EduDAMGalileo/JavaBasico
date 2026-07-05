package ejemplos.poo.registros;

//MALA PRÁCTICA / CÓDIGO HEREDADO: 
//Un POJO tradicional asfixiado por el "Boilerplate".

import java.util.Objects;

public class CoordenadaLegacy {

	private double latitud;
	private double longitud;

	// Constructor
	public CoordenadaLegacy(double latitud, double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}

	//Getters y Setters (Ruido visual)
	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	//Sobrescritura de equals y hashCode (Propensos a errores)
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CoordenadaLegacy that = (CoordenadaLegacy) o;
		return Double.compare(that.latitud, latitud) == 0 &&
				Double.compare(that.longitud, longitud) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(latitud, longitud);
	}

	//Sobrescritura de toString (Para poder leer el objeto en los logs)
	@Override
	public String toString() {
		return "CoordenadaLegacy{" +
				"latitud=" + latitud +
				", longitud=" + longitud +
				'}';
	}
}

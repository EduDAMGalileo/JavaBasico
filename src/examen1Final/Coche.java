package examen1Final;

import java.util.Objects;

public class Coche extends Vehiculo{
	private String tipoCombustible;

	public Coche(String matricula, String tipoCombustible) {
		super(matricula);
		
		if (!tipoCombustible.equals("Gasolina") && !tipoCombustible.equals("Diésel") 
				&& !tipoCombustible.equals("Eléctrico")) {
			throw new IllegalArgumentException("Tipo de vehículo no permitido");
		}
		this.tipoCombustible = tipoCombustible;
		
	}
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(tipoCombustible);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(tipoCombustible, other.tipoCombustible);
	}




	@Override
	public double costeFinal(double costeBase) {
		switch (tipoCombustible) {
			case "Gasolina":{
				return costeBase;
			}
			case "Eléctrico":{
				return costeBase*1.2;
			}
			case "Diésel":{
				return costeBase+15;
			}
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Coche [ matricula: " + this.getMatricula() + " tipoCombustible=" + tipoCombustible + "]";
	}
	
	
	
	

}

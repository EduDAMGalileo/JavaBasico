package examenes.examen;

public final class LocalComercial extends Inmueble{
	private boolean salidaHumos;

	public LocalComercial(String id, String direccion, double precioVenta, double metrosCuadrados, boolean salidaHumos) {
		super(id, direccion, precioVenta, metrosCuadrados);
		this.salidaHumos=salidaHumos;
	}

	public boolean isSalidaHumos() {
		return salidaHumos;
	}

	@Override
	public String toString() {
		String cadenaAMostrar="LocalComercial";
		cadenaAMostrar += super.toString();
		cadenaAMostrar += cadenaAMostrar + " salidaHumos= ";
		String hay= (salidaHumos==true)? "Sí " : "No";
		return cadenaAMostrar + hay;
	}
	
	
	
	

}

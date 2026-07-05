package ejercicios.poo.abstraccion;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Suscripcion {
	private String nombreUsuario;
	private final double precioBase;
	private ArrayList<Perfil> perfiles = new ArrayList<>();
	
	public Suscripcion(String nombreUsuario, double precioBase) {
		this.nombreUsuario=nombreUsuario;
		if (precioBase < 0) {
			//Si intentan engañarnos que paguen!!
			this.precioBase=100;
		}else {
			this.precioBase=precioBase;	
		}
		
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(nombreUsuario);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Suscripcion other = (Suscripcion) obj;
		return Objects.equals(nombreUsuario, other.nombreUsuario);
	}



	public double getPrecioBase() {
		return precioBase;
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	protected abstract double calcularPrecio();
	
	protected abstract int getMaxPerfiles();
	
	protected void anadirPerfil(Perfil p) {
		if (getPerfiles().size() >= getMaxPerfiles()) {
			System.out.print("Tu lista está llena, no puedes añadir más perfiles");
		} else {
			getPerfiles().add(p);
		}
		
	}

	protected ArrayList<Perfil> getPerfiles() {
		return perfiles;
	}

	
}

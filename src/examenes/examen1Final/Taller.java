package examenes.examen1Final;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Taller {
	private String nombre;
	private double precioPorHora;
	private ArrayList<Reparacion> reparaciones;
	
	public Taller(String nombre, double precioPorHora) {
		this.nombre = nombre;
		this.precioPorHora = precioPorHora;
		this.reparaciones = new ArrayList<>();
	}
	
	public void reparar(Reparacion averia) {
		reparaciones.add(averia);
		
	}

	public ArrayList<Reparacion> getReparaciones() {
		return reparaciones;
	}
	
	private boolean existeReparable(String id) {
		for (Reparacion r : reparaciones) {
			if (id.equals(r.getElemento().getIdentificador())) {
				return true;
			}
		}
		return false;
	}
	
	public void generarInforme(String id) throws NoHayReparacionesException{
		//si no hay elementos
		FileWriter fichero;
		PrintWriter escritor = null;	
		//Esto se hace mejor con Streams, pero no los hemos visto
		
		if (existeReparable(id)) {
			try {
				fichero = new FileWriter("informe_" + id + ".txt");
				escritor = new PrintWriter (fichero);
				escritor.println(nombre + " INFORME");
				escritor.println("Cliente: " + id);
				escritor.println("---------------");
				double total=0;
				for (Reparacion r : reparaciones) {
					if (id.equals(r.getElemento().getIdentificador())) {
						escritor.println("Avería " + r.getDescripcion());
						escritor.println("Coste de la reparación " + r.getCosteReparacion());
						total+=r.getCosteReparacion();
					}
				}
				escritor.println("------------");
				escritor.println ("Total facturado: " + total);	
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (escritor != null) {
					escritor.close();
				}
			}
		}
		
		else {
			throw new NoHayReparacionesException("No hay reparaciones con identificador" + id);	
		}
		
		
	}

	public double getPrecioPorHora() {
		return precioPorHora;
	}
	
	

	
	
	
	

}

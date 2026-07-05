package examenes.examen;

import java.util.ArrayList;

public class Muestra {
	private String nombre;
	private ArrayList<Integer> muestras;
	
	public Muestra(String nombre) {
			this.nombre = nombre;
			this.muestras = new ArrayList<>(); 
	}
	
	public Muestra(String nombre, int[] muestras) {
		this(nombre);
		for (int i=0 ; i < muestras.length; i++) {
			this.muestras.add(muestras[i]);
		}
	}
	
	public Muestra(String nombre, ArrayList<Integer> muestra) {
		this(nombre);
		for (Integer m : muestra) {
			this.muestras.add(m);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Integer> getMuestras() {
		return muestras;
	}
	
	public void añadirMuestra (int nuevoDato) {
		muestras.add(nuevoDato);
	}
	
	

}

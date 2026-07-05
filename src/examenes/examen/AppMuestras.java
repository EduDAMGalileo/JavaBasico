package examenes.examen;

import java.util.ArrayList;

public class AppMuestras {

	public static void main(String[] args) {
		Muestra m = new Muestra("Muestra de prueba");
		
		m.añadirMuestra(4);
		m.añadirMuestra(1);
		m.añadirMuestra(2);
		m.añadirMuestra(2);
		m.añadirMuestra(2);
		m.añadirMuestra(2);
		m.añadirMuestra(7);
		m.añadirMuestra(20);
		
		System.out.println(m.getNombre() + " " + m.getMuestras() + 
				". Su media es: " + Estadisticas.media(m) + " y la moda " + Estadisticas.moda(m));
		
		int[] muestraArray= {2,3,4,6,6,7,3,5,1,7,7};
		Muestra mArray = new Muestra ("Muestra desde array", muestraArray);
		
		System.out.println(mArray.getNombre() + " " + mArray.getMuestras() 
		+ " " + Estadisticas.media(mArray) + " y la moda " + Estadisticas.moda(mArray));
		
		ArrayList<Integer> muestraArrayList = new ArrayList<>();
		muestraArrayList.add(1);
		muestraArrayList.add(2);
		muestraArrayList.add(3);
		muestraArrayList.add(4);
		muestraArrayList.add(5);
		muestraArrayList.add(6);
		
		Muestra mArrayList = new Muestra ("Con un ArrayList", muestraArrayList);

		System.out.println(mArrayList.getNombre() + " " + mArrayList.getMuestras() 
		+ " " + Estadisticas.media(mArrayList) + " y la moda " + Estadisticas.moda(mArrayList));
		
		
		Estadisticas.moda(m);
	}

}


package examenes.examen;

import java.util.ArrayList;

public class Estadisticas {
	
	public static double media (Muestra m) {
		ArrayList<Integer> muestra = m.getMuestras();
		int suma=0;
		for (Integer i : muestra) {
			suma+=i;
		}
		return (double) suma/muestra.size();
	}
	
	public static int moda(Muestra m) {
		ArrayList<Integer> muestra = m.getMuestras();
		int numModa=0;
		int numAparicionesMaximas=0;
		for (int i=0;i<muestra.size()-1;i++) {
			//System.out.println ("Vamos a mirar cuantas veces sale el: "+ muestra.get(i));
			int numero=muestra.get(i);
			int numApariciones=1;
			for (int j=i+1; j<muestra.size(); j++) {
				//System.out.println("Comparo " + numero + " con " + muestra.get(j));
				if(numero==muestra.get(j)) {
					//System.out.println("Son iguales");
					numApariciones++;
				}
			}
			
			if (numAparicionesMaximas < numApariciones) {
				numModa=numero;
				numAparicionesMaximas=numApariciones;
			}
				
		}
		return numModa;
	}
}

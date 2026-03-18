package examen;

import java.util.ArrayList;

public class AppInmobiliaria {

	public static void main(String[] args) {
		ArrayList<Inmueble> inmuebles = new ArrayList<>();
		
		inmuebles.add(new LocalComercial("L001", "Calle A, 1ºB", 2000000, 150, false));
		inmuebles.add(new Casa("C001", "Calle B, 2ºC", 1500000, 200, 3,1,2));
		inmuebles.add(new Casa("C001", "Calle B, 3ºC", 1500000, 200, 3,1,2));
		
		Casa c = (Casa) inmuebles.get(1);
		c.anadirHabitacion(new Habitacion ("Estudio",2, 10));
		
		((Casa) inmuebles.get(1)).anadirHabitacion(new Habitacion ("Habitacion principal",2, 15));
		
		for (Inmueble i : inmuebles) {
			System.out.println( i.toString());
		}
		
		System.out.println("¿Con iguales? " + (inmuebles.get(1).equals(inmuebles.get(2))));
		
		Habitacion hab = new Habitacion("Salon",3,14);
		hab.getNumVentanas();
		hab.getUso();
	}

}

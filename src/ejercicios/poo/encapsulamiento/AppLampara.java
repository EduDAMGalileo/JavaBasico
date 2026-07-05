package ejercicios.poo.encapsulamiento;

public class AppLampara {

	public static void main(String[] args) {
		Lampara lamparaIkea = new Lampara("Blanca", "IKEA");
		Lampara lamparaPhillips = new Lampara("Roja", "Phillips");
		
		lamparaIkea.estado();
		
		lamparaPhillips.encender();
		lamparaPhillips.estado();
		
		lamparaPhillips.apagar();
		lamparaPhillips.estado();
		

	}

}

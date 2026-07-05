package ejemplos.poo.interfaces;


public class AppAnimales {

	public static void main(String[] args) {
		Animales a = new Perro ("Toby", 5);
		Animales b = new Aguila ("Fenix", 2);
			
		a.hacerSonido();
		a.respirar();
		
		b.hacerSonido();
		b.respirar();

		Avion av = new Avion("RF4452");
		
		ejecutarVuelo((Aguila)b, 30);
		ejecutarVuelo(av, 1500);
		
		
		Pato patoPato = new Pato("Donald", 35);
		Volador patoVolador = new Pato ("Lucas", 30);
		Nadador patoNadador = new Pato ("Gilito", 60);
		
		Volador avionVolador = new Avion ("F15");
		
		//ejecutarNado((Nadador)avionVolador, 300);
		
		ejecutarNado(patoPato, 50);
		ejecutarNado((Nadador)patoVolador, 400);
		ejecutarNado(patoNadador, 400);
		
		
	}

	public static void ejecutarNado (Nadador n, int metros) {
		System.out.println("Iniciando el curso de natación:");
		n.zambullirse();
		n.nadar(metros);
		n.salirDelAgua();
		System.out.println(" A por la toalla:");	
	}
	
	public static void ejecutarVuelo (Volador v, int metros) {
		System.out.println("Iniciando el vuelo:");
		v.despega();
		v.volar(metros);
		v.aterrizar();
		System.out.println("fin del trayecto:");	
	}
	
	

}

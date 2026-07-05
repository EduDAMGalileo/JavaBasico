package ejercicios.poo.encapsulamiento;

public class AppTermometro {

	public static void main(String[] args) {
		Termometro termSalon = new Termometro(400, "Infrarrojos");
		System.out.println ("En el salón hace " + termSalon.getTemperatura() 
			+ " grados, según el termómetro de " + termSalon.getTipo());
		
		termSalon.setTemperatura(2000);
		System.out.println ("En el salón hace " + termSalon.getTemperatura() 
			+ " grados");
	}

}

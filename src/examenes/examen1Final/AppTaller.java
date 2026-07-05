package examenes.examen1Final;

public class AppTaller {
	public static void main(String[] args) {
		Coche coche1;
		Coche coche2;
		try {
			 coche1 = new Coche("1111-AAA", "Gasolina");
			//coche2 = new Coche("1111-AAA", "Agua");	
			System.out.println (coche1.toString());
			//System.out.println (coche2.toString());
		} catch (IllegalArgumentException e) {
			System.out.print(e.getMessage());
		}
		
		Moto moto1 = new Moto("2222-BBB", 250);
		Camion camion1 = new Camion("3333-CCC", 3500.00);
		
		Dispositivo tablet = new Dispositivo("tablet-000");
		
		Taller multiFix = new Taller("Multi-fix", 40.0);
		
		multiFix.reparar(new Reparacion(moto1, "Cambio de aceite", 1, 20, multiFix.getPrecioPorHora()));
		multiFix.reparar(new Reparacion(moto1, "Arreglar pinchazo", 2, 10, multiFix.getPrecioPorHora()));
		multiFix.reparar(new Reparacion(tablet, "Cambio de pantalla", 1, 15, multiFix.getPrecioPorHora()));
		
		System.out.println(multiFix.getReparaciones().get(0));
		System.out.println(multiFix.getReparaciones().get(1));
		
		try {
			multiFix.generarInforme("2222-BBB");
			multiFix.generarInforme("tablet-000");
			multiFix.generarInforme("2222-CCC");
		} catch (NoHayReparacionesException e) {
			System.out.println (e.getMessage());
		}

	}
	
}


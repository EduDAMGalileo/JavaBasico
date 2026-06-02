package noTanBasicosEjercicios.enumeraciones;

public class AppTamañoPizza {
	public static void main (String[] args) {
		TamañoPizza peq = TamañoPizza.PEQUEÑA;
		TamañoPizza med = TamañoPizza.MEDIANA;
		TamañoPizza fam = TamañoPizza.FAMILIAR;
		

		for (TamañoPizza t :TamañoPizza.values()) {
			System.out.printf ("\nEl tamaño %s con un área de %.2f y un precio de %.2f", t.name(), t.calcularArea(),t.getPrecioBase());
		}

	}


}

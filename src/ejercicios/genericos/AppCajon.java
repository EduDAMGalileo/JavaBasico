package ejercicios.genericos;

public class AppCajon {
	public static void main (String[] args) {
		Cajon<String> cajaString = new Cajon<>();
		Cajon<String> cajaString2 = new Cajon<>();
		cajaString2.guardar("Edu");

		if (cajaString2.estaVacio()) {
			System.out.println("El cajón está vacío");
		} else {
			System.out.println("El cajón tiene algo");
		}

		try {
			String algo = cajaString2.extraer();
			System.out.println("Ese algo es: " + algo);

			String nada =  cajaString.extraer();
			System.out.println("La nada es: " + nada);

			String algo2 = cajaString2.extraer();
			System.out.println("Ese algo2 es: " + algo2);
		} catch (IllegalStateException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
		System.out.println("El programa finaliza correctamente");
		
		Cajon<Integer> entero = new Cajon<>();
		entero.guardar(33);
		//Esto daría fallo, no puedo guardar un String en un cajón de enteros
		//entero.guardar("Hola");
		Pedido p = new Pedido(1, "Primer pedido");
		
		Cajon<Pedido> cajonPedido = new Cajon<>();
		cajonPedido.guardar(p);
		

	}


}

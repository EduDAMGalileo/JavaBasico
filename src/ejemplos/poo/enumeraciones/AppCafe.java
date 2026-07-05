package ejemplos.poo.enumeraciones;

public class AppCafe {
	public static void main (String[] args) {
		
		//Quien se acuerda del 1, 2, 3...
		PedidoCafeLegacy cafeAntiguo = new PedidoCafeLegacy(1);
		
		//Usando las constantes
		PedidoCafeLegacy cafeAntiguo3 = new PedidoCafeLegacy(PedidoCafeLegacy.TAMANO_GRANDE);
		
		//este no existe como tal, pero se permite, ya petará más adelante.
		PedidoCafeLegacy cafeAntiguo2 = new PedidoCafeLegacy(10);

		//Usando el enum
		PedidoCafeModerno cafeModerno = new PedidoCafeModerno(TamanoCafe.GRANDE);
		
		//No deja poner otra cosa que no sea el enum
		//PedidoCafeModerno cafeModerno2 = new PedidoCafeModerno(5);
		
	}

	
	

}

package noTanBasicos.genericos;

public class AppCajaLegacy {
	
	public static void main (String [] args) {
		CajaLegacy caja = new CajaLegacy();
		caja.guardar("Un mensaje secreto");

		// El programador "cree" que hay un String, pero tiene que forzar el casting:
		String mensaje = (String) caja.obtener(); 

		// EL DESASTRE: El compilador permite esto, pero explotará al ejecutarlo
		// (ClassCastException en tiempo de ejecución)
		caja.guardar(123); 
		String error = (String) caja.obtener(); // ¡BOOM!	
	}



}

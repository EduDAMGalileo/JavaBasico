package ejemplos.estructurada.strings;

public class Mayuscula {
	public static void main (String[] args) {
		String nombre = "eduardo";
		nombre = primeraEnMayuscula(nombre);
		System.out.println(nombre);
	}
	
	public static String primeraEnMayuscula(String cadena) {
		
		return Character.toUpperCase(cadena.charAt(0)) + cadena.substring(1);
	}
	
	
}

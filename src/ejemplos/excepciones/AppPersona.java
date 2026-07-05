package ejemplos.excepciones;

public class AppPersona {

	public static void main(String[] args) {
		
		Persona pers1 = new Persona();
		Persona pers2 = new Persona();
		
		try {
			pers1.setEdad(55);
			pers2.setEdad(200);

		} catch (IllegalArgumentException e) {
			System.out.println ("Error: " + e.getMessage());
		}

	}

}

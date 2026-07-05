package ejemplos.poo;

public class AppSocio {
	public static void main (String[] args) {
		Socio s1 = new Socio(101, "Ana");
		Socio s2 = new Socio(101, "Ana");

		//Funciona de la misma forma si no ponemos toString()
		System.out.println(s1.toString());           
		System.out.println(s1.equals(s2)); 
		
		
		//Ahora con los métodos sobreesc
		Sociov2 s3 = new Sociov2(101, "Ana");
		Sociov2 s4 = new Sociov2(101, "Ana");

		// Ahora toString nos da información útil:
		System.out.println(s3);            

		// Ahora equals entiende la lógica de nuestro negocio:
		System.out.println(s3.equals(s4)); 
	}

}

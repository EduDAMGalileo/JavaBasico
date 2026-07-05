package ejercicios.poo.records;

public class AppUsuario {
	public static void main (String[] args){
	
		
		try {
			Usuario user = new Usuario("   sdsdf     ", "eduardoj.niegar@educa.jcyl.es");
			System.out.println("Mi usuario es: " + user.username() + 
					" y mi correo: " + user.email());
			
		} catch (IllegalArgumentException e) {
			System.out.println("ERROR:" + e.getMessage());
		}
		
		/*Pruebas
		 *  new Usuario("Eduardo", "eduardoj.niegar@educa.jcyl.es");
		 *  new Usuario("", "eduardoj.niegar@educa.jcyl.es");
		 *  new Usuario(null, "eduardoj.niegar@educa.jcyl.es");
		 *  new Usuario("Eduardo", null);
		 *  new Usuario("     ", "eduardoj.niegar@educa.jcyl.es");
		 *  new Usuario("Eduardo", "eduardoj.niegareduca.jcyl.es");
		 *  new Usuario("Eduardo", "@");
		 *  
		 */
		

	}


}

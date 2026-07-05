package ejercicios.poo.records;

public record Usuario(String username, String email) {
	
	public Usuario {
		//Restricciones: no quiero que username vaya vacío
		System.out.println(username.trim().length());
		if (username == null || username.trim().length() < 4) {
			throw new IllegalArgumentException("El usuario no puede ir vacío");
		}
		
		if (email == null || !email.contains("@")) {
			throw new IllegalArgumentException("Correo no válido");
		}
		
		username=username.trim();

	}

}

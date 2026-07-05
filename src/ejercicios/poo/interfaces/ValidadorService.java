package ejercicios.poo.interfaces;

public class ValidadorService {
	private Validable[] ficheros;

	public ValidadorService(Validable[] ficheros) {
		this.ficheros = ficheros;
	}
	
	public static boolean validarFichero(Validable fichero) {
		return fichero.isValid();
		
	}

	public boolean validarTodo() {
		for(Validable f: ficheros) {
			if (!f.isValid()) {
				return false;
			}
		}
		return true;
	}
	
	
	
}

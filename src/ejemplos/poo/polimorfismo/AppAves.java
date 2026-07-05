package ejemplos.poo.polimorfismo;

public class AppAves {

	public static void main(String[] args) {
		Ave gallina = new Gallina("Tutuleta");
		Ave gallo = new Gallo("Claudio");
		if (gallina instanceof Gallina) {
			gallina.volar();
			((Gallina) gallina).ponerHuevo();

		}
		
		//Si no hago esta comprobación, obtengo un error en tiempo de ejecución
		if (gallo instanceof Gallina) {
			((Gallina) gallo).ponerHuevo();
		} else {
			gallo.volar();
		}
	}

}

package ejemplos.poo.polimorfismo;

public class Gallina extends Ave {

	public Gallina(String nombre) {
		super(nombre);
	}

	public void ponerHuevo() {
		System.out.println("Acabo de poner un huevo");
	}

}

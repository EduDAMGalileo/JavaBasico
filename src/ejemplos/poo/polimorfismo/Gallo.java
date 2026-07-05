package ejemplos.poo.polimorfismo;

public class Gallo extends Ave{
	private boolean estaAfonico;

	public Gallo(String nombre) {
		super(nombre);
		this.estaAfonico=false;
	}
	
	
	@Override
	public void volar() {
		// TODO Auto-generated method stub
		super.volar();
		System.out.println("pero no muy alto, que soy un Gallo");
	}

	public void ponerAfonico() {
		estaAfonico=true;
	}
	
	public void curarAfonia() {
		estaAfonico=false;
	}

	public boolean isEstaAfonico() {
		return estaAfonico;
	}
	
	
	
}

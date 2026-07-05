package ejemplos.poo.interfaces;

public class Avion implements Volador{
	private String numBastidor;
	
	
	public Avion(String numBastidor) {
		this.numBastidor = numBastidor;
	}


	@Override
	public void despega() {
		System.out.println ("El avión " + numBastidor + " despegando por la pista 5");
		
	}

	@Override
	public void volar(int altitud) {
		System.out.println ("El avión " + numBastidor + " sobrevuela Huesca a " + altitud +" metros  de altura");
		
	}

	@Override
	public void aterrizar() {
		System.out.println ("El avión " + numBastidor + " aterriza por la pista 5");
		
	}

}

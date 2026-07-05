package ejercicios.poo.encapsulamiento;

public class Lampara {
	private String color;
	private String marca;
	private boolean estaEncendida;
	
	public Lampara (String color, String marca) {
		this.color=color;
		this.marca=marca;
	}
	
	public Lampara (String color, String marca, boolean estaEncendida) {		
		//Llamamos al otro constructor
		this(color,marca);
		this.estaEncendida=estaEncendida;
	}
	
	public void estado() {
		System.out.print("Aquí tenemos una lámpara " + marca + " de color " + color);
		if (estaEncendida) {
			System.out.println(" y está encendida");
		}else {
			System.out.println(" y está apagada");
		}
	}
	
	public void encender() {
		this.estaEncendida=true;
	}
	
	public void apagar() {
		this.estaEncendida=false;
	}

}

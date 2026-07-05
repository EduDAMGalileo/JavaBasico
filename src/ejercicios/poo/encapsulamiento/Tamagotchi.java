package ejercicios.poo.encapsulamiento;

public class Tamagotchi {
	private String nombre;
	private int hambre;
	private int energia;
	private double peso;
	
	public Tamagotchi(String nombre) {
		this.nombre=nombre;
		this.energia=100;
		this.hambre=0;
		this.peso=15;
	}
	
	public Tamagotchi(String nombre, int energia, int hambre) {
		this.nombre=nombre;
		this.energia=energia;
		this.hambre=hambre;
	}
	
	public void estado() {
		System.out.println("Tu mascota " + nombre + " tiene " + hambre + 
				" de hambre y " +energia + " de energía");
	}
	
	public void saludar() {
		System.out.print("Soy " + this.nombre + " encantado de conocerte, qué hacemos ahora?");
	}
	
	private void engordar(int engorde) {
		peso+=5;
	}
	
	public void comer() {
		if (this.hambre <= 10) {
			this.hambre=0;
		} else {
			this.hambre-=10; //Lo mismo que this.hambre=this.hambre-10;	
		}
		engordar(6);
		
	}
	
	public void jugar() {
		if (this.energia>=20) {
			if (this.hambre<85) {
				this.hambre+=15;
			} else {
				this.hambre=100;
			}
			this.energia-=20;
		} else {
			System.out.print("Estoy muy cansado para jugar, necesito una siesta");
		}
		
	}
	
	public void dormir() {
		this.energia=100;
	}
	
}

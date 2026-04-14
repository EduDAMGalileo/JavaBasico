package pooEjercercicios.interfaces;

public abstract class Imagen implements Validable{
	private int width; 
	private int height;
	
	
	public Imagen(int width, int height) {
		this.width = width;
		this.height = height;
	}


	public int getWidth() {
		return width;
	}


	public int getHeight() {
		return height;
	}
	
	
	
	
}

package pooEjercercicios.interfaces;

public abstract class Video implements Validable{
	private int length;

	public Video(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}
	
	
}

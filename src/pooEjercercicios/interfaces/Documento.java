package pooEjercercicios.interfaces;

public abstract class Documento implements Validable {
	private long size;

	public Documento(long size) {
		this.size = size;
	}

	public long getSize() {
		return size;
	}	
	
}

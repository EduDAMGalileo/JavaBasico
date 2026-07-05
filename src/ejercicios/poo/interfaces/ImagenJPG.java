package ejercicios.poo.interfaces;

public class ImagenJPG extends Imagen {

	
	public ImagenJPG(int width, int height) {
		super(width, height);
	}

	@Override
	public boolean isValid() {
		if (this.getHeight() *  this.getWidth() < 5000000) {
			return true;
		}
		return false;
	}
	

}

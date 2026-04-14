package pooEjercercicios.interfaces;

public class VideoMp4 extends Video{

	public VideoMp4(int length) {
		super(length);
	}

	@Override
	public boolean isValid() {
		if (this.getLength() < 300) {
			return true;
		}
		return false;
	}
	
	
	

}

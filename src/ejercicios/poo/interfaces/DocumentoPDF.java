package ejercicios.poo.interfaces;

public class DocumentoPDF extends Documento {

	public DocumentoPDF(long size) {
		super(size);
	}

	@Override
	public boolean isValid() {
		if (getSize() < 1048576) {
			return true;
		}
		return false;	
		
	}

}

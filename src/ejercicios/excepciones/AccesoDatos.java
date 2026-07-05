package ejercicios.excepciones;

import java.io.IOException;

public class AccesoDatos {
	//(Nivel 1)
	public void leerDatoFisico() throws IOException {
		System.out.println("Recuperando dato del disco");
		throw new IOException();
	}
}

package ejercicios.excepciones;

import java.io.IOException;

public class LogicaNegocio {
	//Nivel 2
	
	
	public void procesarInformacion() throws IOException {
		AccesoDatos ad = new AccesoDatos();	
		System.out.println("Procesando Información");
		ad.leerDatoFisico();
	}
}

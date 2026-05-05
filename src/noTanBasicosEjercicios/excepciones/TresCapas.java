package noTanBasicosEjercicios.excepciones;

import java.io.IOException;

public class TresCapas {

	public static void leerDatoFisico() throws IOException{
		//Acceso a datos (Nivel 1)
		System.out.println("Me piden un dato, voy a acceder al disco");
		throw new IOException("Error de lectura en disco");
		
		//System.out.println("Dato recuperado del disco");
	}
	
	public static void procesarInformacion() throws IOException {
		//Lógica de negocio (Nivel 2)
		System.out.println("Necesito leer un dato físico");
		leerDatoFisico();
		System.out.println("Dato físico leído");
	}
	
	public static void main(String[] args) {
		//Capa más alta, la interfaz (Nivel 3)
		System.out.println("Vamos a procesar la información");
		try {
			procesarInformacion();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Ha ocurrido un error al leer del disco, cerrando programa");
		}
		System.out.println("Información procesada");

	}
}

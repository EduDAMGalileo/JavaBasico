package ejercicios.excepciones;

import java.io.IOException;

public class Interfaz {

	public static void main(String[] args) {
		//Interfaz (Nivel 3)
		LogicaNegocio ln = new LogicaNegocio();
		
		try {
			ln.procesarInformacion();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error inesperado, inténtelo más tarde");
		}
	}
}

package ejercicios.estructurada.estructurasControl;

import java.util.Scanner;

public class ConvertirUnidades {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		double velocidad, conversion;
		int opcion;
		System.out.println("¿A qué velocidad vas?");
		velocidad=escaner.nextDouble();

		System.out.println("¿Y de qué unidades estamos hablando?");
		System.out.println("1/-Km/h");
		System.out.println("2/-m/s");
		
		opcion=escaner.nextInt();
		escaner.close();
		
		if(opcion==1) {
			//El dato está en Km/h se lo muestro en m/s
			conversion=velocidad*1000/3600;
			System.out.println("Vas a " + velocidad + " Km/h lo que equivale a " + conversion + "m/s");
		} else {
			//El dato está en m/s, se lo muestro en km/h
			conversion=velocidad*3600/1000;
			System.out.println("Vas a " + velocidad + " m/s lo que equivale a " + conversion + "Km/h");
		}
		
	}

}


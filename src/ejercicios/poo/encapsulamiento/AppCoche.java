package ejercicios.poo.encapsulamiento;

public class AppCoche {

	public static void main(String[] args) {
		Coche coche1 = new Coche("Lamborghini", "Diablo", "Gasolina", 1000);
		Coche coche2 = new Coche("Dacia", "Sandero", "Diesel", 5);
		
		
		coche1.mostrarInfo();
		coche2.mostrarInfo();

	}

}

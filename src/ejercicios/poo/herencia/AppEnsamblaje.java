package ejercicios.poo.herencia;

public class AppEnsamblaje {

	public static void main(String[] args) {
		EnsamblajeMovil movil = new EnsamblajeMovil();
		EnsamblajePremium movilPremium = new EnsamblajePremium();
		
		movil.fabricar();
		System.out.println("");
		movilPremium.fabricar();

	}

}

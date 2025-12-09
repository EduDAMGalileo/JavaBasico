package ejercicios;

public class Aleatorio {
	public static int numAleatorio(int hasta) {
		return((int)((Math.random()*hasta)+1));
	}
	public static void main (String[] args) {
		for (int i=0; i<100; i++) {
			System.out.println(numAleatorio(125));
		}
	}
}

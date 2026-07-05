package ejercicios.estructurada.metodos;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int numero;
		System.out.println("Dame un número y te digo su factorial ");
		Scanner sc = new Scanner(System.in);
		numero=sc.nextInt();
		System.out.println("El factorial de " + numero + "es: " + calcularFactorial(numero));
	}
	
	public static long calcularFactorial(int n) {
		long fact=1;
		if (n==0) {
			return 1;
		}
		for (int i=n; i>1; i--) {
			fact=fact*i;
			//fact*=i;
		}
		return fact;
	}

}

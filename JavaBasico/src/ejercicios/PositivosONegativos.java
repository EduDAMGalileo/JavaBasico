package ejercicios;

import java.util.Scanner;

public class PositivosONegativos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Dime cuantos números me vas a dar: ");
		int num;
		int numeros = scan.nextInt();
		
		int positivos=0;
		int negativos=0;
		int ceros=0;
		
		for (int i=1 ; i<=numeros ;i++) {
			System.out.println("Dime el número: " + i);
			num = scan.nextInt();
			
			if (num>0) {
				positivos++; // positivos=positivos+1;
			}else if (num<0) {
				negativos++;
			}else {
				ceros++;
			}
		}
		
		System.out.println("En total han sido: " 
			+ positivos + " numeros positivos " 
			+ negativos + " numeros negativos y "
			+ ceros + " numeros 0");
		
		scan.close();

	}

}

package ejercicios;

import java.util.Scanner;

public class AdivinarNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero;
		int vidas=3;
		int numeroPensado = (int) (Math.random()*100);	
		System.out.println("He pensado el número:" + numeroPensado);
		
		System.out.println("He pensado un múmero, a ver si adivinas");
		
		do{
			System.out.println("\nPrueba");
			numero=sc.nextInt();
			if(numero< numeroPensado) {
				System.out.println("Fallaste es mayor, te quedan " + --vidas + " vidas");
			}else if(numero > numeroPensado){
				System.out.println("Fallaste es menor " + --vidas + " vidas");
			}else {
				System.out.print("Acertaste!");
				break;
			}
		} while(numero!=numeroPensado && vidas>0);
		
		
		

	}

}

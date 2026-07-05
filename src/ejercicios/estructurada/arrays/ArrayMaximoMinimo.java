package ejercicios.estructurada.arrays;

public class ArrayMaximoMinimo {

	public static void main(String[] args) {
		double[] numeros = {6,8,9,2.1,4};
		
		double minimo=numeros[0];
		double maximo=numeros[0];
		
		for (int i = 1; i< numeros.length; i++) {
			if (minimo > numeros[i]) {
				minimo=numeros[i];
			}else if (maximo < numeros[i]) {
				maximo=numeros[i];
			}
				
		}
		System.out.print("El número más alto es: " + maximo);
		System.out.print("\nEl número más pequeño es: " + minimo);

	}

}

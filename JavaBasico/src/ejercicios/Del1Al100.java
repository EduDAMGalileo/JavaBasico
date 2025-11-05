package ejercicios;

public class Del1Al100 {

	public static void main(String[] args) {
		/* Para entenderlo mejor vamos a crear una tabla
		donde se muestren las filas y las columnas
		*/
		for (int i=1; i<=10;i++) {
			for(int j=1; j<=10;j++) {
				System.out.print(" F" + i + "C" + j);
			}
			System.out.println("");

		}
		System.out.println("\n\n\n");

		/*Ahora sí, el ejercicio, necesitamos un contador
		 * Y dentro del segundo bucle lo mostramos e incrementamos
		 */
		int contador=1;
		for (int i=1; i<=10;i++) {
			for(int j=1; j<=10;j++) {
				System.out.print(contador + " ");
				contador++;
			}
			System.out.println("");

		}
	}

}

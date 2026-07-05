//Un examen que le pedimos a la IA, pero no guardé el enunciado
package ejercicios.poo.examenIA;

import java.util.ArrayList;

public class AppBebidas {

	public static void main(String[] args) {
		ArrayList<Bebida> bebidas = new ArrayList();
		
		Cafe cafe = new Cafe("Café solo", 1, 0);
		Cafe cafe2 = new Cafe("Café con hielo", 1, 1);
		Refresco ref = new Refresco("Cocacola", 2.5, 'M');
		Refresco ref2 = new Refresco("Fanta naranja", 2.5, 'G');
		
		bebidas.add(cafe);
		bebidas.add(cafe2);
		bebidas.add(ref);
		bebidas.add(ref2);
		bebidas.add(new Refresco ("Aquarius",2,'P' ));
		
		for (Bebida b : bebidas) {
			System.out.println(b.toString());
		}

	}

}

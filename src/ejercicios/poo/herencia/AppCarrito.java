package ejercicios.poo.herencia;

import java.util.ArrayList;

public class AppCarrito {

	public static void main(String[] args) {
		ArrayList<Producto> productos = new ArrayList(); 
		
		Television miTele = new Television("Philips T400", 399.99, 42);
		Smartphone miSmart = new Smartphone("Redmi Note T14", 250, 8);
		
		//Breve introducción al polimorfismo
		productos.add(miTele);
		productos.add(miSmart);
		
		System.out.println(productos.get(0).toString());
		
	}

}

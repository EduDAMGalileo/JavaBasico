package ejercicios;

public class AreaPerimetro {
	
	public static double perimetro(double radio) {
		return 2*Math.PI*radio;
	}
	
	public static double area(double radio) {
		double area=Math.PI*radio*radio;
		return area;
	}

	public static void main(String[] args) {
		
		double r = 1.4;
		double p;
		
		//Guardamos el valor devuelto por el método
		p=perimetro(r);
		System.out.println("El perímetro es: " +  p);
		
		//Utilizamos directamente el valor que me devuelve el método
		System.out.println("El área es: " +  area(r));
		

	}

}

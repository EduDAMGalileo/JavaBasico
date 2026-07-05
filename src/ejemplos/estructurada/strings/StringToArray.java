package ejemplos.estructurada.strings;

public class StringToArray {

	public static void main(String[] args) {
			System.out.println("SPLIT");
		 	String datosProducto = "Portátil,Electrónica,899.99";

	        // Usamos la coma "," como delimitador para dividir el String
	        String[] partes = datosProducto.split(",");

	        // El resultado es un array de Strings: {"Portátil", "Electrónica", "899.99"}
	        
	        // Ahora podemos acceder a cada parte usando los índices del array
	        String nombre = partes[0];
	        String categoria = partes[1];
	        String precioTexto = partes[2];
	        
	        // Convertimos el precio a un tipo numérico para poder operar con él
	        double precio = Double.parseDouble(precioTexto);

	        System.out.println("--- Ficha de Producto ---");
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Categoría: " + categoria);
	        System.out.println("Precio con IVA: " + (precio * 1.21) + "€");
	        
	        //Contando las palabras de una frase
	        System.out.println("\n--- Palabras en una frase ---");
	        String frase = "Java es un lenguaje de programación muy popular";
	        String[] palabras = frase.split(" ");

	        System.out.println("La frase tiene " + palabras.length + " palabras."); 
	        System.out.println("La tercera palabra es: '" + palabras[2] + "'");
	        
	        
	        // Tenemos las partes de una ruta en un array
	        System.out.println("\n\nJOIN");
	        String[] partesRuta = {"home", "usuario", "documentos", "informe.pdf"};

	        // Queremos unirlas para formar una ruta de sistema Unix, usando "/" como separador
	        String rutaCompleta = String.join("/", partesRuta);

	        System.out.println("La ruta completa es: /" + rutaCompleta);
	        

	        
	        // Otro ejemplo: crear una lista separada por comas
	        String[] listaCompra = {"Leche", "Pan", "Huevos"};
	        String listaFormateada = String.join(", ", listaCompra);
	        
	        System.out.println("Lista de la compra: " + listaFormateada);
	        

	}

}

package basicos;

public class CadenasCaracteres {
	public static void main(String[] args) {
		// Creación de un String usando un literal
		String saludo = "Hola, Mundo";
		String despedida = "Adiós";
		
		//String pool
		String saludo1 = "Hola";
		String saludo2 = "Hola"; // Java es listo, no crea un nuevo objeto.
		                         // 'saludo2' apunta al mismo objeto "Hola" que 'saludo1'.
		
		
		// Creación de un String usando el constructor de la clase
		String saludoConNew = new String("Hola, Mundo");
		
		String saludo3 = "Hola"; // Objeto 1 (en el pool)
		String saludo4 = new String("Hola"); // Objeto 2 (fuera del pool)
		// Aunque el texto es idéntico, 'saludo1' y 'saludo2' apuntan a objetos diferentes en memoria.
		
		System.out.println("\nBloques de texto");
		System.out.println("----------------");
		String htmlAntiguo = "<html>\n" +
                "    <body>\n" +
                "        <p>Hola, Mundo</p>\n" +
                "    </body>\n" +
                "</html>";
		System.out.println(htmlAntiguo);
		
		String htmlModerno = """
                <html>
                    <body>
                        <p>Hola, Mundo</p>
                    </body>
                </html>
                """;
		System.out.println(htmlAntiguo);
		
		//Secuencias de escape
		System.out.println("\nSeceuncias de escape");
		System.out.println("--------------------");
		
		  // --- Comillas dobles y simples ---
        String cita = "El programador dijo: \"¡Hola, Mundo!\"";
        System.out.println(cita);

        String posesivo = "Es el libro de O'Reilly."; // Las comillas simples no necesitan escape en un String...
        String posesivoConEscape = "Es el libro de O\\'Reilly."; // ...pero también se puede.
        System.out.println(posesivo);


        // --- Saltos de línea y tabuladores ---
        String lista = "Productos:\n\t- Manzanas\n\t- Leche\n\t- Pan";
        System.out.println(lista);


        // --- Barra invertida ---
        // Para representar una ruta de fichero en Windows, debemos escapar cada '\'.
        String rutaFichero = "C:\\Usuarios\\MiUsuario\\Documentos\\archivo.txt";
        System.out.println(rutaFichero);
        // Salida: C:\Usuarios\MiUsuario\Documentos\archivo.txt
		
		//String miTexto = "Él dijo: "Hola, Mundo""; // ¡ERROR DE COMPILACIÓN!
		
		//Inmutabilidad de los strings
		System.out.println("\nInmutabilidad de los String");
		System.out.println("---------------------------");
		 String lenguaje = "Java";
	     System.out.println("String original: " + lenguaje);

        // 2. Llamamos a un método que "parece" modificar el String
        lenguaje.toUpperCase(); // Esta línea crea un NUEVO String "JAVA", pero no lo guardamos en ningún sitio.
                               // El String original al que apunta 'lenguaje' sigue siendo "Java".

        System.out.println("Después de llamar a toUpperCase() sin asignar: " + lenguaje); // Salida: Java
        
        // 3. La forma correcta: asignar el nuevo objeto a una variable
        String lenguajeMayusculas = lenguaje.toUpperCase(); // Creamos "JAVA" y lo guardamos en una nueva variable.

        System.out.println("El nuevo String en mayúsculas es: " + lenguajeMayusculas); // Salida: JAVA
        System.out.println("El String original sigue intacto: " + lenguaje);       // Salida: Java

        // 4. También podemos reasignar la variable original para que apunte al nuevo objeto
        lenguaje = lenguaje.toUpperCase(); // Ahora 'lenguaje' deja de apuntar a "Java" y apunta al nuevo "JAVA".

        System.out.println("Después de reasignar, 'lenguaje' ahora vale: " + lenguaje); // Salida: JAVA

        
        
        //Concatenación
		System.out.println("\nConcatenación");
		System.out.println("-------------");
        String nombre = "Eduardo";
        String apellido = "Niévares";

        String nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);
        
        //Concatenando tipos primitivos
        String producto = "Portátil";
        int stock = 15;
        double precio = 899.99;

        String infoProducto = "Producto: " + producto + " - Stock: " + stock + " unidades - Precio: " + precio + "€";
        System.out.println(infoProducto);
        
        //Ojo al orden
        System.out.println("\nCuidado con concaternar números");
        System.out.println("-------------------------------");
      
        System.out.println("La suma es: " + 5 + 3); 
        System.out.println("La suma es: " + (5 + 3)); 
     
        
        String saludar = "Hola";
        String mundo = ", Mundo";

        System.out.println("\nCon el método concat()");
        System.out.println("----------------------");
        String saludoCompleto = saludar.concat(mundo);
        System.out.println(saludoCompleto);
        //System.out.println (saludar + mundo);
        

        
     
	}
}

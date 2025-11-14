package basicos;

import java.util.Scanner;

public class StringMetodos {

	public static void main(String[] args) {
		//Longitud de una cadena
        System.out.println("\nLongitud con length()");
        System.out.println("---------------------");
        String frase = "Java es potente.";
        int numeroDeCaracteres = frase.length();
        System.out.println("La frase '" + frase + "' tiene " + numeroDeCaracteres + " caracteres.");
        
 
        //Accediendo a caracteres de forma individual
        String palabra = "Java";
 
        System.out.println("\nCaracter a caracter chatAt()");
        System.out.println("----------------------------");
        
        // Obtenemos el primer carácter (índice 0)
        char primeraLetra = palabra.charAt(0);
        System.out.println("La primera letra es: " + primeraLetra); 

        // Obtenemos el tercer carácter (índice 2)
        char terceraLetra = palabra.charAt(2);
        System.out.println("La tercera letra es: " + terceraLetra); 

        // La longitud es 4, así que el último índice es 3 (longitud - 1)
        char ultimaLetra = palabra.charAt(palabra.length() - 1);
        System.out.println("La última letra es: " + ultimaLetra); // Salida: a

        // Si intentamos acceder a un índice que no existe, como palabra.charAt(4),
        // el programa lanzará un error: StringIndexOutOfBoundsException.
        
        //Comparación de string
        System.out.println("\nComparación de Strings");
        System.out.println("----------------------");
        String s1 = "Hola"; // Creado como literal, va al String Pool.
        String s2 = "Hola"; // Java reutiliza el mismo objeto del pool.
        String s3 = new String("Hola"); // Forzamos la creación de un NUEVO objeto en memoria.

        System.out.println("--- Usando el operador == ---");

        // s1 y s2 apuntan al MISMO objeto en el String Pool.
        System.out.println("¿s1 == s2? " + (s1 == s2)); 

        // s1 y s3 tienen el mismo contenido, pero son OBJETOS DIFERENTES.
        System.out.println("¿s1 == s3? " + (s1 == s3));
        
        System.out.println("--- Usando equals()---");
        // Compara el contenido de s1 con el de s2.
        System.out.println("¿s1.equals(s2)? " + s1.equals(s2));

        // Compara el contenido de s1 con el de s3.
        System.out.println("¿s1.equals(s3)? " + s1.equals(s3));
        
        
        System.out.println("--- Usando equalsIgnoreCase()---");
        String respuestaCorrecta = "Java";
        String respuestaUsuario = "java";

        // Usando .equals() (sensible a mayúsculas)
        System.out.println("¿equals()? " + respuestaCorrecta.equals(respuestaUsuario)); 

        // Usando .equalsIgnoreCase() (ignora mayúsculas/minúsculas)
        System.out.println("¿equalsIgnoreCase()? " + respuestaCorrecta.equalsIgnoreCase(respuestaUsuario)); 
     
        System.out.println("\nBúsqueda y Extracción de Información");
        System.out.println("------------------------------------");
        
        String fraseBuscar = "El lenguaje de programación es Java.";
        
        boolean contieneJava = fraseBuscar.contains("Java");  
        boolean contienePython = fraseBuscar.contains("Python"); 
        boolean contienejava = fraseBuscar.contains("java");   
        
        System.out.println("¿Contiene Java? " + contieneJava);
        System.out.println("¿Contiene Python? " + contienePython);
        System.out.println("¿Contiene java? " + contienejava);
        
        
        String fichero = "documento_final.pdf";

        boolean esDocumento = fichero.startsWith("documento");
        boolean esImagen = fichero.startsWith("imagen");  
        System.out.println("¿Empieza por 'documento'? " + esDocumento);
        System.out.println("¿Empieza por'imagen'? " + esImagen);
        
        boolean esPdf = fichero.endsWith(".pdf");
        boolean esTxt = fichero.endsWith(".txt");
        System.out.println("¿Termina por '.pdf'? " + esPdf);
        System.out.println("¿Termina por '.txt'? " + esTxt);

        
        
        System.out.println("\n--- Por índice---");

        //IndexOf()
        String email = "usuario@ejemplo.com";

        int posicionArroba = email.indexOf("@"); 
        int posicionPunto = email.indexOf("."); 
        int posicionGuion = email.indexOf("-"); 
  
        
        System.out.println("Posición de la @ " + posicionArroba + 
        		" Posición del punto " + posicionPunto
        		+ " posición del guión " + posicionGuion);
        
    	//lastIndexOf()
        String ruta = "/home/usuario/documentos/informe.pdf";
    	int ultimaBarra = ruta.lastIndexOf("/");
    	System.out.println("La última barra etá en la posición " + ultimaBarra);
        
    	
    	//Substrings
        System.out.println("\nSubcadenas");
        System.out.println("-----------");
    	String url = "https://www.ejemplo.com/recursos";

    	// Queremos obtener todo lo que va después del dominio
    	int inicioRuta = url.indexOf(".com") + 4; 
    	String rutaRecursos = url.substring(inicioRuta);
    	System.out.println("El recurso es: " + rutaRecursos);
    	
    	

    	String fecha = "1984-04-14"; // Formato AAAA-MM-DD

        // Extraer el año (del índice 0 al 3)
        String anio = fecha.substring(0, 4); 

        // Extraer el mes (del índice 5 al 6)
        String mes = fecha.substring(5, 7); 

        // Extraer el día (del índice 8 hasta el final)
        String dia = fecha.substring(8);

        System.out.println("Año: " + anio);    
        System.out.println("Mes: " + mes);     
        System.out.println("Día: " + dia);    
        
        System.out.println("\nTransformaciones");
        System.out.println("-----------");
        
        System.out.println("\n--- Mayúsculas/minúsculas---");
        Scanner lector = new Scanner(System.in);
        System.out.print("¿Desea continuar? (Si/No): ");
        String respuestaUser = lector.nextLine();

        // Convertimos la respuesta a minúsculas para una comparación fiable
        String respuestaNormalizada = respuestaUser.toLowerCase();

        if (respuestaNormalizada.equals("si")) {
            System.out.println("El programa continúa...");
        } else {
            System.out.println("El programa finaliza.");
        }
        
        // El String original no ha cambiado
        System.out.println("La respuesta original fue: " + respuestaUser);
        lector.close();
        
        
        System.out.println("\n--- Reemplazar---");
		String fecha2 = "2025/11/07";
        
        // Reemplazamos las barras por guiones para estandarizar el formato
        String fechaFormateada = fecha2.replace('/', '-');
        System.out.println("Fecha original: " + fecha2);
        System.out.println("Fecha formateada: " + fechaFormateada); 

        String frase2 = "La programación en Java es divertida. Java es potente.";
        
        // Reemplazamos todas las apariciones de "Java" por "Python"
        String nuevaFrase = frase2.replace("Java", "Python");
        System.out.println("Frase original: " + frase2);
        System.out.println("Nueva frase: " + nuevaFrase);
        
        
        System.out.println("\n--- Limpiar de espacios---");
        // El usuario ha introducido espacios por error
        String entradaUsuario = "   edu.ardo@galileo.com   ";

        System.out.println("Entrada original: '" + entradaUsuario + "'");
        System.out.println("Longitud original: " + entradaUsuario.length());


        // Usamos trim() para limpiar la entrada
        String emailLimpio = entradaUsuario.trim();

        System.out.println("Entrada limpia: '" + emailLimpio + "'");
        System.out.println("Longitud limpia: " + emailLimpio.length());
        
        // Comparamos para ver el efecto
        if (emailLimpio.equals("edu.ardo@galileo.com")) {
            System.out.println("El email es correcto después de la limpieza.");
        }
 
	}
	


}

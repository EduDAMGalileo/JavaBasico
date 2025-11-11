package basicos;

public class ArraysMultidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaramos e instanciamos una matriz de 3 filas y 3 columnas para caracteres.
		char[][] tablero = new char[3][3];
		
		// Colocar una 'X' en la casilla central (fila 1, columna 1)
		tablero[1][1] = 'X';

		// Colocar una 'O' en la esquina superior derecha (fila 0, columna 2)
		tablero[0][2] = 'O';

		// Leer el valor de una casilla
		char valorCasilla = tablero[1][1];
		System.out.println("En la casilla del medio hay: " + valorCasilla);
		
		
		// Creamos una matriz de 2 filas y 3 columnas con valores predefinidos.
		int[][] matriz = {
		    {10, 20, 30},  // Fila 0
		    {40, 50, 60}   // Fila 1
		};

		// Accedemos al elemento en la fila 1, columna 0
		System.out.println(matriz[1][0]);

		
		
		// Matriz para 3 alumnos (filas) y 4 asignaturas (columnas)
        double[][] notasAlumnos = {
            {7.5, 8.0, 9.2, 6.5}, // Notas del Alumno 1 (fila 0)
            {5.0, 6.5, 7.0, 8.2}, // Notas del Alumno 2 (fila 1)
            {9.5, 9.0, 8.8, 9.8}  // Notas del Alumno 3 (fila 2)
        };

        // --- Recorrer y mostrar la matriz ---
        System.out.println("--- Tabla de Notas ---");
        // El bucle exterior recorre las filas (de 0 a 2)
        for (int i = 0; i < notasAlumnos.length; i++) {
            System.out.print("Notas del Alumno " + (i + 1) + ": ");
            // El bucle interior recorre las columnas (de 0 a 3) para la fila 'i'
            for (int j = 0; j < notasAlumnos[i].length; j++) {
                System.out.print(notasAlumnos[i][j] + "  ");
            }
            System.out.println(); 
        }

        // --- Procesar la matriz: Calcular la media del Alumno 2 (fila 1) ---
        double suma = 0;
        int alumnoIndex = 1; 
        for (int j = 0; j < notasAlumnos[alumnoIndex].length; j++) {
            suma += notasAlumnos[alumnoIndex][j];
        }
        double media = suma / notasAlumnos[alumnoIndex].length;
        System.out.println("\nLa nota media del Alumno " + (alumnoIndex + 1) + " es: " + media);
        
        
     // Creamos un array de 3 filas, pero no especificamos las columnas aún.
        int[][] arrayIrregular = new int[3][];

        // Ahora, creamos cada fila con un tamaño diferente.
        arrayIrregular[0] = new int[2]; 
        arrayIrregular[1] = new int[4]; 
        arrayIrregular[2] = new int[3]; 

        // Podemos rellenarlo y recorrerlo de la misma forma, ya que .length se adapta.
        arrayIrregular[1][3] = 99; // Asignar un valor

        for (int i = 0; i < arrayIrregular.length; i++) {
            System.out.println("Fila " + i + " tiene " + arrayIrregular[i].length + " columnas.");
        }
        
        // Array de 3 dimensiones para almacenar enteros
        int[][][] cuboDeDatos;

        // Array de 4 dimensiones para almacenar valores double
        double[][][][] tensorDeValores;
   
	     // Creamos un "cubo" de 3x4x5
	     // Imagina 3 tablas, cada una con 4 filas y 5 columnas.
	     cuboDeDatos = new int[3][4][5];
	     
	  // Un array de 2x3x2
	     int[][][] datosConocidos = {
	         { // Primera "tabla" (índice 0)
	             {1, 2},  // Fila 0 de la tabla 0
	             {3, 4},  // Fila 1 de la tabla 0
	             {5, 6}   // Fila 2 de la tabla 0
	         },
	         { // Segunda "tabla" (índice 1)
	        	 {7, 8},  // Fila 0 de la tabla 1
	        	 {9, 10}, // Fila 1 de la tabla 1
	        	 {11, 12} // Fila 2 de la tabla 1
	         }
	     };

	     int[][][] cubo = {
	    		 {{1, 2}, {3, 4}},
	    		 {{5, 6}, {7, 8}}
	     };
	     // Es un cubo de 2x2x2

	     // El bucle más externo recorre la primera dimensión (las "tablas")
	     for (int i = 0; i < cubo.length; i++) {
	    	 System.out.println("Tabla " + i + ":");

	    	 // El segundo bucle recorre la segunda dimensión (las "filas" de cada tabla)
	    	 for (int j = 0; j < cubo[i].length; j++) {
	    		 System.out.print("  Fila " + j + ": { ");

	    		 // El bucle más interno recorre la tercera dimensión (las "columnas" de cada fila)
	    		 for (int k = 0; k < cubo[i][j].length; k++) {
	    			 System.out.print(cubo[i][j][k] + " ");
	    		 }
	    		 System.out.println("}");
	    	 }
	     }

	}

}

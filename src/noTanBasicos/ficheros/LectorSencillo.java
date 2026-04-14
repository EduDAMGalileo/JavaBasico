package noTanBasicos.ficheros;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class LectorSencillo {
    public static void main(String[] args) {
        
        File miArchivo = new File("listado_alumnos.txt");
        Scanner lector = null; 
        
        try {
            System.out.println("Intentando abrir el archivo para lectura...\n");
            
            //Conectamos el Scanner al archivo físico. Si el archivo no existe en la raíz del proyecto, saltará al catch.
            lector = new Scanner(miArchivo);
            
            // Bucle de extracción (Lectura hasta el Fin de Fichero)
            while (lector.hasNextLine()) {
                String texto = lector.nextLine();
                System.out.println("LEÍDO: " + texto);
            }

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: No se encuentra el archivo en el disco.");
            System.out.println("Asegúrate de ejecutar primero el programa de escritura.");
            
        } finally {
            if (lector != null) {
            	//Para no dejar el fichero "abierto"
                lector.close();
                System.out.println("\nFlujo de lectura cerrado correctamente.");
            }
        }
    }
}
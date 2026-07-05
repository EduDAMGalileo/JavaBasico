package ejemplos.ficheros;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class EscritorSencillo {
    public static void main(String[] args) {
        
        File miArchivo = new File("listado_alumnos.txt");
        // Se declara fuera del try cathc, para que el finally pueda verlo
        PrintWriter escritor = null; 
        
        try {
            System.out.println("Abriendo flujo de escritura...");
            
            // Esta línea obliga a capturar FileNotFoundException
            escritor = new PrintWriter(miArchivo);
            
            // Escribimos en el archivo exactamente igual que en la consola
            escritor.println("--- LISTADO DE MATRICULADOS ---");
            escritor.println("1. Roberto García");
            escritor.println("2. Laura Pérez");
            escritor.print("Total de alumnos: ");
            escritor.println(2); 
            
            System.out.println("Los datos se han escrito en el buffer de memoria.");

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: No se ha podido crear o acceder al archivo.");
            System.out.println("Ruta intentada: " + miArchivo.getAbsolutePath());
            
        } finally {
            // Ponemos un if para no generar otra excepción dentro del finally.
            if (escritor != null) {
                // Esta instrucción es la que realmente vuelca el texto al disco duro
                escritor.close(); 
                System.out.println("Flujo cerrado. Datos guardados físicamente en disco.");
            }
        }
    }
}
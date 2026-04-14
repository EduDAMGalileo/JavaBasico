package noTanBasicos.ficheros;

import java.util.Properties;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class GestionPreferencias {
    public static void main(String[] args) {
        Properties config = new Properties();
        File archivo = new File("configuracion.properties");

        //Guardar
        try (FileWriter escritor = new FileWriter(archivo)) {
            config.setProperty("idioma", "es");
            config.setProperty("volumen", "85");
            config.setProperty("tema", "oscuro");

            // Guardamos físicamente en el disco
            // El segundo parámetro es un comentario que aparecerá al principio del archivo
            config.store(escritor, "Ajustes de usuario de la Aplicacion");
            System.out.println("Configuracion guardada con exito.");

        } catch (IOException e) {
            System.err.println("Error al guardar: " + e.getMessage());
        }

        //Cargar
        try (FileReader lector = new FileReader(archivo)) {
            // El método load lee el archivo y rellena el objeto Properties
            config.load(lector);

            // Recuperamos los valores de forma individual
            String lang = config.getProperty("idioma");
            
            // Los valores siempre se leen como String, debemos convertirlos si son números
            int vol = Integer.parseInt(config.getProperty("volumen"));
            
            // Ejemplo de valor por defecto si la clave no existiera
            String resolucion = config.getProperty("resolucion", "1024x768");

            System.out.println("\n--- AJUSTES CARGADOS ---");
            System.out.println("Idioma: " + lang);
            System.out.println("Volumen: " + vol + "/100");
            System.out.println("Resolucion: " + resolucion);

        } catch (IOException e) {
            System.err.println("Error al cargar: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error: El volumen en el archivo no es un numero.");
        }
    }
}

package ejemplos.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class LectorEficiente {
    public static void main(String[] args) {
        
        File archivo = new File("datos_masivos.txt");
        // Declaramos los recursos fuera del try para cerrarlos en el finally
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            System.out.println("Iniciando lectura de alta velocidad...");

            // Bucle de lectura línea a línea
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.err.println("Error crítico durante la lectura: " + e.getMessage());
        } finally {
            //Cierre de flujos (Cerrar el envoltorio cierra automáticamente el conducto interno)
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
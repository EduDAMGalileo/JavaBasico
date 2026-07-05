package ejemplos.ficheros;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;
import java.util.Collections;

/*
 *
 *Para el fichero nombres.txt 
Zigor
Ainhoa
Iker
Beatriz
Maite
Carlos
Unai
Elena
 */

public class ProcesadorModerno {
    public static void main(String[] args) {
        Path rutaEntrada = Path.of("nombres.txt");
        Path rutaSalida = Path.of("nombres_ordenados.txt");

        try {
            // LECTURA: De disco a List<String> en un solo paso
            List<String> nombres = Files.readAllLines(rutaEntrada);

            // PROCESAMIENTO: Ordenación en RAM usando colecciones
            Collections.sort(nombres);

            // ESCRITURA: De List<String> a disco en un solo paso
            Files.write(rutaSalida, nombres);

            System.out.println("Proceso finalizado con éxito.");

        } catch (IOException e) {
            System.err.println("Error en la operación de archivos: " + e.getMessage());
        }
    }
}

package laboratorios.excepciones;

import java.io.BufferedReader;
import java.io.FileReader;

public class GestorFichero {

    public static String leerDescripcion(String rutaFichero) {
        BufferedReader br = new BufferedReader(new FileReader(rutaFichero));
        String linea = br.readLine();
        br.close();
        return linea;
    }
}


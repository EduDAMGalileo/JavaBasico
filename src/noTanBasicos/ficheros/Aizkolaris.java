package noTanBasicos.ficheros;

/*
 Copiar esto en un fichero, resultadosAizkolari.txt
 
	Ainhoa;13
	Iker;10
	Maite;15
	Unai;12
	
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aizkolaris {
    public static void main(String[] args) {
        
        try (BufferedReader br = new BufferedReader(new FileReader("resultadosAizkolari.txt"))) {
            String linea;
            
            System.out.println("--- CRÓNICA DEL CAMPEONATO ---\n");

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                String nombre = partes[0].trim();
                int troncos = Integer.parseInt(partes[1].trim());             
                System.out.println(nombre + " ha cortado un total de " + troncos + " troncos.");
            }

        } catch (IOException e) {
            System.err.println("Error al acceder al archivo de resultados.");
        } catch (NumberFormatException e) {
            System.err.println("Error: Se ha encontrado una puntuación no numérica.");
        }
    }
}
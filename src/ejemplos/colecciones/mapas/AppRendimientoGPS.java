package ejemplos.colecciones.mapas;
import java.util.HashMap;
import java.util.Map;

public class AppRendimientoGPS {

    public static void recorridoDelNovato(Map<CoordenadaGPS, Cliente> mapaDatos) {
        System.out.println("--- Recorrido Ineficiente (keySet + get) ---");
        long inicio = System.currentTimeMillis();
        
        int sumaDummy = 0; 
        
        for (CoordenadaGPS clave : mapaDatos.keySet()) {
            // EL DESASTRE: 
            // Para hacer el get(), el mapa llama a clave.hashCode().
            // Como CoordenadaGPS no tiene caché, la CPU tiene que recalcular.
            Cliente c = mapaDatos.get(clave); 
            sumaDummy += c.getNombre().length(); 
        }
        
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo invertido: " + (fin - inicio) + " ms");
    }

    public static void recorridoProfesional(Map<CoordenadaGPS, Cliente> mapaDatos) {
        System.out.println("\n--- Recorrido Estándar (entrySet) ---");
        long inicio = System.currentTimeMillis();
        
        int sumaDummy = 0;
        
        for (Map.Entry<CoordenadaGPS, Cliente> pareja : mapaDatos.entrySet()) {
            // ÉXITO:
            // No hay get(). No se invoca NUNCA al hashCode(). 
            // Simplemente leemos el valor que ya está en la memoria física.
            Cliente c = pareja.getValue(); 
            sumaDummy += c.getNombre().length();
        }
        
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo invertido: " + (fin - inicio) + " ms");
    }

    public static void main(String[] args) {
        Map<CoordenadaGPS, Cliente> baseDatos = new HashMap<>();
        
        // Usamos 3 millones para no saturar la RAM, 
        // pero es suficiente para estresar a la CPU.
        int cantidad = 3000000; 
        System.out.println("Generando " + cantidad + " coordenadas GPS... espere.");
        
        for (int i = 0; i < cantidad; i++) {
            CoordenadaGPS gps = new CoordenadaGPS(40.0 + i, -3.0 - i);
            baseDatos.put(gps, new Cliente("DNI" + i, "Usuario " + i));
        }

        System.gc(); // Limpiamos basura
        recorridoDelNovato(baseDatos);
        
        System.gc(); // Limpiamos basura
        recorridoProfesional(baseDatos);
    }
}
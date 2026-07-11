package ejemplos.colecciones.mapas;

import java.util.List;
import java.util.Map;

public class BuscadorClientes {
	
	public void busquedaObsoleta(List<Cliente> baseDatosList, String dniBuscado) {
        System.out.println("--- Búsqueda Secuencial (List) ---");
        // MALA PRÁCTICA PARA BÚSQUEDAS:
        // Si tenemos un millón de clientes, y el que buscamos es el último,
        // la CPU tendrá que dar un millón de vueltas preguntando uno a uno.
        // Complejidad: O(N)
        long inicio = System.currentTimeMillis();
        Cliente encontrado = null;
        
        for (Cliente c : baseDatosList) {
            if (c.getDni().equals(dniBuscado)) {
                encontrado = c;
                break; // Lo encontramos, detenemos el bucle
            }
        }
        
        long fin = System.currentTimeMillis();
        System.out.println("Cliente encontrado: " + (encontrado != null ? encontrado.getNombre() : "No existe"));
        System.out.println("Tiempo invertido: " + (fin - inicio) + " ms\n");
    }

    public void busquedaProfesional(Map<String, Cliente> baseDatosMap, String dniBuscado) {
        System.out.println("--- Búsqueda Directa (Map) ---");
        // ESTÁNDAR DE LA INDUSTRIA:
        // Entregamos la "ficha" (el DNI) al guardarropa. 
        // El mapa nos devuelve el abrigo (el Cliente) de forma instantánea.
        // No hay bucles. Complejidad: O(1)
        long inicio = System.currentTimeMillis();
        
        // El método get(Key) es el corazón de la interfaz Map
        Cliente encontrado = baseDatosMap.get(dniBuscado);
        
        long fin = System.currentTimeMillis();
        System.out.println("Cliente encontrado: " + (encontrado != null ? encontrado.getNombre() : "No existe"));
        System.out.println("Tiempo invertido: " + (fin - inicio) + " ms\n");
    }

}

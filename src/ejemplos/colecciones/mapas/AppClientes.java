package ejemplos.colecciones.mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppClientes {

    public static void busquedaObsoleta(List<Cliente> baseDatosList, String dniBuscado) {
        System.out.println("--- Búsqueda Secuencial (List) ---");
        // MALA PRÁCTICA PARA BÚSQUEDAS:
        // En el peor de los casos (el dato está al final), la CPU 
        // dará 1.000.000 de vueltas. Complejidad: O(N)
        long inicio = System.currentTimeMillis();
        Cliente encontrado = null;
        
        for (Cliente c : baseDatosList) {
            if (c.getDni().equals(dniBuscado)) {
                encontrado = c;
                break; 
            }
        }
        
        long fin = System.currentTimeMillis();
        System.out.println("Encontrado: " + (encontrado != null ? encontrado.getNombre() : "No existe"));
        System.out.println("Tiempo invertido: " + (fin - inicio) + " ms\n");
    }

    public static void busquedaProfesional(Map<String, Cliente> baseDatosMap, String dniBuscado) {
        System.out.println("--- Búsqueda Directa (Map) ---");
        // ESTÁNDAR DE LA INDUSTRIA:
        // No hay bucles. El mapa va directo a la coordenada de memoria.
        // Complejidad: O(1)
        long inicio = System.currentTimeMillis();
        
        Cliente encontrado = baseDatosMap.get(dniBuscado);
        
        long fin = System.currentTimeMillis();
        System.out.println("Encontrado: " + (encontrado != null ? encontrado.getNombre() : "No existe"));
        System.out.println("Tiempo invertido: " + (fin - inicio) + " ms\n");
    }

    public static void main(String[] args) {
        
        List<Cliente> lista = new ArrayList<>();
        Map<String, Cliente> mapa = new HashMap<>();

        System.out.println("Generando 1.000.000 de registros en memoria... espere.");
        
        // Poblamos ambas estructuras , con los mismos datos
        for (int i = 0; i < 1000000; i++) {
            String dniGenerado = i + "X";
            Cliente c = new Cliente(dniGenerado, "Usuario " + i);
            
            lista.add(c);
            mapa.put(c.getDni(), c);
        }

        // Insertamos el objetivo al final de la Lista para forzar el peor caso
        Cliente objetivo = new Cliente("9999999Z", "Zack (El Buscado)");
        lista.add(objetivo);
        mapa.put(objetivo.getDni(), objetivo);

        // Ejecutamos la comparativa buscando el último registro
        busquedaObsoleta(lista, "9999999Z");
        busquedaProfesional(mapa, "9999999Z");
    }
}

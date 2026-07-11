package ejemplos.colecciones.recorrer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BorrandoElementos {

      public static void limpiezaProfesional() {
        System.out.println("--- Limpieza Estructural Segura (Uso de Iterator) ---");
        List<Cliente> carteraClientes = new ArrayList<>();
        
        carteraClientes.add(new Cliente("Ana", false));
        carteraClientes.add(new Cliente("Luis", true));  // Moroso
        carteraClientes.add(new Cliente("Bea", false));
        carteraClientes.add(new Cliente("Zack", true));  // Moroso

        System.out.println("Cartera inicial: " + carteraClientes);

        // ESTÁNDAR PARA BORRADOS:
        // Pedimos explícitamente el control manual de la colección
        Iterator<Cliente> cirujano = carteraClientes.iterator();

        // Controlamos el avance manualmente mediante un bucle while
        while (cirujano.hasNext()) {
            
            // 3. Extraemos el paciente actual
            Cliente paciente = cirujano.next();
            
            if (paciente.isMoroso()) {
                System.out.println(" -> Detectado moroso: " + paciente.getNombre() + ". Amputando...");
                
                // LO QUE ES DISTINTO: 
                // NO usamos carteraClientes.remove(paciente) (Eso provocaría la excepción)
                // Usamos el propio Iterador para que sincronice la operación internamente.
                cirujano.remove(); 
            }
        }

        // El programa no colapsa. La estructura se mantiene íntegra.
        System.out.println("\nLimpieza completada. Cartera final: " + carteraClientes);
    }

    public static void main(String[] args) {
        limpiezaProfesional();
    }
}


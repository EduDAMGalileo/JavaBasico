package ejemplos.colecciones.listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class GestorCampañas {
	public static void main (String[] args) {
        // Escenario 1: El departamento de ventas usa un ArrayList (permite duplicados, mantiene orden)
        ArrayList<Cliente> clientesVentas = new ArrayList<>();
        clientesVentas.add(new Cliente("111A", "Ana"));
        
        // Escenario 2: El departamento legal usa un HashSet (garantiza unicidad, no tiene orden)
        HashSet<Cliente> clientesLegal = new HashSet<>();
        clientesLegal.add(new Cliente("222B", "Luis"));

        // El método novato SOLO funciona con Ventas. Fallará si le pasamos los datos de Legal.
        aplicarDescuentoNovato(clientesVentas);
        //aplicarDescuentoNovato(clientesLegal); // ERROR DE COMPILACIÓN

        // Nuestro método profesional acepta AMBOS escenarios sin modificar ni una coma de código.
        aplicarDescuentoProfesional(clientesVentas);
        aplicarDescuentoProfesional(clientesLegal);
	}

    // MALA PRÁCTICA (Código rígidamente acoplado):
    // Exigimos explícitamente un ArrayList. 
    // ¿Qué pasa si el equipo de base de datos nos envía los clientes en otra estructura?
    public static void aplicarDescuentoNovato(ArrayList<Cliente> listaClientes) {
        System.out.println("Aplicando descuento a " + listaClientes.size() + " clientes.");
        for (Cliente c : listaClientes) {
            // Lógica de descuento...
        }
    }

    // ESTÁNDAR DE LA INDUSTRIA (Flexibilidad y Polimorfismo):
    // Exigimos la interfaz Collection. Nos da igual cómo vengan organizados,
    // solo necesitamos saber que podemos recorrerlos y contar cuántos son.
    public static void aplicarDescuentoProfesional(Collection<Cliente> grupoClientes) {
        // El método size() está garantizado por el contrato de Collection
        System.out.println("Aplicando descuento a " + grupoClientes.size() + " clientes.");
        
        // El for-each está garantizado porque Collection hereda de Iterable
        for (Cliente c : grupoClientes) {
            // Lógica de descuento...
        }
    }

}
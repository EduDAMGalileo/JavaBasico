package ejemplos.colecciones.comparar;

//Implementamos Comparable especificando que nos compararemos con otros Clientes.
public class ClienteComparable implements Comparable<ClienteComparable> {
    private String nombre;

    public ClienteComparable(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { 
        return nombre; 
    }

    // Cumplimos el contrato de la interfaz
    @Override
    public int compareTo(ClienteComparable otroCliente) {
        /* En lugar de calcular quién va antes manualmente, delegamos 
           la responsabilidad en la clase String, que ya es una experta en alfabetizar.
           Esto devolverá negativo si 'this.nombre' va antes que 'otroCliente.nombre'
        */
        return this.nombre.compareTo(otroCliente.nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }
}


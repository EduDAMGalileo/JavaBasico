package ejemplos.colecciones.listas;

import java.util.ArrayList;

public class RegistroClientesModerno {
    // Delegamos la gestión de memoria al Framework de Colecciones.
    private ArrayList<Cliente> clientes;

    public RegistroClientesModerno() {
        // Inicializamos el contenedor. ¡Ya no nos importa su tamaño inicial!
        this.clientes = new ArrayList<>();
    }

    public void registrar(Cliente nuevoCliente) {
        // Toda nuestra compleja lógica de redimensionamiento, copiado 
        // de arrays y gestión del índice, se reduce a una sola palabra:
        clientes.add(nuevoCliente);
    }
}

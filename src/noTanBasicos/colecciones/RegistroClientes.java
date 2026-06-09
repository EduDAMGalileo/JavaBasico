package noTanBasicos.colecciones;

public class RegistroClientes {
    // MALA PRÁCTICA, PARA ILUSTRAR EL PROBLEMA (Enfoque manual): 
    private Cliente[] clientes;
    private int cantidadActual;

    public RegistroClientes() {
        this.clientes = new Cliente[5]; 
        this.cantidadActual = 0;
    }

    public void registrar(Cliente nuevoCliente) {
        // Ensuciamos nuestra lógica de negocio para vigilar constantemente la memoria
        if (cantidadActual == clientes.length) {
            System.out.println("Array lleno. Ejecutando costoso redimensionamiento manual...");
            
            // Instanciamos un array nuevo, por ejemplo del doble de tamaño
            Cliente[] nuevoArray = new Cliente[clientes.length * 2];
            
            // Mudamos a los inquilinos del edificio viejo al nuevo (operación muy costosa en CPU)
            for (int i = 0; i < clientes.length; i++) {
                nuevoArray[i] = clientes[i];
            }
            
            // Reemplazamos la referencia. Dejamos que el Garbage Collector destruya el array viejo.
            clientes = nuevoArray; 
        }
        
        // Ahora sí, por fin, insertamos el dato que nos importaba
        clientes[cantidadActual] = nuevoCliente;
        cantidadActual++;
    }
}
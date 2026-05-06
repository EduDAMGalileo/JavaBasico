package noTanBasicos.enumeraciones;

class PedidoRobusto {
    private String titulo;
    private EstadoPedido estado; // Tipo específico, no un String genérico

    public PedidoRobusto(String titulo) {
        this.titulo = titulo;
        this.estado = EstadoPedido.PENDIENTE;
    }

    public void intentarCambiarEstado(EstadoPedido nuevo) {
        if (estado.puedePasarA(nuevo)) {
            this.estado = nuevo;
            System.out.println("Estado actualizado a: " + estado);
        } else {
            // El sistema detecta la violación de la regla de negocio
            System.err.println("ERROR: No se puede pasar de " + estado + " a " + nuevo);
        }
    }

    public EstadoPedido getEstado() { return estado; }
}
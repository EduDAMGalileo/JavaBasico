package noTanBasicos.enumeraciones;

public enum EstadoPedido {
    PENDIENTE, 
    PAGADO, 
    ENTREGADO;

    public boolean puedePasarA(EstadoPedido nuevo) {
        return switch (this) {
            case PENDIENTE -> nuevo == PAGADO;
            case PAGADO -> nuevo == ENTREGADO;
            case ENTREGADO -> false; // No hay más estados después de entregado
        };
    }
}
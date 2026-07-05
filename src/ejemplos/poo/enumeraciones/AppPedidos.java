package ejemplos.poo.enumeraciones;

public class AppPedidos {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA 1: MODELO FRÁGIL ---");
        PedidoFragil p1 = new PedidoFragil("Cafetera Express");
        
        // Error 1: El programador se equivoca al teclear
        p1.setEstado("PAGADOO"); 
        
        // Error 2: Transición ilógica (Saltarse pasos)
        p1.setEstado("ENTREGADO"); 
        
        System.out.println("Estado final (erróneo): " + p1.getEstado());


        System.out.println("\n--- PRUEBA 2: MODELO ROBUSTO ---");
        PedidoRobusto p2 = new PedidoRobusto("Cafetera Express");

        // Intento 1: Error de escritura
        // ¡Ni siquiera compila! No podemos escribir p2.intentarCambiarEstado("PAGADOO");
        //p2.intentarCambiarEstado("PAGADOO");
        // El IDE nos obliga a elegir un valor válido del Enum.

        // Intento 2: Transición ilógica
        System.out.println("Intentando pasar de PENDIENTE a ENTREGADO: ");
        p2.intentarCambiarEstado(EstadoPedido.ENTREGADO);

        // Intento 3: Flujo correcto
        System.out.println("\n Intentando pasar de PENDIENTE a PAGADO: ");
        p2.intentarCambiarEstado(EstadoPedido.PAGADO);
    }
}

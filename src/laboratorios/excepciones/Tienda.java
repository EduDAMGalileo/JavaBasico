package laboratorios.excepciones;

public class Tienda {

    public static Producto buscarProducto(Producto[] catalogo, String nombre) {
        for (Producto p : catalogo) {
            if (p.getNombre().equals(nombre)) {
                return p;
            }
        }
        return null;
    }

    public static Producto crearProducto(String nombre, String precioTexto)
            throws StockInsuficienteException {
        double precio = Double.parseDouble(precioTexto);
        if (precio <= 0) throw new PrecioInvalidoException(precio);
        return new Producto(nombre, precio, 10);
    }

    public static void main(String[] args) throws Exception {

        // --- Preparar catálogo ---
        Producto[] catalogo = new Producto[5];
        catalogo[0] = new Producto("Teclado", 45.99, 10);
        catalogo[1] = new Producto("Ratón", 19.99, 5);
        catalogo[2] = new Producto("Monitor", 299.00, 3);
        // catalogo[3] y [4] quedan sin inicializar

        Producto encontrado = buscarProducto(catalogo, "Auriculares");
        System.out.println("Buscando: " + encontrado);

        Pedido pedido = new Pedido("Eduardo Niévares", 3);
        pedido.agregarProducto(catalogo[0], 1);
        pedido.agregarProducto(catalogo[1], 2);
        System.out.println("Total: " + pedido.calcularTotal());

        Producto nuevo = crearProducto("Webcam", "29,99");
        System.out.println("Nuevo producto: " + nuevo);

        System.out.println("Con descuento: " + pedido.calcularDescuento(10));

        String desc = GestorFichero.leerDescripcion("descripcion.txt");
        System.out.println("Descripción: " + desc);

        Producto monitor = catalogo[2];
        monitor.reducirStock(10);
        if (monitor.getStock() < 0) {
            System.out.println("ERROR: stock negativo = " + monitor.getStock());
        }
    }
}
